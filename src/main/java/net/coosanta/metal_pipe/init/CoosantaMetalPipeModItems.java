/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.coosanta.metal_pipe.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.coosanta.metal_pipe.item.MetalPipeItem;
import net.coosanta.metal_pipe.item.FlintAndSteelItem;
import net.coosanta.metal_pipe.CoosantaMetalPipeMod;

public class CoosantaMetalPipeModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(CoosantaMetalPipeMod.MODID);
	public static final DeferredItem<Item> METAL_PIPE;
	public static final DeferredItem<Item> FLINT_AND_STEEL;
	static {
		METAL_PIPE = REGISTRY.register("metal_pipe", MetalPipeItem::new);
		FLINT_AND_STEEL = REGISTRY.register("flint_and_steel", FlintAndSteelItem::new);
	}
	// Start of user code block custom items
	// End of user code block custom items
}