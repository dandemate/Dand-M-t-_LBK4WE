/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat_5;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

/**
 *
 * @author dande
 */
public class Szamologep extends JFrame{
     JTextField t;
    JButton ures;
    JButton Backspace;
    JButton CE;
    JButton C;
    JButton MC;
    JButton MR;
    JButton MS;
    JButton Mplusz;
    JButton szam0;
    JButton szam1;
    JButton szam2;
    JButton szam3;
    JButton szam4;
    JButton szam5;
    JButton szam6;
    JButton szam7;
    JButton szam8;
    JButton szam9;
    JButton btizedes;
    JButton bpnvalto;
    JButton bosztas;
    JButton bszorzas;
    JButton bkivon;
    JButton bosszead;
    JButton bgyok;
    JButton bszazalek;
    JButton btortresz;
    JButton begyenlo;
    
    JPanel p1;
    JPanel p2;
    JPanel p3;

    public Szamologep() {
        super("Számológép");
        t= new JTextField(25);
        ures= new JButton("");
        Backspace= new JButton("Backspace");
         CE = new JButton("CE");
        C=new JButton("C");
         MC=new JButton("MC");
         MR=new JButton("MR");
         MS=new JButton("MS");
        Mplusz=new JButton("M+");
         szam0=new JButton("0");
         szam1=new JButton("1");
         szam2=new JButton("2");
         szam3=new JButton("3");
         szam4=new JButton("4");
         szam5=new JButton("5");
        szam6=new JButton("6");
        szam7=new JButton("7");
        szam8=new JButton("8");
        szam9=new JButton("9");
        btizedes=new JButton(".");
        bpnvalto=new JButton("+/-");
       bosztas=new JButton("/");
        bszorzas=new JButton("*");
        bkivon=new JButton("-");
        bosszead=new JButton("+");
        bgyok=new JButton("sqrt");
        bszazalek=new JButton("%");
        btortresz=new JButton("1/x");
        begyenlo=new JButton("=");
        p1=new JPanel();
        p2=new JPanel();
        p3=new JPanel();
        t.setEditable(false);
        
        GridLayout gralap = new GridLayout(3,1);
        setLayout(gralap);
        
        GridLayout gr1 = new GridLayout(1,1);
        p1.setLayout(gr1);
        GridLayout gr2 = new GridLayout(1,4);
        p2.setLayout(gr2);
        GridLayout gr3 = new GridLayout(4,6);
        p3.setLayout(gr3);
        
        p1.add(t);
        p2.add(ures);
        p2.add(Backspace);
        p2.add(CE);
        p2.add(C);
       p3.add(MC);
    p3.add(szam7);
    p3.add(szam8);
    p3.add(szam9);
    p3.add(bosztas);
    p3.add(bgyok);
    p3.add(MR);
    p3.add(szam4);
    p3.add(szam5);
    p3.add(szam6);
    p3.add(bszorzas);
    p3.add(bszazalek);
    p3.add(MS);
    p3.add(szam1);
    p3.add(szam2);
    p3.add(szam3);
    p3.add(bkivon);
    p3.add(btortresz);
    p3.add(Mplusz);
    p3.add(szam0);
    p3.add(bpnvalto);
    p3.add(btizedes);
    p3.add(bosszead);
    p3.add(begyenlo);
    add(p1);
    add(p2);
    add(p3);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    pack();    
    szam0.addActionListener(new ActionListener()
    {
            @Override
            public void actionPerformed(ActionEvent e) {
               t.setText(t.getText()+"0");
            }
        
    });
    szam1.addActionListener(new ActionListener()
    {
            @Override
            public void actionPerformed(ActionEvent e) {
               t.setText(t.getText()+"1");
            }
        
    });
    szam2.addActionListener(new ActionListener()
    {
            @Override
            public void actionPerformed(ActionEvent e) {
               t.setText(t.getText()+"2");
            }
        
    });
    szam3.addActionListener(new ActionListener()
    {
            @Override
            public void actionPerformed(ActionEvent e) {
               t.setText(t.getText()+"3");
            }
        
    });
    szam4.addActionListener(new ActionListener()
    {
            @Override
            public void actionPerformed(ActionEvent e) {
               t.setText(t.getText()+"4");
            }
        
    });
    szam5.addActionListener(new ActionListener()
    {
            @Override
            public void actionPerformed(ActionEvent e) {
               t.setText(t.getText()+"5");
            }
        
    });
    szam6.addActionListener(new ActionListener()
    {
            @Override
            public void actionPerformed(ActionEvent e) {
               t.setText(t.getText()+"6");
            }
        
    });
    szam7.addActionListener(new ActionListener()
    {
            @Override
            public void actionPerformed(ActionEvent e) {
               t.setText(t.getText()+"7");
            }
        
    });
    szam8.addActionListener(new ActionListener()
    {
            @Override
            public void actionPerformed(ActionEvent e) {
               t.setText(t.getText()+"8");
            }
        
    });
    szam9.addActionListener(new ActionListener()
    {
            @Override
            public void actionPerformed(ActionEvent e) {
               t.setText(t.getText()+"9");
            }
        
    });
    btizedes.addActionListener(new ActionListener()
    {
            @Override
            public void actionPerformed(ActionEvent e) {
               if(!t.getText().contains("."))
                t.setText(t.getText()+".");
            }
        
    });
    
    C.addActionListener(new ActionListener()
    {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                t.setText("");
            }
        
    });
    CE.addActionListener(new ActionListener()
    {
            @Override
            public void actionPerformed(ActionEvent e) {
               if(t.getText().length()>0)
               { if(!t.getText().contains("."))
                   t.setText(t.getText().substring(0,t.getText().length()-1));
                   else
                   {
                       t.setText("");
                   }
               }
              }
        
    });
    bosszead.addActionListener(new ActionListener()
    {
            @Override
            public void actionPerformed(ActionEvent e) {
               szam=Double.parseDouble(t.getText());
               osszeadas=1;
               t.setText(null);
            }
        
    });
    begyenlo.addActionListener(new ActionListener()
    {
            @Override
            public void actionPerformed(ActionEvent e) {
               eredmeny();
            }
        
    });
    
        
    }
    public void eredmeny()
    {
        if(osszeadas==1)
        {
            osszeg=szam+Double.parseDouble(t.getText());
            t.setText(Double.toString(osszeg));
        }
    }
    
    
    
    
    double osszeg,szam;
    int osszeadas;
    
    
    
    
    public static void main(String[] args) {
        Szamologep sz = new Szamologep();
    }
}
