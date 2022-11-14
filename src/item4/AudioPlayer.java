package item4;

import item4.interfaces.MediaPlayer;

public class AudioPlayer implements MediaPlayer{
    
    @Override
    public void play() {
        System.out.println("playing in Audio Player");
    }

}
