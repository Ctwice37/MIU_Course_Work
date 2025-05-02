package Zion;

public class Recipe implements Cloneable{
    private String recipeName;
    private String ingredients;
    private String instructions;
    private int prepTime;
    private int cookTime;
    private int servings;

    public Recipe(){
        recipeName = "unknown";
        ingredients = "unknown";
        instructions = "unknown";
        cookTime = 0;
        servings = 0;
    }


    public Recipe(String recipeName, String ingredients, String instructions,int prepTime, int cookTime, int servings) {
        this.recipeName = recipeName;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.prepTime = prepTime;
        this.cookTime = cookTime;
        this.servings = servings;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public int getCookTime() {
        return cookTime;
    }

    public void setCookTime(int cookTime) {
        this.cookTime = cookTime;
    }

    public int getServings() {
        return servings;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public int getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(int prepTime) {
        this.prepTime = prepTime;
    }



    @Override
    public Recipe clone() {
        try {
            Recipe clone = (Recipe) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
