package item4;

import item4.interfaces.AdvancedMediaPlayer;

public class VLCPlayer implements AdvancedMediaPlayer{

    @Override
    public void playVLC() {
        System.out.println("Playing VLC media file.");
    }

    @Override
    public void playMp4() {
        System.out.println("Playing Mp4 media file.");
    }


}
