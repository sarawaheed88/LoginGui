import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class LoginGUI {
    private final String ADMIN_USERNAME = "admin";
    private final String ADMIN_PASSWORD = "1234";
    private final String USER_USERNAME = "user";
    private final String USER_PASSWORD = "5678";

    public void showLogin() {
        JFrame frame = new JFrame("Login Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        frame.setVisible(true);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(10, 80, 80, 25);
        panel.add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                String password = new String(passwordText.getPassword());

//                if (ADMIN_USERNAME.equals(username) && ADMIN_PASSWORD.equals(password)) {
//                    JOptionPane.showMessageDialog(null, "Welcome Admin!");
//                    new StudentManagementGUI(true).showGUI();
//                } else if (USER_USERNAME.equals(username) && USER_PASSWORD.equals(password)) {
//                    JOptionPane.showMessageDialog(null, "Welcome User!");
//                    new StudentManagementGUI(false).showGUI();
//                } else {
//                    JOptionPane.showMessageDialog(null, "Invalid Credentials!");
//                }
            }
        });
    }
}
