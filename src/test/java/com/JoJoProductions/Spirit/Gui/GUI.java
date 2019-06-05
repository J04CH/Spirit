package com.JoJoProductions.Spirit.Gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import org.junit.Test;

public class GUI
{
  @Test
  public void makeWindow()
  {
    JFrame frame = new JFrame();

    JPanel panel1 = new JPanel();
    panel1.setLayout(null);
    frame.add(panel1);

    JPanel panel2 = new JPanel();
    panel2.setLayout(null);
    frame.add(panel2);

    JPanel panel3 = new JPanel();
    panel3.setLayout(null);
    frame.add(panel3);

    JTabbedPane tabs = new JTabbedPane();
    tabs.setBounds(0,0, 400, 400);
    tabs.add("N1",panel1);
    tabs.add("N2",panel2);
    tabs.add("N3",panel3);

    frame.add(tabs);
    frame.setSize(400,400);
    frame.setLayout(null);
    frame.setVisible(true);
  }
}
