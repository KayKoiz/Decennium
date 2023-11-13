
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.decennium.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.decennium.item.DecceniumSwordItem;
import net.mcreator.decennium.item.DecceniumShovelItem;
import net.mcreator.decennium.item.DecceniumPickscypheItem;
import net.mcreator.decennium.item.DecceniumMeatItem;
import net.mcreator.decennium.item.DecceniumIngotItem;
import net.mcreator.decennium.item.DecceniumHoeItem;
import net.mcreator.decennium.item.DecceniumAxeItem;
import net.mcreator.decennium.DecenniumMod;

public class DecenniumModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DecenniumMod.MODID);
	public static final RegistryObject<Item> DECCENIUM_INGOT = REGISTRY.register("deccenium_ingot", () -> new DecceniumIngotItem());
	public static final RegistryObject<Item> DECCENIUM_SWORD = REGISTRY.register("deccenium_sword", () -> new DecceniumSwordItem());
	public static final RegistryObject<Item> DECCENIUM_AXE = REGISTRY.register("deccenium_axe", () -> new DecceniumAxeItem());
	public static final RegistryObject<Item> DECCENIUM_SHOVEL = REGISTRY.register("deccenium_shovel", () -> new DecceniumShovelItem());
	public static final RegistryObject<Item> DECCENIUM_HOE = REGISTRY.register("deccenium_hoe", () -> new DecceniumHoeItem());
	public static final RegistryObject<Item> DECCENIUM_PICKSCYPHE = REGISTRY.register("deccenium_pickscyphe", () -> new DecceniumPickscypheItem());
	public static final RegistryObject<Item> DECCENIUM_MEAT = REGISTRY.register("deccenium_meat", () -> new DecceniumMeatItem());
	public static final RegistryObject<Item> MADEIRA_ENSANGUENTADA_LOG = block(DecenniumModBlocks.MADEIRA_ENSANGUENTADA_LOG);
	public static final RegistryObject<Item> MADEIRA_ENSANGUENTADA_WOOD = block(DecenniumModBlocks.MADEIRA_ENSANGUENTADA_WOOD);
	public static final RegistryObject<Item> MADEIRA_ENSANGUENTADA_PLANKS = block(DecenniumModBlocks.MADEIRA_ENSANGUENTADA_PLANKS);
	public static final RegistryObject<Item> MADEIRA_ENSANGUENTADA_LEAVES = block(DecenniumModBlocks.MADEIRA_ENSANGUENTADA_LEAVES);
	public static final RegistryObject<Item> MADEIRA_ENSANGUENTADA_STAIRS = block(DecenniumModBlocks.MADEIRA_ENSANGUENTADA_STAIRS);
	public static final RegistryObject<Item> MADEIRA_ENSANGUENTADA_SLAB = block(DecenniumModBlocks.MADEIRA_ENSANGUENTADA_SLAB);
	public static final RegistryObject<Item> MADEIRA_ENSANGUENTADA_FENCE = block(DecenniumModBlocks.MADEIRA_ENSANGUENTADA_FENCE);
	public static final RegistryObject<Item> MADEIRA_ENSANGUENTADA_FENCE_GATE = block(DecenniumModBlocks.MADEIRA_ENSANGUENTADA_FENCE_GATE);
	public static final RegistryObject<Item> MADEIRA_ENSANGUENTADA_PRESSURE_PLATE = block(DecenniumModBlocks.MADEIRA_ENSANGUENTADA_PRESSURE_PLATE);
	public static final RegistryObject<Item> MADEIRA_ENSANGUENTADA_BUTTON = block(DecenniumModBlocks.MADEIRA_ENSANGUENTADA_BUTTON);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
