package com.calibermc.naturescanvas.item;

import com.calibermc.naturescanvas.NaturesCanvas;
import com.calibermc.naturescanvas.block.NCBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.Map;

public class NCCreativeTab {

    private static final DeferredRegister<CreativeModeTab> CREATIVE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NaturesCanvas.MOD_ID);

    public static final RegistryObject<CreativeModeTab> NATURES_CANVAS_TAB = CREATIVE_TABS.register("naturescanvas",
            () -> CreativeModeTab.builder().title(Component.translatable("itemGroup.naturescanvas"))
                    .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
                    .icon(() -> new ItemStack(NCBlocks.SILVER_ORE.get()))
                    .displayItems((pParameters, pOutput) -> {
                        for (RegistryObject<Item> entry : NCItems.ITEMS.getEntries()) {
                            pOutput.accept(entry.get());
                        }
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_TABS.register(eventBus);
    }

    // Sorted
    private static List<Item> getItems() {
        return ForgeRegistries.ITEMS.getEntries().stream().map(Map.Entry::getValue).sorted((o, o1) -> {
            ResourceLocation str1 = ForgeRegistries.ITEMS.getKey(o);
            ResourceLocation str2 = ForgeRegistries.ITEMS.getKey(o1);
            assert str1 != null && str2 != null;
            return str1.compareTo(str2);
        }).toList();
    }

}
