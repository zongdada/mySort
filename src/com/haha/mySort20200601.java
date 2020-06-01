package com.haha;

public class mySort20200601 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 4, 7, 8, 1, 7};
        int[] brr = insertSort(arr);
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }
    }

    /**
     * 冒泡排序
     * 相邻数据对比，大的放后面
     */
    public static int[] bubbleSort(int[] arr) {
        //执行的次数
        for (int i = 0; i < arr.length - 1; i++) {
            //从哪个开始执行
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tem = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tem;
                }
            }
        }
        return arr;
    }


    /**
     * 插入排序：每个元素和前面的元素做比较，找到插入位置
     *
     * @param arr
     * @return
     */
    public static int[] insertSort(int[] arr) {
        if (arr.length == 0) return arr;

        int insertNum;
        for (int i = 0; i < arr.length-1; i++) {
            insertNum = arr[i + 1];
            int insertFlag = i;
            while (insertFlag >= 0 && insertNum < arr[insertFlag]) {
                arr[insertFlag + 1] = arr[insertFlag];
                insertFlag--;
            }
            arr[insertFlag+1]=insertNum;
        }
        return arr;
    }



}



