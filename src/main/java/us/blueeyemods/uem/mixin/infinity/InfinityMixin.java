/* package us.blueeyemods.uem.mixin.infinity;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.ArrowInfiniteEnchantment;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import us.blueeyemods.uem.config.ModConfig;

@Mixin(ArrowInfiniteEnchantment.class)
public class InfinityMixin {
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
        return ModConfig.InfinityConfig.ENCHANTMENT_RARITY;
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
        return ModConfig.InfinityConfig.ENCHANTMENT_CATEGORY;
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
        return ModConfig.InfinityConfig.EQUIPMENT_SLOTS;
    }
    @Inject(
            method = {"checkCompatibility"},
            at = @At(
                    value = "RETURN",
                    target = "Lnet/minecraft/world/item/enchantment/Enchantment;checkCompatibility(Lnet/minecraft/world/item/enchantment/Enchantment;)Z"
            ),
            cancellable = true)
    public void betterenchantments$checkCompatibility(Enchantment pEnch, CallbackInfoReturnable<Boolean> cir) {
            cir.setReturnValue(ModConfig.InfinityConfig.COMPATIBLE_WITH_MENDING);
    }
} */