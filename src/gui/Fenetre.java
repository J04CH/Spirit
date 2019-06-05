package gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.Dimension;

import graph.BarGraphs;
import file.StreamDate;

public class Fenetre extends JFrame
{
  public Fenetre(int i, String texte)
  {
    JPanel panel = new JPanel();
    panel.setLayout(null);
    this.add(panel);

    JLabel label = new JLabel(texte);
    label.setSize(new Dimension(290, 20));
    label.setLocation(50, 80);
    panel.add(label);

    this.setTitle("Alerte!");
    this.setSize(400, 200);
    this.setLocationRelativeTo(null);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public Fenetre(String TexteDate)
  {
    JLabel DateIntro = new JLabel("Date: ");
    DateIntro.setBounds(20 ,0 , 300, 50);
    this.add(DateIntro);

    JLabel Date = new JLabel(TexteDate);
    Date.setBounds(80 ,0 , 300, 50);
    this.add(Date);

    JButton TopBouton = new JButton("Top");
    TopBouton.setSize(new Dimension(140, 40));
    TopBouton.setLocation(330, 100);
    this.add(TopBouton);

    JButton MoyenBouton = new JButton("Moyen");
    MoyenBouton.setSize(new Dimension(140, 40));
    MoyenBouton.setLocation(330, 200);
    this.add(MoyenBouton);

    JButton PasSuperBouton = new JButton("Pas Super");
    PasSuperBouton.setSize(new Dimension(140, 40));
    PasSuperBouton.setLocation(330, 300);
    this.add(PasSuperBouton);

    Bouton BoutonTop = new Bouton(TopBouton, "0");
    Bouton BoutonMoyen = new Bouton(MoyenBouton, "1");
    Bouton BoutonPasSuper = new Bouton(PasSuperBouton, "2");

    JPanel panel = new JPanel();
    this.add(panel);

    this.setTitle("États d'âme");
    this.setSize(800, 450);
    this.setLocationRelativeTo(null);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public Fenetre()
  {
    BarGraphs BarGraphs = new BarGraphs();
    BarGraphs.setLayout(null);
    this.add(BarGraphs);

    JButton Month1 = new JButton("Month: " + StreamDate.getText1());
    Month1.setSize(new Dimension(140, 40));
    Month1.setLocation(115, 530);
    BarGraphs.add(Month1);

    JButton Month2 = new JButton("Month: " + StreamDate.getText2());
    Month2.setSize(new Dimension(140, 40));
    Month2.setLocation(425, 530);
    BarGraphs.add(Month2);

    JButton Month3 = new JButton("Month: " + StreamDate.getText3());
    Month3.setSize(new Dimension(140, 40));
    Month3.setLocation(735, 530);
    BarGraphs.add(Month3);

    JLabel Top11 = new JLabel("");
    Top11.setBounds(90, 30, 100, 25);
    BarGraphs.add(Top11);

    JLabel Top21 = new JLabel("");
    Top21.setBounds(177, 30, 100, 25);
    BarGraphs.add(Top21);

    JLabel Top31 = new JLabel("");
    Top31.setBounds(265, 30, 100, 25);
    BarGraphs.add(Top31);

    JLabel Top12 = new JLabel("");
    Top12.setBounds(398, 30, 100, 25);
    BarGraphs.add(Top12);

    JLabel Top22 = new JLabel("");
    Top22.setBounds(485, 30, 100, 25);
    BarGraphs.add(Top22);

    JLabel Top32 = new JLabel("");
    Top32.setBounds(572, 30, 100, 25);
    BarGraphs.add(Top32);

    JLabel Top13 = new JLabel("");
    Top13.setBounds(710, 30, 100, 25);
    BarGraphs.add(Top13);

    JLabel Top23 = new JLabel("");
    Top23.setBounds(797, 30, 100, 25);
    BarGraphs.add(Top23);

    JLabel Top33 = new JLabel("");
    Top33.setBounds(884, 30, 100, 25);
    BarGraphs.add(Top33);

    Bouton BoutonMonth1 = new Bouton(Month1, Top11, Top21, Top31, Top12, Top22, Top32, Top13, Top23, Top33, 0);
    Bouton BoutonMonth2 = new Bouton(Month2, Top12, Top22, Top32, Top11, Top21, Top31, Top13, Top23, Top33, 1);
    Bouton BoutonMonth3 = new Bouton(Month3, Top13, Top23, Top33, Top11, Top21, Top31, Top12, Top22, Top32, 2);

    this.setTitle("Graphes & Statistiques");
    this.setSize(1000, 600);
    this.setVisible(true);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
