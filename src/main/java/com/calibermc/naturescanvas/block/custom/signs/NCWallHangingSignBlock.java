package com.calibermc.naturescanvas.block.custom.signs;

import com.calibermc.naturescanvas.block.entity.NCHangingSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class NCWallHangingSignBlock extends WallHangingSignBlock {

    public NCWallHangingSignBlock(Properties pProperties, WoodType pType) {
        super(pProperties, pType);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new NCHangingSignBlockEntity(pPos, pState);
    }
}

