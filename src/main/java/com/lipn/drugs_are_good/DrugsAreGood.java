package com.lipn.drugs_are_good;

import com.lipn.drugs_are_good.registry.DAGItems;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(com.lipn.drugs_are_good.DrugsAreGood.MOD_ID)
public class DrugsAreGood {
    public static final String MOD_ID = "drugs_are_good";
    private static final Logger LOGGER = LogUtils.getLogger();

    public DrugsAreGood(IEventBus modEventBus, ModContainer modContainer) {
        com.lipn.drugs_are_good.registry.DAGBlocks.register(modEventBus);
        DAGItems.register(modEventBus);
        com.lipn.drugs_are_good.registry.DAGCreativeModeTabs.register(modEventBus);
    }

}