package com.rewind.ldskyblock.screens;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.items.CapabilityItemHandler;

import javax.annotation.Nullable;

import static com.rewind.ldskyblock.screens.ModContainers.wood_oven_container;

public class WoodOvenContainer extends Container {

    protected WoodOvenContainer(int id, World world, BlockPos pos, PlayerInventory playerInventory) {
        super(wood_oven_container, id);
        TileEntity tileEntity = world.getTileEntity(pos);
        tileEntity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY);
    }

    @Override
    public boolean canInteractWith(PlayerEntity playerIn) {
        return true;
    }
}
