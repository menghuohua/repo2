package com.itheima.Thread;

/**
 * @author DELL
 * @date 2018--08--26--15:18
 */
public class Ticks implements Runnable {
    private int ticks = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (ticks > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + ticks + "张票");
                    ticks--;

                } else {
                    break;
                }

            }

        }
    }
}