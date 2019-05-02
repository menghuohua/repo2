package com.itheima.num1.basics.extension;

import java.util.Random;

/**
 * @author DELL
 * @date 2018--08--26--20:51
 */
public class Tunnel implements Runnable {
    //定义一个变量，用来记录通过隧道的人数；
    private int count=1;


    public void run() {
        synchronized (this) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //打印游客的线程和顺序
            System.out.println(Thread.currentThread().getName() + "已经通过隧道，TA是第" + count+"通过的！");
            count++;
        }
    }
}