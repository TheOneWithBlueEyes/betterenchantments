/* package us.blueeyemods.uem.mixin.unbreaking;


import net.minecraft.world.item.enchantment.DigDurabilityEnchantment;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.MendingEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import us.blueeyemods.uem.config.ModConfig;
import us.blueeyemods.uem.utils.IEnchantment;

@Mixin(DigDurabilityEnchantment.class)
public abstract class UnbreakingInterface implements IEnchantment {
    public boolean isTreasureOnly() {
        return ModConfig.UnbreakingConfig.TREASURE_ONLY;
    }
    public boolean isTradeable() {
        return ModConfig.UnbreakingConfig.TRADEABLE;
    }
    public boolean isCurse() {
        return ModConfig.UnbreakingConfig.IS_CURSE;
    }
    public boolean isDiscoverable() { return ModConfig.UnbreakingConfig.DISCOVERABLE; }
    public boolean isAllowedOnBooks() { return ModConfig.UnbreakingConfig.IS_ALLOWED_ON_BOOKS; }
    public boolean checkCompatibility(Enchantment pOther) {
        return ModConfig.UnbreakingConfig.COMPATIBLE_WITH_MENDING && pOther instanceof MendingEnchantment;
    }
} */
