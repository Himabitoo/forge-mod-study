package com.ell.studymod;

import org.slf4j.Logger;
import com.mojang.logging.LogUtils;
import com.ell.studymod.item.ModItems;
import net.minecraftforge.fml.common.Mod;
import com.ell.studymod.item.ModCreativeModeTabs;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod(StudyMod.MOD_ID)
public class StudyMod {

    public static final String MOD_ID = "studymod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public StudyMod(){

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        /**
            ~~~ModItems.register関数を呼び出して登録をする~~~
            - ModItemsクラスは呼び出さないと処理が走らないためインスタンスで呼び出す必要がある。
         */
        ModItems.register(modEventBus);

        /**
            EventBusにStudyModクラスを登録する
         */
        modEventBus.addListener(this::addCreative);
    }

    private void addCreative(CreativeModeTabEvent.BuildContents event){
        if(event.getTab() == CreativeModeTabs.INGREDIENTS){
            event.accept(ModItems.RED_DIAMOND);
            event.accept(ModItems.RAW_RED_DIAMOND);
        }

        if(event.getTab() == ModCreativeModeTabs.STUDYMOD_TAB){
            event.accept(ModItems.RED_DIAMOND);
            event.accept(ModItems.RAW_RED_DIAMOND);
        }
    }

}
