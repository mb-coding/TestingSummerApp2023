import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class App extends JFrame {
    public static void main(String[] args) {
        
        JFrame HomeScreen = new JFrame("Home Screen");
        HomeScreen.setVisible(true);
        HomeScreen.setExtendedState(JFrame.MAXIMIZED_BOTH);
        HomeScreen.setLayout(null);
        JFrame Garden = new JFrame("Garden Screen");
        Garden.setExtendedState(JFrame.MAXIMIZED_BOTH);
        Garden.setLayout(null);
        JFrame Kitchen = new JFrame("Kitchen Screen");
        Kitchen.setExtendedState(JFrame.MAXIMIZED_BOTH);
        Kitchen.setLayout(null);
        JFrame RecipeBook = new JFrame("Recipe Book Screen");
        RecipeBook.setLayout(null);
        JFrame Lottery = new JFrame("Lottery Screen");
        Lottery.setExtendedState(JFrame.MAXIMIZED_BOTH);
        Lottery.setLayout(null);
        JFrame Restaurant = new JFrame("Restaurant Screen");
        Restaurant.setExtendedState(JFrame.MAXIMIZED_BOTH);
        Restaurant.setLayout(null);
        
        Garden.setVisible(false);
        Kitchen.setVisible(false);
        RecipeBook.setVisible(false);
        Lottery.setVisible(false);
        Restaurant.setVisible(false);

        JButton GardenButton = new JButton("Garden");
        GardenButton.setBounds(90, 650, 225, 100);
        JButton KitchenButton = new JButton("Kitchen");
        KitchenButton.setBounds(440, 650, 225, 100);
        JButton RecipeBookButton = new JButton("Recipe Book");
        RecipeBookButton.setBounds(790, 650, 225, 100);
        JButton LotteryButton = new JButton("Lottery");
        LotteryButton.setBounds(1140, 650, 225, 100);
        JButton RestaurantButton = new JButton("Restaurant");
        RestaurantButton.setBounds(1490, 650, 225, 100);

        HomeScreen.getContentPane().add(GardenButton);
        HomeScreen.getContentPane().add(KitchenButton);
        HomeScreen.getContentPane().add(RecipeBookButton);
        HomeScreen.getContentPane().add(LotteryButton);
        HomeScreen.getContentPane().add(RestaurantButton);

        GardenButton.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent e) {
                HomeScreen.setVisible(false);
                Garden.setVisible(true);
                Kitchen.setVisible(false);
                RecipeBook.setVisible(false);
                Lottery.setVisible(false);
                Restaurant.setVisible(false);
                Garden.getContentPane().add(GardenButton);
                Garden.getContentPane().add(KitchenButton);
                Garden.getContentPane().add(RecipeBookButton);
                Garden.getContentPane().add(LotteryButton);
                Garden.getContentPane().add(RestaurantButton);
                
            }
        });

        KitchenButton.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent e) {
                HomeScreen.setVisible(false);
                Garden.setVisible(false);
                Kitchen.setVisible(true);
                RecipeBook.setVisible(false);
                Lottery.setVisible(false);
                Restaurant.setVisible(false);
                Kitchen.getContentPane().add(GardenButton);
                Kitchen.getContentPane().add(KitchenButton);
                Kitchen.getContentPane().add(RecipeBookButton);
                Kitchen.getContentPane().add(LotteryButton);
                Kitchen.getContentPane().add(RestaurantButton);

            }
        });

        RecipeBookButton.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent e) {
                HomeScreen.setVisible(false);
                Garden.setVisible(false);
                Kitchen.setVisible(false);
                RecipeBook.setVisible(true);
                Lottery.setVisible(false);
                Restaurant.setVisible(false);
                RecipeBook.getContentPane().add(GardenButton);
                RecipeBook.getContentPane().add(KitchenButton);
                RecipeBook.getContentPane().add(RecipeBookButton);
                RecipeBook.getContentPane().add(LotteryButton);
                RecipeBook.getContentPane().add(RestaurantButton);
                
            }
        });

        LotteryButton.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent e) {
                HomeScreen.setVisible(false);
                Garden.setVisible(false);
                Kitchen.setVisible(false);
                RecipeBook.setVisible(false);
                Lottery.setVisible(true);
                Restaurant.setVisible(false);
                Lottery.getContentPane().add(GardenButton);
                Lottery.getContentPane().add(KitchenButton);
                Lottery.getContentPane().add(RecipeBookButton);
                Lottery.getContentPane().add(LotteryButton);
                Lottery.getContentPane().add(RestaurantButton);
            
            }
        });

        RestaurantButton.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent e) {
                HomeScreen.setVisible(false);
                Garden.setVisible(false);
                Kitchen.setVisible(false);
                RecipeBook.setVisible(false);
                Lottery.setVisible(false);
                Restaurant.setVisible(true);
                Restaurant.getContentPane().add(GardenButton);
                Restaurant.getContentPane().add(KitchenButton);
                Restaurant.getContentPane().add(RecipeBookButton);
                Restaurant.getContentPane().add(LotteryButton);
                Restaurant.getContentPane().add(RestaurantButton);
                
            }
        });

    }
}
