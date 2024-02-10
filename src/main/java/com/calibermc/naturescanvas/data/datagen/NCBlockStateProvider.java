package com.calibermc.naturescanvas.data.datagen;

import com.calibermc.caliberlib.block.custom.TallDoorBlock;
import com.calibermc.caliberlib.data.datagen.ModBlockStateProvider;
import com.calibermc.naturescanvas.NaturesCanvas;
import com.calibermc.naturescanvas.block.NCBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class NCBlockStateProvider extends ModBlockStateProvider {
    public NCBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, NaturesCanvas.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(NCBlocks.BRONZE_BLOCK.get());
        metalBlocks();
        plasterBlocks();
        terrainBlocks();
        treeBlocks();
        stainedPlanks();
        super.registerStatesAndModels();
    }

    private void plasterBlocks() {
        simpleBlock(NCBlocks.BEIGE_PLASTER_POWDER.get());
        simpleBlock(NCBlocks.BROWN_PLASTER_POWDER.get());
        simpleBlock(NCBlocks.OCHRE_PLASTER_POWDER.get());
        simpleBlock(NCBlocks.TAN_PLASTER_POWDER.get());
        simpleBlock(NCBlocks.WHITE_PLASTER_POWDER.get());
    }

    private void terrainBlocks() {
        simpleBlock(NCBlocks.BLACK_SAND.get());
        simpleBlock(NCBlocks.BROWN_SAND.get());
        simpleBlock(NCBlocks.ORANGE_SAND.get());
        simpleBlock(NCBlocks.WHITE_SAND.get());    // Maybe way to make item models?
//        simpleBlockItem(NCBlocks.BLACK_SAND.get(), itemModels().withExistingParent("black_sand", "caliber:block/black_sand"));
    }

    private void metalBlocks() {
        simpleBlock(NCBlocks.TIN_BLOCK.get());
        simpleBlock(NCBlocks.RAW_TIN_BLOCK.get());
        simpleBlock(NCBlocks.TIN_ORE.get());
        simpleBlock(NCBlocks.DEEPSLATE_TIN_ORE.get());

        simpleBlock(NCBlocks.SILVER_BLOCK.get());
        simpleBlock(NCBlocks.RAW_SILVER_BLOCK.get());
        simpleBlock(NCBlocks.SILVER_ORE.get());
        simpleBlock(NCBlocks.DEEPSLATE_SILVER_ORE.get());
    }

    private void treeBlocks() {
        saplingBlock(NCBlocks.FIR_SAPLING);
        logBlock((RotatedPillarBlock) NCBlocks.FIR_LOG.get());
        axisBlock((RotatedPillarBlock) NCBlocks.STRIPPED_FIR_LOG.get(), blockTexture(NCBlocks.STRIPPED_FIR_LOG.get()), new ResourceLocation(NaturesCanvas.MOD_ID, "block/fir_log_top"));
        axisBlock(((RotatedPillarBlock) NCBlocks.FIR_WOOD.get()), blockTexture(NCBlocks.FIR_LOG.get()), blockTexture(NCBlocks.FIR_LOG.get()));
        axisBlock(((RotatedPillarBlock) NCBlocks.STRIPPED_FIR_WOOD.get()), blockTexture(NCBlocks.STRIPPED_FIR_LOG.get()), blockTexture(NCBlocks.STRIPPED_FIR_LOG.get()));
        blockItem(NCBlocks.FIR_LOG);
        blockItem(NCBlocks.STRIPPED_FIR_LOG);
        blockItem(NCBlocks.FIR_WOOD);
        blockItem(NCBlocks.STRIPPED_FIR_WOOD);
        leavesBlock(NCBlocks.FIR_LEAVES);

        saplingBlock(NCBlocks.PINE_SAPLING);
        logBlock((RotatedPillarBlock) NCBlocks.PINE_LOG.get());
        axisBlock((RotatedPillarBlock) NCBlocks.STRIPPED_PINE_LOG.get(), blockTexture(NCBlocks.STRIPPED_PINE_LOG.get()), new ResourceLocation(NaturesCanvas.MOD_ID, "block/pine_log_top"));
        axisBlock(((RotatedPillarBlock) NCBlocks.PINE_WOOD.get()), blockTexture(NCBlocks.PINE_LOG.get()), blockTexture(NCBlocks.PINE_LOG.get()));
        axisBlock(((RotatedPillarBlock) NCBlocks.STRIPPED_PINE_WOOD.get()), blockTexture(NCBlocks.STRIPPED_PINE_LOG.get()), blockTexture(NCBlocks.STRIPPED_PINE_LOG.get()));
        blockItem(NCBlocks.PINE_LOG);
        blockItem(NCBlocks.STRIPPED_PINE_LOG);
        blockItem(NCBlocks.PINE_WOOD);
        blockItem(NCBlocks.STRIPPED_PINE_WOOD);
        leavesBlock(NCBlocks.PINE_LEAVES);

        saplingBlock(NCBlocks.CEDAR_SAPLING);
        logBlock((RotatedPillarBlock) NCBlocks.CEDAR_LOG.get());
        axisBlock((RotatedPillarBlock) NCBlocks.STRIPPED_CEDAR_LOG.get(), blockTexture(NCBlocks.STRIPPED_CEDAR_LOG.get()), new ResourceLocation(NaturesCanvas.MOD_ID, "block/cedar_log_top"));
        axisBlock(((RotatedPillarBlock) NCBlocks.CEDAR_WOOD.get()), blockTexture(NCBlocks.CEDAR_LOG.get()), blockTexture(NCBlocks.CEDAR_LOG.get()));
        axisBlock(((RotatedPillarBlock) NCBlocks.STRIPPED_CEDAR_WOOD.get()), blockTexture(NCBlocks.STRIPPED_CEDAR_LOG.get()), blockTexture(NCBlocks.STRIPPED_CEDAR_LOG.get()));
        blockItem(NCBlocks.CEDAR_LOG);
        blockItem(NCBlocks.STRIPPED_CEDAR_LOG);
        blockItem(NCBlocks.CEDAR_WOOD);
        blockItem(NCBlocks.STRIPPED_CEDAR_WOOD);
        leavesBlock(NCBlocks.CEDAR_LEAVES);
    }

    private void stainedPlanks(){
        models().buttonInventory("stained_acacia_button_inventory", blockTexture(NCBlocks.STAINED_ACACIA.baseBlock()));
        models().buttonInventory("stained_birch_button_inventory", blockTexture(NCBlocks.STAINED_BIRCH.baseBlock()));
        models().buttonInventory("stained_dark_oak_button_inventory", blockTexture(NCBlocks.STAINED_DARK_OAK.baseBlock()));
        models().buttonInventory("stained_jungle_button_inventory", blockTexture(NCBlocks.STAINED_JUNGLE.baseBlock()));
        models().buttonInventory("stained_oak_button_inventory", blockTexture(NCBlocks.STAINED_OAK.baseBlock()));
        models().buttonInventory("stained_spruce_button_inventory", blockTexture(NCBlocks.STAINED_SPRUCE.baseBlock()));
        buttonBlock((ButtonBlock) NCBlocks.STAINED_ACACIA_BUTTON.get(), modLoc("block/stained_acacia_planks"));
        buttonBlock((ButtonBlock) NCBlocks.STAINED_BIRCH_BUTTON.get(), modLoc("block/stained_birch_planks"));
        buttonBlock((ButtonBlock) NCBlocks.STAINED_DARK_OAK_BUTTON.get(), modLoc("block/stained_dark_oak_planks"));
        buttonBlock((ButtonBlock) NCBlocks.STAINED_JUNGLE_BUTTON.get(), modLoc("block/stained_jungle_planks"));
        buttonBlock((ButtonBlock) NCBlocks.STAINED_OAK_BUTTON.get(), modLoc("block/stained_oak_planks"));
        buttonBlock((ButtonBlock) NCBlocks.STAINED_SPRUCE_BUTTON.get(), modLoc("block/stained_spruce_planks"));
        doorBlock((DoorBlock) NCBlocks.STAINED_ACACIA_DOOR.get(), modLoc("block/stained_acacia_door_bottom"), modLoc("block/stained_acacia_door_top"));
        doorBlock((DoorBlock) NCBlocks.STAINED_BIRCH_DOOR.get(), modLoc("block/stained_birch_door_bottom"), modLoc("block/stained_birch_door_top"));
        doorBlock((DoorBlock) NCBlocks.STAINED_DARK_OAK_DOOR.get(), modLoc("block/stained_dark_oak_door_bottom"), modLoc("block/stained_dark_oak_door_top"));
        doorBlock((DoorBlock) NCBlocks.STAINED_JUNGLE_DOOR.get(), modLoc("block/stained_jungle_door_bottom"), modLoc("block/stained_jungle_door_top"));
        doorBlock((DoorBlock) NCBlocks.STAINED_OAK_DOOR.get(), modLoc("block/stained_oak_door_bottom"), modLoc("block/stained_oak_door_top"));
        doorBlock((DoorBlock) NCBlocks.STAINED_SPRUCE_DOOR.get(), modLoc("block/stained_spruce_door_bottom"), modLoc("block/stained_spruce_door_top"));
        hangingSignBlock(NCBlocks.STAINED_ACACIA_HANGING_SIGN.get(), NCBlocks.STAINED_ACACIA_WALL_HANGING_SIGN.get(), modLoc("block/stained_acacia_planks"));
        hangingSignBlock(NCBlocks.STAINED_BIRCH_HANGING_SIGN.get(), NCBlocks.STAINED_BIRCH_WALL_HANGING_SIGN.get(), modLoc("block/stained_birch_planks"));
        hangingSignBlock(NCBlocks.STAINED_DARK_OAK_HANGING_SIGN.get(), NCBlocks.STAINED_DARK_OAK_WALL_HANGING_SIGN.get(), modLoc("block/stained_dark_oak_planks"));
        hangingSignBlock(NCBlocks.STAINED_JUNGLE_HANGING_SIGN.get(), NCBlocks.STAINED_JUNGLE_WALL_HANGING_SIGN.get(), modLoc("block/stained_jungle_planks"));
        hangingSignBlock(NCBlocks.STAINED_OAK_HANGING_SIGN.get(), NCBlocks.STAINED_OAK_WALL_HANGING_SIGN.get(), modLoc("block/stained_oak_planks"));
        hangingSignBlock(NCBlocks.STAINED_SPRUCE_HANGING_SIGN.get(), NCBlocks.STAINED_SPRUCE_WALL_HANGING_SIGN.get(), modLoc("block/stained_spruce_planks"));
        signBlock((StandingSignBlock) NCBlocks.STAINED_ACACIA_SIGN.get(), (WallSignBlock) NCBlocks.STAINED_ACACIA_WALL_SIGN.get(), modLoc("block/stained_acacia_planks"));
        signBlock((StandingSignBlock) NCBlocks.STAINED_BIRCH_SIGN.get(), (WallSignBlock) NCBlocks.STAINED_BIRCH_WALL_SIGN.get(), modLoc("block/stained_birch_planks"));
        signBlock((StandingSignBlock) NCBlocks.STAINED_DARK_OAK_SIGN.get(), (WallSignBlock) NCBlocks.STAINED_DARK_OAK_WALL_SIGN.get(), modLoc("block/stained_dark_oak_planks"));
        signBlock((StandingSignBlock) NCBlocks.STAINED_JUNGLE_SIGN.get(), (WallSignBlock) NCBlocks.STAINED_JUNGLE_WALL_SIGN.get(), modLoc("block/stained_jungle_planks"));
        signBlock((StandingSignBlock) NCBlocks.STAINED_OAK_SIGN.get(), (WallSignBlock) NCBlocks.STAINED_OAK_WALL_SIGN.get(), modLoc("block/stained_oak_planks"));
        signBlock((StandingSignBlock) NCBlocks.STAINED_SPRUCE_SIGN.get(), (WallSignBlock) NCBlocks.STAINED_SPRUCE_WALL_SIGN.get(), modLoc("block/stained_spruce_planks"));
        trapdoorBlock((TrapDoorBlock) NCBlocks.STAINED_ACACIA_TRAPDOOR.get(), modLoc("block/stained_acacia_trapdoor"), true);
        trapdoorBlock((TrapDoorBlock) NCBlocks.STAINED_BIRCH_TRAPDOOR.get(), modLoc("block/stained_birch_trapdoor"), true);
        trapdoorBlock((TrapDoorBlock) NCBlocks.STAINED_DARK_OAK_TRAPDOOR.get(), modLoc("block/stained_dark_oak_trapdoor"), true);
        trapdoorBlock((TrapDoorBlock) NCBlocks.STAINED_JUNGLE_TRAPDOOR.get(), modLoc("block/stained_jungle_trapdoor"), true);
        trapdoorBlock((TrapDoorBlock) NCBlocks.STAINED_OAK_TRAPDOOR.get(), modLoc("block/stained_oak_trapdoor"), true);
        trapdoorBlock((TrapDoorBlock) NCBlocks.STAINED_SPRUCE_TRAPDOOR.get(), modLoc("block/stained_spruce_trapdoor"), true);
        tallDoorBlock((TallDoorBlock) NCBlocks.TALL_STAINED_ACACIA_DOOR.get(), modLoc("block/tall_stained_acacia_door_bottom"), modLoc("block/tall_stained_acacia_door_middle"), modLoc("block/tall_stained_acacia_door_top"));
        tallDoorBlock((TallDoorBlock) NCBlocks.TALL_STAINED_BIRCH_DOOR.get(), modLoc("block/tall_stained_birch_door_bottom"), modLoc("block/tall_stained_birch_door_middle"), modLoc("block/tall_stained_birch_door_top"));
        tallDoorBlock((TallDoorBlock) NCBlocks.TALL_STAINED_DARK_OAK_DOOR.get(), modLoc("block/tall_stained_dark_oak_door_bottom"), modLoc("block/tall_stained_dark_oak_door_middle"), modLoc("block/tall_stained_dark_oak_door_top"));
        tallDoorBlock((TallDoorBlock) NCBlocks.TALL_STAINED_JUNGLE_DOOR.get(), modLoc("block/tall_stained_jungle_door_bottom"), modLoc("block/tall_stained_jungle_door_middle"), modLoc("block/tall_stained_jungle_door_top"));
        tallDoorBlock((TallDoorBlock) NCBlocks.TALL_STAINED_OAK_DOOR.get(), modLoc("block/tall_stained_oak_door_bottom"), modLoc("block/tall_stained_oak_door_middle"), modLoc("block/tall_stained_oak_door_top"));
        tallDoorBlock((TallDoorBlock) NCBlocks.TALL_STAINED_SPRUCE_DOOR.get(), modLoc("block/tall_stained_spruce_door_bottom"), modLoc("block/tall_stained_spruce_door_middle"), modLoc("block/tall_stained_spruce_door_top"));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(NaturesCanvas.MOD_ID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }
}
