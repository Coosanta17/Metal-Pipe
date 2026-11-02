/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.coosanta.metal_pipe.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.coosanta.metal_pipe.CoosantaMetalPipeMod;

public class CoosantaMetalPipeModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, CoosantaMetalPipeMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> METAL_PIPE_FALLING = REGISTRY.register("metal_pipe_falling",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("coosanta_metal_pipe", "metal_pipe_falling")));
	public static final DeferredHolder<SoundEvent, SoundEvent> FLINT_AND_STEEL = REGISTRY.register("flint_and_steel", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("coosanta_metal_pipe", "flint_and_steel")));
}