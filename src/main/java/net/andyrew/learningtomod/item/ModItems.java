package net.andyrew.learningtomod.item;

import net.andyrew.learningtomod.LearningToMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LearningToMod.MOD_ID);

    public static final RegistryObject<Item> AIR_HORN = ITEMS.register("air_horn",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.LEARNINGTO_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
