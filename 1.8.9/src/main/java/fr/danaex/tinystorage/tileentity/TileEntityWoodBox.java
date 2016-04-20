package fr.danaex.tinystorage.tileentity;

import java.util.ArrayList;

import fr.danaex.tinystorage.blocks.WoodBox;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

public class TileEntityWoodBox extends TileEntity {

	private ArrayList<ItemStack> content = new ArrayList<ItemStack>();
	private ArrayList<Integer> amounts = new ArrayList<Integer>();

	private static int amount = 0;
	private static Item boxType;
	
	public int fill(ItemStack stack) {
		
		if (stack != null) {

			if (boxType == null) {
				boxType = stack.getItem();
			}

			if (stack.getItem() == boxType && amount < 256) {

				int tempAmount = amount + stack.stackSize;

				if (tempAmount < 256) {
					amount = tempAmount;
					return 0;
				} else {
					amount = 256;
					return (256 - tempAmount) * -1;
				}

			}
		}
		return -1;
	}

	public ItemStack take() {

		ItemStack stack = null;

		if (amount >= 64) {
			stack = new ItemStack(boxType, 64);
			amount = amount - 64;
		} else if (amount != 0){
			stack = new ItemStack(boxType, amount);
			boxType = null;
			amount = 0;
		}

		return stack;

	}
	
	
	public static int getAmount() {
		return amount;
	}
	
	public static Item getBoxType() {
		return boxType;
	}

}
