
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.decennium.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.decennium.block.MadeiraEnsanguentadaWoodBlock;
import net.mcreator.decennium.block.MadeiraEnsanguentadaStairsBlock;
import net.mcreator.decennium.block.MadeiraEnsanguentadaSlabBlock;
import net.mcreator.decennium.block.MadeiraEnsanguentadaPressurePlateBlock;
import net.mcreator.decennium.block.MadeiraEnsanguentadaPlanksBlock;
import net.mcreator.decennium.block.MadeiraEnsanguentadaLogBlock;
import net.mcreator.decennium.block.MadeiraEnsanguentadaLeavesBlock;
import net.mcreator.decennium.block.MadeiraEnsanguentadaFenceGateBlock;
import net.mcreator.decennium.block.MadeiraEnsanguentadaFenceBlock;
import net.mcreator.decennium.block.MadeiraEnsanguentadaButtonBlock;
import net.mcreator.decennium.DecenniumMod;

public class DecenniumModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DecenniumMod.MODID);
	public static final RegistryObject<Block> MADEIRA_ENSANGUENTADA_LOG = REGISTRY.register("madeira_ensanguentada_log", () -> new MadeiraEnsanguentadaLogBlock());
	public static final RegistryObject<Block> MADEIRA_ENSANGUENTADA_WOOD = REGISTRY.register("madeira_ensanguentada_wood", () -> new MadeiraEnsanguentadaWoodBlock());
	public static final RegistryObject<Block> MADEIRA_ENSANGUENTADA_PLANKS = REGISTRY.register("madeira_ensanguentada_planks", () -> new MadeiraEnsanguentadaPlanksBlock());
	public static final RegistryObject<Block> MADEIRA_ENSANGUENTADA_LEAVES = REGISTRY.register("madeira_ensanguentada_leaves", () -> new MadeiraEnsanguentadaLeavesBlock());
	public static final RegistryObject<Block> MADEIRA_ENSANGUENTADA_STAIRS = REGISTRY.register("madeira_ensanguentada_stairs", () -> new MadeiraEnsanguentadaStairsBlock());
	public static final RegistryObject<Block> MADEIRA_ENSANGUENTADA_SLAB = REGISTRY.register("madeira_ensanguentada_slab", () -> new MadeiraEnsanguentadaSlabBlock());
	public static final RegistryObject<Block> MADEIRA_ENSANGUENTADA_FENCE = REGISTRY.register("madeira_ensanguentada_fence", () -> new MadeiraEnsanguentadaFenceBlock());
	public static final RegistryObject<Block> MADEIRA_ENSANGUENTADA_FENCE_GATE = REGISTRY.register("madeira_ensanguentada_fence_gate", () -> new MadeiraEnsanguentadaFenceGateBlock());
	public static final RegistryObject<Block> MADEIRA_ENSANGUENTADA_PRESSURE_PLATE = REGISTRY.register("madeira_ensanguentada_pressure_plate", () -> new MadeiraEnsanguentadaPressurePlateBlock());
	public static final RegistryObject<Block> MADEIRA_ENSANGUENTADA_BUTTON = REGISTRY.register("madeira_ensanguentada_button", () -> new MadeiraEnsanguentadaButtonBlock());
}
