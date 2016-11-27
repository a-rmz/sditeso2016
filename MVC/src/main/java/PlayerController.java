/**
 * Created by a-rmz on 11/26/16.
 */
public class PlayerController {

    Player player;
    Game game;

    public PlayerController(Player player, Game game) {
        this.player = player;
        this.game = game;
    }

    public void setName(String name) {
        player.setName(name);
    }

    public void moveHorizontal(int dx) {
        player.setCoordX(player.getCoordX() + dx);
    }

    public void moveVertical(int dy) {
        player.setCoordY(player.getCoordY() + dy);
    }

    public void moveDiagonal(int dx, int dy) {
        player.setCoordX(player.getCoordX() + dx);
        player.setCoordY(player.getCoordY() + dy);
    }

    public String updateGame() {
        return game.printPlayerStatus(player);

    }

}