import java.util.LinkedList;

public class Playlist {
    private LinkedList<String> listofsongs;
    private int caps;

    public Playlist(int capacity) {
        this.caps = capacity;
        this.listofsongs = new LinkedList<>();
    }

    public void addSong(String song) {
        if (listofsongs.contains(song)) {
        	listofsongs.remove(song);
        } else if (listofsongs.size() == caps) {
        	listofsongs.removeLast();
        }
        listofsongs.addFirst(song);
    }

    public void print() {
        System.out.println(listofsongs);
    }

    public static void main(String[] args) {
        Playlist PlaylistSongs = new Playlist(3);
        PlaylistSongs.addSong("S1");
        PlaylistSongs.addSong("S2");
        PlaylistSongs.addSong("S3");
        PlaylistSongs.print(); // output: [S3, S2, S1]
        PlaylistSongs.addSong("S4");
        PlaylistSongs.print(); // output: [S4, S2, S3]
        PlaylistSongs.addSong("S2");
        PlaylistSongs.print(); // output: [S2, S4, S3]
        PlaylistSongs.addSong("S1");
        PlaylistSongs.print(); // output: [S1, S2, S4]
    }
}

