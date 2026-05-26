package com.lipn.drugs_are_good.events;


import com.lipn.drugs_are_good.DrugsAreGood;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.MobEffectEvent;

@EventBusSubscriber(modid = DrugsAreGood.MOD_ID, bus = EventBusSubscriber.Bus.GAME)
public class DAGEvents {

    @SubscribeEvent
    public static void aggroIronGolems(MobEffectEvent.Added event) {

    }

}