package com.calibermc.naturescanvas.block.management;

import com.calibermc.caliberlib.block.management.BlockManager;
import com.calibermc.caliberlib.block.management.CaliberBlockHelper;
import com.calibermc.caliberlib.data.ModBlockFamily;
import com.calibermc.naturescanvas.block.NCBlocks;
import com.calibermc.naturescanvas.block.properties.BlockProps;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.Supplier;

public class NCBlockManager {
    
    public static BlockManager register(String name, BlockBehaviour.Properties properties, Collection<ModBlockFamily.Variant> variants) {
        return BlockManager.register(name, NCBlocks.BLOCKS, properties, () -> Blocks.AIR, variants).registerBlockFunc(NCBlocks::registerBlock).build();
    }

    public static BlockManager registerStoneWithLoot(String name, Supplier<Block> cobblestone) {
        Collection<ModBlockFamily.Variant> variants = CaliberBlockHelper.modifyList(CaliberBlockHelper.STONE_VARIANTS, (c) -> c.addAll(Arrays.asList(ModBlockFamily.Variant.BASE, ModBlockFamily.Variant.BUTTON, ModBlockFamily.Variant.PRESSURE_PLATE)));
        BlockManager.Builder builder = new BlockManager.Builder(name, NCBlocks.BLOCKS);
        Supplier<Block> baseBlock = () -> new Block(BlockProps.LIMESTONE.get());
        builder.addVariant(ModBlockFamily.Variant.BASE, baseBlock, (additional) ->
                additional.lootGen((loot, b) -> loot.add(b, (block) ->
                        loot.createSingleItemTableWithSilkTouch(block, cobblestone.get()))));
        BlockManager.addDefaultVariants(builder, BlockProps.LIMESTONE.get(), baseBlock, variants);
        return builder.registerBlockFunc(NCBlocks::registerBlock).build();
    }

    public static BlockManager registerOneBlock(String name, Supplier<Block> block) {
        return BlockManager.registerOneBlock(name, NCBlocks.BLOCKS, block).registerBlockFunc(NCBlocks::registerBlock).build();
    }

    public static BlockManager register(String name, BlockBehaviour.Properties properties, Supplier<Block> blockSupplier, Collection<ModBlockFamily.Variant> variants) {
        return BlockManager.register(name, NCBlocks.BLOCKS, properties, blockSupplier, variants).registerBlockFunc(NCBlocks::registerBlock).build();
    }
}
