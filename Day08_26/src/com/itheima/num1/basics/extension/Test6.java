package com.itheima.num1.basics.extension;

import java.util.Random;

/**
 * @author DELL
 * @date 2018--08--26--21:15
 */
public class Test6 {
   /* 1.定义一个传感器类,实现Runnable接口：
            1.1 重写Runnable的run方法；
            1.2 子线程睡眠5秒钟,模拟传感器获得温度,湿度,风速需要的5秒钟时间；
            1.3 使用Random模拟得到随机的温度,湿度和风速；
            1.4 子线程睡眠0.01秒,模拟计算机读取传感器的数据需要的0.01秒时间；
            1.5 打印温度,湿度和风速, 模拟计算机读取传感器的数据；
            2.定义一个传感器的测试类：
            2.1 在main方法中创建传感器类的对象；
            2.2 在main方法中循环创建100个子线程对象,并把传感器对象传递给构造方法；
            2.3 每创建一个子线程，就开启，读取传感器的获取的大气环境数据；*/
   public static void main(String[] args) {


       sensor s = new sensor();
       for (int i = 1; i <=100 ; i++) {
           //传感器
           Thread t = new Thread(s,"传感器"+i);

           t.start();
       }



   }
}
