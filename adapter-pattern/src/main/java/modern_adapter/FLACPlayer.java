package modern_adapter;

import common_adapter.interfaces.AudioPlayer;

public class FLACPlayer{
    public void play(String filename){
        System.out.println("Playing FLAC file: " + filename);
    }
}
