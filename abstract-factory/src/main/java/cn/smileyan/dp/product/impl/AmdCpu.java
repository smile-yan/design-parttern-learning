package cn.smileyan.dp.product.impl;

import cn.smileyan.dp.product.Cpu;

/**
 * 具体产品实现类 - AMD处理器
 * @author Smileyan
 */
public class AmdCpu implements Cpu {
    @Override
    public void process() {
        System.out.println("AMD CPU is processing.");
    }
}
