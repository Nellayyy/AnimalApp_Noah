package com.nelliott.animalapp_noah;

public class Seal extends Animal implements Fun {

    public Seal(){
    }
    public String say(){
        return "arf arf";
    }
    @Override
    public String play() {
        return "The Seal bounces a ball off its nose.";
    }
}
