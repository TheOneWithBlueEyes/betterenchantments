package us.blueeyemods.uem.mixin.mending;


import com.google.common.collect.Lists;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

@Mixin(ExperienceOrb.class)
public class ExperienceOrbMixin {
    private int currentMendingLevel = 0;

    private int getMendingRepairRatio(int mendingLevel) {
        return (int)((float)mendingLevel);
    }

    private int getMendingRepairCost(int repairAmount, int mendingLevel) {
        float finalCalculation = Math.max(2.0F * (float)repairAmount / (float)(mendingLevel + 3), 1.0F);
        return (int)finalCalculation;
    }

    @Inject(
            method = {"repairPlayerItems"},
            at = {@At(
                    value = "INVOKE_ASSIGN",
                    target = "Ljava/util/Map$Entry;getValue()Ljava/lang/Object;"
            )},
            locals = LocalCapture.CAPTURE_FAILSOFT
    )
    private void betterenchantments$repairPlayerItemsCapture(Player player, int amount, CallbackInfoReturnable<Integer> cir, Map.Entry entry) {
        this.currentMendingLevel = EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MENDING, (ItemStack)entry.getValue());
    }

    @Redirect(
            method = {"repairPlayerItems"},
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/world/item/ItemStack;getXpRepairRatio()F"
            )
    )
    private float betterenchantments$redirectRepairRatio(ItemStack stack) {
        return (float)this.getMendingRepairRatio(this.currentMendingLevel);
    }

    @Redirect(
            method = {"repairPlayerItems"},
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/world/entity/ExperienceOrb;durabilityToXp(I)I"
            )
    )
    private int betterenchantments$redirectRepairCost(ExperienceOrb instance, int repairAmount) {
        return this.getMendingRepairCost(repairAmount, this.currentMendingLevel);
    }
    @Redirect(
            method = {"repairPlayerItems"},
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/world/item/enchantment/EnchantmentHelper;" +
                            "getRandomItemWith(Lnet/minecraft/world/item/enchantment/Enchantment;" +
                            "Lnet/minecraft/world/entity/LivingEntity;Ljava/util/function/Predicate;)" +
                            "Ljava/util/Map$Entry;"
            )
    )
    public Map.Entry<EquipmentSlot, ItemStack> betterenchantments$getBestForMending(Enchantment enchant, LivingEntity entity, Predicate<ItemStack> list) {
        Map<EquipmentSlot, ItemStack> map = enchant.getSlotItems(entity);
        if (map.isEmpty()) {
            return null;
        } else {
            List<Map.Entry<EquipmentSlot, ItemStack>> list1 = Lists.newArrayList();

            for (Map.Entry<EquipmentSlot, ItemStack> equipmentSlotItemStackEntry : map.entrySet()) {
                ItemStack item = (ItemStack) ((Map.Entry<?, ?>) equipmentSlotItemStackEntry).getValue();
                if (!item.isEmpty() && EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MENDING, item) > 0) {
                    list1.add(equipmentSlotItemStackEntry);
                }
            }

            Map.Entry sEntry = null;
            int dmgAmnt = 0;

            for (Map.Entry<EquipmentSlot, ItemStack> equipmentSlotItemStackEntry : list1) {
                if (((Map.Entry<?, ?>) equipmentSlotItemStackEntry).getValue() != null && ((ItemStack) ((Map.Entry<?, ?>) equipmentSlotItemStackEntry).getValue()).isDamageableItem()) {
                    int amnt = ((ItemStack) ((Map.Entry<?, ?>) equipmentSlotItemStackEntry).getValue()).getDamageValue();
                    if (amnt > dmgAmnt) {
                        dmgAmnt = amnt;
                        sEntry = equipmentSlotItemStackEntry;
                    }
                }
            }
            return sEntry;
        }
    }
}
