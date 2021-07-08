package com.wfybelief.demo1;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Part4 {
    public static void main(String[] args) {
        int f = f(5);
        System.out.println(f);
        int[] ints = {1, 2, 3, 4};
        OptionalInt max = Arrays.stream(ints).max();
        System.out.println(max.getAsInt());
        System.out.println(max);
        double[] doubles = {1.0, 2.0, 3.0, 4.0};
        OptionalDouble max1 = Arrays.stream(doubles).max();


    }
    public static int f(int n){
        if (n == 1){
            return 1;
        }
        return f(n - 1) * n;
    }
}
