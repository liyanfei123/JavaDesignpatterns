package CreationalPattern.BuilderPattern;

/**
 * Description:
 * 导演类
 * 用于指导如何构建对象的类
 * @date:2022/03/27 17:19
 * @author: lyf
 */
public class CarBuilderDirector {
    public Car buildElectricCar(CarBuilder builder){
        builder.buildCar();
        builder.addEngine("Electric 150 kW");
        builder.addBatteries("1500 kWh");
        builder.addTransmission("Manual");
        for (int i = 0; i < 4; i++)
            builder.addWheel("20x12x30");
        builder.paint("red");

        return builder.getCar();
    }
}
