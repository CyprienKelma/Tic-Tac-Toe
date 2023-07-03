import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

import java.awt.event.ActionListener;
import javax.swing.Timer;

public class TicTacToe implements ActionListener {

  Random random = new Random();
  JFrame frame = new JFrame();
  JPanel titlePanel = new JPanel();
  JPanel buttonPanel = new JPanel();
  JLabel textField = new JLabel();
  JButton[] buttons = new JButton[9];
  boolean player1Turn;
  boolean XlastWinner;

  TicTacToe() { /* Constructor of the game */

    /* Window */
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(800, 800);
    frame.getContentPane().setBackground(new Color(50, 50, 50));
    frame.setLayout(new BorderLayout());
    frame.setVisible(true);

    /* Title part */
    textField.setBackground(new Color(30, 30, 30));
    textField.setForeground(new Color(25, 120, 255));
    textField.setFont(new Font("Verdana", Font.BOLD, 75));
    textField.setHorizontalAlignment(JLabel.CENTER);
    textField.setText("Tic-Tac-Toe");
    textField.setOpaque(true);

    /* First case (JPanel) : Title */
    titlePanel.setLayout(new BorderLayout());
    titlePanel.setBounds(0, 0, 800, 100);

    /* Second case (JPanel) : The game */
    buttonPanel.setLayout(new GridLayout(3, 3));
    buttonPanel.setBackground(new Color(150, 150, 150));

    for (int i = 0; i < 9; i++) {
      buttons[i] = new JButton();
      buttonPanel.add(buttons[i]);
      buttons[i].setFont(new Font("Verdana", Font.BOLD, 120));
      buttons[i].setFocusable(false);
      buttons[i].addActionListener(this);
    }

    /* Global Imbrication */
    titlePanel.add(textField);
    frame.add(titlePanel, BorderLayout.NORTH);

    frame.add(buttonPanel);

    firstTurn();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    for (int i = 0; i < 9; i++) {
      if (e.getSource() == buttons[i]) {
        if (player1Turn) {
          if (buttons[i].getText().equals("")) {
            buttons[i].setForeground(new Color(255, 0, 0));
            buttons[i].setText("X");
            player1Turn = false;
            textField.setText("O Turn");
            check();
          }
        } else {
          if (buttons[i].getText().equals("")) {
            buttons[i].setForeground(new Color(0, 255, 0));
            buttons[i].setText("O");
            player1Turn = true;
            textField.setText("X Turn");
            check();
          }
        }
      }
    }
  }

  public void firstTurn() {

    try {
      Thread.sleep(1500);
    } catch (InterruptedException e) {
      e.printStackTrace();
      Thread.currentThread().interrupt();
    }

    if (random.nextInt(2) == 0) {
      player1Turn = true;
      textField.setText("X Turn");
    } else {
      player1Turn = false;
      textField.setText("O Turn");
    }
  }

  public void nextTurns(){

    // try {
    //   Thread.sleep(4000);
    // } catch (InterruptedException e) {
    //   e.printStackTrace();
    //   Thread.currentThread().interrupt();
    // }


    for(int i = 0; i < 9; i++){
      buttons[i].setText("");
      buttons[i].setBackground(Color.WHITE);
    }
    if(XlastWinner){
      player1Turn = false;
      textField.setText("O Turn");
    } else {
      player1Turn = true;
      textField.setText("X turn");
    }
  }

  public void check() {
    /* For X */

    /* Rows */
    if (buttons[0].getText().equals("X") &&
        buttons[1].getText().equals("X") &&
        buttons[2].getText().equals("X")) {
      xWins(0, 1, 2);
    }
    if (buttons[3].getText().equals("X") &&
        buttons[4].getText().equals("X") &&
        buttons[5].getText().equals("X")) {
      xWins(3, 4, 5);
    }
    if (buttons[6].getText().equals("X") &&
        buttons[7].getText().equals("X") &&
        buttons[8].getText().equals("X")) {
      xWins(6, 7, 8);
    }
    /* Columns */
    if (buttons[0].getText().equals("X") &&
        buttons[3].getText().equals("X") &&
        buttons[6].getText().equals("X")) {
      xWins(0, 3, 6);
    }
    if (buttons[1].getText().equals("X") &&
        buttons[4].getText().equals("X") &&
        buttons[7].getText().equals("X")) {
      xWins(1, 4, 7);
    }
    if (buttons[2].getText().equals("X") &&
        buttons[5].getText().equals("X") &&
        buttons[8].getText().equals("X")) {
      xWins(2, 5, 8);
    }
    /* Diagonals */
    if (buttons[0].getText().equals("X") &&
        buttons[4].getText().equals("X") &&
        buttons[8].getText().equals("X")) {
      xWins(0, 4, 8);
    }
    if (buttons[2].getText().equals("X") &&
        buttons[4].getText().equals("X") &&
        buttons[6].getText().equals("X")) {
      xWins(2, 4, 6);
    }

    /* For 0 */

    /* Rows */
    if (buttons[0].getText().equals("O") &&
        buttons[1].getText().equals("O") &&
        buttons[2].getText().equals("O")) {
      oWins(0, 1, 2);
    }
    if (buttons[3].getText().equals("O") &&
        buttons[4].getText().equals("O") &&
        buttons[5].getText().equals("O")) {
      oWins(3, 4, 5);
    }
    if (buttons[6].getText().equals("O") &&
        buttons[7].getText().equals("O") &&
        buttons[8].getText().equals("O")) {
      oWins(6, 7, 8);
    }
    /* Columns */
    if (buttons[0].getText().equals("O") &&
        buttons[3].getText().equals("O") &&
        buttons[6].getText().equals("O")) {
      oWins(0, 3, 6);
    }
    if (buttons[1].getText().equals("O") &&
        buttons[4].getText().equals("O") &&
        buttons[7].getText().equals("O")) {
      oWins(1, 4, 7);
    }
    if (buttons[2].getText().equals("O") &&
        buttons[5].getText().equals("O") &&
        buttons[8].getText().equals("O")) {
      oWins(2, 5, 8);
    }
    /* Diagonals */
    if (buttons[0].getText().equals("O") &&
        buttons[4].getText().equals("O") &&
        buttons[8].getText().equals("O")) {
      oWins(0, 4, 8);
    }
    if (buttons[2].getText().equals("O") &&
        buttons[4].getText().equals("O") &&
        buttons[6].getText().equals("O")) {
      oWins(2, 4, 6);
    }
  }

  public void xWins(int a, int b, int c) {
    buttons[a].setBackground(Color.YELLOW);
    buttons[b].setBackground(Color.YELLOW);
    buttons[c].setBackground(Color.YELLOW);
    textField.setText("The X Player Wins");

    Timer timer = new Timer(3500, new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
          XlastWinner = false;
          nextTurns();
      }
    });
    timer.setRepeats(false); // S'assure que le timer ne se répète pas
    timer.start();
  }

  public void oWins(int a, int b, int c) {
    buttons[a].setBackground(Color.YELLOW);
    buttons[b].setBackground(Color.YELLOW);
    buttons[c].setBackground(Color.YELLOW);
    textField.setText("The O Player Wins");

    Timer timer = new Timer(3500, new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
          XlastWinner = false;
          nextTurns();
      }
    });
    timer.setRepeats(false); // S'assure que le timer ne se répète pas
    timer.start();
  }
}
