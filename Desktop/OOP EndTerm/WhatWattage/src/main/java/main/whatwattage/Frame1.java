
package main.whatwattage;

import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.*;


public class Frame1 extends BaseJavaFrame{
   
   public Frame1(){
       
       setTitle("Welcome to What Wattage!");
       ImageIcon user = new ImageIcon("Images/imauser.png");
       
       
       JButton customer = new JButton(user);
       customer.setContentAreaFilled(false);
       customer.setBorderPainted(false);
       customer.setFont(new Font(customer.getFont().getName(),customer.getFont().getStyle(),customer.getFont().getSize()+6));
       customer.setBounds(100,180,150,60);
       
       ImageIcon adbut = new ImageIcon("Images/admin.png");
       JButton admin = new JButton(adbut);
       admin.setBorderPainted(false);
       admin.setContentAreaFilled(false);
       admin.setBounds(650,500,120,45);
       
       JLabel bgImg = new JLabel();
       bgImg.setIcon(new ImageIcon("Images/Frame1.png"));
       setContentPane(bgImg);
       
       add(customer);
       add(admin);
      
       
       
       customer.addActionListener((ActionEvent e) -> {
           new Frame2().setVisible(true);
           dispose();
       });
       admin.addActionListener((ActionEvent e) -> {
           new Frame3().setVisible(true);
           dispose();
       });
   }
}
