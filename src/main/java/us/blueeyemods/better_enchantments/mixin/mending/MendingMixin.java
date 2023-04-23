package us.blueeyemods.better_enchantments.mixin.mending;

import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.MendingEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MendingEnchantment.class)
public class MendingMixin {
    int maxLvl = 255;

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
        return Enchantment.Rarity.VERY_RARE;
    }

    @Inject(
            method = {"getMaxLevel"},
            at = {@At("RETURN")},
            cancellable = true
    )
    public void betterenchantments$getMaxLevel(CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(Math.min(maxLvl, 255));
    }
}
