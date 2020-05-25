package com.haha;

public class MySort {
    public static void main(String[] args) {
        int[] arr = {3, 6, 4, 7,8, 1};
        int[] ints = bubbleSort1(arr);
        for (int i = 0; i < ints.length; i++) {
            System.out.printf(ints[i]+"\t");
        }
    }
//待定？
//
//9, 6, 4, 7,8, 1->6, 9, 4, 7,8, 1=>4, 9, 6, 7,8, 1->1,9, 6, 7,8, 4
//
//9, 6, 4, 7,8, 1
    public static int[] bubbleSort(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int i1 = i + 1; i1 < arr.length; i1++) {
                if (arr[i] > arr[i1]) {
                    int temp = arr[i];
                    arr[i] = arr[i1];
                    arr[i1] = temp;
                }
            }
        }
        return arr;
    }


    public static int[] bubbleSort1(int[] arr){
        if (arr.length==0){
            return arr;
        }
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = 0; i1 < arr.length-1-i; i1++) {
               if (arr[i1]>arr[i1+1]){
                   temp=arr[i1];
                   arr[i1]=arr[i1+1];
                   arr[i1+1]=temp;
               }
            }
        }
        return  arr;
    }




    public static int[] selectSort(int[] arr){
        if (arr.length==0){
            return arr;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = i+1; i1 < arr.length; i1++) {

            }
        }
        return  null;
    }
}


