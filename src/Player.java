
import java.awt.Color;

/**
 * @author Enrique Fernández Hurtado
 * Tarea de la unidad 4 de Entornos de Desarrollo
 * Fecha de realización 05/03/2024
 */

public class Player {

    private String name;
    private int playerPosn;
    private int playerScore;
    private Color playerColor;

    public Player(int no) {
        name = "Player " + no;
        playerPosn = 0;
    }

    public int getPosition() {
        return playerPosn;
    }

    public String getName() {
        return name;
    }

    public void setPosition(int posn) {
        playerPosn = posn;
    }

    public void incPosition(int posn) {
        playerPosn += posn;
    }

    public void setPlayerColor(Color c) {
        playerColor = c;
    }

    public Color getPlayerColor() {
        return playerColor;
    }

    public void incPlayerScore(int a) {
        playerScore += a;
    }

    public int getPlayerScore() {
        return playerScore;
    }

}
