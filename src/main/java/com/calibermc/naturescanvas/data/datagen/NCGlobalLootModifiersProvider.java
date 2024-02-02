package com.calibermc.naturescanvas.data.datagen;

import com.calibermc.naturescanvas.NaturesCanvas;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.GlobalLootModifierProvider;

public class NCGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public NCGlobalLootModifiersProvider(PackOutput output) {
        super(output, NaturesCanvas.MOD_ID);
    }

    @Override
    protected void start() {
//        add("grass_stems_from_grass", new AddItemModifier(new LootItemCondition[] {
//                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.GRASS).build(),
//                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.GRASS_STEMS.get()));
//
//        add("resin_from_spruce_leaves", new AddItemModifier(new LootItemCondition[] {
//                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.SPRUCE_LEAVES).build(),
//                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.RESIN.get()));

//        add("pine_cone_from_creeper", new AddItemModifier(new LootItemCondition[] {
//                new LootTableIdCondition.Builder(new ResourceLocation("entities/creeper")).build() }, ModItems.PINE_CONE.get()));
//
//        add("metal_detector_from_jungle_temples", new AddItemModifier(new LootItemCondition[] {
//                new LootTableIdCondition.Builder(new ResourceLocation("chests/jungle_temple")).build() }, ModItems.METAL_DETECTOR.get()));
//
//
//        add("metal_detector_from_suspicious_sand", new AddSusSandItemModifier(new LootItemCondition[] {
//                new LootTableIdCondition.Builder(new ResourceLocation("archaeology/desert_pyramid")).build() }, ModItems.METAL_DETECTOR.get()));




    }
}
