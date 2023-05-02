/* package us.blueeyemods.uem.mixin.unbreaking;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.DigDurabilityEnchantment;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import us.blueeyemods.uem.config.ModConfig;

@Mixin(DigDurabilityEnchantment.class)
public class UnbreakingMixin {
    @Inject(
            method = {"getMaxLevel"},
            at = {@At("RETURN")},
            cancellable = true
    )
    public void betterenchantments$getMaxLevel(CallbackInfoReturnable<Integer> cir) {
            cir.setReturnValue(Math.min(ModConfig.UnbreakingConfig.MAXIMUM_ENCHANTMENT_LEVEL, 255));
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
    private static Enchantment.Rarity betterenchantments$enchantmentRarityInjection(Enchantment.Rarity weight) {
            return ModConfig.UnbreakingConfig.ENCHANTMENT_RARITY;
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
    private static EnchantmentCategory betterenchantments$enchantmentCategoryInjection(EnchantmentCategory pCategory) {
        return ModConfig.UnbreakingConfig.ENCHANTMENT_CATEGORY;
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
    private static EquipmentSlot[] betterenchantments$enchantmentSlotInjection(EquipmentSlot[] pApplicableSlots) {
        return ModConfig.UnbreakingConfig.EQUIPMENT_SLOTS;
    }
} */