
package main.whatwattage;

import static java.awt.Color.gray;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import javax.swing.*;


public class Frame3b extends Components{
    
    public Frame3b(){
    setSize(400,300);
    setTitle("Add Component");
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setLocationRelativeTo(null);
    
    JPanel panel = new JPanel();
    panel.setBounds(0,0,400 ,300 );
    panel.setBackground(gray);
    panel.setLayout(null);
    add(panel);
    
    String [] parts = {"GPU","CPU","Motherboard","RAM","HDD","SSD"};
       
       
       JComboBox components = new JComboBox(parts);
       components.setBounds(80,70,190, 30);
       
       JButton addB = new JButton("ADD");
       addB.setBounds(145,190,80,40);
       
    //label
    JLabel ac = new JLabel("ADD COMPONENT");
    ac.setFont(new Font(ac.getFont().getFontName(), ac.getFont().getStyle(), ac.getFont().getSize() + 4));
    ac.setBounds(110,40,200,15);
    
    JLabel name = new JLabel("Name: ");
    name.setBounds(60,120,80,20);
    name.setFont(new Font(name.getFont().getFontName(), name.getFont().getStyle(), name.getFont().getSize() + 2));
    JLabel watt = new JLabel("Wattage: ");
    watt.setBounds(60,150,80,20);
    watt.setFont(new Font(watt.getFont().getFontName(), watt.getFont().getStyle(), watt.getFont().getSize() + 2));
    //textfield
    JTextField tfName = new JTextField();
    tfName.setBounds(130,120,120,20);
    
    JTextField tfWatt = new JTextField();
    tfWatt.setBounds(130,150,120,20);
    

    
    HashMap<String, Runnable> command = new HashMap();
    
    
    command.put("GPU", ()-> addGPU(tfName.getText(), Integer.parseInt(tfWatt.getText())));
    command.put("CPU", ()-> addCPU(tfName.getText(), Integer.parseInt(tfWatt.getText())));
    command.put("Motherboard", ()-> addMoBo(tfName.getText(), Integer.parseInt(tfWatt.getText())));
    command.put("RAM", ()-> addRAM(tfName.getText(), Integer.parseInt(tfWatt.getText())));
    command.put("HDD", ()-> addHDD(tfName.getText(), Integer.parseInt(tfWatt.getText())));
    command.put("SSD", ()-> addSSD(tfName.getText(), Integer.parseInt(tfWatt.getText())));
    
    
    
    addB.addActionListener((ActionEvent e )->{
       String selected = (String) components.getSelectedItem();
       if(command.containsKey(selected)){
           try{
           command.get(selected).run();
           }
           catch(Exception a){
            JOptionPane.showMessageDialog(null, "Invalid Input!");
            }
           }
    });
    
    
    
    panel.add(tfName);
    panel.add(tfWatt);
    panel.add(name);
    panel.add(watt);
    panel.add(components);
    panel.add(ac);
    panel.add(addB);
    
    setLayout(null);
    }
}
