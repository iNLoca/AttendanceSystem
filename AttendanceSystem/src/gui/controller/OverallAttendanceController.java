/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class OverallAttendanceController implements Initializable {

    private PieChart pieChart;
    @FXML
    private Label lbl_totalpresence;
    @FXML
    private Label lbl_totalabsence;
    @FXML
    private Button btn_close;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<PieChart.Data> pieChartData 
                = FXCollections.observableArrayList(
                new PieChart.Data("Present", 50),
                new PieChart.Data("Absent", 50));
        pieChart.setData(pieChartData);
    }    
    
}
