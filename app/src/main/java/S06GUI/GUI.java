package S06GUI;

// Arvan Kadkol

// Lee Alex. "Java GUI Tutorial - Make a GUI in 13 Minutes #99." YouTube, uploaded by Alex Lee, 6 Febuary 2020, https://www.youtube.com/watch?v=5o3fMLPY7qY&t=17s

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    int count = 0;
    JLabel label;
    JPanel panel;
    JButton button;
    JFrame frame;

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks: " + count);
    }

    public GUI() {

        frame = new JFrame();

        button = new JButton("Click Me");

        button.addActionListener(this);

        panel = new JPanel();
        label = new JLabel("Number of clicks: 0");

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 10));
        panel.setLayout(new GridLayout(0, 1));

        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI");
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new GUI();
    }

}
