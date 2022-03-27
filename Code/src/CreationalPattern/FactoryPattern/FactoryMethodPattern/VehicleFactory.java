package CreationalPattern.FactoryPattern.FactoryMethodPattern;

/**
 * Description:
 * 工厂方法模式
 * 是在静态工厂模式上的改进，工厂类被抽象化，用户实例化特定产品类的代码被转移到实现抽象方法的子类中
 * 这样不需要修改就可以拓展工厂类
 * @date:2022/03/27 16:31
 * @author: lyf
 */
public abstract class VehicleFactory {  // 抽象工厂类

    protected abstract Vehicle createVehicle(String size);

    // 工厂类中不包含任何创建实例的代码

    public Vehicle orderVehicle(String size, String color) {
        Vehicle vehicle = createVehicle(size);
        vehicle.setColor(color);
        vehicle.testVehicle();
        return vehicle;
    }


}
