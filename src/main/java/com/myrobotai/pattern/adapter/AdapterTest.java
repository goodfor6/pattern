package com.myrobotai.pattern.adapter;

public class AdapterTest {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3","11.mp3");
        audioPlayer.play("vlc","22222222.vlc");
        audioPlayer.play("mp4","The Wandering Earth.mp4");
        audioPlayer.play("h264","444.h264");
    }
}
