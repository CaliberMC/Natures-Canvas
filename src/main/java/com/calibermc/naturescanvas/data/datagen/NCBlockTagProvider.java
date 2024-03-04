package com.calibermc.naturescanvas.data.datagen;

import com.calibermc.caliberlib.data.datagen.ModBlockTagProvider;
import com.calibermc.naturescanvas.NaturesCanvas;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class NCBlockTagProvider extends ModBlockTagProvider {
    public NCBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, NaturesCanvas.MOD_ID, existingFileHelper);
    }
    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        super.addTags(pProvider);

    }
}



