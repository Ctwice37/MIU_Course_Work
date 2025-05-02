package Sortable;

import Zion.CookingVideo;

import java.util.Comparator;

public class sortCookingVideoByServingSizeDescending implements Comparator<CookingVideo> {

    @Override
    public int compare(CookingVideo o1, CookingVideo o2) {
        return -1 * (o1.getCookingRecipe().getServings() - o2.getCookingRecipe().getServings());
    }
}
