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
        terrainBlocks();
        metalBlocks();
        treeBlocks();
        super.registerStatesAndModels();
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

    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), new ResourceLocation("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ResourceLocation texture) {
        ModelFile sign = models().sign(name(signBlock), texture);
        hangingSignBlock(signBlock, wallSignBlock, sign);
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ModelFile sign) {
        simpleBlock(signBlock, sign);
        simpleBlock(wallSignBlock, sign);
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(NaturesCanvas.MOD_ID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }
}
