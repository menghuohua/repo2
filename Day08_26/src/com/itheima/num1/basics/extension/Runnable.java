package com.itheima.num1.basics.extension;

import java.util.ArrayList;

/**
 * @author DELL
 * @date 2018--08--26--19:19
 */
 class Runnab implements Runnable{
    //  构造方法体
    private int Threadcount;    //Threadcount=3
    public Runnab(int threadcount) {
        Threadcount = threadcount;
    }
    ArrayList<String> list = new ArrayList<String>();// //建立集合
    public void run() {
        synchronized (list) {//使用同步代码块，保证同一时间只能向集合中添加一个线程名称
                //把当前的线程添加到集合中
            list.add(Thread.currentThread().getName() + ":" + Threadcount);
            Threadcount--;//运行线程个数减1
            if (Threadcount == 0) {
                System.out.println("线程添加完毕");
                //遍历集合打印所有线程
                for (String s : list) {
                    System.out.println(s);
                }
            }

        }
    }
}

