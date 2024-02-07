package com.calibermc.naturescanvas;

import com.calibermc.naturescanvas.block.NCBlocks;
import com.calibermc.naturescanvas.block.entity.NCBlockEntities;
import com.calibermc.naturescanvas.block.properties.NCWoodType;
import com.calibermc.naturescanvas.config.NCClientConfigs;
import com.calibermc.naturescanvas.config.NCCommonConfigs;
import com.calibermc.naturescanvas.crafting.NCMenuTypes;
import com.calibermc.naturescanvas.crafting.NCRecipeSerializers;
import com.calibermc.naturescanvas.item.NCCreativeTab;
import com.calibermc.naturescanvas.item.NCItems;
import com.calibermc.naturescanvas.networking.NCNetworking;
import com.calibermc.naturescanvas.data.NCBlockFamilies;
import com.calibermc.naturescanvas.util.compat.BuildifyBlockPicker;
import com.calibermc.naturescanvas.worldgen.NCTerrablender;
import com.calibermc.naturescanvas.worldgen.feature.NCFeatures;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraft.world.inventory.RecipeBookType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
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

    public static final RecipeBookType KILN_BOOK_TYPE = RecipeBookType.create("kiln");


    public NaturesCanvas() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
//        System.setProperty("mod.dataGen", "true");
        System.out.println("Data Generation Flag: " + System.getProperty("mod.dataGen"));
        NCItems.register(eventBus);
        NCBlocks.register(eventBus);
        NCCreativeTab.register(eventBus);
        NCMenuTypes.register(eventBus);
        NCBlockEntities.register(eventBus);
        NCRecipeSerializers.register(eventBus);

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
//        BuildifyBlockPicker.init();
    }


    private void interModProcess(final InterModProcessEvent event) {
        if (ModList.get().isLoaded("buildify")) {
            event.enqueueWork(() -> {
                new NCBlockFamilies().register();
            });
        }
    }

}
