package com.lipn.drugs_are_good.items;

import com.lipn.drugs_are_good.registry.DAGEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class CatPillItem extends Item {

    public static final FoodProperties CAT_PILL = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.8F)
            .effect(new MobEffectInstance(DAGEffects.CATPILL,10, 0), 1.0F)
            .build();

    public CatPillItem(Properties properties) {
        super(properties.food(CAT_PILL));
    }
}


