package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private raveMusic raveMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, org.example.raveMusic raveMusic) {
        this.classicalMusic = classicalMusic;
        this.raveMusic = raveMusic;
    }

    public void playMusic() {
        System.out.println("Я ваши рты ебал, потому что ты " + classicalMusic.getSong());
        System.out.println("А я вот обожаю CMH, потому что  " + raveMusic.getSong());
    }
}
