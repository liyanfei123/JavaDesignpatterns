package CreationalPattern.BuilderPattern;

/**
 * Description:
 * 具体建造者类
 * 用语实现抽象建造者类接口中声明的方法
 * @date:2022/03/27 17:18
 * @author: lyf
 */
public class ElectricCarBuilder extends CarBuilder{
    @Override
    public void addEngine(String string) {

    }

    @Override
    public void addBatteries(String string) {

    }

    @Override
    public void addTransmission(String string) {

    }

    @Override
    public void addWheel(String string) {

    }

    @Override
    public void paint(String string) {

    }

    @Override
    public Car getCar() {
        return null;
    }

    @Override
    public void addGasTank(String string) {

    }
}
