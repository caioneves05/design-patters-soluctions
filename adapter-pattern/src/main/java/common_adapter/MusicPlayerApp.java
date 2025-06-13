package common_adapter;

import common_adapter.adapters.FLACAdpater;
import common_adapter.adapters.MP3Adapter;
import common_adapter.adapters.WAVAdapter;

public class MusicPlayerApp {
    public static void main(String[] args) {
        MP3Adapter mp3Player = new MP3Adapter(new MP3Player());
        mp3Player.play("song.mp3");

        FLACAdpater flacPlayer = new FLACAdpater(new FLACPlayer());
        flacPlayer.play("song.flac");

        WAVAdapter wavPlayer = new WAVAdapter(new WAVPlayer());
        wavPlayer.play("song.wav");
    }
}

