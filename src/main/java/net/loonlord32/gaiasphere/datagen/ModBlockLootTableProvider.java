package net.loonlord32.gaiasphere.datagen;

import net.loonlord32.gaiasphere.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {

    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.PINE_PLANKS.get());
        this.dropSelf(ModBlocks.PINE_LOG.get());
        this.dropSelf(ModBlocks.PINE_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_PINE_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_PINE_WOOD.get());
        this.dropSelf(ModBlocks.PINE_STAIRS.get());
        add(ModBlocks.PINE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.PINE_SLAB.get()));
        this.dropSelf(ModBlocks.PINE_FENCE.get());
        this.dropSelf(ModBlocks.PINE_BUTTON.get());
        this.dropSelf(ModBlocks.PINE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.PINE_TRAPDOOR.get());
        add(ModBlocks.PINE_DOOR.get(),
                block -> createDoorTable(ModBlocks.PINE_DOOR.get()));
        this.dropSelf(ModBlocks.PINE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.ASPEN_PLANKS.get());
        this.dropSelf(ModBlocks.ASPEN_LOG.get());
        this.dropSelf(ModBlocks.ASPEN_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_ASPEN_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_ASPEN_WOOD.get());
        this.dropSelf(ModBlocks.ASPEN_STAIRS.get());
        add(ModBlocks.ASPEN_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.ASPEN_SLAB.get()));
        this.dropSelf(ModBlocks.ASPEN_FENCE.get());
        this.dropSelf(ModBlocks.ASPEN_BUTTON.get());
        this.dropSelf(ModBlocks.ASPEN_FENCE_GATE.get());
        this.dropSelf(ModBlocks.ASPEN_TRAPDOOR.get());
        add(ModBlocks.ASPEN_DOOR.get(),
                block -> createDoorTable(ModBlocks.ASPEN_DOOR.get()));
        this.dropSelf(ModBlocks.ASPEN_PRESSURE_PLATE.get());

        //TODO: IMPORTANT: REPLACE THE LOGS CALLS WITH THE SAPLING BLOCK INSTEAD WHEN IMPLEMENTED
        add(ModBlocks.PINE_LEAVES.get(),
                block -> this.createLeavesDrops(ModBlocks.PINE_LEAVES.get(), ModBlocks.ASPEN_LOG.get(), NORMAL_LEAVES_SAPLING_CHANCES));

       add(ModBlocks.GREEN_ASPEN_LEAVES.get(),
                block -> this.createLeavesDrops(ModBlocks.GREEN_ASPEN_LEAVES.get(), ModBlocks.ASPEN_LOG.get(), NORMAL_LEAVES_SAPLING_CHANCES));

       add(ModBlocks.YELLOW_ASPEN_LEAVES.get(),
                block -> this.createLeavesDrops(ModBlocks.YELLOW_ASPEN_LEAVES.get(), ModBlocks.YELLOW_ASPEN_LEAVES.get(), NORMAL_LEAVES_SAPLING_CHANCES));
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
