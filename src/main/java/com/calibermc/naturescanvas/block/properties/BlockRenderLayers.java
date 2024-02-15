package com.calibermc.naturescanvas.block.properties;

import com.calibermc.caliber.block.CaliberBlocks;
import com.calibermc.naturescanvas.NaturesCanvas;
import com.calibermc.naturescanvas.block.NCBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class BlockRenderLayers {
    public static void set() {

        ItemBlockRenderTypes.setRenderLayer(NCBlocks.CEDAR_LEAVES.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(NCBlocks.FIR_LEAVES.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(NCBlocks.PINE_LEAVES.get(), RenderType.cutoutMipped());
//        ItemBlockRenderTypes.setRenderLayer(NCBlocks.RED_CEDAR_SAPLING.get(), RenderType.cutout());

    }
}

