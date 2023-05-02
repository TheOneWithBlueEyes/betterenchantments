package us.blueeyemods.uem;

import dev.toma.configuration.Configuration;
import dev.toma.configuration.config.format.ConfigFormats;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Main.MODID)
public class Main {
    public static final String MODID = "uem";

    public static ModConfig config;

    public Main() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);
        config = Configuration.registerConfig(ModConfig.class, ConfigFormats.json()).getConfigInstance();
    }
}

  /*  @SubscribeEvent
    public static void onLoadComplete(FMLLoadCompleteEvent e) throws IllegalAccessException {
        Field rarityField = ObfuscationReflectionHelper.findField(Enchantment.class, "f_44674_");
        Field maxLevelField = ObfuscationReflectionHelper.findField(Enchantment.class, "getMaxLevel");
        rarityField.set(Enchantments.ALL_DAMAGE_PROTECTION, ProtectionConfig.ENCHANTMENT_RARITY);
        rarityField.set(Enchantments.FIRE_PROTECTION, CONFIG_VALUE);
        rarityField.set(Enchantments.FALL_PROTECTION, CONFIG_VALUE);
    } */