package com.wfybelief.demo2;

public class Application {
    public static void main(String[] args) {
        Student xiaoming = new Student();

        xiaoming.name = "xiao ming";
        xiaoming.age = 3;
        System.out.println(xiaoming.name);
        System.out.println(xiaoming.age);

        Student xiaohong = new Student("小红", 12);
        xiaohong.study();
    }
}
