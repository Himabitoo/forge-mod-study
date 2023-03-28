package com.ell.studymod.item;

import com.ell.studymod.StudyMod;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

@Mod.EventBusSubscriber(modid = StudyMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {

    public static CreativeModeTab STUDYMOD_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event){

        STUDYMOD_TAB = event.registerCreativeModeTab(new ResourceLocation(StudyMod.MOD_ID,"studymod_tab"),
                builder -> builder.icon(()-> new ItemStack(ModItems.THUNDER_DIAMOND.get()))
                        .title(Component.translatable("creativemodetab.studymod_tab")));

    }
}
