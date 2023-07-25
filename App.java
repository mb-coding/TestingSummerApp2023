import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class App extends JFrame {
    public static void main(String[] args) {
        JFrame screenOne = new JFrame("Screen 1");
        screenOne.setVisible(true);
        JButton nextScreen = new JButton("Next Screen");
        screenOne.setSize(300,200);
        screenOne.getContentPane().add(nextScreen);
        //screenOne.pack(); - uncomment this line once we have more components --> then we can remove the screen dimensions
        nextScreen.addActionListener(new ActionListener () {

            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame screenTwo = new JFrame("Screen 2");
                screenTwo.setSize(300,200);
                screenOne.setVisible(false);
                screenTwo.setVisible(true);
            }

        });
    }
}
