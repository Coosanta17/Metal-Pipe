package net.coosanta.metal_pipe.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.coosanta.metal_pipe.CoosantaMetalPipeMod;

public class FlintAndSteelItem extends Item {
	public FlintAndSteelItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(CoosantaMetalPipeMod.MODID, "flint_and_steel"))));
	}
}