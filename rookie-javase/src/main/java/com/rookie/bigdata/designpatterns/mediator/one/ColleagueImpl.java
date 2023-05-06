package com.rookie.bigdata.designpatterns.mediator.one;

/**
 * @Class ColleagueImpl
 * @Description TODO
 * @Author rookie
 * @Date 2023/5/6 17:34
 * @Version 1.0
 */
public class ColleagueImpl extends Colleague {

    ColleagueImpl(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void getMessage(String message,String messageFormName) {
        System.out.println("我" + this.getName() + " 被" + messageFormName + " 联系了， " + "信息为:" + message );
    }

    @Override
    public void contactColleague(String message,String ... toColleagueNames) {
        System.out.print("我 " + this.getName() + " 向 ");
        for (String toColleagueName : toColleagueNames){
            System.out.print(toColleagueName + ",");
        }
        System.out.println(" 发 " + message + " 信息");
        this.getMediator().contact(message,this, toColleagueNames);
    }
}