package mx.iteso.decorator;

import mx.iteso.decorator.condiments.*;
import mx.iteso.decorator.condiments.meat.Chorizo;
import mx.iteso.decorator.condiments.meat.Lengua;
import mx.iteso.decorator.condiments.meat.Pastor;
import mx.iteso.decorator.tacos.Quesadilla;
import mx.iteso.decorator.tacos.TacoNormal;
import mx.iteso.decorator.tacos.Volcan;

public class TuTaco {
    public static void main(String[] args) {
//        Taco taco = new TacoNormal();
//        System.out.println(taco.getDescription());
//        System.out.println("$" + taco.cost() + " MXN");
//
//        taco = new TortillaMaiz(taco);
//        taco = new Chorizo(taco);
//        taco = new Cebolla(taco);
//        taco = new Cilantro(taco);
//
//        System.out.println();
//        System.out.println();
//        System.out.println(taco.getDescription());
//        System.out.println("$" + taco.cost() + " MXN");
//
//        Taco taco2 = new TacoNormal();
//
//        taco2 = new TortillaHarina(taco2);
//        taco2 = new Lengua(taco2);
//        taco2 = new Cilantro(taco2);
//
//        System.out.println();
//        System.out.println();
//        System.out.println(taco2.getDescription());
//        System.out.println("$" + taco2.cost() + " MXN");
//
//        Taco taco3 = new Quesadilla(Taco.MEGA);
//
//        taco3 = new TortillaHarina(taco3);
//        taco3 = new Pastor(taco3);
//        taco3 = new Cebolla(taco3);
//
//        System.out.println();
//        System.out.println();
//        System.out.println(taco3.getDescription());
//        System.out.println("$" + taco3.cost() + " MXN");

        Taco quesadilla = new Quesadilla(Taco.MINI);
        quesadilla = new Fish(quesadilla);
        System.out.println(quesadilla.getDescription());
        System.out.println("$" + quesadilla.cost() + " MXN");
    }
}
