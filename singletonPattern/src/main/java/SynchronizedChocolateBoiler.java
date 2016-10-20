/**
 * Created by a-rmz on 10/20/16.
 */
public class SynchronizedChocolateBoiler {

    private boolean empty;
    private boolean boiled;

    private static SynchronizedChocolateBoiler instance;


    private SynchronizedChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static synchronized SynchronizedChocolateBoiler getInstance() {
        return (instance != null) ? instance : new SynchronizedChocolateBoiler();
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // fill the boiler with a milk/chocolate mixture
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // drain the boiled milk and chocolate
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // bring the contents to a boil
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }


}
