package mx.iteso.observer.impl;

import mx.iteso.observer.Observer;
import mx.iteso.observer.Scorer;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import static org.mockito.Mockito.*;


/**
 * Created by fernando on 22/09/16.
 */
public class MobileAppDisplayTest {
    private MobileAppDisplay mobileAppDisplay;
    private ScoresData scoresData;
    private ArrayList<Scorer> scorers;

    @Before
    public void setUp() {
        scoresData = mock(ScoresData.class);
        mobileAppDisplay = new MobileAppDisplay(scoresData);

        scorers = new ArrayList<Scorer>(2);
        scorers.add(new Scorer("Scorer 1", 10, "Midfielder", "homeTeam"));
        scorers.add(new Scorer("Scorer 2", 14, "Defense", "homeTeam"));
    }

    @Test
    public void testUpdate() {
        mobileAppDisplay.update("homeTeam", "awayTeam", 2, 0, scorers);
    }

    @Test
    public void testStopNotifications() {
        mobileAppDisplay.deactiveNotifications();
        verify(scoresData, times(1)).removeObserver(mobileAppDisplay);
    }

    @Test
    public void testSubscribeNotifications() {
        // First de-subscribe so you can subscribe again
        mobileAppDisplay.deactiveNotifications();
        mobileAppDisplay.activateNotifications();
        verify(scoresData, times(1)).removeObserver(mobileAppDisplay);
    }

<<<<<<< HEAD
    @Test
    public void testActiveNotifications(){

    }

    @Test
    public void testDeactvieNotifications(){

    }
=======

>>>>>>> b5eae95ceada6bdcb59524bdf3f7a4e68b07a79f
}
