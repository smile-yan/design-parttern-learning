package cn.smileyan.dp.factory;

import cn.smileyan.dp.product.Cpu;
import cn.smileyan.dp.product.GraphicsCard;
import cn.smileyan.dp.product.Memory;

/**
 * 抽象工厂接口
 * @author Smileyan
 */
public interface ComputerFactory {
    /**
     * 创建处理器
     */
    Cpu createCpu();

    /**
     * 创建内存
     */
    Memory createMemory();

    /**
     * 创建显卡
     */
    GraphicsCard createGraphicsCard();
}
