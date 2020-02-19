/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendancesystem.gui.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import static java.lang.System.err;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

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
    private void makeLoginTeacher(ActionEvent event) throws IOException {
        
        String username = user.getText();
        String password = pass.getText();
        if(username.equals("Teacher")&& password.equals("password"))
        {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/attendancesystem/gui/view/TeacherAttendanceOverview.fxml"));
        Parent root = loader.load();
        TeacherAttendanceOverviewController tactrl = loader.getController();
        
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        }else
            wrongpass.setText("Wrong password or username");
            loginT.pressedProperty();
        
                               
    }
    
}
