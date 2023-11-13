
package net.mcreator.decennium.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import net.mcreator.decennium.procedures.DecceniumMeatOnPlayerStoppedUsingProcedure;

import java.util.List;

public class DecceniumMeatItem extends Item {
	public DecceniumMeatItem() {
		super(new Item.Properties().stacksTo(6).fireResistant().rarity(Rarity.EPIC).food((new FoodProperties.Builder()).nutrition(114).saturationMod(0.3f).alwaysEat().build()));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Carne Estranha"));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		DecceniumMeatOnPlayerStoppedUsingProcedure.execute(entity);
		return retval;
	}
}
