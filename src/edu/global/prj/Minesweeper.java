package edu.global.prj;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Minesweeper extends JFrame {
    private JButton[][] buttons;
    private int[][] mines;
    private int size = 10;
    private int numOfMines = 10;

    public Minesweeper() {
        setTitle("Minesweeper");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buttons = new JButton[size][size];
        mines = new int[size][size];

        setLayout(new GridLayout(size, size));

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].addActionListener(new ButtonClickListener(i, j));
                add(buttons[i][j]);
            }
        }

        setSize(500, 500);
        setVisible(true);
    }

    private void initGame() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                buttons[i][j].setText("");
                buttons[i][j].setEnabled(true);
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                mines[i][j] = 0;
            }
        }

        int count = 0;
        while (count < numOfMines) {
            int x = (int) (Math.random() * size);
            int y = (int) (Math.random() * size);
            if (mines[x][y] != -1) {
                mines[x][y] = -1;
                count++;
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (mines[i][j] != -1) {
                    mines[i][j] = countMines(i, j);
                }
            }
        }
    }

    private int countMines(int x, int y) {
        int count = 0;
        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                if (i >= 0 && i < size && j >= 0 && j < size && mines[i][j] == -1) {
                    count++;
                }
            }
        }
        return count;
    }

    private class ButtonClickListener implements ActionListener {
        private int x;
        private int y;

        public ButtonClickListener(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void actionPerformed(ActionEvent e) {
            if (mines[x][y] == -1) {
                buttons[x][y].setText("Mine");
                showAllMines();
                JOptionPane.showMessageDialog(null, "Game Over!");
                initGame();
            } else if (mines[x][y] == 0) {
                openAdjacentButtons(x, y);
            } else {
                buttons[x][y].setText(Integer.toString(mines[x][y]));
                buttons[x][y].setEnabled(false);
            }
        }
    }

    private void openAdjacentButtons(int x, int y) {
        if (x >= 0 && x < size && y >= 0 && y < size &&buttons[x][y].isEnabled()) {
            buttons[x][y].setEnabled(false);
            buttons[x][y].setText(Integer.toString(mines[x][y]));

            if (mines[x][y] == 0) {
                openAdjacentButtons(x - 1, y - 1);
                openAdjacentButtons(x - 1, y);
                openAdjacentButtons(x - 1, y + 1);
                openAdjacentButtons(x, y - 1);
                openAdjacentButtons(x, y + 1);
                openAdjacentButtons(x + 1, y - 1);
                openAdjacentButtons(x + 1, y);
                openAdjacentButtons(x + 1, y + 1);
            }
        }
    }

    private void showAllMines() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (mines[i][j] == -1) {
                    buttons[i][j].setText("Mine");
                    buttons[i][j].setEnabled(false);
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Minesweeper().initGame();
            }
        });
    }
}

