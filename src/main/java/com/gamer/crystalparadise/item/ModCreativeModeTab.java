package com.gamer.crystalparadise.item;

import com.gempire.init.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab GEMS_TAB = new CreativeModeTab("gemtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ROSE_QUARTZ_QUARTZ_GEM.get());
        }
    };

}
