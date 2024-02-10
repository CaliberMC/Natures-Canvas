package com.calibermc.naturescanvas.block.custom.signs;

import com.calibermc.naturescanvas.block.entity.NCSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class NCStandingSignBlock extends StandingSignBlock {

    public NCStandingSignBlock(Properties pProperties, WoodType pType) {
        super(pProperties, pType);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new NCSignBlockEntity(pPos, pState);
    }
}

