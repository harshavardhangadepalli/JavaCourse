import java.util.*;
import java.lang.*;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {
        if(this.findSong(title) != null)
            return false;
        Song s = new Song(title, duration);
        this.songs.add(s);
        return true;
    }

    private Song findSong(String title) {
        for (int i = 0; i < this.songs.size(); i++) {
            if(this.songs.get(i).getTitle().equals(title))
                return this.songs.get(i);
        }
        return null;
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist) {
        int index = trackNumber - 1;
        if(index >= 0 && index <= this.songs.size()) {
            playlist.add(this.songs.get(index));
            return true;
        }
        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playlist) {
        Song s;
        s = this.findSong(title);
        if(s == null)
            return false;
        playlist.add(s);
        return true;

    }
}
