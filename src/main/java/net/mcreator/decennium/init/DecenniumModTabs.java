
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.decennium.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.decennium.DecenniumMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DecenniumModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DecenniumMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(DecenniumModBlocks.MADEIRA_ENSANGUENTADA_LOG.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(DecenniumModBlocks.MADEIRA_ENSANGUENTADA_FENCE_GATE.get().asItem());
			tabData.accept(DecenniumModBlocks.MADEIRA_ENSANGUENTADA_PRESSURE_PLATE.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(DecenniumModItems.DECCENIUM_SWORD.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(DecenniumModItems.DECCENIUM_AXE.get());
			tabData.accept(DecenniumModItems.DECCENIUM_SHOVEL.get());
			tabData.accept(DecenniumModItems.DECCENIUM_HOE.get());
			tabData.accept(DecenniumModItems.DECCENIUM_PICKSCYPHE.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(DecenniumModItems.DECCENIUM_MEAT.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(DecenniumModBlocks.MADEIRA_ENSANGUENTADA_LEAVES.get().asItem());
			tabData.accept(DecenniumModBlocks.MADEIRA_ENSANGUENTADA_FENCE.get().asItem());
		}
	}
}
