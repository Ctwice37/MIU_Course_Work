package Zion;

public class GamingVideo extends Video implements GamingVideos{

   String game;

    public GamingVideo() {
        super();
        game = "unknown";
    }

    public GamingVideo(String title, double durationInMinutes, int views, int likes, double watchTime, String game) {
        super(title, durationInMinutes, views, likes, watchTime);
        this.game = game;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }




    @Override
    public String getGameName() {
        return this.game;
    }
}
