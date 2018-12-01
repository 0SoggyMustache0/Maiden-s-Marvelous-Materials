package com.maideniles.maidensmaterials.init.blocks.trees.vine;

import java.util.Random;

import com.maideniles.maidensmaterials.config.ConfigHandler;

import net.minecraft.block.BlockVine;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockPaulowniaVine extends BlockVine {
	
	public BlockPaulowniaVine(String name){
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setSoundType(SoundType.PLANT);
	}

	
	private boolean canAttachVineOn(IBlockState state)
    {
        return state.isFullCube() && state.getMaterial().blocksMovement();
    }
	
	@Override
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
		if(ConfigHandler.PAULOWNIA_VINES_GROW){
		
		// TODO Auto-generated method stub
		super.updateTick(worldIn, pos, state, rand);
		}
	}
}
