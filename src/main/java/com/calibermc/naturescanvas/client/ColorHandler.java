package com.calibermc.naturescanvas.client;

import com.calibermc.naturescanvas.block.NCBlocks;
import com.calibermc.caliberlib.data.ModBlockFamily;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.world.level.GrassColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ColorHandler {

    @SubscribeEvent
    public static void onColorHandlerEvent(RegisterColorHandlersEvent.Block event) {
        event.register((state, reader, pos, tintIndex) -> {
            if (tintIndex == 0 && reader != null && pos != null) {
                // Apply biome color to the block
                return BiomeColors.getAverageGrassColor(reader, pos);
            } else {
                return GrassColor.get(0.5D, 1.0D);
            }
        }, NCBlocks.GRASS_LAYER.get());
    }
}