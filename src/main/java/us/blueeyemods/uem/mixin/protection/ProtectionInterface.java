/* package us.blueeyemods.uem.mixin.protection;


import net.minecraft.world.item.enchantment.ProtectionEnchantment;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import us.blueeyemods.uem.config.*;
import us.blueeyemods.uem.utils.IEnchantment;

@Mixin(ProtectionEnchantment.class)
public abstract class ProtectionInterface implements IEnchantment {
    @Final
    @Shadow
    public ProtectionEnchantment.Type type;
    public boolean isTreasureOnly() {
        return switch (type) {
            case ALL -> ProtectionConfig.SHOWS_UP_IN_ENCHANTMENT_TABLE;
            case FALL -> FallProtectionConfig.SHOWS_UP_IN_ENCHANTMENT_TABLE;
            case FIRE -> FireProtectionConfig.SHOWS_UP_IN_ENCHANTMENT_TABLE;
            case EXPLOSION -> BlastProtectionConfig.SHOWS_UP_IN_ENCHANTMENT_TABLE;
            case PROJECTILE -> ProjectileProtectionConfig.SHOWS_UP_IN_ENCHANTMENT_TABLE;
        };
    }
    public boolean isTradeable() {
        return switch (type) {
            case ALL -> ProtectionConfig.CAN_BE_OBTAINED_BY_TRADING_WITH_VILLAGERS;
            case FALL -> FallProtectionConfig.CAN_BE_OBTAINED_BY_TRADING_WITH_VILLAGERS;
            case FIRE -> FireProtectionConfig.CAN_BE_OBTAINED_BY_TRADING_WITH_VILLAGERS;
            case EXPLOSION -> BlastProtectionConfig.CAN_BE_OBTAINED_BY_TRADING_WITH_VILLAGERS;
            case PROJECTILE -> ProjectileProtectionConfig.CAN_BE_OBTAINED_BY_TRADING_WITH_VILLAGERS;
        };
    }
    public boolean isCurse() {
        return switch (type) {
            case ALL -> ProtectionConfig.IS_CURSE;
            case FALL -> FallProtectionConfig.IS_CURSE;
            case FIRE -> FireProtectionConfig.IS_CURSE;
            case EXPLOSION -> BlastProtectionConfig.IS_CURSE;
            case PROJECTILE -> ProjectileProtectionConfig.IS_CURSE;
        };
    }
    public boolean isDiscoverable() {
        return switch (type) {
            case ALL -> ProtectionConfig.DISCOVERABLE;
            case FALL -> FallProtectionConfig.DISCOVERABLE;
            case FIRE -> FireProtectionConfig.DISCOVERABLE;
            case EXPLOSION -> BlastProtectionConfig.DISCOVERABLE;
            case PROJECTILE -> ProjectileProtectionConfig.DISCOVERABLE;
        };
    }
    public boolean isAllowedOnBooks() {
        return switch (type) {
            case ALL -> ProtectionConfig.IS_ALLOWED_ON_BOOKS;
            case FALL -> FallProtectionConfig.IS_ALLOWED_ON_BOOKS;
            case FIRE -> FireProtectionConfig.IS_ALLOWED_ON_BOOKS;
            case EXPLOSION -> BlastProtectionConfig.IS_ALLOWED_ON_BOOKS;
            case PROJECTILE -> ProjectileProtectionConfig.IS_ALLOWED_ON_BOOKS;
        };
    }
} */
