package cn.smileyan.dp.factory.impl;

import cn.smileyan.dp.factory.ComputerFactory;
import cn.smileyan.dp.product.Cpu;
import cn.smileyan.dp.product.GraphicsCard;
import cn.smileyan.dp.product.Memory;
import cn.smileyan.dp.product.impl.AMDGraphicsCard;
import cn.smileyan.dp.product.impl.AmdCpu;
import cn.smileyan.dp.product.impl.TiPlusMemory;

/**
 * 具体工厂实现类 - AMD电脑工厂
 * @author Smileyan
 */
public class AmdComputerFactory implements ComputerFactory {
    @Override
    public Cpu createCpu() {
        return new AmdCpu();
    }

    @Override
    public Memory createMemory() {
        return new TiPlusMemory();
    }

    @Override
    public GraphicsCard createGraphicsCard() {
        return new AMDGraphicsCard();
    }
}
