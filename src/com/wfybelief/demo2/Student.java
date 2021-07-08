package com.wfybelief.demo2;

public class Student {
    // 字段 属性
    String name;
    int age;

    public Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void study() {
        System.out.println("I am studying");
    }
}
