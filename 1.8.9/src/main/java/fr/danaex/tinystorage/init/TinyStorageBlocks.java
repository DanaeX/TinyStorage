package fr.danaex.tinystorage.init;

import fr.danaex.tinystorage.TinyStorageMod;
import fr.danaex.tinystorage.blocks.WoodBox;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TinyStorageBlocks {

	public static Block oak_wood_box;
	public static Block spruce_wood_box;
	public static Block birch_wood_box;
	public static Block jungle_wood_box;
	public static Block acacia_wood_box;
	public static Block darkOak_wood_box;
	
	public static void init() {
		
		oak_wood_box =  new WoodBox(Material.wood, 1.0F).setUnlocalizedName("oak_wood_box");
		spruce_wood_box =  new WoodBox(Material.wood, 1.0F).setUnlocalizedName("spruce_wood_box");
		birch_wood_box =  new WoodBox(Material.wood, 1.0F).setUnlocalizedName("birch_wood_box");
		jungle_wood_box =  new WoodBox(Material.wood, 1.0F).setUnlocalizedName("jungle_wood_box");
		acacia_wood_box =  new WoodBox(Material.wood, 1.0F).setUnlocalizedName("acacia_wood_box");
		darkOak_wood_box =  new WoodBox(Material.wood, 1.0F).setUnlocalizedName("dark_oak_wood_box");
		
	}
	
	public static void register() {
		
		GameRegistry.registerBlock(oak_wood_box, oak_wood_box.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(spruce_wood_box, spruce_wood_box.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(birch_wood_box, birch_wood_box.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(jungle_wood_box, jungle_wood_box.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(acacia_wood_box, acacia_wood_box.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(darkOak_wood_box, darkOak_wood_box.getUnlocalizedName().substring(5));
		
	}
}
