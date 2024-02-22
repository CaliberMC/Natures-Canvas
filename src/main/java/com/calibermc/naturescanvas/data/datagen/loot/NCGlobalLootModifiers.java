package com.calibermc.naturescanvas.data.datagen.loot;

import com.calibermc.naturescanvas.NaturesCanvas;
import com.calibermc.naturescanvas.item.NCItems;
import com.calibermc.naturescanvas.loot.AddItemModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;

public class NCGlobalLootModifiers extends GlobalLootModifierProvider {
    public NCGlobalLootModifiers(PackOutput output) {
        super(output, NaturesCanvas.MOD_ID);
    }

    @Override
    protected void start() {
        add("grass_stems_from_grass", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.GRASS).build(),
                LootItemRandomChanceCondition.randomChance(0.30f).build()}, NCItems.GRASS_STEMS.get()));

        add("resin_from_spruce_leaves", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.SPRUCE_LEAVES).build(),
                LootItemRandomChanceCondition.randomChance(0.20f).build()}, NCItems.RESIN.get()));

    }
}
