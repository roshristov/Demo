package com.csc.myworkday;

import javax.swing.JFrame;

public class Main extends JFrame {
  public static void main(String[] args) {
    System.out.println("hello, world!");
    Main mainFrame = new Main();
    //test
    mainFrame.setBounds(100,100,600,300);
    
    mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    mainFrame.setVisible(true);
    
  }
}
