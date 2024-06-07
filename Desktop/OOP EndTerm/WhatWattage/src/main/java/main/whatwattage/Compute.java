
package main.whatwattage;

public class Compute {
    protected int gpusi,cpusi,mobosi,ramsi,hddsi,ssdsi;
    
    public Compute(){
        this.gpusi=0;
        this.cpusi=0;
        this.mobosi=0;
        this.ramsi=0;
        this.hddsi=0;
        this.ssdsi=0;
    }
    
    
    int compute(){
        return gpusi+cpusi+mobosi+ramsi+hddsi+ssdsi;
    }
    
    double reqCompute(){
        double required = gpusi+cpusi+mobosi+ramsi+hddsi+ssdsi+((gpusi+cpusi+mobosi+ramsi+hddsi+ssdsi)*(.2));
        int newVal = (int)required%100;
        
        if(newVal<50){
            
            required-=newVal;
            required+=50;
            return required;
        }
        else{
            
            required-=newVal;
            required+=100;
            return required;
        }
    }
    
    void setGPU(int name){
    this.gpusi=name;
    }
    void setCPU(int name){
    this.cpusi=name;
    }
    void setMoBo(int name){
    this.mobosi=name;
    }
    void setRAM(int name){
    this.ramsi=name;
    }
    void setHDD(int name){
    this.hddsi=name;
    }
    void setSSD(int name){
    this.ssdsi=name;
    }
    
}
