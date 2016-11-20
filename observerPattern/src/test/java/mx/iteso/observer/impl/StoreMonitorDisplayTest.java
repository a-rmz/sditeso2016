package mx.iteso.observer.impl;

import mx.iteso.observer.Scorer;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

<<<<<<< HEAD
import static org.mockito.Mockito.mock;

=======
>>>>>>> 55ed0a291cfddd2396c78254fee800d79770f81a
public class StoreMonitorDisplayTest {
    private StoreMonitorDisplay storeMonitorDisplay;
    private ScoresData scoresData;

    @Before
    public void setUp() {
        scoresData = mock(ScoresData.class);
        storeMonitorDisplay = new StoreMonitorDisplay(scoresData);
    }

    @Test
    public void testUpdate() {
        ArrayList<Scorer> scorers = new ArrayList<Scorer>(2);
        scorers.add(new Scorer("Scorer 1", 10, "Midfielder", "homeTeam"));
        scorers.add(new Scorer("Scorer 2", 14, "Defense", "homeTeam"));

        storeMonitorDisplay.update("homeTeam", "awayTeam", 2, 0, scorers);
    }

}
