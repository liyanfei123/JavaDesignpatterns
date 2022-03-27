package CreationalPattern.FactoryPattern.FactoryMethodPattern;

/**
 * Description:
 *
 * @date:2022/03/27 16:40
 * @author: lyf
 */
public class SedanCar extends Vehicle {

    public SedanCar(String size) {
        super(size);
    }

    @Override
    public String setColor(String color) {
        this.color = color;
        return this.color;
    }

    @Override
    public String testVehicle() {
        System.out.println("SedanCar, size:" + this.size + ", color:" + this.color);
        return "SedanCar, size:" + this.size + ", color:" + this.color;
    }
}
