package mx.iteso.decorator.condiments;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

/**
 * Created by fernando on 29/09/16.
 */
public class Fish extends CondimentsDecorator{
    Taco taco;

    public Fish (Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " con pescado";
    }

    @Override
    public double cost() {
        return 4 + taco.cost();
    }
}
