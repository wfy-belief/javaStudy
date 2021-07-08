package com.wfybelief.demo1;

public class Part2 {
    public static void main(String[] args) {
        int max = max(1, 2);

    }

    private static int max(int a, int b) {
        int result = 0;
        if (a == b) {
            System.out.println("a == b");
            return 0;
        }

        if (a > b) {
            result = a;
        } else {
            result = b;
        }
        return result;
    }

}
