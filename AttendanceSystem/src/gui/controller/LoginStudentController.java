/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author mac
 */
public class LoginStudentController implements Initializable {

    @FXML
    private JFXTextField username;
    @FXML
    private JFXButton login;
    @FXML
    private JFXPasswordField password;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void makeLogin(ActionEvent event) {
        
       String user = username.getText();
       String pass = password.getText();
       if(user.equals("Student")&&pass.equals("password"))
        {
        System.out.println("Welcome");
        } else 
        System.out.println("Wrong Password");
    }
    
}
