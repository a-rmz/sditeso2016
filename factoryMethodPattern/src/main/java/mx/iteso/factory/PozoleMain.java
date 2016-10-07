package mx.iteso.factory;

import mx.iteso.factory.stores.MenudoStore;
import mx.iteso.factory.stores.PozoleRojoStore;
import mx.iteso.factory.stores.PozoleVerdeStore;
import mx.iteso.factory.stores.PozolilloStore;

public class PozoleMain {
    public static void main(String[] args) {
        PozoleStore verdeStore = new PozoleVerdeStore();
        PozoleStore rojoStore = new PozoleRojoStore();
        PozoleStore menuderia = new MenudoStore();
        PozoleStore pozolilloStore = new PozolilloStore();

        Pozole pozole = verdeStore.orderPozole(PozoleType.POLLO);
        System.out.println("First order is: " + pozole.getName());
        System.out.println();

        pozole = rojoStore.orderPozole(PozoleType.POLLO);
        System.out.println("Second order is: " + pozole.getName());
        System.out.println();

        pozole = menuderia.orderPozole(PozoleType.POLLO);
        System.out.println("Third order is: " + pozole.getName());
        System.out.println();

        pozole = pozolilloStore.orderPozole(PozoleType.POLLO);
        System.out.println("Fourth order is: " + pozole.getName());
        System.out.println();

    }
}