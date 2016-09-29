package mx.iteso.decorator.condiments;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Queso extends CondimentsDecorator {
    Taco taco;

    public Queso(Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " con queso";
    }

    @Override
    public double cost() {
        double size = 2.00;
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
