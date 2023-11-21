package cn.smileyan.dp.product.impl;

import cn.smileyan.dp.product.GraphicsCard;

/**
 * 具体产品实现类 - NVIDIA显卡
 * @author Smileyan
 */
public class NvidiaGraphicsCard implements GraphicsCard {
    @Override
    public void display() {
        System.out.println("NVIDIA Graphics Card is displaying graphics.");
    }
}
