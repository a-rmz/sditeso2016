package mx.iteso.decorator.condiments;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

/**
 * Created by fernando on 29/09/16.
 */
public class Shrimp extends CondimentsDecorator{
    Taco taco;

    public Shrimp (Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " con camaron";
    }

    @Override
    public double cost() throws WrongSizeException {
        if (taco.getSize() == Size.MINI) {
            throw new WrongSizeException();
        }
        double size = 4.00;
        size += (getSize() == Size.MEGA) ? 3.00 : 0.00;
        return size + taco.cost();
    }

    @Override
    public Size getSize() { return taco.getSize();
    }

}