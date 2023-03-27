package com.ell.studymod.item;

import com.ell.studymod.StudyMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS,
                    StudyMod.MOD_ID);

    public static final RegistryObject<Item> RED_DIAMOND = ITEMS.register("red_diamond",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_RED_DIAMOND = ITEMS.register("raw_red_diamond",
            () -> new Item(new Item.Properties()));



    public  static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
