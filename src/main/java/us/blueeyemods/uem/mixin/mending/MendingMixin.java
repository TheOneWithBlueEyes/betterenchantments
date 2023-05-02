/* package us.blueeyemods.uem.mixin.mending;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.MendingEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import us.blueeyemods.uem.config.ModConfig;

@Mixin(MendingEnchantment.class)
public class MendingMixin {
    @Inject(
            method = {"getMaxLevel"},
            at = {@At("RETURN")},
            cancellable = true
    )
    public void betterenchantments$getMaxLevel(CallbackInfoReturnable<Integer> cir) {
            cir.setReturnValue(Math.min(ModConfig.MyNestedStructure.MAXIMUM_ENCHANTMENT_LEVEL, 255));
    }
    @Inject(
            method = {"isTreasureOnly"},
            at = {@At("RETURN")},
            cancellable = true
    )
    public void betterenchantments$isTreasureOnly(CallbackInfoReturnable<Boolean> cir) {
            cir.setReturnValue(ModConfig.MyNestedStructure.TREASURE_ONLY);
    }
    @ModifyArg(
            method = {"<init>"},
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/world/item/enchantment/Enchantment;" +
                            "<init>(Lnet/minecraft/world/item/enchantment/Enchantment$Rarity;" +
                            "Lnet/minecraft/world/item/enchantment/EnchantmentCategory;" +
                            "[Lnet/minecraft/world/entity/EquipmentSlot;)V"
            ),
            index = 0
    )
    private static Enchantment.Rarity betterenchantments$modifyEnchantmentRarity(Enchantment.Rarity weight) {
        return ModConfig.MyNestedStructure.ENCHANTMENT_RARITY;
    }
    @ModifyArg(
            method = {"<init>"},
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/world/item/enchantment/Enchantment;" +
                            "<init>(Lnet/minecraft/world/item/enchantment/Enchantment$Rarity;" +
                            "Lnet/minecraft/world/item/enchantment/EnchantmentCategory;" +
                            "[Lnet/minecraft/world/entity/EquipmentSlot;)V"
            ),
            index = 1
    )
    private static EnchantmentCategory betterenchantments$modifyEnchantmentCategory(EnchantmentCategory pCategory) {
        return ModConfig.MyNestedStructure.ENCHANTMENT_CATEGORY;
    }
    @ModifyArg(
            method = {"<init>"},
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/world/item/enchantment/Enchantment;" +
                            "<init>(Lnet/minecraft/world/item/enchantment/Enchantment$Rarity;" +
                            "Lnet/minecraft/world/item/enchantment/EnchantmentCategory;" +
                            "[Lnet/minecraft/world/entity/EquipmentSlot;)V"
            ),
            index = 2
    )
    private static EquipmentSlot[] betterenchantments$modifyEnchantmentSlots(EquipmentSlot[] pApplicableSlots) {
        return ModConfig.MyNestedStructure.EQUIPMENT_SLOTS;
    }
} */
