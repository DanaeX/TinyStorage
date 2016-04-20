package fr.danaex.tinystorage.blocks;

import java.util.ArrayList;
import java.util.Random;

import fr.danaex.tinystorage.init.TinyStorageBlocks;
import fr.danaex.tinystorage.init.TinyStorageItems;
import fr.danaex.tinystorage.tileentity.TileEntityWoodBox;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;

public class WoodBox extends StorageBox implements ITileEntityProvider {

	public WoodBox(Material materialIn, float hardness) {
		super(materialIn, hardness);
	}

	@Override
	public boolean isFullCube() {
		return false;
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public EnumWorldBlockLayer getBlockLayer() {
		return EnumWorldBlockLayer.CUTOUT;
	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
			EnumFacing side, float hitX, float hitY, float hitZ) {

		ItemStack stack = playerIn.getCurrentEquippedItem();

		TileEntityWoodBox tile = (TileEntityWoodBox) worldIn.getTileEntity(pos);
		
		System.out.println(playerIn.isSneaking());

		if (playerIn.isSneaking()) {

			if (stack == null && !worldIn.isRemote) {
				
				ItemStack stack2 = tile.take();

				EntityItem ent = new EntityItem(worldIn, pos.getX() , pos.getY() + 0.5, pos.getZ() + 0.5, stack2);
				worldIn.spawnEntityInWorld(ent);
				return true;

			}
			
		} else {

			int returned = tile.fill(stack);

			if (returned != -1) {

				stack.stackSize = returned;
				worldIn.markBlockForUpdate(pos);
				return true;
			}

		}
		return false;

	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {

		if (this == TinyStorageBlocks.acacia_wood_box) {
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

	@Override
	public ItemStack getPickBlock(MovingObjectPosition target, World world, BlockPos pos, EntityPlayer player) {
		if (this == TinyStorageBlocks.acacia_wood_box) {
			return new ItemStack(TinyStorageItems.itemAcaciaWoodBox);
		} else if (this == TinyStorageBlocks.birch_wood_box) {
			return new ItemStack(TinyStorageItems.itemBirchWoodBox);
		} else if (this == TinyStorageBlocks.darkOak_wood_box) {
			return new ItemStack(TinyStorageItems.itemDarkOakWoodBox);
		} else if (this == TinyStorageBlocks.jungle_wood_box) {
			return new ItemStack(TinyStorageItems.itemJungleWoodBox);
		} else if (this == TinyStorageBlocks.oak_wood_box) {
			return new ItemStack(TinyStorageItems.itemOakWoodBox);
		} else if (this == TinyStorageBlocks.spruce_wood_box) {
			return new ItemStack(TinyStorageItems.itemSpruceWoodBox);
		} else {
			return null;
		}
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityWoodBox();
	}

}