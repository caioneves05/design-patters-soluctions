package modern_adapter;

import common_adapter.interfaces.AudioPlayer;

public class MusicPlayerApp {
    public static void main(String[] args) {
        var mp3Player = new MP3Player();
        AudioPlayer audioPlayer = mp3Player::play;
        audioPlayer.play("song.mp3");

        var WAVPlayer = new WAVPlayer();
        AudioPlayer audioPlayerWav = WAVPlayer::play;
        audioPlayerWav.play("song.mp3");

        var FLACPlayer = new FLACPlayer();
        AudioPlayer audioPlayerFlac = FLACPlayer::play;
        audioPlayerFlac.play("song.mp3");
    }
}
