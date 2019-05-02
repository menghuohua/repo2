package com.itheima.num1.basics.extension;

/**
 * @author DELL
 * @date 2018--08--26--19:07
 */
public class Test3 {/*1.定义接口(Player)
    a)抽象方法: 打篮球(playBasketball),踢足球(playFootball),打排球(playVolleyball)
2.定义测试类Test
    a)定义静态方法:进入运行会(join(Player p)),在方法中调用p的 打篮球,踢足球,打排球 方法
    b)提供main方法
    c)在main方法中
i.调用join(Player p),传入使用Player 接口的匿名内部类创建的匿名对象;
    ii.在匿名内部类中
1.重写playBasketball()方法
    a)输出: 在打篮球
2..重写playFootball()方法
    a)输出: 在踢足球
3..重写playVolleyball()方法
    a)输出: 在打排球*/

    public static void main(String[] args) {
        join(new Player(){
            //传入使用Player 接口的匿名内部类创建的匿名对象;

            @Override
            public void playBasketball() {
                System.out.println("在打篮球");
            }

            @Override
            public void PlayFootball() {
                System.out.println("在踢足球");
            }

            @Override
            public void PlayVolleyball() {
                System.out.println("在打排球");
            }
        });
    }
    private static void join(Player p){
        p.playBasketball();
        p.PlayFootball();
        p.PlayVolleyball();
    }
}
