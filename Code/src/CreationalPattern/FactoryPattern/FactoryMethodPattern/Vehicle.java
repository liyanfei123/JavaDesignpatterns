package CreationalPattern.FactoryPattern.FactoryMethodPattern;

/**
 * Description:
 * 抽象类
 * @date:2022/03/27 10:59
 * @author: lyf
 */
public abstract class Vehicle {

    public String color;

    public String size;

    public Vehicle(String size) {
        this.size = size;
    }

    public abstract String setColor(String color);

    public abstract String testVehicle();

}
