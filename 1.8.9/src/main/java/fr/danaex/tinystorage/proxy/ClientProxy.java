package fr.danaex.tinystorage.proxy;

import fr.danaex.tinystorage.init.TinyStorageItems;
import fr.danaex.tinystorage.render.tileentity.WoodBoxRenderer;
import fr.danaex.tinystorage.tileentity.TileEntityWoodBox;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerRenders() {
	
		TinyStorageItems.registerRenders();
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityWoodBox.class, new WoodBoxRenderer());
		
	}

}
