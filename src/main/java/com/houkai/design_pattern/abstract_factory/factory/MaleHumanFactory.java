package com.houkai.design_pattern.abstract_factory.factory;

import com.houkai.design_pattern.abstract_factory.domain.Human;
import com.houkai.design_pattern.abstract_factory.enums.HumanEnum;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 男性创建工厂
 */
public class MaleHumanFactory extends AbstractHumanFactory{

    //创建一个男性黄种人
    @Override
    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.YelloMaleHuman);
    }

    //创建一个男性白种人
    @Override
    public Human createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteMaleHuman);
    }
    //创建一个男性黑种人
    @Override
    public Human createBlackHuman() {
        return super.createHuman(HumanEnum.BlackMaleHuman);
    }
}
