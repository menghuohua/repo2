package com.itheima.Thread;

/**
 * @author DELL
 * @date 2018--08--26--15:58
 */
public class Test02 {
    public static void main(String[] args) {
        Ticks2 t1 = new Ticks2();
        t1.setName("路飞");
        t1.start();
        Ticks2 t2 = new Ticks2();
        t2.setName("娜美");
        t2.start();
        Ticks2 t3 = new Ticks2();
        t3.start();
        t3.setName("索隆");
        Ticks2 t4 = new Ticks2();
        t4.setName("乔巴");
        t4.start();
        Ticks2 t5 = new Ticks2();
        t5.setName("罗宾");
        t5.start();
    }


}
