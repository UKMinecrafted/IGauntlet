package com.common.blocks;


import com.tabs.InfinityTabs;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import javax.annotation.Nullable;

public class AshPile extends BlockBase {

    public static final AxisAlignedBB DUST_AABB = new AxisAlignedBB(0.3125,0,0.3125,0.6875,0.1875 / 2,0.6875);

    public AshPile(String name, Material material)
    {
        super(name, material);
        setSoundType(SoundType.SAND);
        setHardness(0.0F);
        setResistance(0.1F);
        setCreativeTab(InfinityTabs.infinityTabs);
    }

    @Override
    public boolean isFullBlock(IBlockState state) {
        return false;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return DUST_AABB;
    }
}