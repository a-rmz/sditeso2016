package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

public class TacoNormal extends Taco {
    public TacoNormal(Size size){
        description = "Taco normal";
        this.size = size;
    }

    private TacoNormal() {}

    @Override
    public double cost() {
        return 8.00;
    }

    @Override
    public Size getSize() {
        return this.size;
    }

}
