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
    
    static Stage stage;
    
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
            Parent root = (Parent) loader.load();
            /// loading default controller
        
            
            Scene scene = new Scene(root);
            scene.getStylesheets().addAll(this.getClass().getResource("frame.css").toExternalForm());
            stage.setScene(scene);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setTitle("Please Wait..");
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(AdvisingManagementSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
  
    
    public static void closeStage(){
        
        stage.close();
    
    }
    
    
       public static void main(String[] args) {
        launch(args);
    }
   
 
  

}
