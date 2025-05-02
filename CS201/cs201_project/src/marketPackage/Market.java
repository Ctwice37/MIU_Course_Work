package marketPackage;

import java.util.ArrayList;

public class Market {

    private static final String BANANAS = "bananas";
    private static final String GRAPES = "grapes";
    private static final String CHERRIES = "cherries";
    private static final String MILK = "milk";
    private static final String ALMONDS = "almonds";
    private static final String POTATOES = "potatoes";
    private static final String BROCCOLI = "broccoli";
    private static final String BOTTLED_WATER = "bottled_water";

    private static final String[] STORE_ITEMS =
            {BANANAS,
                    GRAPES,
                    CHERRIES,
                    MILK,
                    ALMONDS,
                    POTATOES,
                    BROCCOLI,
                    BOTTLED_WATER
            };

     boolean carriesFoodItem(String itemName){
        if(itemName == null) return false;
        for(String s : STORE_ITEMS){
            if(itemName.equals(s)) return true;
        }
        return false;
    }

    public static String[] getSTORE_ITEMS() {
        return STORE_ITEMS;
    }
}
