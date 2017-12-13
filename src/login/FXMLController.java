/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;
import functions.Admin;
import advising.management.system.StartFXMLController;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Himel Rana
 */
public class FXMLController implements Initializable {
    private static Stage stage = new Stage();
    @FXML
    private JFXPasswordField password;

    @FXML
    private JFXTextField username;
    
    @FXML
    private Button button;
    
    @FXML
    private AnchorPane rootPane;
    
    @FXML
    void buttonAction(ActionEvent event) {
            String user = this.username.getText().trim();
            String pass = this.password.getText().trim();
            
            if(Admin.checkLogin(user, pass)){
                 
                loadAdminWindow();
                StartFXMLController.closeLoginWindow();
                 
            }else{
                showErrorMsg("Login Credentials Incorrect ");
            }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     
    }    
     
     
    private void showErrorMsg(String login_Success) {
        JFXSnackbar snackbar = new JFXSnackbar(rootPane);
        snackbar.setPrefWidth(rootPane.getWidth());
        snackbar.prefHeight(20);
        snackbar.show(login_Success, 2000);
 
    }
    private void loadAdminWindow(){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/admin/AdminFXML.fxml"));
            Parent adminRoot = (Parent)loader.load();
            stage.setTitle("Welcome Admin");
            stage.setScene(new Scene(adminRoot));
            stage.show();
        } catch (IOException ex) {
            System.out.println("Can't load admin Package");
        }
    }
    public static void closeAdminWindow(){
        stage.close();
    }
      
    
}
