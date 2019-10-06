package com.rewind.ldskyblock.blocks;

import com.rewind.ldskyblock.LDSkyblock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class SproutBlock extends Block {
    public SproutBlock() {
        super(Properties.create(Material.LEAVES).sound(SoundType.PLANT).hardnessAndResistance(.5f));
        setRegistryName(LDSkyblock.MOD_ID, "sprout_block");
    }
}
