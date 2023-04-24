package com.ell.studymod.datagen;

import com.ell.studymod.StudyMod;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {


    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, StudyMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item){
        return withExistingParent(Item.getId(),getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(StudyMod.MOD_ID,"item/" + item.getId().getPath()));
    }

//    private ItemModelBuilder

}
