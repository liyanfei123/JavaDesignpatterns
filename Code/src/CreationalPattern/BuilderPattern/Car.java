package CreationalPattern.BuilderPattern;

import javafx.util.Builder;

/**
 * Description:
 * 产品类
 * 需要为起构建对象的类，是具有不同表现形式的复杂或复合对象
 * @date:2022/03/27 17:15
 * @author: lyf
 */
public class Car {

    public Builder setColor() {
        return (Builder) this;
    }
}
