package mezz.jei.runtime;

import mezz.jei.api.IJeiHelpers;
import mezz.jei.api.ingredients.IIngredientRegistry;
import mezz.jei.gui.GuiHelper;
import mezz.jei.ingredients.IngredientBlacklist;
import mezz.jei.startup.StackHelper;
import mezz.jei.transfer.RecipeTransferHandlerHelper;
import mezz.jei.util.Log;

public class JeiHelpers implements IJeiHelpers {
	private final GuiHelper guiHelper;
	private final StackHelper stackHelper;
	private final IngredientBlacklist ingredientBlacklist;
	private final RecipeTransferHandlerHelper recipeTransferHandlerHelper;

	public JeiHelpers(IIngredientRegistry ingredientRegistry, StackHelper stackHelper) {
		this.guiHelper = new GuiHelper();
		this.stackHelper = stackHelper;
		this.ingredientBlacklist = new IngredientBlacklist(ingredientRegistry);
		this.recipeTransferHandlerHelper = new RecipeTransferHandlerHelper();
	}

	@Override
	public GuiHelper getGuiHelper() {
		return guiHelper;
	}

	@Override
	public StackHelper getStackHelper() {
		return stackHelper;
	}

	@Override
	@Deprecated
	public IngredientBlacklist getItemBlacklist() {
		return ingredientBlacklist;
	}

	@Override
	public IngredientBlacklist getIngredientBlacklist() {
		return ingredientBlacklist;
	}

	@Override
	public RecipeTransferHandlerHelper recipeTransferHandlerHelper() {
		return recipeTransferHandlerHelper;
	}

	@Override
	public void reload() {
		Log.error("A mod tried to reload JEI, this is no longer supported. See the javadocs for more information", new RuntimeException());
	}
}
