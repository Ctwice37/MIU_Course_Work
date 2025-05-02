package Sortable;


import Zion.Video;

import java.util.Comparator;

public class sortVideosByViews implements Comparator<Video> {
    @Override
    public int compare(Video o1, Video o2) {
            return o1.getViews() - o2.getViews();
        }
}
