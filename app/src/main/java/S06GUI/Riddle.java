package S06GUI;

// Arvan Kadkol, Riddle

// Lee Alex. "Java GUI Tutorial - Make a GUI in 13 Minutes #99." YouTube, uploaded by Alex Lee, 6 Febuary 2020, https://www.youtube.com/watch?v=5o3fMLPY7qY&t=17s

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Riddle implements ActionListener {

    int count = 0;
    JLabel label;
    JPanel panel;
    JButton button;
    JFrame frame;
    String answer = "Mayonnaise";
    String riddle = "I have a horse named mayo, what does mayo do?";

    @Override
    public void actionPerformed(ActionEvent e) {
        // Changed update to set the text to show the answer instead of a counter
        label.setText(answer);
    }

    public Riddle() {

        frame = new JFrame();

        // Chnaged name of the button to better show what it is doing
        button = new JButton("Show Answer");

        button.addActionListener(this);

        panel = new JPanel();

        // Chnage to show the riddle instead of a counter
        label = new JLabel(riddle);

        // changed the size from 30, 30, 10 ,10 so that the entire riddle can be seen
        // without resizing
        panel.setBorder(BorderFactory.createEmptyBorder(200, 200, 100, 100));
        panel.setLayout(new GridLayout(0, 1));

        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Chanegd title to better show whats being done
        frame.setTitle("Riddle");
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new Riddle();
    }

}
