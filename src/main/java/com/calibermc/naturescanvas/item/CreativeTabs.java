package com.calibermc.naturescanvas.item;

import com.calibermc.naturescanvas.NaturesCanvas;
import com.calibermc.naturescanvas.block.NCBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTabs {

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

}
