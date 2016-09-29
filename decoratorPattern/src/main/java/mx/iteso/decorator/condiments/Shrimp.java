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
    public double cost() {
        if (getSize() == MINI) {
            throw new WrongSizeException();
        }
        double size = 4.00;
        size += (getSize() == MEGA) ? 3.00 : 0.00;
        return size + taco.cost();
    }

    @Override
    public int getSize() { return taco.getSize();
    }

}