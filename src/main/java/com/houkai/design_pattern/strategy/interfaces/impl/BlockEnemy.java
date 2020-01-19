package com.houkai.design_pattern.strategy.interfaces.impl;

import com.houkai.design_pattern.strategy.interfaces.IStrategy;

/**
 * I'm glad to share my knowledge with you all.
 * 孙夫人断后，挡住追兵
 */
public class BlockEnemy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵");
    }
}
