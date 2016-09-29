package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Pastor extends CondimentsDecorator {
    Taco taco;

    public Pastor (Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de pastor";
    }

    @Override
    public double cost() {
        double size = 0.00;
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
        return taco.getSize();
    }

}
