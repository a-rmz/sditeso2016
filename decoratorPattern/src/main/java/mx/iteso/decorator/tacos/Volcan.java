package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

/**
 * Created by fernando on 29/09/16.
 */
public class Volcan extends Taco {
    public Volcan() {
        description = "Volcan";
        if(size != NORMAL) throw new WrongSizeException();
        this.size = NORMAL;
    }

    @Override
    public int getSize() { return this.size;}

    @Override
    public double cost() { return 10;}

}
