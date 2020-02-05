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
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Francesco
 */
public class TeacherAttendanceOverviewController implements Initializable {

    @FXML
    private DatePicker calendar;
    @FXML
    private Label reasonForAbsence;
    @FXML
    private Label percentageOfAbsence;
    @FXML
    private Label teacherName;
    @FXML
    private Button exit;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        calendar.show();
    }    
    
}
