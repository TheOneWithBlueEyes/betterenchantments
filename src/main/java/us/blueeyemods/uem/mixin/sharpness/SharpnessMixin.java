/* package us.blueeyemods.uem.mixin.sharpness;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.DamageEnchantment;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(DamageEnchantment.class)
public class SharpnessMixin {
    @Inject(
            method = {"getMaxLevel"},
            at = {@At("RETURN")},
            cancellable = true
    )
    public void betterenchantments$getMaxLevel(CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(Math.min(SharpnessConfig.MAXIMUM_ENCHANTMENT_LEVEL, 255));
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
        return SharpnessConfig.ENCHANTMENT_RARITY;
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
        return SharpnessConfig.ENCHANTMENT_CATEGORY;
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
        return SharpnessConfig.EQUIPMENT_SLOTS;
    }

    @Inject(
            method = {"checkCompatibility"},
            at = @At(
                    value = "RETURN",
                    target = "Lnet/minecraft/world/item/enchantment/DamageEnchantment;checkCompatibility(Lnet/minecraft/world/item/enchantment/Enchantment;)Z"
            ),
            cancellable = true)
    public void betterenchantments$checkCompatibility(Enchantment pEnch, CallbackInfoReturnable<Boolean> cir) {
        if (SharpnessConfig.COMPATIBLE_WITH_OTHER_DAMAGE_ENCHANTMENTS) {
            cir.setReturnValue(true);
        } else {
            cir.setReturnValue(false);
        }
    }
} */