package com.myrobotai.pattern.adapter;

public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audiosType, String fileName) {
        if(audiosType.equalsIgnoreCase("mp3")){
            System.out.println(" mp3 play "+fileName+" .......");
        }else if(audiosType.equalsIgnoreCase("mp4") ||
            audiosType.equalsIgnoreCase("vlc")){
            mediaAdapter = new MediaAdapter(audiosType);
            mediaAdapter.play(audiosType,fileName);
        }
        else{
            System.out.println(fileName+" not support!!!");
        }

    }
}
