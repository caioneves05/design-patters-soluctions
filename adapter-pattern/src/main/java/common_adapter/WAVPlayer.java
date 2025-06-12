package common_adapter;

import common_adapter.interfaces.AudioPlayer;

public class WAVPlayer implements AudioPlayer {
    public void play(String filename){
        System.out.println("Playing WAV file: " + filename);
    }
}
