import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LoginPage implements ActionListener {

    JFrame loginFrame;
    SpringLayout layout;
    JLabel  usernameLabel ,passwordLabel;
    JTextField usernameField;
    JPasswordField passwordField;
    JButton loginButton;

    public LoginPage() {
        loginFrame = new JFrame("Login Page");
        layout = new SpringLayout();
        loginFrame.setSize(390, 370);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = loginFrame.getContentPane();
        container.setBackground(Color.WHITE);
        container.setLayout(layout);

        JLabel titleLabel = new JLabel("Parking Management");
        titleLabel.setFont(new Font("Serif", Font.BOLD, 24));
        titleLabel.setForeground(Color.RED);
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, titleLabel, 0, SpringLayout.HORIZONTAL_CENTER, container);
        layout.putConstraint(SpringLayout.NORTH, titleLabel, 22, SpringLayout.NORTH, container);
        container.add(titleLabel);

        usernameLabel = new JLabel("Username:");
        layout.putConstraint(SpringLayout.WEST, usernameLabel, 60, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, usernameLabel, 100, SpringLayout.NORTH, container);
        container.add(usernameLabel);
        usernameLabel.setFont(new Font("Serif", Font.BOLD, 16));
        usernameLabel.setForeground(Color.RED);

        usernameField = new JTextField(15);
        layout.putConstraint(SpringLayout.WEST, usernameField, 160, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, usernameField, 100, SpringLayout.NORTH, container);
        container.add(usernameField);

        passwordLabel = new JLabel("Password:");
        layout.putConstraint(SpringLayout.WEST, passwordLabel, 60, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, passwordLabel, 160, SpringLayout.NORTH, container);
        passwordLabel.setFont(new Font("Serif", Font.BOLD, 16));
        passwordLabel.setForeground(Color.RED);
        container.add(passwordLabel);

        passwordField = new JPasswordField(15);
        layout.putConstraint(SpringLayout.WEST, passwordField, 160, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, passwordField, 160, SpringLayout.NORTH, container);
        container.add(passwordField);

        loginButton = new JButton("Login");
        layout.putConstraint(SpringLayout.WEST, loginButton, 150, SpringLayout.WEST, container);
        layout.putConstraint(SpringLayout.NORTH, loginButton, 230, SpringLayout.NORTH, container);
        loginButton.setBorderPainted(false);
        loginButton.setBackground(Color.white);
        loginButton.setForeground(Color.RED);
        loginButton.setFont(new Font("Serif", Font.BOLD, 18));
        container.add(loginButton);

        loginButton.addActionListener(this);

        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - loginFrame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - loginFrame.getHeight()) / 2);
        loginFrame.setLocation(x, y);
        loginFrame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());
        if (username.equals("admin") && password.equals("password")) {
            JOptionPane.showMessageDialog(loginFrame, "Login successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
            loginFrame.dispose();
            new Parking();
        } else {
            JOptionPane.showMessageDialog(loginFrame, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
       LoginPage loginPage= new LoginPage();
    }
}