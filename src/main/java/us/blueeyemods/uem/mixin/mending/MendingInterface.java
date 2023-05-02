/* package us.blueeyemods.uem.mixin.mending;


import net.minecraft.world.item.enchantment.MendingEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import us.blueeyemods.uem.config.ModConfig;
import us.blueeyemods.uem.utils.IEnchantment;

@Mixin(MendingEnchantment.class)
public abstract class MendingInterface implements IEnchantment {
    public boolean isTradeable() {
        return ModConfig.MyNestedStructure.TRADEABLE;
    };
    public boolean isCurse() { return ModConfig.MyNestedStructure.IS_CURSE; }
    public boolean isDiscoverable() { return ModConfig.MyNestedStructure.DISCOVERABLE; }
    public boolean isAllowedOnBooks() { return ModConfig.MyNestedStructure.IS_ALLOWED_ON_BOOKS; }
} */
