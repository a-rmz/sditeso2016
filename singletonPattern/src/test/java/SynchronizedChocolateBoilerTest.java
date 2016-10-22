import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by fernando on 22/10/16.
 */
public class SynchronizedChocolateBoilerTest {
    private SynchronizedChocolateBoiler synchronizedChocolateBoile1;
    private SynchronizedChocolateBoiler synchronizedChocolateBoile2;
    private SynchronizedChocolateBoiler synchronizedChocolateBoile3;
    private SynchronizedChocolateBoiler synchronizedChocolateBoile4;
    private SynchronizedChocolateBoiler synchronizedChocolateBoile5;
    private SynchronizedChocolateBoiler synchronizedChocolateBoilerTested1;
    private SynchronizedChocolateBoiler synchronizedChocolateBoilerTested2;

    @Before
    public void setup () {
        synchronizedChocolateBoile1 = SynchronizedChocolateBoiler.getInstance();
        synchronizedChocolateBoile2 = SynchronizedChocolateBoiler.getInstance();
        synchronizedChocolateBoile3 = SynchronizedChocolateBoiler.getInstance();
        synchronizedChocolateBoile4 = SynchronizedChocolateBoiler.getInstance();
        synchronizedChocolateBoile5 = SynchronizedChocolateBoiler.getInstance();
    }

    Thread thread1 = new Thread(new Runnable() {

        public void run() {
            synchronizedChocolateBoile1.fill();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronizedChocolateBoile2.fill();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronizedChocolateBoile3.fill();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronizedChocolateBoile4.fill();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronizedChocolateBoile5.fill();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    });

    Thread thread2 = new Thread(new Runnable() {

        public void run() {
            synchronizedChocolateBoile1.drain();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronizedChocolateBoile2.drain();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronizedChocolateBoile3.drain();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronizedChocolateBoile4.drain();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronizedChocolateBoile5.drain();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    });

    Thread thread3 = new Thread(new Runnable() {

        public void run() {
            synchronizedChocolateBoile1.boil();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronizedChocolateBoile2.boil();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronizedChocolateBoile3.boil();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronizedChocolateBoile4.boil();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronizedChocolateBoile5.boil();
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
        synchronizedChocolateBoilerTested1 = synchronizedChocolateBoile1;
        synchronizedChocolateBoilerTested1.fill();
        synchronizedChocolateBoilerTested1.fill();
        synchronizedChocolateBoilerTested1 = synchronizedChocolateBoile2;
        synchronizedChocolateBoilerTested1.fill();

        synchronizedChocolateBoilerTested2 = synchronizedChocolateBoile1;
        Assert.assertEquals(false, synchronizedChocolateBoile1.isEmpty());
        Assert.assertEquals(false, synchronizedChocolateBoile1.isBoiled());
    }
    @Test
    public void testOverFill (){
        synchronizedChocolateBoile1.fill();
        synchronizedChocolateBoile1.fill();
        Assert.assertEquals(false, synchronizedChocolateBoile1.isEmpty());
    }

    @Test
    public void testBoil (){
        synchronizedChocolateBoilerTested1 = synchronizedChocolateBoile1;
        synchronizedChocolateBoilerTested1.fill();
        synchronizedChocolateBoilerTested1.boil();
        synchronizedChocolateBoilerTested1 = synchronizedChocolateBoile2;
        synchronizedChocolateBoilerTested1.fill();
        synchronizedChocolateBoilerTested1.boil();

        synchronizedChocolateBoilerTested2 = synchronizedChocolateBoile1;
        Assert.assertEquals(false, synchronizedChocolateBoile1.isEmpty());
        Assert.assertEquals(true, synchronizedChocolateBoile1.isBoiled());
    }

    @Test
    public void testOverBoil () {
        synchronizedChocolateBoile1.fill();
        synchronizedChocolateBoile1.boil();
        synchronizedChocolateBoile1.boil();
        Assert.assertEquals(true, synchronizedChocolateBoile1.isBoiled());
    }

    @Test
    public void testDrain (){
        synchronizedChocolateBoilerTested1 = synchronizedChocolateBoile1;
        synchronizedChocolateBoilerTested1.fill();
        synchronizedChocolateBoilerTested1.boil();
        synchronizedChocolateBoilerTested1.drain();

        synchronizedChocolateBoilerTested1 = synchronizedChocolateBoile2;
        synchronizedChocolateBoilerTested1.fill();
        synchronizedChocolateBoilerTested1.boil();
        synchronizedChocolateBoilerTested1.drain();

        synchronizedChocolateBoilerTested2 = synchronizedChocolateBoile1;
        Assert.assertEquals(true, synchronizedChocolateBoile1.isEmpty());
        Assert.assertEquals(true, synchronizedChocolateBoile1.isBoiled());
    }

    @Test
    public void testIsEmpty () {
        synchronizedChocolateBoile1.fill();
        Assert.assertEquals(false, synchronizedChocolateBoile1.isEmpty());
    }

    @Test
    public void testIsBoiled () {
        synchronizedChocolateBoile1.fill();
        synchronizedChocolateBoile1.boil();
        Assert.assertEquals(true, synchronizedChocolateBoile1.isBoiled());
    }

}
