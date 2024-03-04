package com.calibermc.naturescanvas.data.datagen;

import com.calibermc.caliberlib.data.datagen.ModItemTagProvider;
import com.calibermc.naturescanvas.NaturesCanvas;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class NCItemTagProvider extends ModItemTagProvider {
    public NCItemTagProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider,
                               CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, NaturesCanvas.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        super.addTags(pProvider);

    }
}

