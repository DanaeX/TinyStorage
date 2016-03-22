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
				'A', new ItemStack(Blocks.planks, 3, 1), 'B', Blocks.glass_pane);
		
	}

}
