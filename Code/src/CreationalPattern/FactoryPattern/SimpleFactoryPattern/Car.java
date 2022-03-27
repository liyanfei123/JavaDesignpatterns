package CreationalPattern.FactoryPattern.SimpleFactoryPattern;

/**
 * Description:
 *
 * @date:2022/03/27 11:03
 * @author: lyf
 */
public class Car extends Vehicle {

    public Car(String name) {
        super(name);
    }

    public Car() {
        super("car");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car:" + name;
    }

    @Override
    public Vehicle newInstance() {
        return new Car("car");
    }

//    public static void main(String[] args) {
//        Car car = new Car("汽车");
//        System.out.println(car.getName());
//    }
}
