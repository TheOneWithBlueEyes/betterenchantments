package us.blueeyemods.uem.utils;

import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.ProtectionEnchantment;

public interface IEnchantment {
    boolean isTreasureOnly();
    boolean isTradeable();
    boolean isCurse();
    boolean isDiscoverable();
    boolean isAllowedOnBooks();
    boolean checkCompatibility(Enchantment pOther);
}
