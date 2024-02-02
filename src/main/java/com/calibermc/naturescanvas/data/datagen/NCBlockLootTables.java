package com.calibermc.naturescanvas.data.datagen;

import com.calibermc.caliberlib.block.custom.TallDoorBlock;
import com.calibermc.caliberlib.block.shapes.doors.TallDoorPart;
import com.calibermc.caliberlib.data.datagen.loot.ModBlockLootTables;
import com.calibermc.naturescanvas.NaturesCanvas;
import com.calibermc.naturescanvas.block.NCBlocks;
import com.calibermc.naturescanvas.item.NCItems;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraftforge.registries.RegistryObject;

public class NCBlockLootTables extends ModBlockLootTables {
    public NCBlockLootTables() {
        super(NaturesCanvas.MOD_ID);
    }

    @Override
    protected void generate() {
        metalsAndOres();
        terrainBlocks();
        treeBlocks();
        super.generate();
    }
    
    private void metalsAndOres() {
        add(NCBlocks.TIN_ORE.get(), (Block) ->
                createOreDrop(NCBlocks.TIN_ORE.get(), NCItems.RAW_TIN.get()));
        add(NCBlocks.DEEPSLATE_TIN_ORE.get(), (Block) ->
                createOreDrop(NCBlocks.DEEPSLATE_TIN_ORE.get(), NCItems.RAW_TIN.get()));
        this.dropSelf(NCBlocks.TIN_BLOCK.get());
        this.dropSelf(NCBlocks.RAW_TIN_BLOCK.get());

        add(NCBlocks.SILVER_ORE.get(), (Block) ->
                createOreDrop(NCBlocks.SILVER_ORE.get(), NCItems.RAW_SILVER.get()));
        add(NCBlocks.DEEPSLATE_SILVER_ORE.get(), (Block) ->
                createOreDrop(NCBlocks.DEEPSLATE_SILVER_ORE.get(), NCItems.RAW_SILVER.get()));
        this.dropSelf(NCBlocks.SILVER_BLOCK.get());
        this.dropSelf(NCBlocks.RAW_SILVER_BLOCK.get());
    }

    private void terrainBlocks() {
        this.dropSelf(NCBlocks.BLACK_SAND.get());
        this.dropSelf(NCBlocks.BROWN_SAND.get());
        this.dropSelf(NCBlocks.ORANGE_SAND.get());
        this.dropSelf(NCBlocks.WHITE_SAND.get());
        this.dropSelf(NCBlocks.BLACK_SAND_LAYER.get());
        this.dropSelf(NCBlocks.BROWN_SAND_LAYER.get());
        this.dropSelf(NCBlocks.ORANGE_SAND_LAYER.get());
        this.dropSelf(NCBlocks.RED_SAND_LAYER.get());
        this.dropSelf(NCBlocks.SAND_LAYER.get());
        this.dropSelf(NCBlocks.SOUL_SAND_LAYER.get());
        this.dropSelf(NCBlocks.WHITE_SAND_LAYER.get());

        this.dropSelf(NCBlocks.CLAY_LAYER.get());
        this.dropSelf(NCBlocks.COARSE_DIRT_LAYER.get());
        this.dropSelf(NCBlocks.DIRT_LAYER.get());
//        this.dropSelf(NCBlocks.FARMLAND_LAYER.get());
        this.dropSelf(NCBlocks.GRAVEL_LAYER.get());
        this.dropSelf(NCBlocks.GRASS_LAYER.get());
        this.dropSelf(NCBlocks.MYCELIUM_LAYER.get());
        this.dropSelf(NCBlocks.PODZOL_LAYER.get());
        this.dropSelf(NCBlocks.ROOTED_DIRT_LAYER.get());
        this.dropSelf(NCBlocks.SOUL_SOIL_LAYER.get());
        this.dropSelf(NCBlocks.CRIMSON_NYLIUM_LAYER.get());
        this.dropSelf(NCBlocks.WARPED_NYLIUM_LAYER.get());
    }

    private void treeBlocks() {
        this.dropSelf(NCBlocks.FIR_SAPLING.get());
        this.dropSelf(NCBlocks.FIR_LOG.get());
        this.dropSelf(NCBlocks.STRIPPED_FIR_LOG.get());
        this.dropSelf(NCBlocks.FIR_WOOD.get());
        this.dropSelf(NCBlocks.STRIPPED_FIR_WOOD.get());
        this.dropSelf(NCBlocks.FIR_LEAVES.get());
        this.dropSelf(NCBlocks.PINE_SAPLING.get());
        this.dropSelf(NCBlocks.PINE_LOG.get());
        this.dropSelf(NCBlocks.STRIPPED_PINE_LOG.get());
        this.dropSelf(NCBlocks.PINE_WOOD.get());
        this.dropSelf(NCBlocks.STRIPPED_PINE_WOOD.get());
        this.dropSelf(NCBlocks.PINE_LEAVES.get());
        this.dropSelf(NCBlocks.CEDAR_SAPLING.get());
        this.dropSelf(NCBlocks.CEDAR_LOG.get());
        this.dropSelf(NCBlocks.STRIPPED_CEDAR_LOG.get());
        this.dropSelf(NCBlocks.CEDAR_WOOD.get());
        this.dropSelf(NCBlocks.STRIPPED_CEDAR_WOOD.get());
        this.dropSelf(NCBlocks.CEDAR_LEAVES.get());
    }


    @Override
    protected Iterable<Block> getKnownBlocks() {
        return NCBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}