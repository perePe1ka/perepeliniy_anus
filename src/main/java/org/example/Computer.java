package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int ID;
    private MusicPlayer musicPlayer;
    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.ID = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Компик с ID = " + ID + " врубает нам лютого рейвера CMH, потому что " + musicPlayer.playMusic();
    }
}
