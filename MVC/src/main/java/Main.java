/**
 * Created by a-rmz on 11/26/16.
 */
public class Main {

    public static void main(String args[]) {

        Player p1 = new Player();
        Game game = new Game();
        PlayerController controller = new PlayerController(p1, game);

        controller.setName("Mr. Roboto");
        // Print the first time
        controller.updateGame();

        controller.moveHorizontal(10);
        controller.moveDiagonal(-2, -2);
        controller.moveVertical(5);

        // Print after changes
        controller.updateGame();
        
    }

}
