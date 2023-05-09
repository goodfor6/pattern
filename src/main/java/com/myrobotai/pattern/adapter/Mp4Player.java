package com.myrobotai.pattern.adapter;

public class Mp4Player implements AdvanceMediaPlayer{

    @Override
    public void mp4Player(String audiosType, String fileName) {
        System.out.println(" mp4 play "+fileName+" .................");
    }

    @Override
    public void vlcPlayer(String audiosType, String fileName) {

    }
}
