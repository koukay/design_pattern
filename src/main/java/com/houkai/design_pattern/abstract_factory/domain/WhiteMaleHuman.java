package com.houkai.design_pattern.abstract_factory.domain;

import com.houkai.design_pattern.abstract_factory.abstract_class.AbstractWhiteHuman;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.\
 * 男性白种人
 */
public class WhiteMaleHuman extends AbstractWhiteHuman {
    @Override
    public void sex() {
        System.out.println("该白种人的性别为男....");
    }
}
