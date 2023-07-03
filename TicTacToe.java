import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class TicTacToe implements ActionListener{
  
  Random random = new Random();
  JFrame frame = new JFrame();
  JPanel titlePanel = new JPanel();
  JPanel buttonPanel = new JPanel();
  JLabel textField = new JLabel();
  JButton[] buttons = new JButton[9];
  boolean player1Turn;

  TicTacToe(){

    /* Window */
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(800, 800);
    frame.getContentPane().setBackground(new Color(50, 50, 50));
    frame.setLayout(new BorderLayout());
    frame.setVisible(true);

    /* Title part */
    textField.setBackground(new Color(30, 30 , 30));
    textField.setForeground(new Color(25, 120, 255));
    textField.setFont(new Font("Verdana", Font.BOLD, 75));
    textField.setHorizontalAlignment(JLabel.CENTER);
    textField.setText("Tic-Tac-Toe");
    textField.setOpaque(true);

    /* First case : Title */
    titlePanel.setLayout(new BorderLayout());
    titlePanel.setBounds(0, 0, 800, 100);

    /* Second case : The game */
    buttonPanel.setLayout(new GridLayout(3, 3));
    buttonPanel.setBackground(new Color(150, 150, 150));
    
    for(int i = 0; i < 9; i++){
      buttons[i] = new JButton();
      buttonPanel.add(buttons[i]);
      buttons[i].setFont(new Font("Verdana", Font.BOLD, 120));
      buttons[i].setFocusable(false);
      buttons[i].addActionListener(this);
    }

    /* Imbrication */
    titlePanel.add(textField);
    frame.add(titlePanel, BorderLayout.NORTH);

    frame.add(buttonPanel);

  }

  @Override
  public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
  }

  public void firstTurn() {

  }

  public void check() {

  }

  public void xWins(int a, int b, int c){

  }

  public void oWins(int a, int b, int c){
    
  }
}
