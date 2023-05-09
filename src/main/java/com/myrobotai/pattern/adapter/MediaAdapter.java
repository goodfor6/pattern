package com.myrobotai.pattern.adapter;

public class MediaAdapter implements MediaPlayer{

    AdvanceMediaPlayer advanceMediaPlayer;

    public MediaAdapter(String audiosType) {
        if(audiosType.equalsIgnoreCase("mp4")){
            advanceMediaPlayer = new Mp4Player();
        } else if (audiosType.equalsIgnoreCase("vlc")) {
            advanceMediaPlayer = new VlcPlayer();
        }
    }

    @Override
    public void play(String audiosType, String fileName) {
        if(audiosType.equalsIgnoreCase("mp4")){
            advanceMediaPlayer.mp4Player(audiosType,fileName);
        }else if(audiosType.equalsIgnoreCase("vlc")){
            advanceMediaPlayer.vlcPlayer(audiosType, fileName);
        }
    }
}
