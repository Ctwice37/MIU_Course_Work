package Sortable;



import Zion.CookingVideo;

import java.util.Comparator;

public class sortCookingVideoByIngredientList implements Comparator<CookingVideo> {

    @Override
    public int compare(CookingVideo o1, CookingVideo o2) {
        return o1.getIngredientsList().length - o2.getIngredientsList().length;
    }
}
