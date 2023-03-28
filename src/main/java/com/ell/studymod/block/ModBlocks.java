package com.ell.studymod.block;

import com.ell.studymod.StudyMod;
import net.minecraft.world.item.Item;
import com.ell.studymod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, StudyMod.MOD_ID);

    public static RegistryObject<Block> DEEPSLATE_THUNDER_DIAMOND_ORE = registryBlock("deesplate_thunder_diamond_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()));

    private static <T extends Block>RegistryObject<T> registryBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name,block);
        registerBlockItem(name,toReturn);

        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name,RegistryObject<T> block){
        return ModItems.ITEMS.register(name,() -> new BlockItem(block.get(),
                new Item.Properties()));
    }

    public static void register(IEventBus eventBus){

        BLOCKS.register(eventBus);

    }

}
