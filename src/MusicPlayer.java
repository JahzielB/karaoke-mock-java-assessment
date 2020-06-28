import java.io.IOException;

public class MusicPlayer extends Player{
    private String voice = "";

    public MusicPlayer(){};

    public MusicPlayer(String voice) {
        this.voice = voice;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    @Override
    public void play(Song song) {
        try {
            Runtime r = Runtime.getRuntime();
            String say = "say Now playing " + song.getTitle() + " by " + song.getArtist();
            r.exec(say);
            Thread.sleep(INTRO_PAUSE);
            for (String lyric : song.getLyrics()) {
                r.exec("say " + lyric);
                Thread.sleep(WORD_CADENCE);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void play(Album album) {
        for (Song songs : album.getSongs()) {
            play(songs);
        }
    }
}
