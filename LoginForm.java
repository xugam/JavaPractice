import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm extends JFrame implements ActionListener {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginForm() {
        // Set up the frame
        setTitle("Login Form");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create components
        usernameField = new JTextField(20);
        passwordField = new JPasswordField(20);
        loginButton = new JButton("Login"); 

        // Set layout manager
        setLayout(new GridLayout(3, 2));

        // Add components to the frame
        add(new JLabel("Username:"));
        add(usernameField);
        add(new JLabel("Password:"));
        add(passwordField);
        add(new JLabel()); // Empty label for spacing
        add(loginButton);

        // Add ActionListener to the login button
        loginButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String username = usernameField.getText();
            char[] password = passwordField.getPassword();
            // Add your login authentication logic here
            // For simplicity, let's just display a message
            JOptionPane.showMessageDialog(this, "Login successful for user: " + username);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LoginForm loginForm = new LoginForm();
            loginForm.setVisible(true);
        });
    }
}