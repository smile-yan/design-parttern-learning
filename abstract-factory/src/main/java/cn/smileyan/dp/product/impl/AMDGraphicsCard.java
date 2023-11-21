package cn.smileyan.dp.product.impl;

import cn.smileyan.dp.product.GraphicsCard;

/**
 * 具体产品实现类 - AMD显卡
 * @author Smileyan
 */
public class AMDGraphicsCard implements GraphicsCard {
    @Override
    public void display() {
        System.out.println("AMD Graphics Card is displaying graphics.");
    }
}
