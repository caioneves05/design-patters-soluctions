package common_adapter.adapters;

import common_adapter.FLACPlayer;
import common_adapter.interfaces.AudioPlayer;

public class FLACAdpater implements AudioPlayer {
    private final FLACPlayer flacPlayer;

    public FLACAdpater(FLACPlayer flacPlayer) {
        this.flacPlayer = flacPlayer;
    }

    @Override
    public void play(String filename) {
        flacPlayer.play(filename);
    }
}
