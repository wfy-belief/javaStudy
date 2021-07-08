package com.wfybelief.demo1;

public class Part3 {
    public static void main(String[] args) {
        Part3 part3 = new Part3();
        part3.test(1, 2, 3, 4, 5, 6);
    }
    public void test(int ... num){
        for (int i : num) {
            System.out.println(i);
        }
    }
}
