package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Lengua  extends CondimentsDecorator {
    Taco taco;

    public Lengua (Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de lengua";
    }

    @Override
    public double cost() {
        double size = 2.00;
        if(this.size == Size.MINI)
            size -= 1.50;
        else if(this.size == Size.MEGA)
            size += 2.00;

        return size + taco.cost();
    }

    @Override
    public Size getSize() {
        return taco.getSize();
    }

}
