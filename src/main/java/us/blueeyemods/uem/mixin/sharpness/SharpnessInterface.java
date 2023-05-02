/* package us.blueeyemods.uem.mixin.sharpness;


import net.minecraft.world.item.enchantment.DamageEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import us.blueeyemods.uem.utils.IEnchantment;

@Mixin(DamageEnchantment.class)
public abstract class SharpnessInterface implements IEnchantment {
    public boolean isTreasureOnly() {
        return !SharpnessConfig.SHOWS_UP_IN_ENCHANTMENT_TABLE;
    }
    public boolean isTradeable() {
        return SharpnessConfig.CAN_BE_OBTAINED_BY_TRADING_WITH_VILLAGERS;
    };
    public boolean isCurse() { return SharpnessConfig.IS_CURSE; }
    public boolean isDiscoverable() { return SharpnessConfig.DISCOVERABLE; }
    public boolean isAllowedOnBooks() { return SharpnessConfig.IS_ALLOWED_ON_BOOKS; }
} */
