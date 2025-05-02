package Zion;

import java.util.Arrays;
import java.util.Comparator;

public class JavaTube {

    public class sortVideosByTitle implements Comparator<Video> {                                           //Member Inner Class

        @Override
        public int compare(Video o1, Video o2) {
            return o1.getTitle().compareTo(o2.getTitle());
        }
    }


    public static class sortVideosByViews implements Comparator<Video> {                                          //Member Inner Class
        @Override
        public int compare(Video o1, Video o2) {
            return o1.getViews() - o2.getViews();
        }
    }




        public void printByIngredientList(CookingVideo[] cookingVideos) {                                       //Local Inner Class

            class sortByIngredientList implements Comparator<CookingVideo> {
                @Override
                    public int compare (CookingVideo o1, CookingVideo o2){
                        return o1.getIngredientsList().length - o2.getIngredientsList().length;
                    }
                }

                sortByIngredientList a = new sortByIngredientList();

                Arrays.sort(cookingVideos, a);
            }


    public void videoPrinter(Video[] arr) {
        for(Video v : arr)
            System.out.println(v);
    }

    public void printAllCookingRecipes(CookingVideo[] arr){
        for(CookingVideo c : arr)
            c.printRecipe();
    }

    public static void main(String[] args) {

        //////////////create <CookingVideo> && <Recipe> objects,, put Recipe objects inside CookingVideo Constructor////////////////////////
        Recipe r1 = new Recipe("Spaghetti", " Spaghetti, Sauce, Sausage, Parmesan, mushrooms, salt, pepper", "Boil water, Saute vegetable, cook spaghetti, serve, eat", 30, 20, 5);
        CookingVideo c1 = new CookingVideo("How to Make Spaghetti", 5.00, 500, 400, 50000, r1);

        Recipe r2 = new Recipe("PBJ", " Bread, PeanutButter, Jam", "Slather PeanutButter on Bread, Do the same With Jam, Combine halves of Bread, Eat", 4, 2, 1);
        CookingVideo c2 = new CookingVideo("How to Make PBJ Sandwich", 2.00, 1000, 23, 40000, r2);

        //////////////create gaming video object////////////////////////
        GamingVideo g1 = new GamingVideo();


        //////////////create Array of <Video> Type, populate with all Video objects////////////////////////
        Video[] allVideos = new Video[]{c1, c2, g1};

        //////////////create Array of <CookingVideo> Type, populate with all CookingVideo objects////////////////////////
        CookingVideo[] cookingVideos= new CookingVideo[]{c1, c2};

        //////////////create Array of <GamingVideo> Type, populate with all VideoGames objects////////////////////////

        GamingVideo[] gamingVideos = new GamingVideo[]{g1};
//
//
//
//
//
//        //////////////Print allVideos using .videoPrinter() Method////////////////////////
//        System.out.println("\n\n****Before Sorting .....\n");
          JavaTube jt = new JavaTube();
//       jt.videoPrinter(allVideos);
//
//        Arrays.sort(allVideos);                                 //**Sorts according to watchTime**, using the @Override Comparable method, defined in Video Class
//
//        System.out.println("\n\n.....After Arrays.sort(), (using watchTime as the criteria) \n\n");
//        jt.videoPrinter(allVideos);
//
//
//        //////////////Member Inner Class -- Comparator Interface -- (SortByTitle) ////////////////////////
//        JavaTube.sortVideosByTitle sortByTitle = jt.new sortVideosByTitle();
//
//        Arrays.sort(allVideos, sortByTitle);
//
//        jt.videoPrinter(allVideos);
//
//        //////////////Static Inner Class -- Comparator Interface -- (SortByViews) ////////////////////////
//
//        JavaTube.sortVideosByViews sortByViews = new sortVideosByViews();
//
//        Arrays.sort(allVideos, sortByViews);
//
//        //////////////Local Inner Class -- Comparator Interface -- (SortBy_IngredientList) ////////////////////////
//
//
//        JavaTube j = new JavaTube();                        //MainClass
//
//       j.printByIngredientList(cookingVideos);
//
//
//
//        //////////////Anonymous Inner Class -- Comparator Interface -- (SortBy_ServingSize_Descending) ////////////////////////
//
//        Arrays.sort(cookingVideos, new Comparator<CookingVideo>() {
//
//            @Override
//            public int compare(CookingVideo o1, CookingVideo o2) {
//                return -1 * (o1.getCookingRecipe().getServings() - o2.getCookingRecipe().getServings());
//            }
//        });
//
        //////////////printAllCookingVideosMethod////////////////////////

        //jt.printAllCookingRecipes(cookingVideos);

//        //////////////Use custom VideoList Class ////////////////////////
          VideoList list = new VideoList();
        for(Video v : gamingVideos)
            list.add(v);
        for(Video v : cookingVideos)
            list.add(v);

        //Print VideoList using a <VideoList> toString() method which concatenates output from <Video> toString() Method
        System.out.println(list);


        JavaTube.sortVideosByViews sv = new sortVideosByViews();
        //Sort By Views
        Arrays.sort(list.getVideo(), sv);


    }
}
