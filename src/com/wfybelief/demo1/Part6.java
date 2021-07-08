package com.wfybelief.demo1;

import java.util.Arrays;

public class Part6 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};

        // 打印所有的数组元素
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        for (int i : a) {
            System.out.println(i);
        }

    }
}
