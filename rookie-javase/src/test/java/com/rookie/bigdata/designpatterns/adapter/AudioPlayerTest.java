package com.rookie.bigdata.designpatterns.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Class AudioPlayerTest
 * @Description TODO
 * @Author rookie
 * @Date 2023/5/6 15:47
 * @Version 1.0
 */
class AudioPlayerTest {

    @Test
    void play() {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}