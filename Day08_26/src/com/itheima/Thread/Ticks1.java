package com.itheima.Thread;

/**
 * @author DELL
 * @date 2018--08--26--15:42
 */
public class Ticks1 implements Runnable {
    private int ticks = 100;

    public synchronized void ThreadRun() {
        if (ticks > 0) {

            System.out.println(Thread.currentThread().getName() + "正在出售第" + ticks + "张票");
            ticks--;
        }
    }

    @Override
    public void run() {
        while (true) {
            ThreadRun();
            if (ticks <= 0) {
                break;
            }
        }
    }
}