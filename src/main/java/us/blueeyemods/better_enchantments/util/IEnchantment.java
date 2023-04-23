package us.blueeyemods.better_enchantments.util;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.item.enchantment.Enchantment;
import org.spongepowered.asm.mixin.Overwrite;

public interface IEnchantment {
    boolean checkCompatibility(Enchantment pEnch);

    int getMaxLevel();

    boolean isTradeable();

    boolean isDiscoverable();

    boolean isTreasureOnly();

    Enchantment.Rarity getRarity();

}
