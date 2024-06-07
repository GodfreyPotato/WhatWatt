
package main.whatwattage;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

//component selector 
public class Frame2 extends Components{
    
    private JComboBox comboBoxGPU, comboBoxCPU,comboBoxMoBo,comboBoxRAM,comboBoxHDD,comboBoxSSD;
    
    public Frame2(){
        
       JLabel bgImg = new JLabel();
       bgImg.setIcon(new ImageIcon("Images/Frame2.png"));
       setContentPane(bgImg);
        
       Compute com = new Compute();
       setTitle("Component selector");
       
       JLabel frameTitle = new JLabel("Select Your Desired Components!");
       frameTitle.setFont(new Font(frameTitle.getFont().getName(),frameTitle.getFont().getStyle(),frameTitle.getFont().getSize()+12));
       frameTitle.setBounds(200,30 , 400, 70);
       add(frameTitle);
       

       
       
       
       //Labels
       JLabel labelGPU =new JLabel("GPU");
       labelGPU.setBounds(140, 100, 200, 30);
       add(labelGPU);
       
       JLabel labelCPU =new JLabel("CPU");
       labelCPU.setBounds(140, 140, 200, 30);
       add(labelCPU);
       
       JLabel labelMoBo =new JLabel("MOTHERBOARD");
       labelMoBo.setBounds(90, 180, 200, 30);
       add(labelMoBo);
       
       JLabel labelRAM =new JLabel("RAM");
       labelRAM.setBounds(140, 220, 200, 30);
       add(labelRAM);
       
       JLabel labelHDD =new JLabel("HDD");
       labelHDD.setBounds(140, 260, 200, 30);
       add(labelHDD);
       
       JLabel labelSSD =new JLabel("SSD");
       labelSSD.setBounds(140, 300, 200, 30);
       add(labelSSD);
       
       
       
       JLabel totalWatt = new JLabel();
       totalWatt.setBounds(200, 350, 200, 30);
       add(totalWatt);
       JLabel watt = new JLabel();
       
       //comboboxes
       comboBoxGPU = new JComboBox();
       comboBoxGPU.setBounds(200,100,400, 30);
       for(String a: GPU.keySet()){
           comboBoxGPU.addItem(a);
       }
       comboBoxGPU.setSelectedIndex(-1);
       add(comboBoxGPU);   
       comboBoxGPU.addActionListener((ActionEvent)->{
       
       com.setGPU(GPU.get(comboBoxGPU.getSelectedItem()));
       totalWatt.setText("TOTAL WATTAGE:   "+com.compute());
       watt.setText((int)com.reqCompute()+" AND ABOVE!");
       });
       
       comboBoxCPU = new JComboBox();
       comboBoxCPU.setBounds(200,140,400, 30);
       for(String a: CPU.keySet()){
           comboBoxCPU.addItem(a);
       }
       comboBoxCPU.setSelectedIndex(-1);
       add(comboBoxCPU);
       comboBoxCPU.addActionListener((ActionEvent)->{
       com.setCPU(CPU.get(comboBoxCPU.getSelectedItem()));
       totalWatt.setText("TOTAL WATTAGE:   "+com.compute());
       watt.setText((int)com.reqCompute()+" AND ABOVE!");
       });
       
       comboBoxMoBo = new JComboBox();
       comboBoxMoBo.setBounds(200,180,400, 30);
       for(String a: MoBo.keySet()){
           comboBoxMoBo.addItem(a);
       }
       comboBoxMoBo.setSelectedIndex(-1);
       add(comboBoxMoBo);
       comboBoxMoBo.addActionListener((ActionEvent)->{
       com.setMoBo(MoBo.get(comboBoxMoBo.getSelectedItem()));
       totalWatt.setText("TOTAL WATTAGE:   "+com.compute());
       watt.setText((int)com.reqCompute()+" AND ABOVE!");
       });
       
       comboBoxRAM = new JComboBox();
       comboBoxRAM.setBounds(200,220,400, 30);
       for(String a: RAM.keySet()){
           comboBoxRAM.addItem(a);
       }
       comboBoxRAM.setSelectedIndex(-1);
       add(comboBoxRAM);  
       comboBoxRAM.addActionListener((ActionEvent)->{
       com.setRAM(RAM.get(comboBoxRAM.getSelectedItem()));
       totalWatt.setText("TOTAL WATTAGE:   "+com.compute());
       watt.setText((int)com.reqCompute()+" AND ABOVE!");
       });
       
       comboBoxHDD = new JComboBox();
       comboBoxHDD.setBounds(200,260,400, 30);
       for(String a: HDD.keySet()){
           comboBoxHDD.addItem(a);
       }
       comboBoxHDD.setSelectedIndex(-1);
       add(comboBoxHDD);
       comboBoxHDD.addActionListener((ActionEvent)->{
       com.setHDD(HDD.get(comboBoxHDD.getSelectedItem()));
       totalWatt.setText("TOTAL WATTAGE:   "+com.compute());
       watt.setText((int)com.reqCompute()+" AND ABOVE!");
       });
       
       
       comboBoxSSD = new JComboBox();
       comboBoxSSD.setBounds(200,300,400, 30);
       for(String a:SSD.keySet()){
           comboBoxSSD.addItem(a);
       }
       comboBoxSSD.setSelectedIndex(-1);
       add(comboBoxSSD);
       comboBoxSSD.addActionListener((ActionEvent)->{
       com.setSSD(SSD.get(comboBoxSSD.getSelectedItem()));
       totalWatt.setText("TOTAL WATTAGE:   "+com.compute());
       watt.setText((int)com.reqCompute()+" AND ABOVE!");
       });
       
       
       JLabel reqWatt = new JLabel("REQUIRED WATTAGE: ");
       reqWatt.setBounds(455, 430, 300, 30);
       reqWatt.setFont(new Font(reqWatt.getFont().getName(),reqWatt.getFont().getStyle(),reqWatt.getFont().getSize()+6));
       add(reqWatt);
      
       
       watt.setBounds(455, 460, 200, 30);
       watt.setFont(new Font(watt.getFont().getName(),watt.getFont().getStyle(),watt.getFont().getSize()+9));
       add(watt);
           
       
       add(back);
       //jump
       back.addActionListener((ActionEvent e) -> {
           new Frame1().setVisible(true);
           dispose();
       });
       
      
    }  
   
}
