package common_adapter;

import common_adapter.adapters.FLACAdpater;
import common_adapter.interfaces.AudioPlayer;

public class FLACPlayer {
    public void playFlac(String filename){
        System.out.println("Playing FLAC file: " + filename);
    }
}
