package com.calibermc.naturescanvas.block.entity;

import com.calibermc.caliber.block.ModBlocks;
import com.calibermc.caliber.block.entity.KilnBlockEntity;
import com.calibermc.naturescanvas.NaturesCanvas;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class NCBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, NaturesCanvas.MOD_ID);

    public static final RegistryObject<BlockEntityType<KilnBlockEntity>> KILN =
            BLOCK_ENTITIES.register("kiln", () ->
                    BlockEntityType.Builder.of(KilnBlockEntity::new, ModBlocks.KILN.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
