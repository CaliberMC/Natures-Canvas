package com.calibermc.naturescanvas.data.datagen;

import com.calibermc.naturescanvas.NaturesCanvas;
import com.calibermc.naturescanvas.block.NCBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class NCBlockTagProvider extends BlockTagsProvider {
    public NCBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, NaturesCanvas.MOD_ID, existingFileHelper);
    }
    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(NCBlocks.CEDAR_LOG.get())
                .add(NCBlocks.CEDAR_WOOD.get())
                .add(NCBlocks.STRIPPED_CEDAR_LOG.get())
                .add(NCBlocks.STRIPPED_CEDAR.baseBlock())
                .add(NCBlocks.FIR_LOG.get())
                .add(NCBlocks.FIR_WOOD.get())
                .add(NCBlocks.STRIPPED_FIR_LOG.get())
                .add(NCBlocks.STRIPPED_FIR.baseBlock())
                .add(NCBlocks.MAPLE_LOG.get())
                .add(NCBlocks.MAPLE_WOOD.get())
                .add(NCBlocks.STRIPPED_MAPLE_LOG.get())
                .add(NCBlocks.STRIPPED_MAPLE.baseBlock())
                .add(NCBlocks.PINE_LOG.get())
                .add(NCBlocks.PINE_WOOD.get())
                .add(NCBlocks.STRIPPED_PINE_LOG.get())
                .add(NCBlocks.STRIPPED_PINE.baseBlock());

    }
}

