package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("singleton")
public class ClassicalMusic implements Music{

    private ClassicalMusic(){};

    @Override
    public String getSong() {
        return (", а ваши эти Бахи полная ЕБАЛА");
    }
}
