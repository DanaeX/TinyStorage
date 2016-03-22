package fr.danaex.tinystorage;

import fr.danaex.tinystorage.init.TinyStorageItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TinyStorageTab extends CreativeTabs{
	
	public TinyStorageTab(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return TinyStorageItems.itemOakWoodBox;
	}

}
