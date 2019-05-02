package com.itheima.num1.basics;

/**
 * @author DELL
 * @date 2018--08--26--17:24
 */
public class Tset1 extends  Thread {
    //创建一个类继承Thread，在线程中打印100次"helloWorld",并开启

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("helloWorld");

        }
    }
}
