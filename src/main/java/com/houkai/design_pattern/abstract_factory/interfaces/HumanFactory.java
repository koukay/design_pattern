package com.houkai.design_pattern.abstract_factory.interfaces;

import com.houkai.design_pattern.abstract_factory.domain.Human;

public interface HumanFactory {
    //制造黄色人类
    public Human createYellowHuman();

    //制造一个白色人类
    public Human createWhiteHuman();

    //制造一个黑色人类
    public Human createBlackHuman();
}
