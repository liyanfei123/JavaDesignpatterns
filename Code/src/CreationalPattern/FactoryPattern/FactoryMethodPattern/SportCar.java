package CreationalPattern.FactoryPattern.FactoryMethodPattern;

/**
 * Description:
 *
 * @date:2022/03/27 16:38
 * @author: lyf
 */
public class SportCar extends Vehicle {

    public SportCar(String size) {
        super(size);
    }

    @Override
    public String setColor(String color) {
        this.color = color;
        return this.color;
    }

    @Override
    public String testVehicle() {
        System.out.println("SportCar, size:" + this.size + ", color:" + this.color);
        return "SportCar, size:" + this.size + ", color:" + this.color;
    }
}
