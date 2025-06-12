package common_adapter;

import common_adapter.adapters.FLACAdpater;

public class MusicPlayerApp {
    public static void main(String[] args) {
        MP3Player mp3Player = new MP3Player();
        mp3Player.play("song.mp3");

        FLACPlayer flacPlayer = new FLACAdpater(new FLACPlayer());
        flacPlayer.play("song.flac");

        WAVPlayer wavPlayer = new WAVPlayer();
        wavPlayer.play("song.wav");
    }
}

