package com.keytz;

public class Robot implements RunnableJumpable{
    int probeg=0;
    int height=0;

    public Robot() {

    }

    public void run() {
        System.out.println("Robot rum");
    }
    public void jump() {
        System.out.println("Robot jump");
    }
    public int getProbeg() {
        return probeg;
    }
    public int getHeight() {
        return height;
    }
}
