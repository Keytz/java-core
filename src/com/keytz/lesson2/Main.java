package com.keytz.lesson2;

public class Main {
    
    
    public static void main(String[] args) {
        String[][] arr = new String[][]{{"1", "s", "3", "4"}, {"2", "2", "2", "3"}, {"1", "2", "2", "2"}, {"2", "2", "2", "2"}};
        try {
            try {
                int result = summArr(arr);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("MyArraySizeException");
            }
        }
        catch (MyArrayDataException e) {
            System.out.println("MyArrayDataException!");
            System.out.println("error: " + e.x + "," + e.y);
        }
    }
    
    public static int summArr(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int res = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int subArr=0;subArr<4;subArr++) {
            if (arr[subArr].length != 4) {
                throw new MyArraySizeException();
            }
            for (int i = 0; i < 4; i++) {
                try {
                    res += Integer.parseInt(arr[subArr][i]);
                    ;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(subArr,i);
                }
            }
        }
        return res;
    }
}
