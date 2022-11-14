package item4;

import item4.adapter.MediaAdapter;

public class AdapterPatternDemo {

    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play();
        MediaAdapter newMediaAdapter = new MediaAdapter(audioPlayer);
        newMediaAdapter.playMp4();
    }

}
