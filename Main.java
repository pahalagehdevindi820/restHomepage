import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Restaurant Home Page");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    
        JButton newUserButton = new JButton("New User");
        newUserButton.setBounds(150, 100, 100, 40);

    
        newUserButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new NewUserForm();
            }
        });

        frame.setLayout(null);
        frame.add(newUserButton);
        frame.setVisible(true);
    }
}