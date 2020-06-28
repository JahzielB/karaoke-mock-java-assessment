import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Song {
    private String title;
    private String artist;
    private ArrayList<String> lyrics;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public ArrayList<String> getLyrics() {
        return lyrics;
    }

    public void setLyrics(ArrayList<String> lyrics) {
        this.lyrics = lyrics;
    }

    public Song(String title, String artist, ArrayList<String> lyrics) {
        this.title = title;
        this.artist = artist;
        this.lyrics = lyrics;
    }

    public static ArrayList<String> parseLyrics(String lyrics) {
        ArrayList<String> lyricsList = new ArrayList<>();
        String[] lyricsArr = lyrics.split(" ");
        Collections.addAll(lyricsList, lyricsArr);
        return lyricsList;
    }
}
