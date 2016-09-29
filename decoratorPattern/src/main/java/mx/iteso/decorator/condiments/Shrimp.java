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
        double size = 4.00;
        switch (getSize()) {
            case Taco.MINI:
                size -= 1.50;
                break;
            case Taco.MEGA:
                size += 2.00;
                break;

        }
        return size + taco.cost();
    }

    @Override
    public int getSize() {
        return taco.size;
    }
}