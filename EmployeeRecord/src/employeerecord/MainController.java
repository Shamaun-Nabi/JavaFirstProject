/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeerecord;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author snash
 */
public class MainController implements Initializable {
    
      @FXML
    private Button justSalary;
    
    @FXML
    private Button AllInfromation;
     @FXML
    private Button updateSalary;
       @FXML
    private Button SearchEmployee;
      @FXML
    private Button addEmployee;
      
           public void showStopAlert()
    {
       Alert alert = new Alert(Alert.AlertType.ERROR);
      alert.setTitle("Application Run Failed");
      alert.setHeaderText("Close And Run again");
      alert.showAndWait();
    }

    @FXML
    void gotToAdd(ActionEvent event)  {
          try {
              Parent root=FXMLLoader.load(getClass().getResource("AddEmployee.fxml"));
              Stage window= (Stage)((Node)event.getSource()).getScene().getWindow();
              Scene scene= new  Scene(root);
              window.setScene(scene);
              window.show();
          } catch (IOException ex) {
              Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
              showStopAlert();
          }

    }
    
       @FXML
    void goToSearch(ActionEvent event) {
          try {
              Parent root=FXMLLoader.load(getClass().getResource("SearchForm.fxml"));
              Stage window= (Stage)((Node)event.getSource()).getScene().getWindow();
              Scene scene= new  Scene(root);
              window.setScene(scene);
              window.show();
          } catch (IOException ex) {
              Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
              showStopAlert();
          }

    }
    
    
  
    @FXML
    void gotToUpdate(ActionEvent event) {
          try {
              Parent root=FXMLLoader.load(getClass().getResource("UpdateSalaryForm.fxml"));
              Stage window= (Stage)((Node)event.getSource()).getScene().getWindow();
              Scene scene= new  Scene(root);
              window.setScene(scene);
              window.show();
          } catch (IOException ex) {
              Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
              showStopAlert();
          }
    }
    
    
    
        @FXML
    void SeeAllInformation(ActionEvent event)  {
          try {
              Parent root=FXMLLoader.load(getClass().getResource("AllInformation.fxml"));
              Stage window= (Stage)((Node)event.getSource()).getScene().getWindow();
              Scene scene= new  Scene(root);
              window.setScene(scene);
              window.show();
          } catch (IOException ex) {
              Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
              showStopAlert();
          }

    }

        @FXML
    void justSalary(ActionEvent event)  {
          try {
              Parent root=FXMLLoader.load(getClass().getResource("JustSalary.fxml"));
              Stage window= (Stage)((Node)event.getSource()).getScene().getWindow();
              Scene scene= new  Scene(root);
              window.setScene(scene);
              window.show();
          } catch (IOException ex) {
              Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
              showStopAlert();
          }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
