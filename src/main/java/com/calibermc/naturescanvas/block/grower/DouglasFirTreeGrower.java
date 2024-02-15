package com.calibermc.naturescanvas.block.grower;

import com.calibermc.naturescanvas.data.worldgen.features.NCTreeFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractMegaTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class DouglasFirTreeGrower extends AbstractMegaTreeGrower
{
    @Nullable
    @Override
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredMegaFeature(RandomSource random)
    {
        return (random.nextInt(12) == 0 ? NCTreeFeatures.DOUGLAS_FIR_TREE_LARGE : NCTreeFeatures.DOUGLAS_FIR_TREE_MEDIUM);
    }

    @Nullable
    @Override
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource random, boolean flowers)
    {
        return NCTreeFeatures.DOUGLAS_FIR_TREE;
    }
}

