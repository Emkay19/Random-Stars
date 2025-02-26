package grade.randomstars;
import javax.swing.*;

/**
 *
 * @author User
 */
public class RandomStars {

    public static void main(String[] args) throws Exception{
        Gui gui = new Gui();
        gui.pack();
        gui.setVisible(true);
        gui.setSize(400, 600); 
        gui.setLocationRelativeTo(null);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.buttons();
    }
}
