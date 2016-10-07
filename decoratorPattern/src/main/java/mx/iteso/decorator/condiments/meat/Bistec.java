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
        if( getSize() == Size.MINI)
            size -= 1.50;
        else if(getSize() == Size.MEGA)
            size += 2.00;

        return size + taco.cost();
    }

    @Override
    public Size getSize() { return taco.getSize();}

}
