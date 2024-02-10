package com.calibermc.naturescanvas.block.entity;

import com.calibermc.caliber.block.custom.entity.CaliberBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class NCHangingSignBlockEntity extends SignBlockEntity {
    public NCHangingSignBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(NCBlockEntities.HANGING_SIGN_BLOCK_ENTITIES.get(), pPos, pBlockState);
    }

    @Override
    public BlockEntityType<?> getType() {
        return NCBlockEntities.HANGING_SIGN_BLOCK_ENTITIES.get();
    }
}

