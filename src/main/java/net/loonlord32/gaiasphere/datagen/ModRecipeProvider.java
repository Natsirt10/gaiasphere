package net.loonlord32.gaiasphere.datagen;

import com.ibm.icu.impl.duration.impl.DataRecord;
import net.loonlord32.gaiasphere.block.ModBlocks;
import net.loonlord32.gaiasphere.items.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

import static net.loonlord32.gaiasphere.block.ModBlocks.PINE_LOG;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

// hey loon, this is just a template/example for when we do smth with a shaped recipe :)
//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PINE_LOG.get())
//                .pattern("BBB")
//                .pattern("BBB")
//                .pattern("BBB")
//                .define('B', ModItems.PINE_SAPLING.get())
//                .unlockedBy("has_pine_sapling",has(ModItems.PINE_SAPLING)).save(recipeOutput);
// this one's legit tho
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.PINE_PLANKS.get(), 4)
                .requires(PINE_LOG)
                .unlockedBy(getHasName(PINE_LOG),has(PINE_LOG)).save(recipeOutput);
// ok now I was ready for that :)
       stairBuilder(ModBlocks.PINE_STAIRS.get(), Ingredient.of(ModBlocks.PINE_PLANKS)).group("pine_planks")
               .unlockedBy("has_pine_planks", has(ModBlocks.PINE_PLANKS)).save(recipeOutput);
       slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINE_SLAB.get(), ModBlocks.PINE_PLANKS.get());
        fenceBuilder(ModBlocks.PINE_FENCE.get(), Ingredient.of(ModBlocks.PINE_PLANKS)).group("pine_planks")
                .unlockedBy("has_pine_planks", has(ModBlocks.PINE_PLANKS)).save(recipeOutput);
        fenceGateBuilder(ModBlocks.PINE_FENCE_GATE.get(), Ingredient.of(ModBlocks.PINE_PLANKS)).group("pine_planks")
                .unlockedBy("has_pine_planks", has(ModBlocks.PINE_PLANKS)).save(recipeOutput);

        buttonBuilder(ModBlocks.PINE_BUTTON.get(), Ingredient.of(ModBlocks.PINE_PLANKS)).group("pine_planks")
                .unlockedBy("has_pine_planks", has(ModBlocks.PINE_PLANKS)).save(recipeOutput);

        pressurePlate(recipeOutput,ModBlocks.PINE_PRESSURE_PLATE.get(), ModBlocks.PINE_PLANKS.get());

        doorBuilder(ModBlocks.PINE_DOOR.get(), Ingredient.of(ModBlocks.PINE_PLANKS)).group("pine_planks")
                .unlockedBy("has_pine_planks", has(ModBlocks.PINE_PLANKS)).save(recipeOutput);

        trapdoorBuilder(ModBlocks.PINE_TRAPDOOR.get(), Ingredient.of(ModBlocks.PINE_PLANKS)).group("pine_planks")
                .unlockedBy("has_pine_planks", has(ModBlocks.PINE_PLANKS)).save(recipeOutput);

        stairBuilder(ModBlocks.ASPEN_STAIRS.get(), Ingredient.of(ModBlocks.ASPEN_PLANKS)).group("aspen_planks")
                .unlockedBy("has_aspen_planks", has(ModBlocks.PINE_PLANKS)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ASPEN_SLAB.get(), ModBlocks.ASPEN_PLANKS.get());
        fenceBuilder(ModBlocks.ASPEN_FENCE.get(), Ingredient.of(ModBlocks.ASPEN_PLANKS)).group("aspen_planks")
                .unlockedBy("has_aspen_planks", has(ModBlocks.PINE_PLANKS)).save(recipeOutput);
        fenceGateBuilder(ModBlocks.ASPEN_FENCE_GATE.get(), Ingredient.of(ModBlocks.ASPEN_PLANKS)).group("aspen_planks")
                .unlockedBy("has_aspen_planks", has(ModBlocks.PINE_PLANKS)).save(recipeOutput);

        buttonBuilder(ModBlocks.ASPEN_BUTTON.get(), Ingredient.of(ModBlocks.ASPEN_PLANKS)).group("aspen_planks")
                .unlockedBy("has_aspen_planks", has(ModBlocks.PINE_PLANKS)).save(recipeOutput);

        pressurePlate(recipeOutput,ModBlocks.ASPEN_PRESSURE_PLATE.get(), ModBlocks.ASPEN_PLANKS.get());

        doorBuilder(ModBlocks.ASPEN_DOOR.get(), Ingredient.of(ModBlocks.ASPEN_PLANKS)).group("aspen_planks")
                .unlockedBy("has_aspen_planks", has(ModBlocks.PINE_PLANKS)).save(recipeOutput);

        trapdoorBuilder(ModBlocks.ASPEN_TRAPDOOR.get(), Ingredient.of(ModBlocks.ASPEN_PLANKS)).group("aspen_planks")
                .unlockedBy("has_aspen_planks", has(ModBlocks.PINE_PLANKS)).save(recipeOutput);

// hey loon, this is just a template/example for when we do smth with a shaped recipe :) PART 2!
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.PINE_PLANKS.get(), 64)
//                .requires(ModBlocks.YELLOW_ASPEN_LEAVES)
//                .unlockedBy("has_yellow_aspen_leaves",has(ModBlocks.YELLOW_ASPEN_LEAVES)).save(recipeOutput, "gaiasphere:holy_crap");
    }
}
