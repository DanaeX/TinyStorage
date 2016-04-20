package fr.danaex.tinystorage;

import fr.danaex.tinystorage.blocks.WoodBox;
import fr.danaex.tinystorage.init.TinyStorageBlocks;
import fr.danaex.tinystorage.init.TinyStorageItems;
import fr.danaex.tinystorage.init.TinyStorageRecipes;
import fr.danaex.tinystorage.init.TinyStorageTileEntities;
import fr.danaex.tinystorage.proxy.CommonProxy;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.mod_id, name = Reference.mod_name, version = Reference.version)
public class TinyStorageMod {
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final TinyStorageTab tabTinyStorage = new TinyStorageTab("tabTinyStorage");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		
		/* Registering Blocks and Items*/
		TinyStorageBlocks.init();
		TinyStorageItems.init();
		TinyStorageBlocks.register();
		TinyStorageItems.register();
		
		/* Registering Recipes */
		TinyStorageRecipes.register();
		
		/* Registering Tile Entities */
		TinyStorageTileEntities.register();
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
		proxy.registerRenders();
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
		
		
	}

}
