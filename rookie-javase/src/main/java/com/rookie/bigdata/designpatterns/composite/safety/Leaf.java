package com.rookie.bigdata.designpatterns.composite.safety;

/**
 * @Class Leaf
 * @Description TODO
 * @Author rookie
 * @Date 2023/5/6 16:16
 * @Version 1.0
 */

// 树叶构件角色类
public class Leaf implements Component {
    /**
     * 叶子对象的名字
     */
    private String name;

    /**
     * 构造方法，传入叶子对象的名称
     *
     * @param name 叶子对象的名字
     */
    public Leaf(String name) {
        this.name = name;
    }

    /**
     * 输出叶子对象的结构，叶子对象没有子对象，也就是输出叶子对象的名字
     *
     * @param preStr 前缀，主要是按照层级拼接的空格，实现向后缩进
     */
    @Override
    public void printStruct(String preStr) {
        //  Auto-generated method stub
        System.out.println(preStr + "-" + name);
    }

}
