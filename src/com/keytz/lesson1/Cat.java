package com.keytz.lesson1;

public class Cat implements RunnableJumpable{
    int probeg=5000;
    int height=5;

    public Cat(){

    }
    public void run() {
        System.out.println("Cat rum");
    }
    public void jump() {
        System.out.println("Cat jump");
    }
    public int getProbeg(){
        return probeg;
    }
    public int getHeight(){
        return height;
    }
}
