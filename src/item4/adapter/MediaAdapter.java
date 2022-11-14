package item4.adapter;

import item4.AudioPlayer;
import item4.interfaces.AdvancedMediaPlayer;

public class MediaAdapter implements AdvancedMediaPlayer{
    private AudioPlayer audioPlayer;

    public MediaAdapter(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }
    @Override
    public void playVLC() {
        this.audioPlayer.play();
    }

    @Override
    public void playMp4() {
        this.audioPlayer.play();
    }

}
