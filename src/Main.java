
import javax.swing.SwingUtilities;

/**
 * @author Enrique Fernández Hurtado
 * Tarea de la unidad 4 de Entornos de Desarrollo
 * Fecha de realización 05/03/2024
 */

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MainWindow mw = new MainWindow();
                mw.setSize(600, 400);
                mw.setTitle("Snake and Ladder");
                mw.setVisible(true);
            }
        });
    }

}
