package S07Game;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

// Programmer: Arvan Kadkol

// Java tic tac toe game ⭕ (2020) by Bro Code on YouTube. Available at: https://www.youtube.com/watch?v=rA7tfvpkw0I (Accessed: 19 May 2025). 

public class TicTacToe implements ActionListener {

    Random random = new Random();

    JFrame frame = new JFrame();

    JPanel titlePanel = new JPanel();

    JPanel buttonPanel = new JPanel();

    JLabel textFeild = new JLabel();

    JButton[] buttons = new JButton[9];

    Shape currentTurn;

    public enum Shape {
        O(Color.blue),
        X(Color.red);

        public Color color;

        Shape(Color color) {
            this.color = color;
        }
    }

    public TicTacToe() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.getContentPane().setBackground(new Color(50, 50, 50));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        textFeild.setBackground(new Color(25, 25, 25));
        textFeild.setForeground(new Color(25, 255, 0));
        textFeild.setFont(new Font("Ink Free", Font.BOLD, 75));
        textFeild.setHorizontalAlignment(JLabel.CENTER);
        textFeild.setText("Tic Tac Toe");
        textFeild.setOpaque(true);

        titlePanel.setLayout(new BorderLayout());
        titlePanel.setBounds(0, 0, 800, 100);

        buttonPanel.setLayout(new GridLayout(3, 3));
        buttonPanel.setBackground(new Color(150, 150, 150));

        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            buttons[i].setFont(new Font("Ink Free", Font.BOLD, 125));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
            buttonPanel.add(buttons[i]);
        }

        titlePanel.add(textFeild);

        frame.add(titlePanel, BorderLayout.NORTH);
        frame.add(buttonPanel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // Pressing a square will place your shape in the square if its open and your
        // turn
        for (int i = 0; i < 9; i++) {
            if (e.getSource() == buttons[i]) {
                if (buttons[i].getText() == "") {
                    buttons[i].setForeground(currentTurn.color);
                    buttons[i].setText(currentTurn.toString());
                    check();
                }

            }
        }
    }

    public void start() {

        try {
            Thread.sleep(2000);
            if (random.nextInt(2) == 0) {
                currentTurn = Shape.O;
            } else {
                currentTurn = Shape.X;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public boolean inARow(int a, int b, int c) {
        return buttons[a].getText() == buttons[b].getText() && buttons[b].getText() == buttons[c].getText()
                && buttons[a].getText() != "";
    }

    public void check() {

        for (int i = 0; i <= 6; i += 3) {
            if (wins(i, i + 1, i + 2)) {
                return;
            }

        }

        for (int i = 0; i < 3; i++) {
            if (wins(i, i + 3, i + 6)) {
                return;
            }
        }

        if (wins(0, 4, 8)) {
            return;
        }

        if (wins(2, 4, 6)) {
            return;
        }

        if (currentTurn == Shape.O) {
            currentTurn = Shape.X;
            textFeild.setText("Player X's turn");
        } else {
            currentTurn = Shape.O;
            textFeild.setText("Player O's turn");
        }

    }

    public boolean wins(int a, int b, int c) {
        if (!inARow(a, b, c)) {
            return false;
        }
        buttons[a].setBackground(Color.green);
        buttons[b].setBackground(Color.green);
        buttons[c].setBackground(Color.green);

        for (JButton button : buttons) {
            if (button.getBackground().equals(Color.green)) {
                continue;
            }
            button.setEnabled(false);
        }

        textFeild.setText("Player " + currentTurn + " Won!");
        return true;
    }

}
