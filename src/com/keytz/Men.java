package com.keytz;

public class Men implements RunnableJumpable {
    int probeg=10000;
    int height=10;

    public Men() {
    }

    public void run() {
        System.out.println("Man run");
    }

    public void jump() {
        System.out.println("Man jump");
    }
    public int getProbeg(){
        return probeg;
    }
    public  int getHeight(){
        return height;
    }
}