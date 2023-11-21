package cn.smileyan.dp.product.impl;

import cn.smileyan.dp.product.Memory;

/**
 * 具体产品实现类 - 金士顿内存
 * @author Smileyan
 */
public class KingstonMemory implements Memory {
    @Override
    public void store() {
        System.out.println("Kingston Memory is storing data.");
    }
}
