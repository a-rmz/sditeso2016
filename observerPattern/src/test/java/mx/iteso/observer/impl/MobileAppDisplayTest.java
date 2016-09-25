package mx.iteso.observer.impl;

import mx.iteso.observer.Observer;
import mx.iteso.observer.Scorer;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.*;

/**
 * Created by fernando on 22/09/16.
 */
public class MobileAppDisplayTest {
    private MobileAppDisplay mobileAppDisplay;
    private ScoresData scoresData;

    @Before
    public void setUp() {
        scoresData = mock(ScoresData.class);
        mobileAppDisplay = new MobileAppDisplay(scoresData);
    }

    @Test
    public void testUpdate() {
        ArrayList<Scorer> scorers = new ArrayList<Scorer>(2);
        scorers.add(new Scorer("Scorer 1", 10, "Midfielder", "homeTeam"));
        scorers.add(new Scorer("Scorer 2", 14, "Defense", "homeTeam"));

        mobileAppDisplay.update("homeTeam", "awayTeam", 2, 0, scorers);

    }

    @Test
    public void unknownTest() {
        verify(scoresData, calls(1)).removeObserver(mobileAppDisplay);
    }
}
