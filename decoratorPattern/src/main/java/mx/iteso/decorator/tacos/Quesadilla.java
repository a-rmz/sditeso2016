package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

public class Quesadilla extends Taco {
    public Quesadilla(int size){
        description = "Quesadilla";
        this.size = size;
    }


    @Override
    public double cost() {return 10.00;}

    @Override
    public int getSize() {
        return this.size;
    }
}
