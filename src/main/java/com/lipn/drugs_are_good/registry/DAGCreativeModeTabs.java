package com.lipn.drugs_are_good.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class DAGCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, com.lipn.drugs_are_good.DrugsAreGood.MOD_ID);

    //Creative mode tabs go here

    public static void register(IEventBus bus) {
        CREATIVE_MODE_TABS.register(bus);
    }

}