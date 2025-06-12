package no_pattern;

public class MP3PlayerApp {
    public static void main (String[] args) {

        /*
            coupling
            inconsistency
            low abstraction
            bad testability
         */

        MP3Player mp3Player = new MP3Player();
        WAVPlayer wavPlayer = new WAVPlayer();
        FLACPlayer flacPlayer = new FLACPlayer();

        mp3Player.playMP3("song.mp3");
        wavPlayer.playWAV("song.wav");
        flacPlayer.playFLAC("song.flac");

        // We have to play other file formats for example: mp4, wav, etc.
    }
}

class MP3Player {
    public void playMP3(String filename){
        System.out.println("Playing MP3 file: " + filename);
    }
}

class WAVPlayer {
    public void playWAV(String filename){
        System.out.println("Playing WAV file: " + filename);
    }
}

class FLACPlayer {
    public void playFLAC(String filename){
        System.out.println("Playing FLAC file: " + filename);
    }
}