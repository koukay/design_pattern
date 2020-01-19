package com.houkai.design_pattern.proxy;

import com.houkai.design_pattern.proxy.interfaces.impl.JiaShi;
import com.houkai.design_pattern.proxy.interfaces.impl.WangPo;
/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 定义一个西门庆，这人色中饿鬼
 */
public class XiMenQing2 {
    public static void main(String[] args) {
        //改编一下历史，贾氏被西门庆勾走：
        JiaShi jiaShi= new JiaShi();
        WangPo wangPo= new WangPo(jiaShi); //让王婆作为贾氏的代理人
        wangPo.makeEyesWithMan();
        wangPo.happyWithMan();
    }
}
