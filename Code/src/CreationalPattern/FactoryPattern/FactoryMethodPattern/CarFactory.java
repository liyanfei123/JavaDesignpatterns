package CreationalPattern.FactoryPattern.FactoryMethodPattern;

/**
 * Description:
 * 用户实例化特定产品类的代码被转移到实现抽象方法的子类中
 * @date:2022/03/27 16:42
 * @author: lyf
 */
public class CarFactory extends VehicleFactory{

    @Override
    protected Vehicle createVehicle(String size) {
        if (size.equals("small")) {
            return new SportCar("small");
        } else if (size.equals("large")) {
            return new SedanCar("large");
        }
         return null;
    }


    public static void main(String[] args) {
        // 匿名具体工厂模式
        VehicleFactory bikeFactory = new VehicleFactory() {
            @Override
            protected Vehicle createVehicle(String size) {
                if (size.equals("small")) {
                    return new SportCar("small");
                } else if (size.equals("large")) {
                    return new SedanCar("large");
                }
                return null;
            }
        };
        bikeFactory.orderVehicle("small", "yellow");
    }


//    public static void main(String[] args) {
//        VehicleFactory vehicleFactory = new CarFactory();
//        vehicleFactory.orderVehicle("large", "blue");
//    }

}
