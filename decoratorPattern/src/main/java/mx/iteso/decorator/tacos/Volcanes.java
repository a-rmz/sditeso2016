package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

/**
 * Created by fernando on 29/09/16.
 */
public class Volcanes extends Taco {
    public Volcanes (int size) {
        description = "Volcan";
        this.size = size;
    }

    @Override
    public int getSize() { return this.size;}

    @Override
    public double cost() { return 10;}

}
