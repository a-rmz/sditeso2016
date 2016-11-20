package mx.iteso.stateDesign;

import mx.iteso.stateDesign.impl.States.AngryState;
import mx.iteso.stateDesign.impl.States.HappyState;
import mx.iteso.stateDesign.impl.States.HungryState;
import mx.iteso.stateDesign.impl.Tamagotchi;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by a-rmz on 11/19/16.
 */
public class tamagotchiTest {

    Tamagotchi t;

    @Before
    public void setup() {
        t = new Tamagotchi();
    }

    @Test
    public void getAngryTest() {
        t.setState(new HappyState());
        Assert.assertEquals(
                "I'm angry! -_-",
                t.leave()
        );
    }

    @Test
    public void getHappyTest() {
        t.setState(new AngryState());
        Assert.assertEquals(
                "I'm happy! (:",
                t.pet()
        );
    }

    @Test
    public void getHungryTest() {
        t.setState(new HappyState());
        Assert.assertEquals(
                "I'm hungry ):",
                t.feed(false)
        );
    }

    @Test
    public void dieTest() {
        t.setState(new HungryState());
        Assert.assertEquals(
                "I'm dead x_x",
                t.feed(false)
        );
    }

    @Test
    public void happyAfterFeedTest() {
        t.setState(new HungryState());
        Assert.assertEquals(
                "I'm happy! (:",
                t.feed(true)
        );
    }

    @Test
    public void hungryAfterNoFeedTest1() {
        t.setState(new HappyState());
        Assert.assertEquals(
                "I'm hungry ):",
                t.feed(false)
        );
    }

    @Test
    public void hungryAfterNoFeedTest2() {
        t.setState(new AngryState());
        Assert.assertEquals(
                "I'm hungry ):",
                t.feed(false)
        );
    }

    @Test
    public void leaveWhenHungryTest() {
        t.setState(new HungryState());
        Assert.assertEquals(
                "I'm dead x_x",
                t.leave()
        );
    }

    @Test
    public void leaveWhenAngryTest() {
        t.setState(new AngryState());
        Assert.assertEquals(
                "I'm hungry ):",
                t.leave()
        );
    }
}
