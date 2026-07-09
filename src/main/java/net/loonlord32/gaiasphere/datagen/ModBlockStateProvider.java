package net.loonlord32.gaiasphere.datagen;

import net.loonlord32.gaiasphere.Gaiasphere;
import net.loonlord32.gaiasphere.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Gaiasphere.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        this.logBlock((RotatedPillarBlock) ModBlocks.PINE_LOG.get());
        this.simpleBlock(ModBlocks.PINE_WOOD.get(), this.models().cubeAll(ModBlocks.PINE_WOOD.getId().getPath(), ResourceLocation.fromNamespaceAndPath(Gaiasphere.MODID, "block/pine_log")));

        this.axisBlock(
                (RotatedPillarBlock) ModBlocks.ASPEN_LOG.get(),
                ResourceLocation.fromNamespaceAndPath(Gaiasphere.MODID, "block/aspen_log_one"),
                ResourceLocation.fromNamespaceAndPath(Gaiasphere.MODID, "block/aspen_log_top"));
        this.simpleBlock(ModBlocks.ASPEN_WOOD.get(), this.models().cubeAll(ModBlocks.ASPEN_WOOD.getId().getPath(), ResourceLocation.fromNamespaceAndPath(Gaiasphere.MODID, "block/aspen_log_one")));

        //Planks (All one cube with all faces)
        blockWithItem(ModBlocks.PINE_PLANKS);
        blockWithItem(ModBlocks.ASPEN_PLANKS);
        //Leaves (All one cube with all faces)
        blockWithItem(ModBlocks.PINE_LEAVES);
        blockWithItem(ModBlocks.GREEN_ASPEN_LEAVES);
        blockWithItem(ModBlocks.YELLOW_ASPEN_LEAVES);

    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
