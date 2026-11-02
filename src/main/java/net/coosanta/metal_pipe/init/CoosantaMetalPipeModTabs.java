/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.coosanta.metal_pipe.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.coosanta.metal_pipe.CoosantaMetalPipeMod;

@EventBusSubscriber
public class CoosantaMetalPipeModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CoosantaMetalPipeMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(CoosantaMetalPipeModItems.METAL_PIPE.get());
			tabData.accept(CoosantaMetalPipeModItems.FLINT_AND_STEEL.get());
		}
	}
}