package fr.danaex.tinystorage.proxy;

import fr.danaex.tinystorage.init.TinyStorageItems;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerRenders() {
	
		TinyStorageItems.registerRenders();
		
	}

}
