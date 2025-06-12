package common_adapter.adapters;

import common_adapter.WAVPlayer;
import common_adapter.interfaces.AudioPlayer;

public class WAVAdapter implements AudioPlayer {
    private final WAVPlayer wavPlayer;

    public WAVAdapter(WAVPlayer wavPlayer) {
        this.wavPlayer = wavPlayer;
    }

    public void play(String filename) {
        wavPlayer.play(filename);
    }
}
