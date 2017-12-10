/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advising.management.system;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;
 

/**
 *
 * @author Himel Rana
 */
public class StartFXMLController implements Initializable {
    
    @FXML
    private Label logoLabel;

    @FXML
    private Pane waitPane;

    @FXML
    private AnchorPane rootPane;

    @FXML
    private Label label;

    @FXML
    private Label appnameLabel;
    
     AdvisingManagementSystem main;
     Stage stage;
     
    
     public void main(AdvisingManagementSystem main, Stage stage){
         this.main = main;
         this.stage = stage;
     }
    
      
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       TranslateTransition translateTransition = new TranslateTransition(Duration.seconds(0.5),logoLabel);
       translateTransition.setByY(700);
       translateTransition.play();
       
       TranslateTransition translateTransition0 = new TranslateTransition(Duration.seconds(0.5),appnameLabel);
       translateTransition0.setByY(700);
       translateTransition0.play();
       
       
        
       
       translateTransition.setOnFinished(event ->{
            TranslateTransition translateTransition1 = new TranslateTransition(Duration.seconds(1),logoLabel);
            translateTransition1.setByY(-700);
            translateTransition1.play();
           
            translateTransition1.setOnFinished(event1 ->{
                appnameLabel.setVisible(true);
               TranslateTransition translateTransition11 = new TranslateTransition(Duration.seconds(1),appnameLabel);
               translateTransition11.setByY(-700);
               translateTransition11.play();
               
               translateTransition11.setOnFinished(event2 ->{
                   waitPane.setVisible(true);
                     
                   FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1),waitPane);
                   fadeTransition.setFromValue(0);
                   fadeTransition.setToValue(1);
                   fadeTransition.play();
                   
                   fadeTransition.setOnFinished(event3 ->{
                   
                       FadeTransition fadeTransition1 = new FadeTransition(Duration.seconds(5),rootPane);
                       fadeTransition1.setFromValue(1);
                       fadeTransition1.setToValue(0.1);
                       fadeTransition1.play();
                     
                       fadeTransition1.setOnFinished(event4 ->{
                           System.out.println("Application Execution Finished!");
                           main.closeStage();
                           
                           
                           
                           
                           
                       });
                   
                   });
               });
               
            });
       });
    }    
    
}
