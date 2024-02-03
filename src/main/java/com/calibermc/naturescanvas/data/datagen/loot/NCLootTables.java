package com.calibermc.naturescanvas.data.datagen.loot;

import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.block.ModBlocks;
import com.calibermc.caliberlib.data.datagen.loot.ModBlockLootTables;
import com.calibermc.naturescanvas.NaturesCanvas;

public class NCLootTables extends ModBlockLootTables {

    public NCLootTables() {
        super(NaturesCanvas.MOD_ID);
    }

    @Override
    protected void generate() {
        craftingTables();
        metalsAndOres();
        plasterBlocks();
        super.generate();
    }

    private void craftingTables() {
        this.dropSelf(ModBlocks.KILN.get());
        this.dropSelf(ModBlocks.WOODCUTTER.get());
    }

    private void metalsAndOres() {
        this.dropSelf(ModBlocks.BRONZE_BLOCK.get());
    }

    private void plasterBlocks() {
        this.dropSelf(ModBlocks.BEIGE_PLASTER_POWDER.get());
        this.dropSelf(ModBlocks.BROWN_PLASTER_POWDER.get());
        this.dropSelf(ModBlocks.OCHRE_PLASTER_POWDER.get());
        this.dropSelf(ModBlocks.TAN_PLASTER_POWDER.get());
        this.dropSelf(ModBlocks.WHITE_PLASTER_POWDER.get());
    }
}

