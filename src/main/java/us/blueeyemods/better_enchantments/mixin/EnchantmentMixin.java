package us.blueeyemods.better_enchantments.mixin;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.item.enchantment.Enchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(Enchantment.class)
public abstract class EnchantmentMixin {
    @Shadow
    protected abstract boolean isCurse();

    @Shadow
    protected abstract boolean isTreasureOnly();

    /**
     * @author -Kyle, TheOneWithBlueEyes
     * @reason
     */
    @Redirect(
            method = {"getFullname"},
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/network/chat/MutableComponent;withStyle(Lnet/minecraft/ChatFormatting;)Lnet/minecraft/network/chat/MutableComponent;"
            )
    )
    private MutableComponent betterenchantments$redirect(MutableComponent mutableComponent, ChatFormatting format) {
        if(this.isCurse()) {
            return mutableComponent.withStyle(ChatFormatting.ITALIC, ChatFormatting.DARK_RED);
        } else if(this.isTreasureOnly()) {
            return mutableComponent.withStyle(ChatFormatting.GOLD);
        } else {
            return mutableComponent.withStyle(ChatFormatting.GRAY);
        }
    }
}