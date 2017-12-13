/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functions;
 
import javafx.beans.property.SimpleStringProperty;

public class Admin {
    private SimpleStringProperty name;
    private SimpleStringProperty username;
    private String password;
    
    public static boolean checkLogin(String username, String password){
        return "a".equals(username) && "a".equals(password);
    }
    
}
