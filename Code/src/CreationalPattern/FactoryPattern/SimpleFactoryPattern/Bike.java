package CreationalPattern.FactoryPattern.SimpleFactoryPattern;

/**
 * Description:
 *
 * @date:2022/03/27 11:16
 * @author: lyf
 */
public class Bike extends Vehicle {

    public Bike(String name) {
        super(name);
    }

    public Bike() {
        super("bike");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Bike:" + name;
    }

    @Override
    public Vehicle newInstance() {
        return new Bike("bike");
    }

//    public static void main(String[] args) {
//        Bike bike = new Bike("自行车");
//        System.out.println(bike.getName());
//    }
}