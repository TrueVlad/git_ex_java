package fileXml;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private Music music;
    private String name;
    private int volume;

    private List<String> array = new ArrayList<String>();


    public MusicPlayer (Music music){
        this.music = music;
    }

    public MusicPlayer() {
    }

    public void playingSound(){
        System.out.println("playing music is: " + music.playingMusic());
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public List<String> getArray() {
        return array;
    }

    public void setArray(List<String> array) {
        this.array = array;
    }
}
