package com.example.Array;

public class rotateByN {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] rotatedArray =  rotateByN(array, 12345);

        for(int i =0;i<rotatedArray.length;i++){
            System.out.print(" " + rotatedArray[i]);
        }
    }

    public static int[] rotateByN(int[] arr, int n) {
        int[] rotatedArray = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            rotatedArray[((i + n) % arr.length)] = arr[i];
        }
        return rotatedArray;
    }
}
