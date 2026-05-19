package com.lipn.drugs_are_good.events;


import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingDamageEvent;

@EventBusSubscriber(modid = com.lipn.drugs_are_good.DrugsAreGood.MOD_ID, bus = EventBusSubscriber.Bus.GAME)
public class DAGEvents {

    @SubscribeEvent
    public static void doAThing(LivingDamageEvent.Pre event) {

    }

}