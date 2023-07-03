import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class TicTacToe implements ActionListener{
  
  Random random = new Random();
  JFrame frame = new JFrame();
  JPanel title_Panel = new JPanel();
  JPanel button_panel = new JPanel();
  JLabel textfield = new JLabel();
  JButton[] buttons = new JButton[9];
  boolean player1_turn;

  TicTacToe(){

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

  public void xWins(int , int b, int c){

  }

  public void oWins(int , int b, int c){
    
  }
}
