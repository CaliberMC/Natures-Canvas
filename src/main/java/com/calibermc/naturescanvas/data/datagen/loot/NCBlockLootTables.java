package com.calibermc.naturescanvas.data.datagen.loot;

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
        craftingTables();
        metalsAndOres();
        plasterBlocks();
        terrainBlocks();
        treeBlocks();
        stainedPlanks();
        super.generate();
    }

    private void craftingTables() {
        this.dropSelf(NCBlocks.KILN.get());
    }

    private void metalsAndOres() {
        this.dropSelf(NCBlocks.BRONZE_BLOCK.get());
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

    private void plasterBlocks() {
        this.dropSelf(NCBlocks.BEIGE_PLASTER_POWDER.get());
        this.dropSelf(NCBlocks.BROWN_PLASTER_POWDER.get());
        this.dropSelf(NCBlocks.OCHRE_PLASTER_POWDER.get());
        this.dropSelf(NCBlocks.TAN_PLASTER_POWDER.get());
        this.dropSelf(NCBlocks.WHITE_PLASTER_POWDER.get());
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
        this.dropSelf(NCBlocks.DOUGLAS_FIR_SAPLING.get());
        this.dropSelf(NCBlocks.SUBALPINE_FIR_SAPLING.get());
        this.dropSelf(NCBlocks.FIR_LOG.get());
        this.dropSelf(NCBlocks.STRIPPED_FIR_LOG.get());
        this.dropSelf(NCBlocks.FIR_WOOD.get());
        this.dropSelf(NCBlocks.STRIPPED_FIR_WOOD.get());
        this.dropSelf(NCBlocks.FIR_LEAVES.get());
        this.dropSelf(NCBlocks.LODGEPOLE_PINE_SAPLING.get());
        this.dropSelf(NCBlocks.PONDEROSA_PINE_SAPLING.get());
        this.dropSelf(NCBlocks.PINE_LOG.get());
        this.dropSelf(NCBlocks.STRIPPED_PINE_LOG.get());
        this.dropSelf(NCBlocks.PINE_WOOD.get());
        this.dropSelf(NCBlocks.STRIPPED_PINE_WOOD.get());
        this.dropSelf(NCBlocks.PINE_LEAVES.get());
        this.dropSelf(NCBlocks.RED_CEDAR_SAPLING.get());
        this.dropSelf(NCBlocks.CEDAR_LOG.get());
        this.dropSelf(NCBlocks.STRIPPED_CEDAR_LOG.get());
        this.dropSelf(NCBlocks.CEDAR_WOOD.get());
        this.dropSelf(NCBlocks.STRIPPED_CEDAR_WOOD.get());
        this.dropSelf(NCBlocks.CEDAR_LEAVES.get());
    }

    private void stainedPlanks() {
        this.dropSelf(NCBlocks.STAINED_ACACIA_BUTTON.get());
        this.add(NCBlocks.STAINED_ACACIA_DOOR.get(), (block) -> createSinglePropConditionTable(NCBlocks.STAINED_ACACIA_DOOR.get(), DoorBlock.HALF, DoubleBlockHalf.LOWER));
        this.add(NCBlocks.STAINED_ACACIA_HANGING_SIGN.get(), (block) -> createSingleItemTable(NCBlocks.STAINED_ACACIA_HANGING_SIGN.get()));
        this.add(NCBlocks.STAINED_ACACIA_SIGN.get(), (block) -> createSingleItemTable(NCBlocks.STAINED_ACACIA_SIGN.get()));
        this.dropSelf(NCBlocks.STAINED_ACACIA_TRAPDOOR.get());
        this.add(NCBlocks.STAINED_ACACIA_WALL_HANGING_SIGN.get(), (block) -> createSingleItemTable(NCBlocks.STAINED_ACACIA_WALL_HANGING_SIGN.get()));
        this.add(NCBlocks.STAINED_ACACIA_WALL_SIGN.get(), (block) -> createSingleItemTable(NCBlocks.STAINED_ACACIA_WALL_SIGN.get()));
        this.dropSelf(NCBlocks.STAINED_BIRCH_BUTTON.get());
        this.add(NCBlocks.STAINED_BIRCH_DOOR.get(), (block) -> createSinglePropConditionTable(NCBlocks.TALL_STAINED_ACACIA_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
        this.add(NCBlocks.STAINED_BIRCH_HANGING_SIGN.get(), (block) -> createSingleItemTable(NCBlocks.STAINED_BIRCH_HANGING_SIGN.get()));
        this.add(NCBlocks.STAINED_BIRCH_SIGN.get(), (block) -> createSingleItemTable(NCBlocks.STAINED_BIRCH_SIGN.get()));
        this.dropSelf(NCBlocks.STAINED_BIRCH_TRAPDOOR.get());
        this.add(NCBlocks.STAINED_BIRCH_WALL_HANGING_SIGN.get(), (block) -> createSingleItemTable(NCBlocks.STAINED_BIRCH_WALL_HANGING_SIGN.get()));
        this.add(NCBlocks.STAINED_BIRCH_WALL_SIGN.get(), (block) -> createSingleItemTable(NCBlocks.STAINED_BIRCH_WALL_SIGN.get()));
        this.dropSelf(NCBlocks.STAINED_DARK_OAK_BUTTON.get());
        this.add(NCBlocks.STAINED_DARK_OAK_DOOR.get(), (block) -> createSinglePropConditionTable(NCBlocks.STAINED_DARK_OAK_DOOR.get(), DoorBlock.HALF, DoubleBlockHalf.LOWER));
        this.add(NCBlocks.STAINED_DARK_OAK_HANGING_SIGN.get(), (block) -> createSingleItemTable(NCBlocks.STAINED_DARK_OAK_HANGING_SIGN.get()));
        this.add(NCBlocks.STAINED_DARK_OAK_SIGN.get(), (block) -> createSingleItemTable(NCBlocks.STAINED_DARK_OAK_SIGN.get()));
        this.dropSelf(NCBlocks.STAINED_DARK_OAK_TRAPDOOR.get());
        this.add(NCBlocks.STAINED_DARK_OAK_WALL_HANGING_SIGN.get(), (block) -> createSingleItemTable(NCBlocks.STAINED_DARK_OAK_WALL_HANGING_SIGN.get()));
        this.add(NCBlocks.STAINED_DARK_OAK_WALL_SIGN.get(), (block) -> createSingleItemTable(NCBlocks.STAINED_DARK_OAK_WALL_SIGN.get()));
        this.dropSelf(NCBlocks.STAINED_JUNGLE_BUTTON.get());
        this.add(NCBlocks.STAINED_JUNGLE_DOOR.get(), (block) -> createSinglePropConditionTable(NCBlocks.STAINED_JUNGLE_DOOR.get(), DoorBlock.HALF, DoubleBlockHalf.LOWER));
        this.add(NCBlocks.STAINED_JUNGLE_HANGING_SIGN.get(), (block) -> createSingleItemTable(NCBlocks.STAINED_JUNGLE_HANGING_SIGN.get()));
        this.add(NCBlocks.STAINED_JUNGLE_SIGN.get(), (block) -> createSingleItemTable(NCBlocks.STAINED_JUNGLE_SIGN.get()));
        this.dropSelf(NCBlocks.STAINED_JUNGLE_TRAPDOOR.get());
        this.add(NCBlocks.STAINED_JUNGLE_WALL_HANGING_SIGN.get(), (block) -> createSingleItemTable(NCBlocks.STAINED_JUNGLE_WALL_HANGING_SIGN.get()));
        this.add(NCBlocks.STAINED_JUNGLE_WALL_SIGN.get(), (block) -> createSingleItemTable(NCBlocks.STAINED_JUNGLE_WALL_SIGN.get()));
        this.dropSelf(NCBlocks.STAINED_OAK_BUTTON.get());
        this.add(NCBlocks.STAINED_OAK_DOOR.get(), (block) -> createSinglePropConditionTable(NCBlocks.STAINED_OAK_DOOR.get(), DoorBlock.HALF, DoubleBlockHalf.LOWER));
        this.add(NCBlocks.STAINED_OAK_HANGING_SIGN.get(), (block) -> createSingleItemTable(NCBlocks.STAINED_OAK_HANGING_SIGN.get()));
        this.add(NCBlocks.STAINED_OAK_SIGN.get(), (block) -> createSingleItemTable(NCBlocks.STAINED_OAK_SIGN.get()));
        this.dropSelf(NCBlocks.STAINED_OAK_TRAPDOOR.get());
        this.add(NCBlocks.STAINED_OAK_WALL_HANGING_SIGN.get(), (block) -> createSingleItemTable(NCBlocks.STAINED_OAK_WALL_HANGING_SIGN.get()));
        this.add(NCBlocks.STAINED_OAK_WALL_SIGN.get(), (block) -> createSingleItemTable(NCBlocks.STAINED_OAK_WALL_SIGN.get()));
        this.dropSelf(NCBlocks.STAINED_SPRUCE_BUTTON.get());
        this.add(NCBlocks.STAINED_SPRUCE_DOOR.get(), (block) -> createSinglePropConditionTable(NCBlocks.STAINED_SPRUCE_DOOR.get(), DoorBlock.HALF, DoubleBlockHalf.LOWER));
        this.add(NCBlocks.STAINED_SPRUCE_HANGING_SIGN.get(), (block) -> createSingleItemTable(NCBlocks.STAINED_SPRUCE_HANGING_SIGN.get()));
        this.add(NCBlocks.STAINED_SPRUCE_SIGN.get(), (block) -> createSingleItemTable(NCBlocks.STAINED_SPRUCE_SIGN.get()));
        this.dropSelf(NCBlocks.STAINED_SPRUCE_TRAPDOOR.get());
        this.add(NCBlocks.STAINED_SPRUCE_WALL_HANGING_SIGN.get(), (block) -> createSingleItemTable(NCBlocks.STAINED_SPRUCE_WALL_HANGING_SIGN.get()));
        this.add(NCBlocks.STAINED_SPRUCE_WALL_SIGN.get(), (block) -> createSingleItemTable(NCBlocks.STAINED_SPRUCE_WALL_SIGN.get()));

        this.add(NCBlocks.TALL_STAINED_ACACIA_DOOR.get(), (block) -> createSinglePropConditionTable(NCBlocks.TALL_STAINED_ACACIA_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
        this.add(NCBlocks.TALL_STAINED_BIRCH_DOOR.get(), (block) -> createSinglePropConditionTable(NCBlocks.TALL_STAINED_BIRCH_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
        this.add(NCBlocks.TALL_STAINED_DARK_OAK_DOOR.get(), (block) -> createSinglePropConditionTable(NCBlocks.TALL_STAINED_DARK_OAK_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
        this.add(NCBlocks.TALL_STAINED_JUNGLE_DOOR.get(), (block) -> createSinglePropConditionTable(NCBlocks.TALL_STAINED_JUNGLE_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
        this.add(NCBlocks.TALL_STAINED_OAK_DOOR.get(), (block) -> createSinglePropConditionTable(NCBlocks.TALL_STAINED_OAK_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
        this.add(NCBlocks.TALL_STAINED_SPRUCE_DOOR.get(), (block) -> createSinglePropConditionTable(NCBlocks.TALL_STAINED_SPRUCE_DOOR.get(), TallDoorBlock.THIRD, TallDoorPart.BOTTOM));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return NCBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}