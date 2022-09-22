<<<<<<< HEAD
package TicTacToe;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Game implements ActionListener {
    public static JButton[] button = new JButton[9];

    Random random = new Random();
    public JFrame frame;
    public TextField text;
    boolean player;

    public void TicTac() {
        frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(420, 420);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.black);


        text = new TextField();
        text.setPreferredSize(new Dimension(300, 100));
        text.setFont(new Font(null, Font.ITALIC, 50));


        JPanel top;
        frame.add(top = new JPanel(), BorderLayout.NORTH);
        top.add(text);


        JPanel board = new JPanel();
        frame.add(board);
        board.setLayout(new GridLayout(3, 3));

        for (int i = 0; i < 9; i++) {
            button[i] = new JButton();

            board.setLayout(new GridLayout(3, 3));
            board.add(button[i]);

            button[i].addActionListener(this);
            button[i].setFont(new Font(null, Font.ITALIC, 50));

        }

    }
        public void player() {


        }


        public void check() {

            if (button[0].getText().equals("x") &&
                    button[1].getText().equals("x") &&
                    button[2].getText().equals("x")) {
                text.setText("Player X wins");
            }
            if (button[3].getText().equals("x") && button[4].getText().equals("x")) {
                button[5].getText().equals("x");
                text.setText("Player X wins");
            }
            if (button[6].getText().equals("x") &&
                    button[7].getText().equals("x") &&
                    button[8].getText().equals("x")) {
                text.setText("Player X wins");
            }
            if (button[0].getText().equals("x") &&
                    button[4].getText().equals("x") &&
                    button[8].getText().equals("x")) {
                text.setText("Player X wins");
            }
            if (button[2].getText().equals("x") &&
                    button[4].getText().equals("x") &&
                    button[6].getText().equals("x")) {
                text.setText("Player X wins");

            }

            if (button[0].getText().equals("o") &&
                    button[1].getText().equals("o") &&
                    button[2].getText().equals("o")) {
                text.setText("Player O wins");
            }
            if (button[3].getText().equals("o") &&
                    button[4].getText().equals("o") &&
                    button[5].getText().equals("o")) {
                text.setText("Player O wins");
            }
            if (button[6].getText().equals("o") &&
                    button[7].getText().equals("o") &&
                    button[8].getText().equals("o")) {
                text.setText("Player O wins");
            }

                if (button[0].getText().equals("o") &&
                        button[4].getText().equals("o") &&
                        button[8].getText().equals("o")) {
                    text.setText("Player O wins");
                }

               if (button[2].getText().equals("o") &&
                        button[4].getText().equals("o") &&
                        button[6].getText().equals("o")) {
                    text.setText("Player O wins");
                }
            }



    public static void main(String[] args) {
        Game g = new Game();
        g.TicTac();

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < 9; i++) {
            if (e.getSource() == button[i]) {
                if (player) {
                    if (button[i].getText() == ("")) {
                        button[i].setText("x");
                        player = false;
                        check();
                    }
                } else {
                    if (button[i].getText()== ("")) {
                        button[i].setText("o");
                        player = true;
                        check();
                    }




                    }

                }
            }

        }

    }



























































=======
package TicTacToe;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Game implements ActionListener {
    public static JButton[] button = new JButton[9];

    Random random = new Random();
    public JFrame frame;
    public TextField text;
    boolean player;

    public void TicTac() {
        frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(420, 420);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.black);


        text = new TextField();
        text.setPreferredSize(new Dimension(300, 100));
        text.setFont(new Font(null, Font.ITALIC, 50));


        JPanel top;
        frame.add(top = new JPanel(), BorderLayout.NORTH);
        top.add(text);


        JPanel board = new JPanel();
        frame.add(board);
        board.setLayout(new GridLayout(3, 3));

        for (int i = 0; i < 9; i++) {
            button[i] = new JButton();

            board.setLayout(new GridLayout(3, 3));
            board.add(button[i]);

            button[i].addActionListener(this);
            button[i].setFont(new Font(null, Font.ITALIC, 50));

        }

    }
        public void player() {


        }


        public void check() {

            if (button[0].getText().equals("x") &&
                    button[1].getText().equals("x") &&
                    button[2].getText().equals("x")) {
                text.setText("Player X wins");
            }
            if (button[3].getText().equals("x") && button[4].getText().equals("x")) {
                button[5].getText().equals("x");
                text.setText("Player X wins");
            }
            if (button[6].getText().equals("x") &&
                    button[7].getText().equals("x") &&
                    button[8].getText().equals("x")) {
                text.setText("Player X wins");
            }
            if (button[0].getText().equals("x") &&
                    button[4].getText().equals("x") &&
                    button[8].getText().equals("x")) {
                text.setText("Player X wins");
            }
            if (button[2].getText().equals("x") &&
                    button[4].getText().equals("x") &&
                    button[6].getText().equals("x")) {
                text.setText("Player X wins");

            }

            if (button[0].getText().equals("o") &&
                    button[1].getText().equals("o") &&
                    button[2].getText().equals("o")) {
                text.setText("Player O wins");
            }
            if (button[3].getText().equals("o") &&
                    button[4].getText().equals("o") &&
                    button[5].getText().equals("o")) {
                text.setText("Player O wins");
            }
            if (button[6].getText().equals("o") &&
                    button[7].getText().equals("o") &&
                    button[8].getText().equals("o")) {
                text.setText("Player O wins");
            }

                if (button[0].getText().equals("o") &&
                        button[4].getText().equals("o") &&
                        button[8].getText().equals("o")) {
                    text.setText("Player O wins");
                }

               if (button[2].getText().equals("o") &&
                        button[4].getText().equals("o") &&
                        button[6].getText().equals("o")) {
                    text.setText("Player O wins");
                }
            }



    public static void main(String[] args) {
        Game g = new Game();
        g.TicTac();

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < 9; i++) {
            if (e.getSource() == button[i]) {
                if (player) {
                    if (button[i].getText() == ("")) {
                        button[i].setText("x");
                        player = false;
                        check();
                    }
                } else {
                    if (button[i].getText()== ("")) {
                        button[i].setText("o");
                        player = true;
                        check();
                    }




                    }

                }
            }

        }

    }



























































>>>>>>> 2c35fd6ac5307c9588f682ec08f769491c7a9d6b
