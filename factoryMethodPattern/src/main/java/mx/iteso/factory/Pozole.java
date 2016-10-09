package mx.iteso.factory;

import java.util.ArrayList;

public abstract class Pozole {
    public String name;
    public String broth;
    public ArrayList toppings = new ArrayList();

    // TODO call base pozole serve method
    public String serve() {
        return "Serving in regular pozole plate...";
    }

    // TODO call base pozole prepare method concatenating each condiment
    public String prepare() {
        String out = "Preparing " + name +
                "\nAdding corn kernels..." +
                "\nAdding broth..." +
                "\nAdding toppings:";
        return out;
    }

    public String getName() {
        return name;
    }
}