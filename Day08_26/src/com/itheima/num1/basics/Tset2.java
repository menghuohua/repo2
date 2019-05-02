package com.itheima.num1.basics;

/**
 * @author DELL
 * @date 2018--08--26--17:27
 */
public class Tset2 implements  Runnable{
    @Override
    public void run() {
        for (int i = 0; i <101 ; i++) {
            if (i%2 == 0) {
                System.out.println(i);
            }
        }

    }
    // 3.创建一个类实现Runnable接口,在线程中打印出0-100之间的偶数

}
