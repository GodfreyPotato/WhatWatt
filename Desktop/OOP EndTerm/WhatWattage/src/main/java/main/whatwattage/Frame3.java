
package main.whatwattage;

import static java.awt.Color.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.*;

//log in for admin
public class Frame3 extends BaseJavaFrame{
    public Frame3(){   

    setTitle("Log In for Admin");
    
    
    JLabel tb = new JLabel("USER LOGIN");
    tb.setFont(new Font(tb.getFont().getFontName(), tb.getFont().getStyle(), tb.getFont().getSize() + 8));
    tb.setBounds(150,30,500,40);
    
    JLabel bgImg = new JLabel();
    bgImg.setIcon(new ImageIcon("Images/Frame3.png"));
    setContentPane(bgImg);
       
    
    
    JPanel panel = new JPanel();
    panel.setBounds(200,200 ,400 ,200 );
    panel.setBackground(gray);
    panel.add(tb);
    panel.setLayout(null);

    add(panel);
    
    //label
    JLabel userlabel = new JLabel("Username: ");
    userlabel.setBounds(25,70,80,30);
    JLabel passlabel = new JLabel("Password: ");
    passlabel.setBounds(25,110,80,30);
    
    //textfield
    JTextField username = new JTextField();
    username.setBounds(100,70,220,30);
    
    JTextField password = new JTextField();
    password.setBounds(100,110,220,30);
    
    panel.add(username);
    panel.add(password);
    panel.add(userlabel);
    panel.add(passlabel);
    
    
    add(back);
       //jump
    back.addActionListener((ActionEvent e) -> {
           new Frame1().setVisible(true);
           dispose();
       });
       
    
    JButton login = new JButton("Login");
       login.setBounds(170,150,80,40);
       panel.add(login);
       
       
       login.addActionListener((ActionEvent e) -> {
           Loginpasswords lp = new Loginpasswords();
           if(lp.check(username, password)==true){
               dispose();
           }
           
       });
    
}}
