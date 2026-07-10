package net.loonlord32.gaiasphere.datagen;

import net.loonlord32.gaiasphere.Gaiasphere;
import net.loonlord32.gaiasphere.block.ModBlocks;
import net.loonlord32.gaiasphere.items.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Gaiasphere.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.SARDINE.get());
        basicItem(ModItems.PINE_SAPLING.get());

        this.simpleBlockItem(ModBlocks.PINE_LOG.getId());
        this.simpleBlockItem(ModBlocks.PINE_WOOD.getId());
        this.simpleBlockItem(ModBlocks.ASPEN_LOG.getId());
        this.simpleBlockItem(ModBlocks.ASPEN_WOOD.getId());
        this.simpleBlockItem(ModBlocks.STRIPPED_PINE_LOG.getId());
        this.simpleBlockItem(ModBlocks.STRIPPED_PINE_WOOD.getId());
        this.simpleBlockItem(ModBlocks.STRIPPED_ASPEN_LOG.getId());
        this.simpleBlockItem(ModBlocks.STRIPPED_ASPEN_WOOD.getId());

        buttonItem(ModBlocks.PINE_BUTTON, ModBlocks.PINE_PLANKS);
        fenceItem(ModBlocks.PINE_FENCE, ModBlocks.PINE_PLANKS);
        fenceItem(ModBlocks.PINE_FENCE, ModBlocks.PINE_PLANKS);

        basicItem(ModBlocks.PINE_DOOR.asItem());

        buttonItem(ModBlocks.ASPEN_BUTTON, ModBlocks.ASPEN_PLANKS);
        fenceItem(ModBlocks.ASPEN_FENCE, ModBlocks.ASPEN_PLANKS);
        fenceItem(ModBlocks.ASPEN_FENCE, ModBlocks.ASPEN_PLANKS);

        basicItem(ModBlocks.ASPEN_DOOR.asItem());
    }

    public void buttonItem(DeferredBlock<?> block, DeferredBlock<?> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/button_inventory"))
                .texture("texture", ResourceLocation.fromNamespaceAndPath(Gaiasphere.MODID,
                        "block/" + baseBlock.getId().getPath()));
    }
    public void fenceItem(DeferredBlock<?> block, DeferredBlock<?> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/fence_inventory"))
                .texture("texture", ResourceLocation.fromNamespaceAndPath(Gaiasphere.MODID,
                        "block/" + baseBlock.getId().getPath()));
    }
}
