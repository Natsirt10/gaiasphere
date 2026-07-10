package net.loonlord32.gaiasphere.datagen;

import net.loonlord32.gaiasphere.Gaiasphere;
import net.loonlord32.gaiasphere.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Gaiasphere.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        this.axisBlock(
                (RotatedPillarBlock) ModBlocks.PINE_LOG.get(),
                ResourceLocation.fromNamespaceAndPath(Gaiasphere.MODID, "block/pine_log"),
                ResourceLocation.fromNamespaceAndPath(Gaiasphere.MODID, "block/pine_log_top"));
        this.axisBlock(
                (RotatedPillarBlock) ModBlocks.PINE_WOOD.get(),
                ResourceLocation.fromNamespaceAndPath(Gaiasphere.MODID, "block/pine_log"),
                ResourceLocation.fromNamespaceAndPath(Gaiasphere.MODID, "block/pine_log"));
        this.axisBlock(
                (RotatedPillarBlock) ModBlocks.STRIPPED_PINE_LOG.get(),
                ResourceLocation.fromNamespaceAndPath(Gaiasphere.MODID, "block/stripped_pine_log"),
                ResourceLocation.fromNamespaceAndPath(Gaiasphere.MODID, "block/stripped_pine_log_top"));
        this.axisBlock(
                (RotatedPillarBlock) ModBlocks.STRIPPED_PINE_WOOD.get(),
                ResourceLocation.fromNamespaceAndPath(Gaiasphere.MODID, "block/stripped_pine_log"),
                ResourceLocation.fromNamespaceAndPath(Gaiasphere.MODID, "block/stripped_pine_log"));

        this.axisBlock(
                (RotatedPillarBlock) ModBlocks.ASPEN_LOG.get(),
                ResourceLocation.fromNamespaceAndPath(Gaiasphere.MODID, "block/aspen_log_one"),
                ResourceLocation.fromNamespaceAndPath(Gaiasphere.MODID, "block/aspen_log_top"));
        this.axisBlock(
                (RotatedPillarBlock) ModBlocks.ASPEN_WOOD.get(),
                ResourceLocation.fromNamespaceAndPath(Gaiasphere.MODID, "block/aspen_log_one"),
                ResourceLocation.fromNamespaceAndPath(Gaiasphere.MODID, "block/aspen_log_one"));
        this.axisBlock(
                (RotatedPillarBlock) ModBlocks.STRIPPED_ASPEN_LOG.get(),
                ResourceLocation.fromNamespaceAndPath(Gaiasphere.MODID, "block/stripped_aspen_log"),
                ResourceLocation.fromNamespaceAndPath(Gaiasphere.MODID, "block/stripped_aspen_log_top"));
        this.axisBlock(
                (RotatedPillarBlock) ModBlocks.STRIPPED_ASPEN_WOOD.get(),
                ResourceLocation.fromNamespaceAndPath(Gaiasphere.MODID, "block/stripped_aspen_log"),
                ResourceLocation.fromNamespaceAndPath(Gaiasphere.MODID, "block/stripped_aspen_log"));
        //Planks (All one cube with all faces)
        blockWithItem(ModBlocks.PINE_PLANKS);
        blockWithItem(ModBlocks.ASPEN_PLANKS);
        //Leaves (All one cube with all faces)
        blockWithItem(ModBlocks.PINE_LEAVES);
        blockWithItem(ModBlocks.GREEN_ASPEN_LEAVES);
        blockWithItem(ModBlocks.YELLOW_ASPEN_LEAVES);

        stairsBlock(ModBlocks.PINE_STAIRS.get(), blockTexture(ModBlocks.PINE_PLANKS.get()));
        slabBlock(ModBlocks.PINE_SLAB.get(), blockTexture(ModBlocks.PINE_PLANKS.get()), blockTexture(ModBlocks.PINE_PLANKS.get()));

        buttonBlock(ModBlocks.PINE_BUTTON.get(), blockTexture(ModBlocks.PINE_PLANKS.get()));
        pressurePlateBlock(ModBlocks.PINE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.PINE_PLANKS.get()));

        fenceBlock(ModBlocks.PINE_FENCE.get(), blockTexture(ModBlocks.PINE_PLANKS.get()));
        fenceGateBlock(ModBlocks.PINE_FENCE_GATE.get(), blockTexture(ModBlocks.PINE_PLANKS.get()));

        doorBlockWithRenderType(ModBlocks.PINE_DOOR.get(), modLoc("block/pine_door_bottom"),modLoc("block/pine_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.PINE_TRAPDOOR.get(), modLoc("block/pine_trapdoor"), true, "cutout");

        blockItem(ModBlocks.PINE_STAIRS);
        blockItem(ModBlocks.PINE_SLAB);
        blockItem(ModBlocks.PINE_PRESSURE_PLATE);
        blockItem(ModBlocks.PINE_FENCE_GATE);
        blockItem(ModBlocks.PINE_TRAPDOOR, "_bottom");

        stairsBlock(ModBlocks.ASPEN_STAIRS.get(), blockTexture(ModBlocks.ASPEN_PLANKS.get()));
        slabBlock(ModBlocks.ASPEN_SLAB.get(), blockTexture(ModBlocks.ASPEN_PLANKS.get()), blockTexture(ModBlocks.ASPEN_PLANKS.get()));

        buttonBlock(ModBlocks.ASPEN_BUTTON.get(), blockTexture(ModBlocks.ASPEN_PLANKS.get()));
        pressurePlateBlock(ModBlocks.ASPEN_PRESSURE_PLATE.get(), blockTexture(ModBlocks.ASPEN_PLANKS.get()));

        fenceBlock(ModBlocks.ASPEN_FENCE.get(), blockTexture(ModBlocks.ASPEN_PLANKS.get()));
        fenceGateBlock(ModBlocks.ASPEN_FENCE_GATE.get(), blockTexture(ModBlocks.ASPEN_PLANKS.get()));

        doorBlockWithRenderType(ModBlocks.ASPEN_DOOR.get(), modLoc("block/aspen_door_bottom"),modLoc("block/aspen_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.ASPEN_TRAPDOOR.get(), modLoc("block/aspen_trapdoor"), true, "cutout");

        blockItem(ModBlocks.ASPEN_STAIRS);
        blockItem(ModBlocks.ASPEN_SLAB);
        blockItem(ModBlocks.ASPEN_PRESSURE_PLATE);
        blockItem(ModBlocks.ASPEN_FENCE_GATE);
        blockItem(ModBlocks.ASPEN_TRAPDOOR, "_bottom");
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("gaiasphere:block/" + deferredBlock.getId().getPath()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock, String appendix) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("gaiasphere:block/" + deferredBlock.getId().getPath() + appendix));
    }
}



