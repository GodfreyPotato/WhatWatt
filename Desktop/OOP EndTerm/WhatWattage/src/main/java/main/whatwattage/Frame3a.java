
package main.whatwattage;


import java.awt.event.ActionEvent;
import javax.swing.*;

//add/remove frame
public class Frame3a extends BaseJavaFrame{
    
    public Frame3a(){   
    
    setTitle("Add/Remove Component");
    

    
    JLabel bgImg = new JLabel();
    bgImg.setIcon(new ImageIcon("Images/Frame3a.png"));
    setContentPane(bgImg);
    ImageIcon addCom = new ImageIcon("Images/addcomponent.png");  
    ImageIcon remCom = new ImageIcon("Images/removecomponent.png");  
    
    JButton plus = new JButton(addCom);
    plus.setBounds(120, 230, 200, 80);
    plus.setBorderPainted(false);
    plus.setContentAreaFilled(false);
    add(plus);
    
    JButton minus = new JButton(remCom);
    minus.setBounds(480, 230, 200, 80);
    minus.setBorderPainted(false);
    minus.setContentAreaFilled(false);
    add(minus);
    
    plus.addActionListener((ActionEvent e) ->{
        new Frame3b().setVisible(true);
    });
    
    minus.addActionListener((ActionEvent e) ->{
        new Frame3c().setVisible(true);
    });
    
   
    ImageIcon mm = new ImageIcon("Images/mainmenu.png");
    back.setIcon(mm);
    add(back);
       //jump
    back.addActionListener((ActionEvent e) -> {
        new Frame1().setVisible(true);
        dispose();
       });
    

}
}
