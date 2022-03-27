package CreationalPattern.FactoryPattern.SimpleFactoryPattern;

/**
 * Description:
 * 简单工厂模式
 * SimpleFactory中包含实例化CreateProduct1和CreateProduct2的代码，当客户需要调用对象时，调用SimpleFactory当createProduct()方法，并提供参数指明所需对象的类型
 * @date:2022/03/27 10:54
 * @author: lyf
 */
public class VehicleFactory {

    public enum VehicleType {
        Bike,
        Car;
    }

    /**
     * 用户可直接通过该接口来实现实例化，减少耦合，符合依赖倒置原则
     * 但是当增加一个新的Vehicle类时，需要对工厂类进行修改，打破了开闭原则
     * @param type
     * @return
     */
    public static Vehicle create1(VehicleType type) {
        if (type.equals(VehicleType.Bike)) {
            return new Bike("bike");
        }
        if (type.equals(VehicleType.Car)) {
            return new Car("car");
        }
        else {
            return null;
        }
    }

}
