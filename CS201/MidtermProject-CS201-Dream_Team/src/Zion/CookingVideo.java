package Zion;



public class CookingVideo extends Video implements CookingVideos{
    Recipe recipe;

    public CookingVideo() {
       super();
       recipe = new Recipe();
    }

    public CookingVideo(String title, double durationInMinutes, int views, int likes, double watchTime, Recipe recipe) {
        super(title, durationInMinutes, views, likes, watchTime);
        this.recipe = recipe;
    }

    @Override
    public String[] getIngredientsList() {
        String ingredients = this.getCookingRecipe().getIngredients();
        String[] items = ingredients.split(",");

        return items;


    }

    @Override
    public Recipe getCookingRecipe() {
        return recipe;
    }

    @Override
    public void printRecipe() {
        Recipe r = this.getCookingRecipe();
        String[] ingredients = this.getIngredientsList();

        System.out.println("\n\n----------------------\nDish: *" + r.getRecipeName() + "*" +"\n\nIngredients: " );
        for(String s : ingredients)
            System.out.println("-" + s);
        System.out.println("\nInstructions: "+ r.getInstructions() + "\n\nPrep Time: "+ r.getPrepTime() +
                "\nCook Time: " + r.getCookTime() + "\n\nServings: " + r.getServings() + "\n----------------------");

    }
}
