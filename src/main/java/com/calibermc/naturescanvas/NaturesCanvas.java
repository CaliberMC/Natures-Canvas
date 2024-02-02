package com.calibermc.naturescanvas;

import com.calibermc.naturescanvas.block.NCBlocks;
import com.calibermc.naturescanvas.config.NCClientConfigs;
import com.calibermc.naturescanvas.config.NCCommonConfigs;
import com.calibermc.naturescanvas.item.NCCreativeTab;
import com.calibermc.naturescanvas.item.NCItems;
import com.calibermc.naturescanvas.networking.NCNetworking;
import com.calibermc.naturescanvas.util.NCBlockFamilies;
import com.calibermc.naturescanvas.worldgen.NCTerrablender;
import com.calibermc.naturescanvas.worldgen.feature.NCFeatures;
import net.minecraft.world.inventory.RecipeBookType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(NaturesCanvas.MOD_ID)
public class NaturesCanvas {
    public static final String MOD_ID = "naturescanvas";
    public static final String BLOCK_ID = "caliber";

    public static final Logger LOGGER = LogManager.getLogger();



    public NaturesCanvas() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        NCItems.register(eventBus);
        NCBlocks.register(eventBus);
        NCCreativeTab.register(eventBus);

        NCFeatures.register(eventBus);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::interModProcess);

        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, NCClientConfigs.SPEC, "naturescanvas-client.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, NCCommonConfigs.SPEC, "naturescanvas-common.toml");

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("Loading NaturesCanvas Mod");

        NCNetworking.registerMessages();
        NCBlocks.printBlockCounts();
        NCTerrablender.registerRegions(); //?
    }

    private void interModProcess(final InterModProcessEvent event) {
        if (ModList.get().isLoaded("caliber")) {
            event.enqueueWork(() -> {
                new NCBlockFamilies();
            });
        }
    }

}
