package com.myrobotai.pattern.adapter;

public class VlcPlayer implements AdvanceMediaPlayer {
    @Override
    public void mp4Player(String audiosType, String fileName) {

    }

    @Override
    public void vlcPlayer(String audiosType, String fileName) {
        System.out.println(" vlc play "+ fileName + " .......");
    }
}
