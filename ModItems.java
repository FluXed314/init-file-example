package com.fluxed314.fluxmod.init;

import java.util.ArrayList;
import java.util.List;

import com.fluxed314.fluxmod.armor.ArmorBase;
import com.fluxed314.fluxmod.items.ItemBase;
import com.fluxed314.fluxmod.tools.ToolAxe;
import com.fluxed314.fluxmod.tools.ToolHoe;
import com.fluxed314.fluxmod.tools.ToolPickaxe;
import com.fluxed314.fluxmod.tools.ToolShield;
import com.fluxed314.fluxmod.tools.ToolShovel;
import com.fluxed314.fluxmod.tools.ToolSword;
import com.fluxed314.fluxmod.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial TOOL_RUBY = EnumHelper.addToolMaterial("tool_ruby",  3,  1380,  8.0F,  2.5F,  7);
	public static final ArmorMaterial ARMOR_RUBY = EnumHelper.addArmorMaterial("armor_ruby", Reference.MOD_ID + ":ruby", 20, new int[] {4, 9, 9, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);

	//Items
	public static final Item ITEM_TEST = new ItemBase("item_test");
	public static final Item GEM_RUBY = new ItemBase("gem_ruby");
	public static final Item INGOT_OBSIDIAN = new ItemBase("ingot_obsidian");
	
	//Tools
	public static final Item PICKAXE_RUBY = new ToolPickaxe("pickaxe_ruby", TOOL_RUBY);
	public static final Item AXE_RUBY = new ToolAxe("axe_ruby", TOOL_RUBY);
	public static final Item SHOVEL_RUBY = new ToolShovel("shovel_ruby", TOOL_RUBY);
	public static final Item HOE_RUBY = new ToolHoe("hoe_ruby", TOOL_RUBY);
	
	//Weapons
	public static final Item SWORD_RUBY = new ToolSword("sword_ruby", TOOL_RUBY);
	
	//Shields
	public static final Item SHIELD_RUBY = new ToolShield("shield_ruby", TOOL_RUBY);
	
	//Armor
	public static final Item HELMET_RUBY = new ArmorBase("helmet_ruby", ARMOR_RUBY, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_RUBY = new ArmorBase("chestplate_ruby", ARMOR_RUBY, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_RUBY = new ArmorBase("leggings_ruby", ARMOR_RUBY, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_RUBY = new ArmorBase("boots_ruby", ARMOR_RUBY, 1, EntityEquipmentSlot.FEET);
}
