package com.haha;

public class MySort {
    public static void main(String[] args) {
        int[] arr = {3, 6, 4, 7,8,7, 1};
        int[] ints = selectSort1(arr);
        for (int i = 0; i < ints.length; i++) {
            System.out.printf(ints[i]+"\t");
        }
    }





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


    public static int[] bubbleSort2(int[] arr){
        if (arr.length==0){
            return arr;
        }
        for (int i = 0; i < arr.length; i++) {
            //j < arr.length-1-i 因为外循环每循环一次，未排序的最大的值就到最后的位置一个，所以不需要和最后已经排好序的做比对
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }


    public static int[] bubbleSortBetter(int[] arr){
        if (arr.length==0){
            return arr;
        }
        boolean flag=false;
        for (int i = 0; i < arr.length; i++) {
            //j < arr.length-1-i 因为外循环每循环一次，未排序的最大的值就到最后的位置一个，所以不需要和最后已经排好序的做比对
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if (!flag) break;
        }
        return arr;
    }



    public static int[] selectSort(int[] arr){
        if (arr.length==0){
            return arr;
        }
        for (int i = 0; i < arr.length-1; i++) {
            int minIndex=i;
            //以i为分界点，i之前是排序好的，也就是从第I个开始进行排序
            //需要在第二个for循环里找到没排序的所有数中，最小的下标。所以在外面定义一个变量，放已知排序的最小下标，和未排序的作比较
            for (int j = i+1; j < arr.length; j++) {
               if (arr[j]<arr[minIndex]){
                   minIndex=j;
               }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
        return  arr;
    }

    public static int[] selectSort1(int[] arr){
        if (arr.length==0){
            return arr;
        }
        for (int i = 0; i < arr.length; i++) {
            int minSize=i;
            for (int j =i+1; j < arr.length; j++) {
                if (arr[j]<arr[i]){
                    minSize=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minSize];
            arr[minSize]=temp;
        }
        return arr;
    }
}


