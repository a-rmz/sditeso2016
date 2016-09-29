package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Bistec extends CondimentsDecorator {
    Taco taco;

    public Bistec (Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de bistec";
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
    public int getSize() { return taco.getSize();}

}
