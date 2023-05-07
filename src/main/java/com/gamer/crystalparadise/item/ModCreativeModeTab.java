package com.gamer.crystalparadise.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import java.util.function.Supplier;

public class ModCreativeModeTab extends CreativeModeTab {
    private Supplier<ItemStack> displayStack;

    public static final ModCreativeModeTab GEMS_TAB = new ModCreativeModeTab("gemtab", () -> new ItemStack(ModItems.PINK_PORCELAIN.get()));
    private ModCreativeModeTab(String label, Supplier<ItemStack> displayStack) {
        super(label);
        this.displayStack = displayStack;
    }

    @Override
    public ItemStack makeIcon() { return displayStack.get(); }

    @Override
    public boolean canScroll() {
        return true;
    }

}
