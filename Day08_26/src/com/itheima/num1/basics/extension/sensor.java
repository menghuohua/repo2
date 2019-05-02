package com.itheima.num1.basics.extension;

import java.util.Random;

/**
 * @author DELL
 * @date 2018--08--26--21:16
 */
public class sensor implements  Runnable{
    private int temperature;
    private int humidness ;
    private int speed;


    public void run() {
        synchronized (this){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            Random r = new Random();
            temperature = r.nextInt(50) +1;
            humidness = r.nextInt(100)+1;
            speed = r.nextInt(40)+1;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"温度"+temperature+"湿度"+humidness+"风速"+speed);
    }
}}
