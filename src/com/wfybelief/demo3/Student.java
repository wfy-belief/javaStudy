package com.wfybelief.demo3;

/**
 * 高内聚 低耦合
 * 1.提高程序的安全性
 * 2.隐藏代码实现的细节
 * 3.统一接口
 * 4.系统可维护增加了
 */
public class Student {
    private int age;
    private String name;
    private char sex;
    private int id;

    public Student() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
