package com.keytz;

public class Treadmill implements Bariers{
    private int probeg;
    public Treadmill(int probeg){
        this.probeg=probeg;
    }
    public boolean toRun(int maxProbeg){
        if (maxProbeg>probeg){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean toJump(int maxHeight) {
        return false;
    }
}
