package com.evep.evepmod.init;

import java.util.ArrayList;

import com.evep.evepmod.VanillaEvolutionMod;
import com.evep.evepmod.items.ItemAdamantiumIngot;
import com.evep.evepmod.items.ItemAluminumIngot;
import com.evep.evepmod.items.ItemAmber;
import com.evep.evepmod.items.ItemAmethyst;
import com.evep.evepmod.items.ItemAncientLocket;
import com.evep.evepmod.items.ItemBeryl;
import com.evep.evepmod.items.ItemBronzeIngot;
import com.evep.evepmod.items.ItemCarbonIngot;
import com.evep.evepmod.items.ItemCobaltIngot;
import com.evep.evepmod.items.ItemCopperIngot;
import com.evep.evepmod.items.ItemDwarfStarAlloy;
import com.evep.evepmod.items.ItemElementalIngot;
import com.evep.evepmod.items.ItemEnderite;
import com.evep.evepmod.items.ItemEnergeticOrb;
import com.evep.evepmod.items.ItemImbuedRod;
import com.evep.evepmod.items.ItemIridiumIngot;
import com.evep.evepmod.items.ItemLeadIngot;
import com.evep.evepmod.items.ItemMagnetiteIngot;
import com.evep.evepmod.items.ItemMalachiteIngot;
import com.evep.evepmod.items.ItemMeteoriteShard;
import com.evep.evepmod.items.ItemNickelIngot;
import com.evep.evepmod.items.ItemOnyx;
import com.evep.evepmod.items.ItemPeridot;
import com.evep.evepmod.items.ItemRuby;
import com.evep.evepmod.items.ItemSeasonalGem;
import com.evep.evepmod.items.ItemSelenite;
import com.evep.evepmod.items.ItemSilverIngot;
import com.evep.evepmod.items.ItemSlimeGem;
import com.evep.evepmod.items.ItemSlimeyStuffs;
import com.evep.evepmod.items.ItemSuperfoodGem;
import com.evep.evepmod.items.ItemTinIngot;
import com.evep.evepmod.items.ItemUltrafoodGem;
import com.evep.evepmod.items.ItemVibranium;
import com.evep.evepmod.items.ItemZincIngot;
import com.evep.evepmod.items.tools.ItemAmethystAxe;
import com.evep.evepmod.items.tools.ItemAmethystHoe;
import com.evep.evepmod.items.tools.ItemAmethystPickaxe;
import com.evep.evepmod.items.tools.ItemAmethystPickhoxel;
import com.evep.evepmod.items.tools.ItemAmethystShovel;
import com.evep.evepmod.items.tools.ItemAmethystSword;
import com.evep.evepmod.items.tools.ItemBronzeAxe;
import com.evep.evepmod.items.tools.ItemBronzeHoe;
import com.evep.evepmod.items.tools.ItemBronzePickaxe;
import com.evep.evepmod.items.tools.ItemBronzePickhoxel;
import com.evep.evepmod.items.tools.ItemBronzeShovel;
import com.evep.evepmod.items.tools.ItemBronzeSword;
import com.evep.evepmod.items.tools.ItemEnderitePickaxe;
import com.evep.evepmod.items.tools.ItemEnderiteSword;
import com.evep.evepmod.items.tools.ItemMalachiteAxe;
import com.evep.evepmod.items.tools.ItemMalachiteHoe;
import com.evep.evepmod.items.tools.ItemMalachitePickaxe;
import com.evep.evepmod.items.tools.ItemMalachiteShovel;
import com.evep.evepmod.items.tools.ItemMalachiteSword;
import com.evep.evepmod.items.tools.ItemOnyxPickaxe;
import com.evep.evepmod.items.tools.ItemPeridotAxe;
import com.evep.evepmod.items.tools.ItemPeridotHoe;
import com.evep.evepmod.items.tools.ItemPeridotPickaxe;
import com.evep.evepmod.items.tools.ItemPeridotShovel;
import com.evep.evepmod.items.tools.ItemPeridotSword;
import com.evep.evepmod.items.tools.ItemSelenitePickaxe;
import com.evep.evepmod.items.tools.ItemSeleniteSword;
import com.evep.evepmod.items.tools.ItemSlimeSword;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid=VanillaEvolutionMod.MODID)

public class VanillaEvolutionItems {
	
	public static ItemMalachiteIngot malachite_ingot;
	public static ItemMalachiteSword malachite_sword;
	public static ItemMalachitePickaxe malachite_pickaxe;
	public static ItemMalachiteAxe malachite_axe;
	public static ItemMalachiteShovel malachite_shovel;
	public static ItemMalachiteHoe malachite_hoe;
	public static ItemMeteoriteShard meteorite_shard;
	public static ItemNickelIngot nickel_ingot;
	public static ItemAluminumIngot aluminum_ingot;
	public static ItemSilverIngot silver_ingot;
	public static ItemLeadIngot lead_ingot;
	public static ItemZincIngot zinc_ingot;
	public static ItemCarbonIngot carbon_ingot;
	public static ItemTinIngot tin_ingot;
	public static ItemCopperIngot copper_ingot;
	public static ItemCobaltIngot cobalt_ingot;
	public static ItemEnderite enderite;
	public static ItemUltrafoodGem ultrafood_gem;
	public static ItemSuperfoodGem superfood_gem;
	public static ItemAmber amber;
	public static ItemOnyx onyx;
	public static ItemSeasonalGem seasonal_gem;
	public static ItemRuby ruby;
	public static ItemPeridot peridot;
	public static ItemAmethyst amethyst;
	public static ItemAdamantiumIngot adamantium_ingot;
	public static ItemVibranium vibranium;
	public static ItemDwarfStarAlloy dwarf_star_alloy;
	public static ItemSlimeGem slime_gem;
	public static ItemEnergeticOrb energetic_orb;
	public static ItemAncientLocket ancient_locket;
	public static ItemElementalIngot elemental_ingot;
	public static ItemSelenite selenite;
	public static ItemEnderiteSword enderite_sword;
	public static ItemEnderitePickaxe enderite_pickaxe;
	public static ItemPeridotSword peridot_sword;
	public static ItemPeridotPickaxe peridot_pickaxe;
	public static ItemPeridotAxe peridot_axe;
	public static ItemPeridotShovel peridot_shovel;
	public static ItemPeridotHoe peridot_hoe;
	public static ItemAmethystSword amethyst_sword;
	public static ItemAmethystPickaxe amethyst_pickaxe;
	public static ItemAmethystAxe amethyst_axe;
	public static ItemAmethystShovel amethyst_shovel;
	public static ItemAmethystHoe amethyst_hoe;
	public static ItemAmethystPickhoxel amethyst_pickhoxel;
	public static ItemBeryl beryl;
	public static ItemMagnetiteIngot magnetite_ingot;
	public static ItemBronzeIngot bronze_ingot;
	public static ItemIridiumIngot iridium_ingot;
	public static ItemSlimeyStuffs enchanted_slime_gem;
	public static ItemSlimeyStuffs infused_slime_gem;
	public static ItemSlimeyStuffs magical_slime_gem;
	public static ItemSlimeyStuffs evolved_slime_gem;
	public static ItemImbuedRod imbued_rod;
	public static ItemSlimeSword slime_sword;
	public static ItemBronzeSword bronze_sword;
	public static ItemBronzePickaxe bronze_pickaxe;
	public static ItemBronzeAxe bronze_axe;
	public static ItemBronzeShovel bronze_shovel;
	public static ItemBronzeHoe bronze_hoe;
	public static ItemBronzePickhoxel bronze_pickhoxel;
	public static ItemSeleniteSword selenite_sword;
	public static ItemSelenitePickaxe selenite_pickaxe;
	public static ItemOnyxPickaxe onyx_pickaxe;
	
	public static void init(){
		malachite_ingot = (ItemMalachiteIngot) new ItemMalachiteIngot("malachite_ingot").setCreativeTab(tabResources);
		malachite_sword = (ItemMalachiteSword) new ItemMalachiteSword("malachite_sword", MalachiteTools, 2.5f, 996f).setCreativeTab(tabTools);
		malachite_pickaxe = (ItemMalachitePickaxe) new ItemMalachitePickaxe("malachite_pickaxe", MalachiteTools, 2.5f, 996f).setCreativeTab(tabTools);
		malachite_axe = (ItemMalachiteAxe) new ItemMalachiteAxe("malachite_axe", MalachiteTools, 4.5f, 996f).setCreativeTab(tabTools);
		malachite_shovel = (ItemMalachiteShovel) new ItemMalachiteShovel("malachite_shovel", MalachiteTools, 2.5f, 996f).setCreativeTab(tabTools);
		malachite_hoe = (ItemMalachiteHoe) new ItemMalachiteHoe("malachite_hoe", MalachiteTools, 2.5f, 996f).setCreativeTab(tabTools);
		meteorite_shard = (ItemMeteoriteShard) new ItemMeteoriteShard("meteorite_shard").setCreativeTab(tabResources);
		nickel_ingot = (ItemNickelIngot) new ItemNickelIngot("nickel_ingot").setCreativeTab(tabResources);
		aluminum_ingot = (ItemAluminumIngot) new ItemAluminumIngot("aluminum_ingot").setCreativeTab(tabResources);
		silver_ingot = (ItemSilverIngot) new ItemSilverIngot("silver_ingot").setCreativeTab(tabResources);
		lead_ingot = (ItemLeadIngot) new ItemLeadIngot("lead_ingot").setCreativeTab(tabResources);
		zinc_ingot = (ItemZincIngot) new ItemZincIngot("zinc_ingot").setCreativeTab(tabResources);
		carbon_ingot = (ItemCarbonIngot) new ItemCarbonIngot("carbon_ingot").setCreativeTab(tabResources);
		tin_ingot = (ItemTinIngot) new ItemTinIngot("tin_ingot").setCreativeTab(tabResources);
		copper_ingot = (ItemCopperIngot) new ItemCopperIngot("copper_ingot").setCreativeTab(tabResources);
		cobalt_ingot = (ItemCobaltIngot) new ItemCobaltIngot("cobalt_ingot").setCreativeTab(tabResources);
		enderite = (ItemEnderite) new ItemEnderite("enderite").setCreativeTab(tabResources);
		ultrafood_gem = (ItemUltrafoodGem) new ItemUltrafoodGem("ultrafood_gem").setCreativeTab(tabResources);
		superfood_gem = (ItemSuperfoodGem) new ItemSuperfoodGem("superfood_gem").setCreativeTab(tabResources);
		amber = (ItemAmber) new ItemAmber("amber").setCreativeTab(tabResources);
		onyx = (ItemOnyx) new ItemOnyx("onyx").setCreativeTab(tabResources);
		seasonal_gem = (ItemSeasonalGem) new ItemSeasonalGem("seasonal_gem").setCreativeTab(tabResources);
		ruby = (ItemRuby) new ItemRuby("ruby").setCreativeTab(tabResources);
		peridot = (ItemPeridot) new ItemPeridot("peridot").setCreativeTab(tabResources);
		amethyst = (ItemAmethyst) new ItemAmethyst("amethyst").setCreativeTab(tabResources);
		adamantium_ingot = (ItemAdamantiumIngot) new ItemAdamantiumIngot("adamantium_ingot").setCreativeTab(tabResources);
		vibranium = (ItemVibranium) new ItemVibranium("vibranium").setCreativeTab(tabResources);
		dwarf_star_alloy = (ItemDwarfStarAlloy) new ItemDwarfStarAlloy("dwarf_star_alloy").setCreativeTab(tabResources);
		slime_gem = (ItemSlimeGem) new ItemSlimeGem("slime_gem").setCreativeTab(tabResources);
		energetic_orb = (ItemEnergeticOrb) new ItemEnergeticOrb("energetic_orb").setCreativeTab(tabResources);
		ancient_locket = (ItemAncientLocket) new ItemAncientLocket("ancient_locket").setCreativeTab(tabResources);
		elemental_ingot = (ItemElementalIngot) new ItemElementalIngot("elemental_ingot").setCreativeTab(tabResources);
		selenite = (ItemSelenite) new ItemSelenite("selenite").setCreativeTab(tabResources);
		enderite_sword = (ItemEnderiteSword) new ItemEnderiteSword("enderite_sword", EnderiteTools, 6f, 996f).setCreativeTab(tabTools);
		enderite_pickaxe = (ItemEnderitePickaxe) new ItemEnderitePickaxe("enderite_pickaxe", EnderiteTools, 6f, 996f).setCreativeTab(tabTools);
		peridot_sword = (ItemPeridotSword) new ItemPeridotSword("peridot_sword", PeridotTools, 5f, 996f).setCreativeTab(tabTools);
		peridot_pickaxe = (ItemPeridotPickaxe) new ItemPeridotPickaxe("peridot_pickaxe", PeridotTools, 5f, 996f).setCreativeTab(tabTools);
		peridot_axe = (ItemPeridotAxe) new ItemPeridotAxe("peridot_axe", PeridotTools, 7f, 996f).setCreativeTab(tabTools);
		peridot_shovel = (ItemPeridotShovel) new ItemPeridotShovel("peridot_shovel", PeridotTools, 5f, 996f).setCreativeTab(tabTools);
		peridot_hoe = (ItemPeridotHoe) new ItemPeridotHoe("peridot_hoe", PeridotTools, 5f, 996f).setCreativeTab(tabTools);
		amethyst_sword = (ItemAmethystSword) new ItemAmethystSword("amethyst_sword", AmethystTools, 5f, 996f).setCreativeTab(tabTools);
		amethyst_pickaxe = (ItemAmethystPickaxe) new ItemAmethystPickaxe("amethyst_pickaxe", AmethystTools, 5f, 996f).setCreativeTab(tabTools);
		amethyst_axe = (ItemAmethystAxe) new ItemAmethystAxe("amethyst_axe", AmethystTools, 7f, 996f).setCreativeTab(tabTools);
		amethyst_shovel = (ItemAmethystShovel) new ItemAmethystShovel("amethyst_shovel", AmethystTools, 5f, 996f).setCreativeTab(tabTools);
		amethyst_hoe = (ItemAmethystHoe) new ItemAmethystHoe("amethyst_hoe", AmethystTools, 5f, 996f).setCreativeTab(tabTools);
		amethyst_pickhoxel = (ItemAmethystPickhoxel) new ItemAmethystPickhoxel("amethyst_pickhoxel", AmethystTools).setCreativeTab(tabTools);
		beryl = (ItemBeryl) new ItemBeryl("beryl").setCreativeTab(tabResources);
		magnetite_ingot = (ItemMagnetiteIngot) new ItemMagnetiteIngot("magnetite_ingot").setCreativeTab(tabResources);
		bronze_ingot = (ItemBronzeIngot) new ItemBronzeIngot("bronze_ingot").setCreativeTab(tabResources);
		iridium_ingot = (ItemIridiumIngot) new ItemIridiumIngot("iridium_ingot").setCreativeTab(tabResources);
		enchanted_slime_gem = (ItemSlimeyStuffs) new ItemSlimeyStuffs("enchanted_slime_gem").setCreativeTab(tabResources);
		infused_slime_gem = (ItemSlimeyStuffs) new ItemSlimeyStuffs("infused_slime_gem").setCreativeTab(tabResources);
		magical_slime_gem = (ItemSlimeyStuffs) new ItemSlimeyStuffs("magical_slime_gem").setCreativeTab(tabResources);
		evolved_slime_gem = (ItemSlimeyStuffs) new ItemSlimeyStuffs("evolved_slime_gem").setCreativeTab(tabResources);
		imbued_rod = (ItemImbuedRod) new ItemImbuedRod("imbued_rod").setCreativeTab(tabResources);
		slime_sword = (ItemSlimeSword) new ItemSlimeSword("slime_sword", SlimeTools, 8f, 996f).setCreativeTab(tabTools);
		bronze_sword = (ItemBronzeSword) new ItemBronzeSword("bronze_sword", BronzeTools, 5f, 996f).setCreativeTab(tabTools);
		bronze_pickaxe = (ItemBronzePickaxe) new ItemBronzePickaxe("bronze_pickaxe", BronzeTools, 5f, 996f).setCreativeTab(tabTools);
		bronze_axe = (ItemBronzeAxe) new ItemBronzeAxe("bronze_axe", BronzeTools, 7f, 996f).setCreativeTab(tabTools);
		bronze_shovel = (ItemBronzeShovel) new ItemBronzeShovel("bronze_shovel", BronzeTools, 5f, 996f).setCreativeTab(tabTools);
		bronze_hoe = (ItemBronzeHoe) new ItemBronzeHoe("bronze_hoe", BronzeTools, 5f, 996f).setCreativeTab(tabTools);
		bronze_pickhoxel = (ItemBronzePickhoxel) new ItemBronzePickhoxel("bronze_pickhoxel", BronzeTools).setCreativeTab(tabTools);
		selenite_sword = (ItemSeleniteSword) new ItemSeleniteSword("selenite_sword", SeleniteTools, 12f, 996f).setCreativeTab(tabTools);
		selenite_pickaxe = (ItemSelenitePickaxe) new ItemSelenitePickaxe("selenite_pickaxe", SelenitePTools, 12f, 996f).setCreativeTab(tabTools);
		onyx_pickaxe = (ItemOnyxPickaxe) new ItemOnyxPickaxe("onyx_pickaxe", OnyxTools, 7f, 996f).setCreativeTab(tabTools);
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(malachite_ingot, malachite_sword, malachite_pickaxe, malachite_axe, malachite_shovel, malachite_hoe, meteorite_shard, nickel_ingot, 
				aluminum_ingot, silver_ingot, lead_ingot, zinc_ingot, carbon_ingot, tin_ingot, copper_ingot, cobalt_ingot, enderite, ultrafood_gem, superfood_gem, amber,
				onyx, seasonal_gem, ruby, peridot, amethyst, adamantium_ingot, vibranium, dwarf_star_alloy, slime_gem, energetic_orb, ancient_locket, elemental_ingot, selenite,
				enderite_sword, enderite_pickaxe, peridot_sword, peridot_pickaxe, peridot_axe, peridot_shovel, peridot_hoe, amethyst_sword, amethyst_pickaxe, amethyst_axe, 
				amethyst_shovel, amethyst_hoe, amethyst_pickhoxel, beryl, magnetite_ingot, bronze_ingot, iridium_ingot, enchanted_slime_gem, infused_slime_gem, magical_slime_gem,
				evolved_slime_gem, imbued_rod, slime_sword, bronze_sword, bronze_pickaxe, bronze_axe, bronze_shovel, bronze_hoe, bronze_pickhoxel, selenite_sword, selenite_pickaxe,
				onyx_pickaxe
				//, enderite_helmet, enderite_chestplate, enderite_leggings, enderite_boots
				);
	}
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		registerRender(malachite_ingot);
		registerRender(malachite_sword);
		registerRender(malachite_pickaxe);
		registerRender(malachite_axe);
		registerRender(malachite_shovel);
		registerRender(malachite_hoe);
		registerRender(meteorite_shard);
		registerRender(nickel_ingot);
		registerRender(aluminum_ingot);
		registerRender(silver_ingot);
		registerRender(lead_ingot);
		registerRender(zinc_ingot);
		registerRender(carbon_ingot);
		registerRender(tin_ingot);
		registerRender(copper_ingot);
		registerRender(cobalt_ingot);
		registerRender(enderite);
		registerRender(ultrafood_gem);
		registerRender(superfood_gem);
		registerRender(amber);
		registerRender(onyx);
		registerRender(seasonal_gem);
		registerRender(ruby);
		registerRender(peridot);
		registerRender(amethyst);
		registerRender(adamantium_ingot);
		registerRender(vibranium);
		registerRender(dwarf_star_alloy);
		registerRender(slime_gem);
		registerRender(energetic_orb);
		registerRender(ancient_locket);
		registerRender(elemental_ingot);
		registerRender(selenite);
		registerRender(enderite_sword);
		registerRender(enderite_pickaxe);
		registerRender(peridot_sword);
		registerRender(peridot_pickaxe);
		registerRender(peridot_axe);
		registerRender(peridot_shovel);
		registerRender(peridot_hoe);
		registerRender(amethyst_sword);
		registerRender(amethyst_pickaxe);
		registerRender(amethyst_axe);
		registerRender(amethyst_shovel);
		registerRender(amethyst_hoe);
		registerRender(amethyst_pickhoxel);
		registerRender(beryl);
		registerRender(magnetite_ingot);
		registerRender(bronze_ingot);
		registerRender(iridium_ingot);
		registerRender(enchanted_slime_gem);
		registerRender(infused_slime_gem);
		registerRender(magical_slime_gem); 
		registerRender(evolved_slime_gem);
		registerRender(imbued_rod);
		registerRender(slime_sword);
		registerRender(bronze_sword);
		registerRender(bronze_pickaxe);
		registerRender(bronze_axe);
		registerRender(bronze_shovel);
		registerRender(bronze_hoe);
		registerRender(bronze_pickhoxel);
		registerRender(selenite_sword);
		registerRender(selenite_pickaxe);
		registerRender(onyx_pickaxe);
	}
	
													//Name, Harvest Level, Durability, Efficiency, Damage, Enchantibility
	public static final ToolMaterial MalachiteTools = EnumHelper.addToolMaterial("MalachiteTools", 2, 905, 7f, 2.5f, 12);
	public static final ToolMaterial BronzeTools = EnumHelper.addToolMaterial("BronzeTools", 2, 4000, 9f, 2f, 20);
	public static final ToolMaterial AmethystTools = EnumHelper.addToolMaterial("AmethystTools", 3, 1350, 9f, 4f, 18);
	public static final ToolMaterial PeridotTools = EnumHelper.addToolMaterial("PeridotTools", 3, 1750, 10f, 5f, 15);
	public static final ToolMaterial OnyxTools = EnumHelper.addToolMaterial("OnyxTools", 3, -1, 7f, 4f, 25);
	public static final ToolMaterial SlimeTools = EnumHelper.addToolMaterial("SlimeTools", 3, 2050, 11f, 8f, 20);
	public static final ToolMaterial EnderiteTools = EnumHelper.addToolMaterial("EnderiteTools", 4, 5000, 15f, 7f, 25);
	public static final ToolMaterial SeleniteTools = EnumHelper.addToolMaterial("SeleniteTools", 5, 8000, 20f, 12f, 30);
	public static final ToolMaterial SelenitePTools = EnumHelper.addToolMaterial("SeleniteTools", 5, 8000, 20f, 8f, 30);
	
					//Boots, Chestplate, Leggings, Helmet
	public static final ArmorMaterial EnderiteArmor = EnumHelper.addArmorMaterial("EnderiteArmor", VanillaEvolutionMod.MODID + ":enderite", 20, 
			new int[] {5, 11, 8, 4}, 15, SoundEvents.ENTITY_ENDERMEN_TELEPORT, 3f);
	
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
	}

	
	static final CreativeTabs tabResources = (new CreativeTabs("tabResources") {

		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(onyx);
		}
		
	});
	
	static final CreativeTabs tabTools = (new CreativeTabs("tabTools") {

		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(malachite_pickaxe);
		}
		
	});
	
	public static final ArrayList<Item> ITEMS = new ArrayList<Item>();
}
