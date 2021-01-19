import javax.swing.*;
import java.awt.event.*; // this enables the events
import java.awt.*;

public class Main
{
  public static void main(String args[])
  {
    JFrame frame1 = new JFrame("This is a JFrame");
    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // YOU MUST HAVE THIS LINE
    frame1.setSize(500, 500);
    frame1.setVisible(true);

    // ------------ Panel to hold the buttons --------------
    JPanel panel1 = new JPanel(new GridLayout(2, 2, 20, 20));

    // --------------------- Button 1 ---------------------
    JButton button1 = new JButton("Click me!");

    button1.addActionListener(new ActionListener()
    {
      public void actionPerformed (ActionEvent e)
      {
        System.out.println("Yay! You clicked the button");
      } // end the block of what the button will do
    }); // end the ActionListner

    // -------------------- Button 2 --------------------
    JButton button2 = new JButton("No, click me");
    button2.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        System.out.println("Thanks, pal!");
      }
    });

    // ------------------- Label 1 ---------------------
    JLabel label1 = new JLabel("Count the ducks");

    panel1.add(button1);
    panel1.add(button2);
    panel1.add(label1);

    frame1.getContentPane().add(panel1);
  } // end main method
} // end class Main