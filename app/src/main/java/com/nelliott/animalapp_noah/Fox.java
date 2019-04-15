package com.nelliott.animalapp_noah;

public class Fox extends Animal implements Fun{

    void Fox(){
    }
    public String say(){
        return "Wa pa pa pa pow pa pow, wa pa pa pa pow pa pow";
    }
    @Override
    public String play() {
        return "The fox chases mice and digs holes!";
    }
}
