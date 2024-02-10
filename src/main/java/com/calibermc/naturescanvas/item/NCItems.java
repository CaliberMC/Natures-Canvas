package com.calibermc.naturescanvas.item;

import com.calibermc.caliber.block.CaliberBlocks;
import com.calibermc.naturescanvas.NaturesCanvas;
import com.calibermc.naturescanvas.block.NCBlocks;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class NCItems {
    public static int itemCount = 0;

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NaturesCanvas.MOD_ID);

    public static final RegistryObject<Item> GRASS_STEMS = ITEMS.register("grass_stems",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RESIN = ITEMS.register("resin",
            () -> new Item(new Item.Properties()));

//    public static final RegistryObject<Item> SAP = ITEMS.register("sap",
//            () -> new Item(new Item.Properties()));
//
//    public static final RegistryObject<Item> SAP_BALL = ITEMS.register("sap_ball",
//            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIN_NUGGET = ITEMS.register("tin_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BRONZE_SWORD = ITEMS.register("bronze_sword",
            () -> new SwordItem(NCTiers.BRONZE, 3, -2.4f,
                    new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe",
            () -> new PickaxeItem(NCTiers.BRONZE, 1, -2.8f,
                    new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_SHOVEL = ITEMS.register("bronze_shovel",
            () -> new ShovelItem(NCTiers.BRONZE, 1.5f, -3.0f,
                    new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_AXE = ITEMS.register("bronze_axe",
            () -> new AxeItem(NCTiers.BRONZE, 6.0f, -3.0f,
                    new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_HOE = ITEMS.register("bronze_hoe",
            () -> new HoeItem(NCTiers.BRONZE, -2, -0.5f,
                    new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_HELMET = ITEMS.register("bronze_helmet",
            () -> new ArmorItem(NCArmorMaterials.BRONZE, ArmorItem.Type.HELMET,
                    new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_CHESTPLATE = ITEMS.register("bronze_chestplate",
            () -> new ArmorItem(NCArmorMaterials.BRONZE, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_LEGGING = ITEMS.register("bronze_leggings",
            () -> new ArmorItem(NCArmorMaterials.BRONZE, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_BOOTS = ITEMS.register("bronze_boots",
            () -> new ArmorItem(NCArmorMaterials.BRONZE, ArmorItem.Type.BOOTS,
                    new Item.Properties()));

    public static final RegistryObject<Item> STAINED_ACACIA_SIGN = ITEMS.register("stained_acacia_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), NCBlocks.STAINED_ACACIA_SIGN.get(), NCBlocks.STAINED_ACACIA_WALL_SIGN.get()));
    public static final RegistryObject<Item> STAINED_ACACIA_HANGING_SIGN = ITEMS.register("stained_acacia_hanging_sign",
            () -> new HangingSignItem(NCBlocks.STAINED_ACACIA_HANGING_SIGN.get(), NCBlocks.STAINED_ACACIA_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> STAINED_BIRCH_SIGN = ITEMS.register("stained_birch_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), NCBlocks.STAINED_BIRCH_SIGN.get(), NCBlocks.STAINED_BIRCH_WALL_SIGN.get()));
    public static final RegistryObject<Item> STAINED_BIRCH_HANGING_SIGN = ITEMS.register("stained_birch_hanging_sign",
            () -> new HangingSignItem(NCBlocks.STAINED_BIRCH_HANGING_SIGN.get(), NCBlocks.STAINED_BIRCH_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> STAINED_DARK_OAK_SIGN = ITEMS.register("stained_dark_oak_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), NCBlocks.STAINED_DARK_OAK_SIGN.get(), NCBlocks.STAINED_DARK_OAK_WALL_SIGN.get()));
    public static final RegistryObject<Item> STAINED_DARK_OAK_HANGING_SIGN = ITEMS.register("stained_dark_oak_hanging_sign",
            () -> new HangingSignItem(NCBlocks.STAINED_DARK_OAK_HANGING_SIGN.get(), NCBlocks.STAINED_DARK_OAK_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> STAINED_JUNGLE_SIGN = ITEMS.register("stained_jungle_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), NCBlocks.STAINED_JUNGLE_SIGN.get(), NCBlocks.STAINED_JUNGLE_WALL_SIGN.get()));
    public static final RegistryObject<Item> STAINED_JUNGLE_HANGING_SIGN = ITEMS.register("stained_jungle_hanging_sign",
            () -> new HangingSignItem(NCBlocks.STAINED_JUNGLE_HANGING_SIGN.get(), NCBlocks.STAINED_JUNGLE_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> STAINED_OAK_SIGN = ITEMS.register("stained_oak_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), NCBlocks.STAINED_OAK_SIGN.get(), NCBlocks.STAINED_OAK_WALL_SIGN.get()));
    public static final RegistryObject<Item> STAINED_OAK_HANGING_SIGN = ITEMS.register("stained_oak_hanging_sign",
            () -> new HangingSignItem(NCBlocks.STAINED_OAK_HANGING_SIGN.get(), NCBlocks.STAINED_OAK_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> STAINED_SPRUCE_SIGN = ITEMS.register("stained_spruce_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), NCBlocks.STAINED_SPRUCE_SIGN.get(), NCBlocks.STAINED_SPRUCE_WALL_SIGN.get()));
    public static final RegistryObject<Item> STAINED_SPRUCE_HANGING_SIGN = ITEMS.register("stained_spruce_hanging_sign",
            () -> new HangingSignItem(NCBlocks.STAINED_SPRUCE_HANGING_SIGN.get(), NCBlocks.STAINED_SPRUCE_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static void printItemCounts() {
        System.out.println("NaturesCanvas Items Registered: " + itemCount);
    }
    public static void register(IEventBus eventBus) {
        itemCount ++;
        printItemCounts();
        ITEMS.register(eventBus);
    }
}
