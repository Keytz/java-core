package com.keytz;

public class Walls implements Bariers{
    private int height;
    public Walls(int height){
        this.height=height;
    }
    public boolean toJump(int maxHeight){
        if (maxHeight>height) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean toRun(int maxProbeg) {
        return false;
    }
}
