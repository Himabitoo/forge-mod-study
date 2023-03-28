package com.ell.studymod.item;

import com.ell.studymod.StudyMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

public class ModItems
{
    // DeferredRegisterを使用してItem型のITEMS変数を生成する
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS,StudyMod.MOD_ID);

    /**
        RegistryObjectのItem型を利用してそれぞれの変数にアイテムコードを書き込んで格納する

        --- 登録一覧 ---
        >>Items<<
        RED_DIAMOND -> red_diamond
        RAW_RED_DIAMOND -> raw_red_diamond

        >>Blocks<<

     */
    // サンダーダイアモンド
    public static final RegistryObject<Item> RED_DIAMOND = ITEMS.register("thunder_diamond",
            () -> new Item(new Item.Properties()));

    // サンダーダイアモンド原石
    public static final RegistryObject<Item> RAW_RED_DIAMOND = ITEMS.register("raw_thunder_diamond",
            () -> new Item(new Item.Properties()));


    public  static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
