package us.blueeyemods.uem.config;

import dev.toma.configuration.config.Config;
import dev.toma.configuration.config.Configurable;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import us.blueeyemods.uem.Main;

@Config(id = "blueeyemods/" + Main.MODID + "/common")
public class ModConfig {
        @Configurable
        public MyNestedStructure myConfigurableStructure = new MyNestedStructure();

        public static class MyNestedStructure {
                @Configurable
                public Enchantment.Rarity ENCHANTMENT_RARITY = Enchantment.Rarity.RARE;
                @Configurable
                public EnchantmentCategory ENCHANTMENT_CATEGORY = EnchantmentCategory.BREAKABLE;
                @Configurable
                public EquipmentSlot[] EQUIPMENT_SLOTS = new EquipmentSlot[]{EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET, EquipmentSlot.MAINHAND, EquipmentSlot.OFFHAND};
                @Configurable
                public int MAXIMUM_ENCHANTMENT_LEVEL = 1;
                @Configurable
                public boolean TREASURE_ONLY = true;
                @Configurable
                public boolean DISCOVERABLE = true;
                @Configurable
                public boolean TRADEABLE = true;
                @Configurable
                public boolean IS_ALLOWED_ON_BOOKS = true;
                @Configurable
                public boolean IS_CURSE = false;

        }
}





/*
@SuppressWarnings({"unused", "FieldMayBeFinal"})
@Config(name = "blueeyemods/" + Main.MODID + "/common")
public class ModConfig extends PartitioningSerializer.GlobalData {
    @ConfigEntry.Category("mending")
    @ConfigEntry.Gui.TransitiveObject
    public MendingConfig mending = new MendingConfig();
    @ConfigEntry.Category("unbreaking")
    @ConfigEntry.Gui.TransitiveObject
    public UnbreakingConfig unbreaking = new UnbreakingConfig();
    @ConfigEntry.Category("infinity")
    @ConfigEntry.Gui.TransitiveObject
    public InfinityConfig infinity = new InfinityConfig();

    @Config(name = "mending")
    public static class MendingConfig implements ConfigData {
        @ConfigEntry.Gui.EnumHandler(option = ConfigEntry.Gui.EnumHandler.EnumDisplayOption.DROPDOWN)
        @ConfigEntry.Gui.Tooltip
        public static Enchantment.Rarity ENCHANTMENT_RARITY = Enchantment.Rarity.RARE;
        @ConfigEntry.Gui.EnumHandler(option = ConfigEntry.Gui.EnumHandler.EnumDisplayOption.DROPDOWN)
        @ConfigEntry.Gui.Tooltip
        public static EnchantmentCategory ENCHANTMENT_CATEGORY = EnchantmentCategory.BREAKABLE;
        @ConfigEntry.Gui.Excluded
        public static EquipmentSlot[] EQUIPMENT_SLOTS = new EquipmentSlot[]{EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET, EquipmentSlot.MAINHAND, EquipmentSlot.OFFHAND};
        @ConfigEntry.Gui.Tooltip
        public static int MAXIMUM_ENCHANTMENT_LEVEL = 1;
        @ConfigEntry.Gui.Tooltip
        public static boolean TREASURE_ONLY = true;
        @ConfigEntry.Gui.Tooltip
        public static boolean DISCOVERABLE = true;
        @ConfigEntry.Gui.Tooltip
        public static boolean TRADEABLE = true;
        @ConfigEntry.Gui.Tooltip
        public static boolean IS_ALLOWED_ON_BOOKS = true;
        @ConfigEntry.Gui.Tooltip
        public static boolean IS_CURSE = false;

    }
    @Config(name = "unbreaking")
    public static class UnbreakingConfig implements ConfigData {
        @ConfigEntry.Gui.EnumHandler(option = ConfigEntry.Gui.EnumHandler.EnumDisplayOption.DROPDOWN)
        @ConfigEntry.Gui.Tooltip
        public static Enchantment.Rarity ENCHANTMENT_RARITY = Enchantment.Rarity.UNCOMMON;
        @ConfigEntry.Gui.EnumHandler(option = ConfigEntry.Gui.EnumHandler.EnumDisplayOption.DROPDOWN)
        @ConfigEntry.Gui.Tooltip
        public static EnchantmentCategory ENCHANTMENT_CATEGORY = EnchantmentCategory.BREAKABLE;
        @ConfigEntry.Gui.Excluded
        public static EquipmentSlot[] EQUIPMENT_SLOTS = new EquipmentSlot[]{EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET, EquipmentSlot.MAINHAND, EquipmentSlot.OFFHAND};
        @ConfigEntry.Gui.Tooltip
        public static int MAXIMUM_ENCHANTMENT_LEVEL = 3;
        @ConfigEntry.Gui.Tooltip
        public static boolean TREASURE_ONLY = false;
        @ConfigEntry.Gui.Tooltip
        public static boolean DISCOVERABLE = true;
        @ConfigEntry.Gui.Tooltip
        public static boolean TRADEABLE = true;
        @ConfigEntry.Gui.Tooltip
        public static boolean COMPATIBLE_WITH_MENDING = true;
        @ConfigEntry.Gui.Tooltip
        public static boolean IS_ALLOWED_ON_BOOKS = true;
        @ConfigEntry.Gui.Tooltip
        public static boolean IS_CURSE = false;

    }
    @Config(name = "infinity")
    public static class InfinityConfig implements ConfigData {
        @ConfigEntry.Gui.EnumHandler(option = ConfigEntry.Gui.EnumHandler.EnumDisplayOption.DROPDOWN)
        @ConfigEntry.Gui.Tooltip
        public static Enchantment.Rarity ENCHANTMENT_RARITY = Enchantment.Rarity.UNCOMMON;
        @ConfigEntry.Gui.EnumHandler(option = ConfigEntry.Gui.EnumHandler.EnumDisplayOption.DROPDOWN)
        @ConfigEntry.Gui.Tooltip
        public static EnchantmentCategory ENCHANTMENT_CATEGORY = EnchantmentCategory.BOW;
        @ConfigEntry.Gui.Excluded
        public static EquipmentSlot[] EQUIPMENT_SLOTS = new EquipmentSlot[]{EquipmentSlot.MAINHAND, EquipmentSlot.OFFHAND};
        @ConfigEntry.Gui.Tooltip
        public static int MAXIMUM_ENCHANTMENT_LEVEL = 1;
        @ConfigEntry.Gui.Tooltip
        public static boolean TREASURE_ONLY = true;
        @ConfigEntry.Gui.Tooltip
        public static boolean DISCOVERABLE = true;
        @ConfigEntry.Gui.Tooltip
        public static boolean TRADEABLE = true;
        @ConfigEntry.Gui.Tooltip
        public static boolean COMPATIBLE_WITH_MENDING = true;
        @ConfigEntry.Gui.Tooltip
        public static boolean IS_ALLOWED_ON_BOOKS = true;
        @ConfigEntry.Gui.Tooltip
        public static boolean IS_CURSE = false;

    }
} */