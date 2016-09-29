package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

public class TacoNormal extends Taco {
    public TacoNormal(int size){
        description = "Taco normal";
        this.size = size;
    }

    @Override
    public double cost() {
        return 8.00;
    }

    @Override
    public int getSize() {
        return this.size;
    }

}
