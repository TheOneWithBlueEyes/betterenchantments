/* package us.blueeyemods.uem.mixin.protection;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.ProtectionEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import us.blueeyemods.uem.config.*;
@Mixin(ProtectionEnchantment.class)
public class ProtectionMixin {
    private static ProtectionEnchantment.Type betterenchantments$savedProtectionType;
    @ModifyVariable(
            method = {"<init>"},
            at = @At(
                    value = "HEAD"
            ),
            ordinal = 0,
            argsOnly = true)
    private static ProtectionEnchantment.Type betterenchantments$savedProtectionType(ProtectionEnchantment.Type pType) {
        betterenchantments$savedProtectionType = pType;
        return pType;
    }
    @Inject(
            method = {"getMaxLevel"},
            at = {@At("RETURN")},
            cancellable = true
    )
    public void betterenchantments$getMaxLevel(CallbackInfoReturnable<Integer> cir) {
        switch (betterenchantments$savedProtectionType) {
            case ALL -> cir.setReturnValue(Math.min(ProtectionConfig.MAXIMUM_ENCHANTMENT_LEVEL, 255));
            case FALL -> cir.setReturnValue(Math.min(FallProtectionConfig.MAXIMUM_ENCHANTMENT_LEVEL, 255));
            case FIRE -> cir.setReturnValue(Math.min(FireProtectionConfig.MAXIMUM_ENCHANTMENT_LEVEL, 255));
            case EXPLOSION -> cir.setReturnValue(Math.min(BlastProtectionConfig.MAXIMUM_ENCHANTMENT_LEVEL, 255));
            case PROJECTILE -> cir.setReturnValue(Math.min(ProjectileProtectionConfig.MAXIMUM_ENCHANTMENT_LEVEL, 255));

        }
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
    private static Enchantment.Rarity betterenchantments$modifyEnchantmentRarity(Enchantment.Rarity pRarity) {
        return switch (betterenchantments$savedProtectionType) {
            case ALL -> ProtectionConfig.ENCHANTMENT_RARITY;
            case FALL -> FallProtectionConfig.ENCHANTMENT_RARITY;
            case FIRE -> FireProtectionConfig.ENCHANTMENT_RARITY;
            case EXPLOSION -> BlastProtectionConfig.ENCHANTMENT_RARITY;
            case PROJECTILE -> ProjectileProtectionConfig.ENCHANTMENT_RARITY;
        };
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
        return switch (betterenchantments$savedProtectionType) {
            case ALL -> ProtectionConfig.ENCHANTMENT_CATEGORY;
            case FALL -> FallProtectionConfig.ENCHANTMENT_CATEGORY;
            case FIRE -> FireProtectionConfig.ENCHANTMENT_CATEGORY;
            case EXPLOSION -> BlastProtectionConfig.ENCHANTMENT_CATEGORY;
            case PROJECTILE -> ProjectileProtectionConfig.ENCHANTMENT_CATEGORY;
        };
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
        return switch (betterenchantments$savedProtectionType) {
            case ALL -> ProtectionConfig.EQUIPMENT_SLOTS;
            case FALL -> FallProtectionConfig.EQUIPMENT_SLOTS;
            case FIRE -> FireProtectionConfig.EQUIPMENT_SLOTS;
            case EXPLOSION -> BlastProtectionConfig.EQUIPMENT_SLOTS;
            case PROJECTILE -> ProjectileProtectionConfig.EQUIPMENT_SLOTS;
        };
    }
} */