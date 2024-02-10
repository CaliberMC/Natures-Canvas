package com.calibermc.naturescanvas.block.entity;

import com.calibermc.naturescanvas.NaturesCanvas;
import com.calibermc.naturescanvas.block.NCBlocks;
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
                    BlockEntityType.Builder.of(KilnBlockEntity::new, NCBlocks.KILN.get()).build(null));

    public static final RegistryObject<BlockEntityType<NCSignBlockEntity>> SIGN_BLOCK_ENTITIES =
            BLOCK_ENTITIES.register("mod_sign_block_entity", () ->
                    BlockEntityType.Builder.of(NCSignBlockEntity::new,
                            NCBlocks.STAINED_ACACIA_WALL_SIGN.get(),
                            NCBlocks.STAINED_ACACIA_SIGN.get(),
                            NCBlocks.STAINED_BIRCH_WALL_SIGN.get(),
                            NCBlocks.STAINED_BIRCH_SIGN.get(),
                            NCBlocks.STAINED_DARK_OAK_WALL_SIGN.get(),
                            NCBlocks.STAINED_DARK_OAK_SIGN.get(),
                            NCBlocks.STAINED_JUNGLE_WALL_SIGN.get(),
                            NCBlocks.STAINED_JUNGLE_SIGN.get(),
                            NCBlocks.STAINED_OAK_WALL_SIGN.get(),
                            NCBlocks.STAINED_OAK_SIGN.get(),
                            NCBlocks.STAINED_SPRUCE_WALL_SIGN.get(),
                            NCBlocks.STAINED_SPRUCE_SIGN.get()).build(null));

    public static final RegistryObject<BlockEntityType<NCHangingSignBlockEntity>> HANGING_SIGN_BLOCK_ENTITIES =
            BLOCK_ENTITIES.register("mod_hanging_sign_block_entity", () ->
                    BlockEntityType.Builder.of(NCHangingSignBlockEntity::new,
                            NCBlocks.STAINED_ACACIA_WALL_HANGING_SIGN.get(),
                            NCBlocks.STAINED_ACACIA_HANGING_SIGN.get(),
                            NCBlocks.STAINED_BIRCH_WALL_HANGING_SIGN.get(),
                            NCBlocks.STAINED_BIRCH_HANGING_SIGN.get(),
                            NCBlocks.STAINED_DARK_OAK_WALL_HANGING_SIGN.get(),
                            NCBlocks.STAINED_DARK_OAK_HANGING_SIGN.get(),
                            NCBlocks.STAINED_JUNGLE_WALL_HANGING_SIGN.get(),
                            NCBlocks.STAINED_JUNGLE_HANGING_SIGN.get(),
                            NCBlocks.STAINED_OAK_WALL_HANGING_SIGN.get(),
                            NCBlocks.STAINED_OAK_HANGING_SIGN.get(),
                            NCBlocks.STAINED_SPRUCE_WALL_HANGING_SIGN.get(),
                            NCBlocks.STAINED_SPRUCE_HANGING_SIGN.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
