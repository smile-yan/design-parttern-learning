package cn.smileyan.dp.product.impl;

import cn.smileyan.dp.product.Memory;

/**
 * 具体产品实现类 - 致钛内存
 * @author Smileyan
 */
public class TiPlusMemory implements Memory {

    @Override
    public void store() {
        System.out.println("TiPlus Memory is storing data.");
    }
}
