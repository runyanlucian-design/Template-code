package com.lipn.drugs_are_good.registry;

import com.lipn.drugs_are_good.DrugsAreGood;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class DAGItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(DrugsAreGood.MOD_ID);

    //Items go here
    public static final DeferredItem<Item> CAT_PILL = ITEMS.register("cat_pill", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> PAIN_KILLER = ITEMS.register("pain_killer", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> STEROID = ITEMS.register("steroid", () -> new Item(new Item.Properties()));

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }

}