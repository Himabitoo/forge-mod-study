package com.ell.studymod.event;

import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.level.BlockEvent.BreakEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class PlayerListener{

    private static final Logger LOGGER = LogManager.getLogger();

    @SubscribeEvent
    public static void onDestroyBlock(BreakEvent event){

        Player player = event.getPlayer();
        Block block = event.getState().getBlock();
        player.sendSystemMessage(Component.translatable("You break " + block.getName()));
    }
}
