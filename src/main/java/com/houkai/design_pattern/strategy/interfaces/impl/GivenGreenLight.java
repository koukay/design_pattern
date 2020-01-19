package com.houkai.design_pattern.strategy.interfaces.impl;

import com.houkai.design_pattern.strategy.interfaces.IStrategy;

/**
 * I'm glad to share my knowledge with you all.
 * 求吴国太开个绿灯
 */
public class GivenGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("求吴国太开个绿灯,放行！");
    }
}
