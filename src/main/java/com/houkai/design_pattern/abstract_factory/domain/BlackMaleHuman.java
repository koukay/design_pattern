package com.houkai.design_pattern.abstract_factory.domain;

import com.houkai.design_pattern.abstract_factory.abstract_class.AbstractBlackHuman;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 女性黑种人
 */
public class BlackMaleHuman extends AbstractBlackHuman {
    @Override
    public void sex() {
        System.out.println("该黑种人的性别为男...");
    }
}
