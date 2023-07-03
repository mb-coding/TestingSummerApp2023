import java.awt.*;
import javax.swing.*;

public class MainFrame extends JFrame {
    final private Font mainFont = new Font("Segoe print", Font.BOLD, 18);
    JTextField tfFirstName, tfLastName;
    JLabel lbWelcome;

    public void initialize(){
        JLabel lbFirstName = new JLabel("First Name");
        lbFirstName.setFont(mainFont);
        
        tfFirstName = new JTextField();
        tfFirstName.setFont(mainFont);
        
        JLabel lbLastName = new JLabel("Last Name");
        lbLastName.setFont(mainFont);
        
        tfLastName = new JTextField();
        tfLastName.setFont(mainFont);

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4, 1, 5, 5));
        formPanel.add(lbFirstName);
        formPanel.add(tfFirstName);
        formPanel.add(lbLastName);
        formPanel.add(tfLastName);

        lbWelcome = new JLabel();
        lbWelcome.setFont(mainFont);

        //JButton btnOK = new JButton("OK");
        //btnOK.setFont(mainFont);
        //btnOk.addActionListener(newActionListener() {

        //}
    //});

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128, 128, 255));
        mainPanel.add(formPanel, BorderLayout.NORTH);
        mainPanel.add(lbWelcome, BorderLayout.CENTER);


        setTitle("Welcome");
        setSize(500,500);
        setMinimumSize(new Dimension(300,400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        MainFrame myFrame = new MainFrame();
        myFrame.initialize();
    }
}
