package com.houkai.design_pattern.proxy.interfaces.impl;

import com.houkai.design_pattern.proxy.interfaces.KindWomen;

public class WangPo implements KindWomen {
    private KindWomen kindWomen;
    public WangPo() { //默认的话，是潘金莲的代理
        kindWomen=new PanJinLian();
    }
    //她可以是KindWomen的任何一个女人的代理，只要你是这一类型
    public WangPo(KindWomen kindWomen){
        this.kindWomen = kindWomen;
    }
    @Override
    public void makeEyesWithMan() {
        kindWomen.makeEyesWithMan();//王婆这么大年龄了，谁看她抛媚眼？！
    }

    @Override
    public void happyWithMan() {
        kindWomen.happyWithMan();//自己老了，干不了，可以让年轻的代替
    }
}
