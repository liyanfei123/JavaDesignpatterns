package CreationalPattern.FactoryPattern.SimpleFactoryPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 *
 * @date:2022/03/27 11:49
 * @author: lyf
 */
public class SimpleFactoryRegister {

//    private static Map<String, Class> registeredProducts = new HashMap<>();
//
//    public static void registerVehicle(String vehicleId, Class vehicleClass) {
//        registeredProducts.put(vehicleId, vehicleClass);
//    }

    /**
     * 为了避免普通方法的缺陷，可以使得注册的新类在使用时才被实例化
     * 使用反射机制注册产品类对象和实例化
     * @param type
     * @return
     */
    public static Vehicle createVehicle(String type)  throws InstantiationException, IllegalAccessException, Exception {
        try {
            Class<?> clazz = Class.forName(type);
            Object obj = clazz.newInstance();  // 类中必须要有无参构造方法
            return (Vehicle) obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, Exception {
        Vehicle car = SimpleFactoryRegister.createVehicle("CreationalPattern.FactoryPattern.SimpleFactoryPattern.Car");
        System.out.println(car.toString());
    }
}
