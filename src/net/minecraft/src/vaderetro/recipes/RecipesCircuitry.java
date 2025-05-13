package net.minecraft.src.vaderetro.recipes;

import net.minecraft.src.CraftingManager;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;

public class RecipesCircuitry {

    public void addRecipes(CraftingManager var1) {
        var1.addRecipe(new ItemStack(Item.wire, 32), new Object[]{"#", Character.valueOf('#'), Item.ingotCopper});
    }
}
