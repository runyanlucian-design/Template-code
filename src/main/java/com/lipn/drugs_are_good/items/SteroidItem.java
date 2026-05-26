package com.lipn.drugs_are_good.items;

import com.lipn.drugs_are_good.registry.DAGEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class SteroidItem extends Item {

    public static final FoodProperties STEROID = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.8F)
            .effect(new MobEffectInstance(DAGEffects.STEROID,2400, 0), 1.0F)
            .build();

    public SteroidItem(Properties properties) {
        super(properties.food(STEROID));
    }
}


