package fr.danaex.tinystorage.init;

import fr.danaex.tinystorage.Reference;
import fr.danaex.tinystorage.TinyStorageMod;
import fr.danaex.tinystorage.items.BlockPlacer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TinyStorageItems {
	
/* Tiny  Storage 0.1*/
	
	public static Item itemOakWoodBox;
	public static Item itemSpruceWoodBox;
	public static Item itemBirchWoodBox;
	public static Item itemJungleWoodBox;
	public static Item itemAcaciaWoodBox;
	public static Item itemDarkOakWoodBox;
	
	public static void init() {
	
		itemAcaciaWoodBox = new BlockPlacer(TinyStorageBlocks.acacia_wood_box).setUnlocalizedName("item_acacia_wood_box").setCreativeTab(TinyStorageMod.tabTinyStorage);
		itemSpruceWoodBox = new BlockPlacer(TinyStorageBlocks.spruce_wood_box).setUnlocalizedName("item_spruce_wood_box").setCreativeTab(TinyStorageMod.tabTinyStorage);
		itemBirchWoodBox = new BlockPlacer(TinyStorageBlocks.birch_wood_box).setUnlocalizedName("item_birch_wood_box").setCreativeTab(TinyStorageMod.tabTinyStorage);
		itemJungleWoodBox = new BlockPlacer(TinyStorageBlocks.jungle_wood_box).setUnlocalizedName("item_jungle_wood_box").setCreativeTab(TinyStorageMod.tabTinyStorage);
		itemOakWoodBox = new BlockPlacer(TinyStorageBlocks.oak_wood_box).setUnlocalizedName("item_oak_wood_box").setCreativeTab(TinyStorageMod.tabTinyStorage);
		itemDarkOakWoodBox = new BlockPlacer(TinyStorageBlocks.darkOak_wood_box).setUnlocalizedName("item_dark_oak_wood_box").setCreativeTab(TinyStorageMod.tabTinyStorage);
	}
	
	public static void register() {
		
		GameRegistry.registerItem(itemAcaciaWoodBox, itemAcaciaWoodBox.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemSpruceWoodBox, itemSpruceWoodBox.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemBirchWoodBox, itemBirchWoodBox.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemJungleWoodBox, itemJungleWoodBox.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemOakWoodBox, itemOakWoodBox.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemDarkOakWoodBox, itemDarkOakWoodBox.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders() {
		
		registerRender(itemAcaciaWoodBox);
		registerRender(itemSpruceWoodBox);
		registerRender(itemBirchWoodBox);
		registerRender(itemJungleWoodBox);
		registerRender(itemOakWoodBox);
		registerRender(itemDarkOakWoodBox);
				
	}
	
	public static void registerRender(Item item) {
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.mod_id + ":" + item.getUnlocalizedName().substring(5), "inventory"));		
	}


}
