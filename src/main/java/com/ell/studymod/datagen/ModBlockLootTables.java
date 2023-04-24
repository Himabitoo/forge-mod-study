package com.ell.studymod.datagen;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Set;

/**
 *  BlockLootSubProviderクラスを使うとブロックのドロップ数のカスタマイズを行える
 */

public class ModBlockLootTables extends BlockLootSubProvider {


    /**
     *  クラスが呼び出された時にこの処理を走らせる。
     *
     *  super(Set.of(), FeatureFlags.REGISTRY.allFlags());
     *
     *  FeatureFlags.REGISTRY.allFlags()　はすべての機能フラグを有効にできる。
     */

    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {

    }

    @Override
    protected Iterable<Block> getKnownBlocks(){
        return super.getKnownBlocks();

    }
}
