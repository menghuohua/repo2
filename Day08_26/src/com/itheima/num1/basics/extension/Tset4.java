package com.itheima.num1.basics.extension;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

/**
 * @author DELL
 * @date 2018--08--26--19:18
 */
public class Tset4 {
    	/*1.定义一个子任务类，实现Runnable接口：
            1.1 定义一个ArrayList集合对象，用于存放子线程的名称；
            1.2 定义一个变量，用来记录正在运行的线程个数；
            1.3定义一个构造方法，把进程总数作为参数进来；
            1.4 在构造方法中，给正在运行的线程个数赋值为线程总数；
            1.5 重写Runnable接口的run方法 ；
            1.6 使用同步代码块，保证同一时间只能向集合中添加一个线程名称；
            1.7 正在运行的线程个数减1；
            1.8 所有的线程运行结束后遍历集合，打印所有线程的名称；
            2.定义一个测试类：
            2.1 在main方法中使用Random得到一个1到10的随机数；
            2.2 调用子任务类的构造方法创建子任务对象，把随机数传递给构造方法；
            2.3 循环创建n的子线程对象，并开启子线程；*/
        public static void main(String[] args) {

            Random r = new Random();
            int n = r.nextInt(10) + 1;
            //创建子任务对象，并把线程总数传递过去
            Runnab r1 = new Runnab(n);
            //循环创建n个子线程对象，并开启
            for (int i = 0; i < n; i++) {//循环创建
                Thread t = new Thread(r1);
                t.start();
            }


        }

}
