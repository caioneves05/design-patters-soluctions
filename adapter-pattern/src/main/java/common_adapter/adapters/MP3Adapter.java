package common_adapter.adapters;


import common_adapter.MP3Player;
import common_adapter.interfaces.AudioPlayer;

public class MP3Adapter implements AudioPlayer {
    private final MP3Player mp3Player;

    public MP3Adapter(MP3Player mp3Player) {
        this.mp3Player = mp3Player;
    }

    @Override
    public void play(String filename) {
        mp3Player.play(filename);
    }
}
