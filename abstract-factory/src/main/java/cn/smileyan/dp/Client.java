package cn.smileyan.dp;

import cn.smileyan.dp.factory.ComputerFactory;
import cn.smileyan.dp.factory.impl.AmdComputerFactory;
import cn.smileyan.dp.factory.impl.IntelComputerFactory;
import cn.smileyan.dp.product.Cpu;
import cn.smileyan.dp.product.GraphicsCard;
import cn.smileyan.dp.product.Memory;

/**
 * 客户类
 * @author Smileyan
 */
public class Client {
    /**
     * 玩电脑，不管是哪个产商生产的主机，至少 CPU 能运行，内存条能存储，显卡能绘制图像
     */
    private static void play(ComputerFactory computerFactory) {
        Cpu cpu = computerFactory.createCpu();
        Memory memory = computerFactory.createMemory();
        GraphicsCard graphicsCard = computerFactory.createGraphicsCard();
        cpu.process();
        memory.store();
        graphicsCard.display();
    }

    /**
     * 运行时需附带一个参数表示用途
     * 如果运行参数为 "玩游戏"，就返回 Amd 工厂
     */
    public static void main(String[] args) {
        String usage = args[0];
        String playGame = "玩游戏";
        ComputerFactory computerFactory;
        if (playGame.equals(usage)) {
            computerFactory = new AmdComputerFactory();
        } else {
            computerFactory = new IntelComputerFactory();
        }
        play(computerFactory);
    }
}
