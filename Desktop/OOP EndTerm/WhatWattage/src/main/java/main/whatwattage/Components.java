
package main.whatwattage;

import java.util.HashMap;
import javax.swing.JOptionPane;


public class Components extends HashMaptoTxtFile{

    protected static HashMap<String, Integer> GPU;
    protected static HashMap<String, Integer> CPU;
    protected static HashMap<String, Integer> MoBo;
    protected static HashMap<String, Integer> RAM;
    protected static HashMap<String, Integer> HDD;
    protected static HashMap<String, Integer> SSD;
    
    public Components(){
    GPU = fileToHashMap("Components/GPU.txt");
    CPU = fileToHashMap("Components/CPU.txt");
    MoBo = fileToHashMap("Components/MoBo.txt");
    RAM = fileToHashMap("Components/RAM.txt");
    HDD = fileToHashMap("Components/HDD.txt");
    SSD = fileToHashMap("Components/SSD.txt");
    }
    
    void addGPU(String name, int watt){        
        GPU.put(name, watt);
        JOptionPane.showMessageDialog(null, "Added!");
        hashMapToFile(GPU, "Components/GPU.txt");
    }
    
    void addCPU(String name, int watt){
        CPU.put(name, watt);
        JOptionPane.showMessageDialog(null, "Added!");
        hashMapToFile(CPU, "Components/CPU.txt");
       
    }
    
   void addMoBo(String name, int watt){
        
        MoBo.put(name, watt);
        JOptionPane.showMessageDialog(null, "Added!");
        hashMapToFile(MoBo, "Components/MoBo.txt");
    }
    
   void addRAM(String name, int watt){
       
        RAM.put(name, watt);
        JOptionPane.showMessageDialog(null, "Added!");
        hashMapToFile(RAM, "Components/RAM.txt");
    }
    
    void addHDD(String name, int watt){
        
        HDD.put(name, watt);
        JOptionPane.showMessageDialog(null, "Added!");
        hashMapToFile(HDD, "Components/HDD.txt");
    }
    
    void addSSD(String name, int watt){
        
        SSD.put(name, watt);
        JOptionPane.showMessageDialog(null, "Added!");
        hashMapToFile(SSD, "Components/SSD.txt");
        
    }
    
    
    //removing parts

    static void remGPU(String name){
        GPU.remove(name);
        hashMapToFile(GPU, "Components/GPU.txt");
        JOptionPane.showMessageDialog(null, "Removed Successfully!");
    }
    static void remCPU(String name){
        CPU.remove(name);
        hashMapToFile(CPU, "Components/CPU.txt");
        JOptionPane.showMessageDialog(null, "Removed Successfully!");
    }
    static void remMoBo(String name){
        MoBo.remove(name);
        hashMapToFile(MoBo, "Components/MoBo.txt");
        JOptionPane.showMessageDialog(null, "Removed Successfully!");
    }    
    static void remRAM(String name){
        RAM.remove(name);
        hashMapToFile(RAM, "Components/RAM.txt");
        JOptionPane.showMessageDialog(null, "Removed Successfully!");
    }    
    static void remHDD(String name){
        HDD.remove(name);
        hashMapToFile(HDD, "Components/HDD.txt");
        JOptionPane.showMessageDialog(null, "Removed Successfully!");
    }
    static void remSSD(String name){
        SSD.remove(name);
        hashMapToFile(SSD, "Components/SSD.txt");
        JOptionPane.showMessageDialog(null, "Removed Successfully!");
    }
}

