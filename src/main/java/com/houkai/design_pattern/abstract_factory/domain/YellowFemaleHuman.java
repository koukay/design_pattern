package com.houkai.design_pattern.abstract_factory.domain;

import com.houkai.design_pattern.abstract_factory.abstract_class.AbstractYellowHuman;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 女性黄种人
 */
public class YellowFemaleHuman extends AbstractYellowHuman {
    @Override
    public void sex() {
        System.out.println("该黄种人的性别为女...");
    }
}
