package com.itheima.num1.basics;

/**
 * @author DELL
 * @date 2018--08--26--17:29
 */
public class Tset02 {
    public static void main(String[] args) {
        Tset2 t= new Tset2();
        Thread t1 = new Thread(t);
        t1.start();
    }
}
