package com.itheima.Thread;

/**
 * @author DELL
 * @date 2018--08--26--15:18
 */
public class Test01 {
    public static void main(String[] args) {
        Ticks1 t = new Ticks1();
        Thread t1 = new Thread(t);
        t1.setName("路飞");
        t1.start();
        Thread t2 = new Thread(t);
        t2.setName("娜美");
        t2.start();
        Thread t3 = new Thread(t);
        t3.start();
        t3.setName("乔巴");
        Thread t4 = new Thread(t);
        t4.setName("索隆");
        t4.start();
    }
}
