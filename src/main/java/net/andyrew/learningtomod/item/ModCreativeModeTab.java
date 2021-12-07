package net.andyrew.learningtomod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab
{
    public static final CreativeModeTab LEARNINGTO_TAB = new CreativeModeTab("learningToModTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.AIR_HORN.get());
        }
    };
}
