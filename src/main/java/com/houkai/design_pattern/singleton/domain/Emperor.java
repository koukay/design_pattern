package com.houkai.design_pattern.singleton.domain;
/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 中国的历史上一般都是一个朝代一个皇帝，有两个皇帝的话，必然要PK出一个皇帝出来
 */
public class Emperor {
    private static Emperor emperor=null;//定义一个皇帝放在那里然后给这个皇帝起个名字

    public Emperor() {
        //世俗和道德约束你，目的就是不让你产生第二个皇帝
    }
    public static Emperor getInstance(){
        if (emperor==null) {
            emperor=new Emperor();//如果皇帝还没有定义，那就定一个
        }
        return emperor;
    }
    //皇帝叫什么名字呀
    public static void emperorInfo(){
        System.out.println("我就是皇帝某某某....");
    }
}
