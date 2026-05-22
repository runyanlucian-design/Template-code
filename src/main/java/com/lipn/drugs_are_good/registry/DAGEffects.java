package com.lipn.drugs_are_good.registry;

import com.lipn.drugs_are_good.DrugsAreGood;
import com.lipn.drugs_are_good.effects.Steriod;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class DAGEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(BuiltInRegistries.MOB_EFFECT, DrugsAreGood.MOD_ID);

    public static final Holder<MobEffect> STEROID = MOB_EFFECTS.register("roids",
            () -> new Steriod(MobEffectCategory.NEUTRAL, 0x947726)
    .addAttributeModifier(Attributes.ATTACK_DAMAGE,
                        ResourceLocation.fromNamespaceAndPath(DrugsAreGood.MOD_ID, "roids"), 0.3f,
            AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
    public static final Holder<MobEffect> PAINKILLER = MOB_EFFECTS.register("painkiller",
            () -> new Steriod(MobEffectCategory.NEUTRAL, 0xFF0099FF)
    .addAttributeModifier(Attributes.MAX_HEALTH,
                        ResourceLocation.fromNamespaceAndPath(DrugsAreGood.MOD_ID, "painkiller"), 1f,
            AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
    public static final Holder<MobEffect> CATPILL = MOB_EFFECTS.register("catpill",
            () -> new Steriod(MobEffectCategory.NEUTRAL, 0xffff9900));


    public static void  register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}
