/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advising.management.system;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Himel Rana
 */
public class AdvisingManagementSystem extends Application {
    
    Stage stage;
    
    @Override
    public void start(Stage stage) throws Exception {
        
        this.stage = stage;
        
        mainWindow();
        
        
    }

    /**
     * @param args the command line arguments
     */
 
    private void mainWindow() {
        
        try {
             FXMLLoader loader = new FXMLLoader(this.getClass().getResource("StartFXML.fxml"));
             AnchorPane pane = loader.load();
        
            StartFXMLController controller = loader.getController();
            controller.main(this,stage);
            Scene scene = new Scene(pane);
            scene.getStylesheets().addAll(this.getClass().getResource("frame.css").toExternalForm());
            stage.setScene(scene);
             
            stage.setTitle("Please Wait..");
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(AdvisingManagementSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
  
    
    public void closeStage(){
        
        stage.close();
        
        loginWindow();
    }
    
    
       public static void main(String[] args) {
        launch(args);
    }

    private void loginWindow() {
        try {
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/login/FXML.fxml"));
            AnchorPane pane = loader.load();           
            Scene scene = new Scene(pane);
             
            stage.setTitle("Please Login First");
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(AdvisingManagementSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
