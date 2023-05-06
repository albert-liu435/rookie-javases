package com.rookie.bigdata.designpatterns.mediator.one;

/**
 * @Class Colleague
 * @Description TODO
 * @Author rookie
 * @Date 2023/5/6 17:34
 * @Version 1.0
 */
public abstract class Colleague {

    private Mediator mediator;

    private String name;

    Colleague(String name,Mediator mediator){
        this.name  =name;
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // getter/setter方法

    // 得到其他同事发来的信息
    public abstract void getMessage(String message,String messageFormName);

    // 与其他同事通信
    public abstract void contactColleague(String message,String ... toColleagueName);

}