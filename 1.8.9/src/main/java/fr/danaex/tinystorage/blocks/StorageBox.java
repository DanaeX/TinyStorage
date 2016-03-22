package fr.danaex.tinystorage.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.World;

public class StorageBox extends Block {
	
	public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);

	public StorageBox(Material materialIn, float hardness) {
		super(materialIn);
		this.setHardness(hardness);
		this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
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
	public int getMetaFromState(IBlockState state)
	{
		return ((EnumFacing) state.getValue(FACING)).getHorizontalIndex();
	}
	
	@Override
	protected BlockState createBlockState()
	{
		return new BlockState(this, new IProperty[] { FACING });
	}
	
	@Override
	public IBlockState onBlockPlaced(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ,
			int meta, EntityLivingBase placer) {

		IBlockState state = super.onBlockPlaced(world, pos, facing, hitX, hitY, hitZ, meta, placer);
		state = state.withProperty(FACING, placer.getHorizontalFacing());
		return state;

	}

}
