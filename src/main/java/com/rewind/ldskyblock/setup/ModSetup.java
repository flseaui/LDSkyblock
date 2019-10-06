package com.rewind.ldskyblock.setup;

import com.rewind.ldskyblock.items.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {

    public static ItemGroup itemGroup = new ItemGroup("ldskyblock") {

        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.sprout);
        }
    };

    public void init() {

    }

}
