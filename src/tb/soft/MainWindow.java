package tb.soft;


import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.net.URL;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MainWindow extends JFrame {
    private static final String title = "Log in Window";

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    JPanel panel = new JPanel();
                    MainWindow frame = new MainWindow(panel);
                    frame.add(panel);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace(System.err);
                }
            }
        });
    }

    public MainWindow(JPanel panel) throws HeadlessException {
        super(title);
        buildFrame(panel);
    }

    protected void buildFrame(JPanel panel) {

        setBounds(100, 100, 285, 210);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.setLayout(null);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JLabel jlUser = new JLabel("User:");
        jlUser.setBounds(10, 10, 80, 25);
        panel.add(jlUser);

        JTextField jtUser = new JTextField(20);
        jtUser.setBounds(100, 10, 160, 25);
        panel.add(jtUser);

        JLabel jlPassword = new JLabel("Password:");
        jlPassword.setBounds(10, 40, 80, 25);
        panel.add(jlPassword);

        JPasswordField jpfPassword = new JPasswordField(20);
        jpfPassword.setBounds(100, 40, 160, 25);
        panel.add(jpfPassword);

        JButton jbLogIn = new JButton("Log in");
        jbLogIn.setBounds(10, 80, 80, 25);
        panel.add(jbLogIn);
        jbLogIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                doLogIn();
            }
        });

        JButton jbClear = new JButton("Clear");
        jbClear.setBounds(180, 80, 80, 25);
        panel.add(jbClear);
        jbClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                doClear(jtUser, jpfPassword);
            }
        });

        JMenu mnMenu = new JMenu("Menu");
        menuBar.add(mnMenu);
        mnMenu.setMnemonic(KeyEvent.VK_M);

        JMenuItem mnitLogIn = new JMenuItem("Log in");
        mnitLogIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                doLogIn();
            }
        });
        mnitLogIn.setMnemonic(KeyEvent.VK_L);
        mnMenu.add(mnitLogIn);

        JMenuItem mnitClear = new JMenuItem("Clear");
        mnitClear.addActionListener(e -> {
            doClear(jtUser, jpfPassword);
        });
        mnitClear.setMnemonic(KeyEvent.VK_C);
        mnMenu.add(mnitClear);

        JToolBar toolBar = new JToolBar();
        getContentPane().add(toolBar, BorderLayout.NORTH);

        JButton btnLogInButton = new JButton("Log In");
        btnLogInButton.setMnemonic(KeyEvent.VK_L);
        btnLogInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                doLogIn();
            }
        });
        toolBar.add(btnLogInButton);

        JButton btnClearButton = new JButton("Clear");
        btnClearButton.setMnemonic(KeyEvent.VK_C);
        btnClearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                doClear(jtUser, jpfPassword);
            }
        });
        toolBar.add(btnClearButton);

    }


    private void doLogIn(){

    }

    private void doClear(JTextField jtUser, JPasswordField jpfPassword){
        jtUser.setText("");
        jpfPassword.setText("");
    }
}
