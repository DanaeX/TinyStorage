package fr.danaex.tinystorage.init;

import fr.danaex.tinystorage.tileentity.TileEntityWoodBox;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TinyStorageTileEntities {
	
	public static void register() {
		
		GameRegistry.registerTileEntity(TileEntityWoodBox.class, "tsWoodBox");
		
	}

}
