package CreationalPattern.FactoryPattern.SimpleFactoryPattern;

/**
 * Description:
 * 抽象类
 * @date:2022/03/27 10:59
 * @author: lyf
 */
public abstract class Vehicle {

    public String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public abstract String getName();

    public abstract String toString();

    public abstract Vehicle newInstance();
}
