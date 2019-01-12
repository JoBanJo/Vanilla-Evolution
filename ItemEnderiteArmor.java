package com.evep.evepmod.items.armor;

import java.util.List;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemEnderiteArmor extends ItemArmor {

	public ItemEnderiteArmor(ArmorMaterial materialIn, String lore, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn,
			String name) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setMaxStackSize(1);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		super.addInformation(stack, worldIn, tooltip, flagIn);

		tooltip.add(I18n.format("§1A strong armor"));

		/*
		 * §1 = Dark Blue 
		 * §4 = white
		 */

	}
}