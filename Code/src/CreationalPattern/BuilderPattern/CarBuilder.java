package CreationalPattern.BuilderPattern;

/**
 * Description:
 * 抽象建造者类
 * 用于声明构建产品类的组成部分的抽象类或接口
 * 作用是仅公开构建产品类的功能
 * @date:2022/03/27 17:13
 * @author: lyf
 */
public abstract class CarBuilder {

    Car car;

    public void buildCar() {
        this.car = new Car();
        // add basic properties
    }

    public abstract void addEngine(String string);

    public abstract void addBatteries(String string);

    public abstract void addTransmission(String string);

    public abstract void addWheel(String string);

    public abstract void paint(String string);

    public abstract Car getCar();

    public abstract void addGasTank(String string);

}
