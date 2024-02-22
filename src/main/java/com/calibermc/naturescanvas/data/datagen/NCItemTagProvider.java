package com.calibermc.naturescanvas.data.datagen;

import com.calibermc.naturescanvas.NaturesCanvas;
import com.calibermc.naturescanvas.block.NCBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class NCItemTagProvider extends ItemTagsProvider {
    public NCItemTagProvider(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                               CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, NaturesCanvas.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(NCBlocks.CEDAR_LOG.get().asItem())
                .add(NCBlocks.CEDAR_WOOD.get().asItem())
                .add(NCBlocks.STRIPPED_CEDAR_LOG.get().asItem())
                .add(NCBlocks.STRIPPED_CEDAR.baseBlock().asItem())
                .add(NCBlocks.FIR_LOG.get().asItem())
                .add(NCBlocks.FIR_WOOD.get().asItem())
                .add(NCBlocks.STRIPPED_FIR_LOG.get().asItem())
                .add(NCBlocks.STRIPPED_FIR.baseBlock().asItem())
                .add(NCBlocks.MAPLE_LOG.get().asItem())
                .add(NCBlocks.MAPLE_WOOD.get().asItem())
                .add(NCBlocks.STRIPPED_MAPLE_LOG.get().asItem())
                .add(NCBlocks.STRIPPED_MAPLE.baseBlock().asItem())
                .add(NCBlocks.PINE_LOG.get().asItem())
                .add(NCBlocks.PINE_WOOD.get().asItem())
                .add(NCBlocks.STRIPPED_PINE_LOG.get().asItem())
                .add(NCBlocks.STRIPPED_PINE.baseBlock().asItem());

    }
}

