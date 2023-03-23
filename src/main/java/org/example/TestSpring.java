package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
//          MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

//        MusicPlayer FirstmusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer SecondmusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//
////        System.out.println(musicPlayer.getName());
////        System.out.println(musicPlayer.getVolume());
////        System.out.println(musicPlayer.getDate());
////        System.out.println(musicPlayer.getAge());
//        FirstmusicPlayer.setVolume(323);
//        System.out.println(FirstmusicPlayer.getVolume());
//        System.out.println(SecondmusicPlayer.getVolume());

//        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
//        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);

//        System.out.println(classicalMusic.getSong());
//        System.out.println(classicalMusic2 .getSong());
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();



        context.close();
    }
}
