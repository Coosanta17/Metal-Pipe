
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.coosanta.metal_pipe.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.coosanta.metal_pipe.CoosantaMetalPipeMod;

public class CoosantaMetalPipeModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, CoosantaMetalPipeMod.MODID);
	public static final RegistryObject<SoundEvent> METAL_PIPE_FALLING = REGISTRY.register("metal_pipe_falling", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("coosanta_metal_pipe", "metal_pipe_falling")));
}
