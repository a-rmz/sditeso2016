package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

/**
 * Created by fernando on 29/09/16.
 */
public class Volcanes extends Taco {
    public Volcanes () {
        description = "Volcan";
        this.size = Taco.NORMAL;
    }

    @Override
    public int getSize() { return this.size;}

    @Override
    public double cost() { return 10;}

}
