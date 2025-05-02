package Zion;

public class VideoList {

    private Video[] video;
    private int size;

    public VideoList() {
        this.video = video = new Video[10];
        this.size = 0;
    }

    public void add(Video o){
        resize();
        for (int i = 0; i < video.length; i++) {
            if(video[size] == null){
                video[size] = o;
                break;}
            size++;
        }
    }

    public int size(){
        return size;
    }

    public void resize(){
        if(video.length-1 == size){
            Video[] temp = new Video[video.length*2];
            for (int i = 0; i < video.length; i++) {
                temp[i] = video[i];
            }video = temp;
        }
    }

    @Override
    public String toString() {
        String y = "";
        for (Video v: video){
            if(v == null)
                break;

            y += v;}

        return y;
    }

    public Video[] getVideo() {

        Video[] temp = new Video[size()];
        for (int i = 0; i < size(); i++) {
            temp[i] = video[i];
        } return temp;

    }
}

