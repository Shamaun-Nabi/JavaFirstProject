/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeerecord;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Devloped By Shamaun Nabi
 * 
 */

public class EmployeeRecord extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root=FXMLLoader.load(getClass().getResource("Main.fxml"));
            Stage stage= new Stage();
            Scene scene= new  Scene(root);
            stage.setScene(scene);
            stage.show();
            stage.setTitle("Devloped By Shamaun Nabi");
            
   
        } 
        
        
        catch (IOException ex) {
            System.out.println(ex);
        }
    
      
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
