package com.calibermc.naturescanvas.block.entity;

import com.calibermc.caliber.block.custom.entity.CaliberBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class NCSignBlockEntity extends SignBlockEntity {
    public NCSignBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(NCBlockEntities.SIGN_BLOCK_ENTITIES.get(), pPos, pBlockState);
    }

    @Override
    public BlockEntityType<?> getType() {
        return NCBlockEntities.SIGN_BLOCK_ENTITIES.get();
    }
}

