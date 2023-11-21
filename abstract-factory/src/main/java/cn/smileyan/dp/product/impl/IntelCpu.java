package cn.smileyan.dp.product.impl;

import cn.smileyan.dp.product.Cpu;

/**
 * 具体产品实现类 - 英特尔处理器
 * @author Smileyan
 */
public class IntelCpu implements Cpu {
    @Override
    public void process() {
        System.out.println("Intel Cpu is processing.");
    }
}
