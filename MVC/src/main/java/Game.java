/**
 * Created by a-rmz on 11/26/16.
 */
public class Game {

    public String printPlayerStatus(Player player) {
        String out = "";
        out += "Player name: " + player.getName();
        out += "\nCoords: (" + player.getCoordX() + ", "+ player.getCoordY() + ")";
        System.out.println(out);
        return out;
    }

}
