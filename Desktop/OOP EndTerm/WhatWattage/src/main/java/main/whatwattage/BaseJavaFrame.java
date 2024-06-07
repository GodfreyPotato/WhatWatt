
package main.whatwattage;

import javax.swing.*;

public class BaseJavaFrame extends JFrame{
    
    ImageIcon b = new ImageIcon("Images/back.png");   
    JButton back = new JButton(b);
    
    public BaseJavaFrame(){
       setSize(800,600);
       setResizable(false);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLocationRelativeTo(null);
       
       
       ImageIcon logo = new ImageIcon("Images/logo.png");
       setIconImage(logo.getImage());
       
       
       
       back.setBounds(50,500,120,45);
       back.setContentAreaFilled(false);
       back.setBorderPainted(false);
    }
    
    
    
}
