package Zion;

public class Video implements Comparable<Video>{
    String title;
    double durationInMinutes;
    int views;
    int likes;
    double watchTime;

    public Video() {
        title = "untitled";
        durationInMinutes = 0.0;
        views = 0;
        likes = 0;
        watchTime = 0.0;

    }

    public Video(String title, double durationInMinutes, int views, int likes, double watchTime) {
        this.title = title;
        this.durationInMinutes = durationInMinutes;
        this.views = views;
        this.likes = likes;
        this.watchTime = watchTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(double durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public double getWatchTime() {
        return watchTime;
    }

    public void setWatchTime(double watchTime) {
        this.watchTime = watchTime;
    }


    @Override
    public int compareTo(Video o) {
        if (!(o == null)) {
            if (this.watchTime > o.watchTime)
                return 1;
            else if (this.watchTime == o.watchTime)
                return 0;

        }return -1;
    }

//    @Override
//    public String toString() {
//        return
//                "\n----------------\nTitle: " + "\"" + title + "\""+
//                "\nDurationInMinutes: " + durationInMinutes +
//                "\nViews: " + views +
//                "\nLikes: " + likes +
//                "\nWatchTime: " + watchTime + "\n----------------";
//    }

        @Override
    public String toString() {
        return
                "Title: " + "\"" + title + "\""+
                " DurationInMinutes: " + durationInMinutes +
                " Views: " + views +
                " Likes: " + likes +
                " WatchTime: " + watchTime;
    }

}

