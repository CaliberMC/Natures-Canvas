package com.calibermc.naturescanvas.item;

import com.calibermc.naturescanvas.NaturesCanvas;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class NCItems {
    public static int itemCount = 0;

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NaturesCanvas.MOD_ID);


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

//    public static final RegistryObject<Item> GRASS_STEMS = ITEMS.register("grass_stems",
//            () -> new Item(new Item.Properties()));

//    public static final RegistryObject<Item> SAP = ITEMS.register("sap",
//            () -> new Item(new Item.Properties()));
//
//    public static final RegistryObject<Item> SAP_BALL = ITEMS.register("sap_ball",
//            () -> new Item(new Item.Properties()));

//    public static final RegistryObject<Item> RESIN = ITEMS.register("resin",
//            () -> new Item(new Item.Properties()));

//    public static final RegistryObject<Item> WOOD_STAIN = ITEMS.register("wood_stain",
//            () -> new Item(new Item.Properties()));



    public static void printItemCounts() {
        System.out.println("NaturesCanvas Items Registered: " + itemCount);
    }
    public static void register(IEventBus eventBus) {
        itemCount ++;
        printItemCounts();
        ITEMS.register(eventBus);
    }
}
