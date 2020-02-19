/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendancesystem.gui.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;

public class TeacherAttendanceOverviewController implements Initializable {

    @FXML
    private DatePicker calendar;
    @FXML
    private Label reasonForAbsence;
    @FXML
    private Button exit;
    @FXML
    private Label percentageOfAbsence;
    @FXML
    private Label teacherName;
    @FXML
    private AnchorPane pane;
    @FXML
    private Label className;
    @FXML
    private TableView<?> students;
    @FXML
    private Label text2;
    @FXML
    private Label text1;
    @FXML
    private Label text3;
    @FXML
    private Label lblStatus;
    private Rectangle rectangle;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        text1.getStyleClass().add("text1");
        text2.getStyleClass().add("text2");
        text3.getStyleClass().add("text3");
        text3.setId("text3");
        calendar.getStyleClass().add("calendar");
        exit.getStyleClass().add("exit");
        exit.setId("exit");
        reasonForAbsence.getStyleClass().add("reasonForAbsence");
        reasonForAbsence.setId("reasonForAbsence");
        lblStatus.getStyleClass().add("lblStatus");
        lblStatus.setId("lblStatus");

       
       
        percentageOfAbsence.getStyleClass().add("percentageOfAbsence");
        teacherName.getStyleClass().add("teacherName");
        className.getStyleClass().add("className");
        className.setId("className");
        students.getStyleClass().add("students");
        teacherName.setId("teacherName");
        
    }    
    
}
