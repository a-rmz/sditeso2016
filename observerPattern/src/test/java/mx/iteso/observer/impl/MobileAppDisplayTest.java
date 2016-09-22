package mx.iteso.observer.impl;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;

/**
 * Created by fernando on 22/09/16.
 */
public class MobileAppDisplayTest {
    private MobileAppDisplay mobileAppDisplay;
    private ScoresData scoresData;

    @Before
    public void setUp() {
        scoresData = mock(ScoresData.class);
        //mobileAppDisplay = new MobileAppDisplay(scoresData);
    }

    @Test
    public void testUpdate() {
        mobileAppDisplay.update("homeTeam", "awayTeam", 1, 0, );
        //Nothing to assert or verify for now
    }
}
