package JFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame {
    JLabel name = new JLabel("Введите имя");
    JTextField name_field = new JTextField();

    public void setBounds() {
        super.setBounds(200, 200, 250,100);

    }
}
