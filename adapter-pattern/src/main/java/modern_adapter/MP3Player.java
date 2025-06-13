package modern_adapter;

import common_adapter.interfaces.AudioPlayer;

public class MP3Player {
    public void play(String filename){
        System.out.println("Playing MP3 file: " + filename);
    }
}
