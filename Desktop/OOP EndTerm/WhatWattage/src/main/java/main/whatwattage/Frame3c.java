
package main.whatwattage;

import static java.awt.Color.gray;
import java.awt.Font;
import javax.swing.*;

public class Frame3c extends Components{
    
    public Frame3c(){
    setSize(400,300);
    setTitle("Remove Component");
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setLocationRelativeTo(null);
    
    String [] parts = {"GPU","CPU","Motherboard","RAM","HDD","SSD"};
        
    JPanel panel = new JPanel();
    panel.setBounds(0,0,400 ,300 );
    panel.setBackground(gray);
    panel.setLayout(null);
    add(panel);
    
       
    JButton remB = new JButton("REMOVE");
    remB.setBounds(145,190,120,40);
       
    //label
    JLabel labelRemoveComponent = new JLabel("REMOVE COMPONENT");
    labelRemoveComponent.setFont(new Font(labelRemoveComponent.getFont().getFontName(), labelRemoveComponent.getFont().getStyle(), labelRemoveComponent.getFont().getSize() + 4));
    labelRemoveComponent.setBounds(110,40,200,15);
    
    JLabel component = new JLabel("Component: ");
    component.setBounds(40,100,100,20);
    component.setFont(new Font(component.getFont().getFontName(), component.getFont().getStyle(), component.getFont().getSize() + 2));
    JLabel name = new JLabel("Name: ");
    name.setBounds(70,150,100,20);
    name.setFont(new Font(name.getFont().getFontName(), name.getFont().getStyle(), name.getFont().getSize() + 2));
    
    //ComboBox
    JComboBox CBcomponent = new JComboBox(parts);
    CBcomponent.setSelectedIndex(-1);
    CBcomponent.setBounds(130,100,150,20);
    
    JComboBox CBname = new JComboBox();
    CBname.setBounds(130,150,150,20);
    
    CBcomponent.addActionListener(( ActionEvent )->{
    if(CBcomponent.getSelectedItem().equals("GPU")){
        CBname.removeAllItems();
      for(String a:GPU.keySet()){
        CBname.addItem(a);
        }
    
    }
    else if(CBcomponent.getSelectedItem().equals("CPU")){
        CBname.removeAllItems();
      for(String a: CPU.keySet()){
        CBname.addItem(a);
        }
      
    }
    else if(CBcomponent.getSelectedItem().equals("Motherboard")){
        CBname.removeAllItems();
      for(String a: MoBo.keySet()){
        CBname.addItem(a);
        }
    }
    else if(CBcomponent.getSelectedItem().equals("RAM")){
        CBname.removeAllItems();
      for(String a: RAM.keySet()){
        CBname.addItem(a);
        }
    }
    else if(CBcomponent.getSelectedItem().equals("HDD")){
        CBname.removeAllItems();
      for(String a: HDD.keySet()){
        CBname.addItem(a);
        }
    }
    else if(CBcomponent.getSelectedItem().equals("SSD")){
        CBname.removeAllItems();
      for(String a: SSD.keySet()){
        CBname.addItem(a);
        }
    }
    });
    
    
    //removing items
    
    remB.addActionListener((ActionEvent )->{
    
    if(CBcomponent.getSelectedItem().equals("GPU")){
        remGPU(CBname.getSelectedItem().toString()); 
        CBname.removeAllItems();
         for(String a: GPU.keySet()){
        CBname.addItem(a);
        }
        }
      else  if(CBcomponent.getSelectedItem().equals("CPU")){
        remCPU(CBname.getSelectedItem().toString()); 
        CBname.removeAllItems();
         for(String a: CPU.keySet()){
        CBname.addItem(a);
        }
        }
      else  if(CBcomponent.getSelectedItem().equals("Motherboard")){
        remMoBo(CBname.getSelectedItem().toString()); 
        CBname.removeAllItems();
         for(String a: MoBo.keySet()){
        CBname.addItem(a);
        }
        }
      else  if(CBcomponent.getSelectedItem().equals("RAM")){
        remRAM(CBname.getSelectedItem().toString()); 
        CBname.removeAllItems();
        for(String a: RAM.keySet()){
        CBname.addItem(a);
        }
        }
       else if(CBcomponent.getSelectedItem().equals("HDD")){
        remHDD(CBname.getSelectedItem().toString()); 
        CBname.removeAllItems();
        for(String a: HDD.keySet()){
        CBname.addItem(a);
        }
        }
      else if(CBcomponent.getSelectedItem().equals("SSD")){
        remSSD(CBname.getSelectedItem().toString()); 
        CBname.removeAllItems();
        for(String a: SSD.keySet()){
        CBname.addItem(a);
        }
        }
    }
    
    );
        
     
   
    
    
    panel.add(name);
    panel.add(component);
    panel.add(CBname);
    panel.add(CBcomponent);
    panel.add(labelRemoveComponent);
    panel.add(remB);
    setLayout(null);
    }
}
