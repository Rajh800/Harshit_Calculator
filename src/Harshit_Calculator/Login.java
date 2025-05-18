package Harshit_Calculator;

import javax.swing.*;

public class Login extends JFrame {
    private JTextField jtUser;
    private JPasswordField jtPass;
    private JCheckBox jtShow;
    private JButton jtLogin, jtExit;

    public Login() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Harshit Calculator Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null); // Manual layout
        setSize(500, 400);
        setLocationRelativeTo(null);

        JLabel jLabel1 = new JLabel("HARSHIT CALCULATOR LOGIN PAGE");
        jLabel1.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 18));
        jLabel1.setBounds(50, 20, 400, 30);
        add(jLabel1);

        JLabel jLabel3 = new JLabel("USER NAME");
        jLabel3.setBounds(50, 130, 80, 30);
        add(jLabel3);

        jtUser = new JTextField();
        jtUser.setBounds(190, 130, 230, 25);
        add(jtUser);

        JLabel jLabel2 = new JLabel("PASSWORD");
        jLabel2.setBounds(50, 190, 80, 30);
        add(jLabel2);

        jtPass = new JPasswordField();
        jtPass.setBounds(190, 190, 230, 25);
        add(jtPass);

        jtShow = new JCheckBox("Show Password");
        jtShow.setBounds(310, 230, 130, 25);
        jtShow.addActionListener(e -> {
            if (jtShow.isSelected()) {
                jtPass.setEchoChar((char) 0);
            } else {
                jtPass.setEchoChar('*');
            }
        });
        add(jtShow);

        jtLogin = new JButton("Login");
        jtLogin.setBounds(340, 270, 80, 30);
        jtLogin.addActionListener(e -> onLogin());
        add(jtLogin);

        jtExit = new JButton("EXIT");
        jtExit.setBounds(240, 270, 80, 30);
        jtExit.addActionListener(e -> System.exit(0));
        add(jtExit);
    }

    private void onLogin() {
        String username = jtUser.getText();
        String password = new String(jtPass.getPassword());

        if (username.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill out username");
        } else if (password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill out password");
        } else if (username.equals("Harshit") && password.equals("12345678")) {
            JOptionPane.showMessageDialog(this, "Login Successful");
            new Calculator().setVisible(true); // Opens placeholder Calculator
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Wrong username or password !!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
    try {
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
    } catch (Exception e) {
        e.printStackTrace();
    }

    SwingUtilities.invokeLater(() -> {
        Login login = new Login();
        login.setVisible(true);
    });


    }
}

