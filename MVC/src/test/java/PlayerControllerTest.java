/**
 * Created by fernando on 26/11/16.
 */
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PlayerControllerTest {
    private PlayerController controller;
    private Player player;
    private Game game;

    @Before
    public void setup () {
        player = new Player();
        game = new Game();
        controller = new PlayerController(player,game);
    }

    @Test
    public void testsetName () {
        controller.setName("Mr. Roboto");
        Assert.assertEquals("Mr. Roboto", player.getName());
    }

    @Test
    public void testmoveHorizontal () {
        //Assert.assertEquals(0,player.getCoordX());
        controller.moveHorizontal(5);
        Assert.assertEquals(5,player.getCoordX());
    }

    @Test
    public void testmoveVertical () {
        //Assert.assertEquals(0,player.getCoordY());
        controller.moveVertical(5);
        Assert.assertEquals(5,player.getCoordY());
    }

    @Test
    public void testmoveDiagonal () {
        Assert.assertEquals(0,player.getCoordX());
        Assert.assertEquals(0,player.getCoordY());
        controller.moveDiagonal(5,5);
        Assert.assertEquals(5,player.getCoordX());
        Assert.assertEquals(5,player.getCoordY());
    }

    @Test
    public void testupdateGame () {
        controller.setName("Mr. Roboto");
        controller.moveDiagonal(-2, -2);
        String gameData = "";
        gameData += "Player name: " + player.getName();
        gameData += "\nCoords: (" + player.getCoordX() + ", "+ player.getCoordY() + ")";
        Assert.assertEquals(gameData, controller.updateGame());

    }
}
