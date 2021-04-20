package com.keytz.lesson2;

public class MyArrayDataException extends Exception {
    public int x;
    public int y;

    MyArrayDataException(int x, int y) {
        this.x = x;
        this.y = y;

    }

}