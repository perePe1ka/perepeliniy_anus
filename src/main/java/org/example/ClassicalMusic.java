package org.example;

import org.springframework.stereotype.Component;
@Component
public class ClassicalMusic implements Music{

    private ClassicalMusic(){};

//    public static ClassicalMusic getClassicalMusic(){
//        return new ClassicalMusic();
//    }
    public void doMyInit() {
        System.out.println("Я начинаю нахуй");
    }

    public void doMyDest() {
        System.out.println("Я кончаю бля...");
    }
    @Override
    public String getSong() {
        return ("Ебала");
    }
}
