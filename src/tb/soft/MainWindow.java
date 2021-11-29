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
                    MainWindow frame = new MainWindow();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace(System.err);
                }
            }
        });
    }

    public MainWindow() throws HeadlessException {
        super(title);
        buildFrame();
    }

    protected void buildFrame() {

        setBounds(100, 100, 450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

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
            doClear();
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
                doClear();
            }
        });
        toolBar.add(btnClearButton);

        JPanel contentPane = new JPanel();

        contentPane.setBorder(new EmptyBorder(50, 50, 50, 50));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        MyPanel panel = new MyPanel();
        panel.setBounds(55, 55, 55, 55);
        contentPane.add(panel);

    }


    private void doLogIn(){

    }

    private void doClear(){

    }
}
