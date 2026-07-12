package net.loonlord32.gaiasphere.datagen;

import net.loonlord32.gaiasphere.Gaiasphere;
import net.loonlord32.gaiasphere.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Gaiasphere.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.PINE_LOG.get())
                .add(ModBlocks.PINE_WOOD.get())
                .add(ModBlocks.STRIPPED_PINE_LOG.get())
                .add(ModBlocks.STRIPPED_PINE_WOOD.get())
                .add(ModBlocks.PINE_PLANKS.get())
                .add(ModBlocks.PINE_STAIRS.get())
                .add(ModBlocks.PINE_SLAB.get())
                .add(ModBlocks.PINE_BUTTON.get())
                .add(ModBlocks.PINE_FENCE.get())
                .add(ModBlocks.PINE_FENCE_GATE.get())
                .add(ModBlocks.PINE_PRESSURE_PLATE.get())
                .add(ModBlocks.PINE_DOOR.get())
                .add(ModBlocks.PINE_TRAPDOOR.get())
                .add(ModBlocks.ASPEN_LOG.get())
                .add(ModBlocks.ASPEN_WOOD.get())
                .add(ModBlocks.STRIPPED_ASPEN_LOG.get())
                .add(ModBlocks.STRIPPED_ASPEN_WOOD.get())
                .add(ModBlocks.ASPEN_PLANKS.get())
                .add(ModBlocks.ASPEN_STAIRS.get())
                .add(ModBlocks.ASPEN_SLAB.get())
                .add(ModBlocks.ASPEN_BUTTON.get())
                .add(ModBlocks.ASPEN_FENCE.get())
                .add(ModBlocks.ASPEN_FENCE_GATE.get())
                .add(ModBlocks.ASPEN_PRESSURE_PLATE.get())
                .add(ModBlocks.ASPEN_DOOR.get())
                .add(ModBlocks.ASPEN_TRAPDOOR.get());

        tag(BlockTags.WOODEN_FENCES).add(ModBlocks.PINE_FENCE.get());
        tag(BlockTags.WOODEN_FENCES).add(ModBlocks.ASPEN_FENCE.get());
        tag(BlockTags.FENCE_GATES).add(ModBlocks.PINE_FENCE_GATE.get());
        tag(BlockTags.FENCE_GATES).add(ModBlocks.ASPEN_FENCE_GATE.get());
    }
}
