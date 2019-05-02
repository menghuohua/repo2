package com.itheima.num1.basics.extension;

/**
 * @author DELL
 * @date 2018--08--26--20:50
 */
public class Test5 {
   /* 1.定义一个隧道类，实现Runnable接口：
            1.1 定义一个变量，用来记录通过隧道的人数；
            1.2 重写Runnable的run方法；
            1.3 定义一个同步方法，模拟每个人通过隧道需要5秒钟：
            1.3.1 子线程睡眠5秒钟，模拟每个人通过隧道需要5秒钟；
            1.3.2 改变通过的人次；
            1.3.3 打印线程名称及其通过隧道的顺序，模拟人通过隧道及其顺序；
            1.4 调用通过隧道的方法；
            2.定义一个测试类：
            2.1 在main方法中创建一个隧道类对象；
            2.2 在main方法中，循环创建10个子线程对象，通过构造方法把隧道对象
    和线程名（作为人的姓名）传递进去，并开启子线程；*/
   public static void main(String[] args) {

       Tunnel t = new Tunnel();
       //循环创建10个子线程对象
       for (int i = 1; i <=10; i++) {
           //创建线程
           Thread t1 = new Thread(t,"雄安命"+i);
           t1.start();
       }

   }

}
