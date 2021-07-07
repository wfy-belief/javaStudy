package com.wfybelief.demo0;

public class Part3 {
    public static void main(String[] args) {
        // 整数拓展 进制问题 二进制0b 十进制 八进制0 十六进制 0x

        int i = 10;
        System.out.println(i);

        int i1 = 010;
        System.out.println(i1);

        int i2 = 0x10;
        System.out.println(i2);

        // 浮点数
        /*
        银行业务怎么表示
        float 和 double 有问题
        应该使用数学工具类 BigDecimal
         */
        float f = 0.1f;
        double d = 1.0 / 10;

        System.out.println(f);
        System.out.println(d);
        System.out.println(f == d);

        float f1 = 221245241231f;
        float f2 = f1 + 1;

        System.out.println(f1 == f2);


        // 字符拓展
    }
}
