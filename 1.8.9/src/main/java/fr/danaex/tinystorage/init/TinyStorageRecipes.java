package fr.danaex.tinystorage.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TinyStorageRecipes {
	
	public static void register() {
		
		GameRegistry.addRecipe(new ItemStack(TinyStorageItems.itemOakWoodBox, 1),
				"AAA",
				"ABA",
				"AAA",
				'A', new ItemStack(Blocks.planks, 1, 0), 'B', Blocks.glass_pane);
		
		GameRegistry.addRecipe(new ItemStack(TinyStorageItems.itemSpruceWoodBox, 1),
				"AAA",
				"ABA",
				"AAA",
				'A', new ItemStack(Blocks.planks, 1, 1), 'B', Blocks.glass_pane);
		
		GameRegistry.addRecipe(new ItemStack(TinyStorageItems.itemBirchWoodBox, 1),
				"AAA",
				"ABA",
				"AAA",
				'A', new ItemStack(Blocks.planks, 1, 2), 'B', Blocks.glass_pane);
		
		GameRegistry.addRecipe(new ItemStack(TinyStorageItems.itemJungleWoodBox, 1),
				"AAA",
				"ABA",
				"AAA",
				'A', new ItemStack(Blocks.planks, 1, 3), 'B', Blocks.glass_pane);
		
		GameRegistry.addRecipe(new ItemStack(TinyStorageItems.itemAcaciaWoodBox, 1),
				"AAA",
				"ABA",
				"AAA",
				'A', new ItemStack(Blocks.planks, 1, 4), 'B', Blocks.glass_pane);
		
		GameRegistry.addRecipe(new ItemStack(TinyStorageItems.itemDarkOakWoodBox, 1),
				"AAA",
				"ABA",
				"AAA",
				'A', new ItemStack(Blocks.planks, 1, 5), 'B', Blocks.glass_pane);
		
	}

}
