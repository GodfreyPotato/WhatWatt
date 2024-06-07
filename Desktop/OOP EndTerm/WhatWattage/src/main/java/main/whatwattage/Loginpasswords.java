
package main.whatwattage;

import javax.swing.*;

public class Loginpasswords {
  private final String username;
  private final String password; 
  
  public Loginpasswords(){
    this.username="Dinakdakan";
    this.password="Tahong"; 
  }

  boolean check(JTextField username, JTextField password){
    if(username.getText().equals(this.username)&&password.getText().equals(this.password)){
        new Frame3a().setVisible(true);
        return true;
        }
    else{
        JOptionPane.showMessageDialog(null,"Your Username/Password is Incorrect!", "ERROR", 0);
        return false;
        }
    }
}
