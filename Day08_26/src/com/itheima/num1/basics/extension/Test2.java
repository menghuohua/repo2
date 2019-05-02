package com.itheima.num1.basics.extension;

/**
 * @author DELL
 * @date 2018--08--26--17:59
 */
public class Test2 {
   /* 1.定义接口(Sport)
    a)抽象方法: 跑(run)
2.定义测试类Test
    a)定义静态方法:进入运行会(enter(Sport s)),在方法中调用s的run方法
    b)提供main方法
    c)在main方法中
i.调用enter(Sport s),传入使用Sport接口的匿名内部类创建的对象;
    ii.在匿名内部类中重写run方法
1.输出: 参加运动会,奔跑吧*/
   public static void main(String[] args) {
       enter(new Sport() {
           @Override
           public void run() {
               System.out.println("参加运动会,奔跑吧");
           }
       });


   }
   private static void enter(Sport s){
       s.run();

    }
}
