package tb.soft;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class MyPanel extends JPanel{
    private final JLabel lblCoords;

    public MyPanel() {
        setBorder(new LineBorder(new Color(0, 0, 0), 1, false));
        setBackground(Color.ORANGE);
        setLayout(null);

        lblCoords = new JLabel("x, y");
        lblCoords.setBounds(10, 10, 60, 15);
        add(lblCoords);
    }
}
