package com.rewind.ldskyblock.screens;

import com.rewind.ldskyblock.LDSkyblock;
import com.rewind.ldskyblock.blocks.ModBlocks;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = LDSkyblock.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(LDSkyblock.MOD_ID)
public class ModContainers {

    @ObjectHolder("ldskyblock:wood_oven")
    public static ContainerType<WoodOvenContainer> wood_oven_container;

    @SubscribeEvent
    public static void registerContainers(RegistryEvent.Register<ContainerType<?>> event) {
        event.getRegistry().registerAll(
                IForgeContainerType.create((windowId, inv, data) -> {
                    BlockPos pos = data.readBlockPos();
                    return new WoodOvenContainer(windowId, LDSkyblock.proxy.getClientWorld(), pos, inv);
                }).setRegistryName(ModBlocks.wood_oven.getRegistryName())
        );
    }
}
