
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * @author Enrique Fernández Hurtado
 * Tarea de la unidad 4 de Entornos de Desarrollo
 * Fecha de realización 05/03/2024
 */

public class WelcomeScreen extends JPanel {

    JLabel title;
    JButton go;
    JButton quit;

    MainWindow mw;

    public void setTitle(String t) {
        title.setText(t);
    }

    public void quitButtonActionListener() {
        if (JOptionPane.showConfirmDialog(this, "Are you sure?") == JOptionPane.OK_OPTION) {
            System.exit(0);
        }
    }

    public void goButtonActionListener() {
        mw.showCard("Two");
    }

    public WelcomeScreen(MainWindow mw) {
        this.mw = mw;

        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        title = new JLabel();
        add(title);

        //add formatting here
        go = new JButton(NEW__GAME);
        quit = new JButton(QUIT);

        go.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                goButtonActionListener();
            }
        });

        quit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                quitButtonActionListener();
            }
        });

        add(go);
        add(quit);
    }
    private static final String QUIT = "Quit";
    private static final String NEW__GAME = "New Game";

}
