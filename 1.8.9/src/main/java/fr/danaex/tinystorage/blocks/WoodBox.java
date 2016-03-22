package fr.danaex.tinystorage.blocks;

import java.util.Random;

import fr.danaex.tinystorage.init.TinyStorageBlocks;
import fr.danaex.tinystorage.init.TinyStorageItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class WoodBox extends StorageBox {
	
	public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);

	public WoodBox(Material materialIn, float hardness) {
		super(materialIn, hardness);
		
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		
		if(this == TinyStorageBlocks.acacia_wood_box) {
			return TinyStorageItems.itemAcaciaWoodBox;
		} else if (this == TinyStorageBlocks.birch_wood_box) {
			return TinyStorageItems.itemBirchWoodBox;
		} else if (this == TinyStorageBlocks.darkOak_wood_box) {
			return TinyStorageItems.itemDarkOakWoodBox;
		} else if (this == TinyStorageBlocks.jungle_wood_box) {
			return TinyStorageItems.itemJungleWoodBox;
		} else if (this == TinyStorageBlocks.oak_wood_box) {
			return TinyStorageItems.itemOakWoodBox;
		} else if (this == TinyStorageBlocks.spruce_wood_box) {
			return TinyStorageItems.itemSpruceWoodBox;
		} else {
			return null;
		}	
	}

}
