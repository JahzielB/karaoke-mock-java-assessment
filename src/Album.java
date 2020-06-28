import java.util.ArrayList;
import java.util.List;

public class Album {
    private String name;
    private List<Song> songs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public Album(String name, List<Song> songs) {
        this.name = name;
        this.songs = songs;
    }

    public void printTrackListings(Album album) {
        System.out.println(album.getName() + " track listing...");
        int i = 0;
        for (Song songs : album.getSongs()) {
            System.out.println(++i + ". " + songs.getTitle());
        }
    }
}
