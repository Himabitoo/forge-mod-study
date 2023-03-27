package com.ell.studymod;

import com.ell.studymod.item.ModCreativeModeTabs;
import com.ell.studymod.item.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(StudyMod.MOD_ID)
public class StudyMod {

    public static final String MOD_ID = "studymod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public StudyMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(this);

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
