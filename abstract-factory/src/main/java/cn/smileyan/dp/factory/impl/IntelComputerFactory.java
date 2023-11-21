package cn.smileyan.dp.factory.impl;

import cn.smileyan.dp.factory.ComputerFactory;
import cn.smileyan.dp.product.Cpu;
import cn.smileyan.dp.product.GraphicsCard;
import cn.smileyan.dp.product.Memory;
import cn.smileyan.dp.product.impl.IntelCpu;
import cn.smileyan.dp.product.impl.KingstonMemory;
import cn.smileyan.dp.product.impl.NvidiaGraphicsCard;

/**
 * 具体工厂实现类 - Intel电脑工厂
 * @author Smileyan
 */
public class IntelComputerFactory implements ComputerFactory {

    @Override
    public Cpu createCpu() {
        return new IntelCpu();
    }

    @Override
    public Memory createMemory() {
        return new KingstonMemory();
    }

    @Override
    public GraphicsCard createGraphicsCard() {
        return new NvidiaGraphicsCard();
    }
}
