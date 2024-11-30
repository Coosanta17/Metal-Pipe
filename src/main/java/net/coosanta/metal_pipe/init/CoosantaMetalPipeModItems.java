
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.coosanta.metal_pipe.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.coosanta.metal_pipe.item.MetalPipeItem;
import net.coosanta.metal_pipe.CoosantaMetalPipeMod;

public class CoosantaMetalPipeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CoosantaMetalPipeMod.MODID);
	public static final RegistryObject<Item> METAL_PIPE = REGISTRY.register("metal_pipe", () -> new MetalPipeItem());
	// Start of user code block custom items
	// End of user code block custom items
}
