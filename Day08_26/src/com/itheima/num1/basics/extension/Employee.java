package com.itheima.num1.basics.extension;

/**
 * @author DELL
 * @date 2018--08--26--17:36
 */
public abstract class Employee {
    /*a)属性: 工号(id),姓名(name)
    b)行为: 抽象方法work()*/
    private  String id ;
    private  String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee() {
        this.id = id;
        this.name = name;

    }

    public abstract void work() ;
}
