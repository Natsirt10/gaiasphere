package net.loonlord32.gaiasphere.datagen;

import net.loonlord32.gaiasphere.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.neoforged.neoforge.registries.DeferredBlock;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {

    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }


    @Override
    protected void generate() {
        dropSelf(ModBlocks.PINE_PLANKS.get());
        dropSelf(ModBlocks.PINE_WOOD.get());
        dropSelf(ModBlocks.PINE_LOG.get());
        dropSelf(ModBlocks.PINE_STAIRS.get());
        dropSelf(ModBlocks.PINE_FENCE_GATE.get());
        dropSelf(ModBlocks.PINE_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.PINE_DOOR.get());
        dropSelf(ModBlocks.PINE_TRAPDOOR.get());
        dropSelf(ModBlocks.ASPEN_LOG.get());
        dropSelf(ModBlocks.ASPEN_PLANKS.get());
        dropSelf(ModBlocks.ASPEN_WOOD.get());

        add(ModBlocks.PINE_LEAVES.get(),
                block -> createLeavesDrops(ModBlocks.PINE_LEAVES.get(), ModBlocks.ASPEN_LOG));
        add(ModBlocks.GREEN_ASPEN_LEAVES.get(),
                block -> createLeavesDrops(ModBlocks.GREEN_ASPEN_LEAVES.get(), ModBlocks.ASPEN_LOG));
        add(ModBlocks.YELLOW_ASPEN_LEAVES.get(),
                block -> createLeavesDrops(ModBlocks.YELLOW_ASPEN_LEAVES.get(), ModBlocks.ASPEN_LOG));
    }

    private LootTable.Builder createLeavesDrops(Block leavesBlock, DeferredBlock<Block> aspenLog) {
        return null;
    }

    {
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
