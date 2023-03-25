package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestSpring {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(
                        SpringConfig.class
                );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(classicalMusic == classicalMusic2);

        raveMusic raveMusic1 = context.getBean("raveMusic", raveMusic.class);
        raveMusic raveMusic2 = context.getBean("raveMusic", raveMusic.class);
        System.out.println(raveMusic1 == raveMusic2);

        context.close();
    }
}
