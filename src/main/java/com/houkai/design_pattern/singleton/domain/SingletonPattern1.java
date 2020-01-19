package com.houkai.design_pattern.singleton.domain;
/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 通用单例模式
 */
public class SingletonPattern1 {
    private static SingletonPattern1 singletonPattern=null;
    //限制住不能直接产生一个实例
    private SingletonPattern1() {
    }
    public SingletonPattern1 getInstance(){
        if (singletonPattern==null) {
            singletonPattern=new SingletonPattern1();
        }
        return singletonPattern;

    }
}
