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
                .add(ModBlocks.ASPEN_LOG.get())
                .add(ModBlocks.PINE_WOOD.get())
                .add(ModBlocks.ASPEN_WOOD.get())
                .add(ModBlocks.STRIPPED_PINE_LOG.get())
                .add(ModBlocks.STRIPPED_ASPEN_LOG.get())
                .add(ModBlocks.STRIPPED_PINE_WOOD.get())
                .add(ModBlocks.STRIPPED_ASPEN_WOOD.get())
                .add(ModBlocks.PINE_PLANKS.get())
                .add(ModBlocks.ASPEN_PLANKS.get());

        tag(BlockTags.WOODEN_FENCES).add(ModBlocks.PINE_FENCE.get());
        tag(BlockTags.WOODEN_FENCES).add(ModBlocks.ASPEN_FENCE.get());
        tag(BlockTags.FENCE_GATES).add(ModBlocks.PINE_FENCE_GATE.get());
        tag(BlockTags.FENCE_GATES).add(ModBlocks.ASPEN_FENCE_GATE.get());
    }
}
