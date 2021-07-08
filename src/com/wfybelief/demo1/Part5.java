package com.wfybelief.demo1;

import java.util.Arrays;

public class Part5 {
    // 变量的类型 变量的名字 = 变量的值
    // 数组类型

    public static void main(String[] args) {
        int[] num1 = {1, 2, 3}; // 定义
        System.out.println(Arrays.stream(num1).sum());
    }
}
