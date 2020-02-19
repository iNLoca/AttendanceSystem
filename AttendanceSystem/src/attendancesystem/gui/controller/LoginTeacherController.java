/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendancesystem.gui.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import static java.lang.System.err;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author mac
 */
public class LoginTeacherController implements Initializable {

    @FXML
    private JFXTextField user;
    @FXML
    private JFXButton loginT;
    @FXML
    private JFXPasswordField pass;
    @FXML
    private Label wrongpass;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void makeLoginTeacher(ActionEvent event) {
        
        String username = user.getText();
        String password = pass.getText();
        if(user.equals("Teacher")&& pass.equals("password"))
        {
          System.out.println("Welcome Teacher");
        }else
            wrongpass.setVisible(false);
            
         //wrongpass.visibleProperty().bind(
             loginT.pressedProperty();
             
           
                           
        
    }
    
}
