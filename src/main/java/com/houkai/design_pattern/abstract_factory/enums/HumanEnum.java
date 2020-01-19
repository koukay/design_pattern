package com.houkai.design_pattern.abstract_factory.enums;
/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 世界上有哪些类型的人，列出来
 * JDK 1.5开始引入enum类型也是目的的，吸引C程序员转过来
 */
public enum HumanEnum {
    //把世界上所有人类型都定义出来
    YelloMaleHuman("com.houkai.design_pattern.abstract_factory.domain.YellowMaleHuman"),

    YelloFemaleHuman("com.houkai.design_pattern.abstract_factory.domain.YellowFemaleHuman"),

    WhiteFemaleHuman("com.houkai.design_pattern.abstract_factory.domain.WhiteFemaleHuman"),

    WhiteMaleHuman("com.houkai.design_pattern.abstract_factory.domain.WhiteMaleHuman"),

    BlackFemaleHuman("com.houkai.design_pattern.abstract_factory.domain.BlackFemaleHuman"),

    BlackMaleHuman("com.houkai.design_pattern.abstract_factory.domain.BlackMaleHuman");
    private String value = "";
    //定义构造函数，目的是Data(value)类型的相匹配
    private HumanEnum(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }
}
