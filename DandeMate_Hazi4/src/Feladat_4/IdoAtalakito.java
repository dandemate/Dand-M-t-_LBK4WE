/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat_4;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author dande
 */
public class IdoAtalakito extends JFrame{
    JTextField t1;
    JTextField t2;
    JTextField t3;
    JTextField t4;
    JTextField t5;
    JTextField t6;
    JTextField t7;
    JTextField t8;
    JTextField t9;
    JTextField t10;
    JTextField t11;
    JTextField t12;
    
    JLabel nap1;
    JLabel ora1;
    JLabel perc1;
    JLabel mperc1;
    
    JLabel nap2;
    JLabel ora2;
    JLabel perc2;
    JLabel mperc2;
    
    JLabel nap3;
    JLabel ora3;
    JLabel perc3;
    JLabel mperc3;
    JButton szamolo;
    JPanel p1;
    JPanel p2;
    JPanel p3;

    public IdoAtalakito() {
        super("Idoatalakito");
        
         t1=new JTextField(6);
    t2=new JTextField(6);
    t3=new JTextField(6);
    t4=new JTextField(6);
     t5=new JTextField(6);
    t6=new JTextField(6);
    t7=new JTextField(6);
    t8=new JTextField(6);
    t9=new JTextField(6);
    t10=new JTextField(6);
    t11=new JTextField(6);
    t12=new JTextField(6);
    
    nap1=new JLabel("nap");
    ora1=new JLabel("óra");
    perc1=new JLabel("perc");
    mperc1=new JLabel("másodperc");
    
    nap2=new JLabel("nap");
    ora2=new JLabel("óra");
    perc2=new JLabel("perc");
    mperc2=new JLabel("másodperc");
    szamolo=new JButton("Számol");
    nap3=new JLabel("nap");
    ora3=new JLabel("óra");
    perc3=new JLabel("perc");
    mperc3=new JLabel("másodperc");
    p1=new JPanel();
    p2=new JPanel();
    p3=new JPanel();
    GridLayout gralap= new GridLayout(3,1);
    setLayout(gralap);
    
    GridLayout gr1= new GridLayout(2,8);
    
    GridLayout gr2= new GridLayout(1,1);
    
    GridLayout gr3= new GridLayout(1,8);
    
    p1.setLayout(gr1);
    p2.setLayout(gr2);
    p3.setLayout(gr3);
    
    p1.add(t1);
    p1.add(nap1);
    p1.add(t2);
    p1.add(ora1);
    p1.add(t3);
    p1.add(perc1);
    p1.add(t4);
    p1.add(mperc1);
    
    
    p1.add(t5);
    p1.add(nap2);
    p1.add(t6);
    p1.add(ora2);
    p1.add(t7);
    p1.add(perc2);
    p1.add(t8);
    p1.add(mperc2);
    
    p2.add(szamolo);
    
    
    p3.add(t9);
    p3.add(nap3);
    p3.add(t10);
    p3.add(ora3);
    p3.add(t11);
    p3.add(perc3);
    p3.add(t12);
    p3.add(mperc3);
    
    szamolo.addActionListener(new ActionListener()
    {
            @Override
            public void actionPerformed(ActionEvent e) {
              int ujmp;
              int ujp;
              int ujo;
              int ujnap;
              int maradek=0;
              
              String mp1=t4.getText();
              String mp2=t8.getText();
              
              String perc1=t3.getText();
              String perc2=t7.getText();
              
              String ora1=t2.getText();
              String ora2=t6.getText();
              
              String nap1=t1.getText();
              String nap2=t5.getText();
              
              ujmp=(Integer.parseInt(mp1)+Integer.parseInt(mp2))%60;
              maradek=(Integer.parseInt(mp1)+Integer.parseInt(mp2))/60;
              
              ujp=(Integer.parseInt(perc1)+Integer.parseInt(perc2)+maradek)%60;
              maradek=(Integer.parseInt(perc1)+Integer.parseInt(perc2)+maradek)/60;
              
              
              
              ujo=(Integer.parseInt(ora1)+Integer.parseInt(ora2)+maradek)%60;
              maradek=(Integer.parseInt(ora1)+Integer.parseInt(ora2)+maradek)/60;
              
              
              ujnap=((Integer.parseInt(nap1)+Integer.parseInt(nap2))+maradek);
              
              if(ujo>=24)
              {
                  ujnap+=1;
                  ujo-=24;
              }
              
              if(ujp>=60)
              {
                  ujo+=1;
                  ujp-=60;
              }
              if(ujmp>=60)
              {
                  ujp+=1;
                  ujmp-=60;
              }
              t9.setText(Integer.toString(ujnap));
              t10.setText(Integer.toString(ujo));
              t11.setText(Integer.toString(ujp));
              t12.setText(Integer.toString(ujmp));
              
              
              
              
            }
        
    });
    
    
    
    add(p1);
    add(p2);
    add(p3);
    
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    pack();
        
    }
    public static void main(String[] args) {
        IdoAtalakito n = new IdoAtalakito();
    }
}
