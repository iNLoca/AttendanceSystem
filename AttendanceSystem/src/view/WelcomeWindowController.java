/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.shape.Rectangle;

/**
 * FXML Controller class
 *
 * @author rtlop
 */
public class WelcomeWindowController implements Initializable {

    @FXML
    private Button btn_teacher;
    @FXML
    private Label lbl1;
    @FXML
    private Label lbl2;
    @FXML
    private Button btn_student;
    @FXML
    private Button btn_close;
    @FXML
    private Rectangle rectangle;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
