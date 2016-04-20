package fr.danaex.tinystorage.render.tileentity;

import org.lwjgl.opengl.GL11;

import fr.danaex.tinystorage.tileentity.TileEntityWoodBox;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;

public class WoodBoxRenderer extends TileEntitySpecialRenderer<TileEntityWoodBox> {

	@Override
	public void renderTileEntityAt(TileEntityWoodBox te, double x, double y, double z, float partialTicks, int destroyStage) {
		
		GL11.glPushMatrix();
		
		
	}

}
