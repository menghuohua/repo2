package com.itheima.Thread;

/**
 * @author DELL
 * @date 2018--08--26--15:54
 */
public class Ticks2  extends  Thread {
    private static int ticks = 1000;

    @Override
    public void run() {
      while(true){
          ThreadRun();
          if (ticks <= 0) {
              break;
          }
      }
    }
    public static synchronized void ThreadRun(){
        if (ticks > 0) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"正在出售第"+ticks+"张票");
            ticks --;
        }
    }
}
