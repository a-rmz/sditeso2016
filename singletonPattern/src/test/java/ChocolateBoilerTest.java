import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by fernando on 20/10/16.
 */
public class ChocolateBoilerTest {

    private ChocolateBoiler chocolateBoiler1;
    private ChocolateBoiler chocolateBoiler2;
    private ChocolateBoiler chocolateBoiler3;
    private ChocolateBoiler chocolateBoiler4;
    private ChocolateBoiler chocolateBoiler5;
    private ChocolateBoiler boilerTested1;
    private ChocolateBoiler boilerTested2;

    @Before
    public void setup () {
        chocolateBoiler1 = ChocolateBoiler.getInstance();
        chocolateBoiler2 = ChocolateBoiler.getInstance();
        chocolateBoiler3 = ChocolateBoiler.getInstance();
        chocolateBoiler4 = ChocolateBoiler.getInstance();
        chocolateBoiler5 = ChocolateBoiler.getInstance();
    }

    Thread thread1 = new Thread(new Runnable() {

        public void run() {
            chocolateBoiler1.fill();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            chocolateBoiler2.fill();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            chocolateBoiler3.fill();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            chocolateBoiler4.fill();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            chocolateBoiler5.fill();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    });

    Thread thread2 = new Thread(new Runnable() {

        public void run() {
            chocolateBoiler1.drain();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            chocolateBoiler2.drain();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            chocolateBoiler3.drain();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            chocolateBoiler4.drain();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            chocolateBoiler5.drain();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    });

    Thread thread3 = new Thread(new Runnable() {

        public void run() {
            chocolateBoiler1.boil();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            chocolateBoiler2.boil();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            chocolateBoiler3.boil();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            chocolateBoiler4.boil();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            chocolateBoiler5.boil();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    });

    @Test
    public void multiThreadTest (){
        thread1.run();
        thread2.run();
        thread3.run();
    }

    @Test
    public void testFill (){
        boilerTested1 = chocolateBoiler1;
        boilerTested1.fill();
        boilerTested1 = chocolateBoiler2;
        boilerTested1.fill();

        boilerTested2 = chocolateBoiler1;
        Assert.assertEquals(false, chocolateBoiler1.isEmpty());
        Assert.assertEquals(false, chocolateBoiler1.isBoiled());
    }

    @Test
    public void testOverFill (){
        chocolateBoiler1.fill();
        chocolateBoiler1.fill();
        Assert.assertEquals(false, chocolateBoiler1.isEmpty());
    }

    @Test
    public void testBoil (){
        boilerTested1 = chocolateBoiler1;
        boilerTested1.fill();
        boilerTested1.boil();
        boilerTested1 = chocolateBoiler2;
        boilerTested1.fill();
        boilerTested1.boil();

        boilerTested2 = chocolateBoiler1;
        Assert.assertEquals(false, chocolateBoiler1.isEmpty());
        Assert.assertEquals(true, chocolateBoiler1.isBoiled());
    }

    @Test
    public void testOverBoil () {
        chocolateBoiler1.fill();
        chocolateBoiler1.boil();
        chocolateBoiler1.boil();
        Assert.assertEquals(true, chocolateBoiler1.isBoiled());
    }

    @Test
    public void testDrain (){
        boilerTested1 = chocolateBoiler1;
        boilerTested1.fill();
        boilerTested1.boil();
        boilerTested1.drain();

        boilerTested1 = chocolateBoiler2;
        boilerTested1.fill();
        boilerTested1.boil();
        boilerTested1.drain();

        boilerTested2 = chocolateBoiler1;
        Assert.assertEquals(true, chocolateBoiler1.isEmpty());
        Assert.assertEquals(true, chocolateBoiler1.isBoiled());
    }

    @Test
    public void testIsEmpty () {
        chocolateBoiler1.fill();
        Assert.assertEquals(false, chocolateBoiler1.isEmpty());
    }

    @Test
    public void testIsBoiled () {
        chocolateBoiler1.fill();
        chocolateBoiler1.boil();
        Assert.assertEquals(true, chocolateBoiler1.isBoiled());
    }

}
