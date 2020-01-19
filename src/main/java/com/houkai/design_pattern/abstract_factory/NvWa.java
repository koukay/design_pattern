package com.houkai.design_pattern.abstract_factory;

import com.houkai.design_pattern.abstract_factory.domain.Human;
import com.houkai.design_pattern.abstract_factory.factory.FemaleHumanFactory;
import com.houkai.design_pattern.abstract_factory.factory.MaleHumanFactory;
import com.houkai.design_pattern.abstract_factory.interfaces.HumanFactory;

public class NvWa {
    public static void main(String[] args) {
        //第一条生产线，男性生产线
        HumanFactory maleHumanFactory=new MaleHumanFactory();

        //第二条生产线，女性生产线
        HumanFactory femaleHumanFactory=new FemaleHumanFactory();
        //生产线建立完毕，开始生产黑人了:
        Human maleBlackHuman = maleHumanFactory.createBlackHuman();
        Human femaleBblackHuman = femaleHumanFactory.createBlackHuman();
        System.out.println("黑男人==========================================");
        maleBlackHuman.cry();
        maleBlackHuman.laugh();
        maleBlackHuman.talk();
        maleBlackHuman.sex();
        System.out.println("黑女人==========================================");
        femaleBblackHuman.cry();
        femaleBblackHuman.laugh();
        femaleBblackHuman.talk();
        femaleBblackHuman.sex();
    }
}
