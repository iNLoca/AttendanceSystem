/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendancesystem.gui.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXListCell;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXTextArea;
import java.io.IOException;
import java.net.URL;
import java.util.EventObject;
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
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import static javafx.scene.paint.Color.color;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author mac
 */
public class StudentRecordAttendanceController implements Initializable {

    
    @FXML
    private Label Label;
    @FXML
    private JFXCheckBox presentbtn;
    @FXML
    private JFXCheckBox absentbtn;
    @FXML
    private JFXListView<String> listview;
    @FXML
    private JFXButton confirmbtn;
    @FXML
    private JFXTextArea absenttext;
    @FXML
    private JFXDatePicker dp;
    @FXML
    private Label lbl_popup;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        absenttext.visibleProperty().set(false);
        lbl_popup.setVisible(false);
        listview.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        listview.getItems().add("DB/OS");
        listview.getItems().add("ITO2");
        listview.getItems().add("SCO2");
        listview.getItems().add("SDE2");
    
//        listview.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
//            // = newValue;
//           listview.setCellFactory(sde2 -> new JFXListCell<>());
//           sde2.isPressed();
           
        //});

     /*   
      listview.listViewProperty().addListener((listObj, oldList, newList) -> {
  if (newList != null) {
   
      JFXListView<String>listview newList.addListener((o, oldVal, newVal) -> {
        
        if (newVal.doubleValue() != 0) {
        
         
          });
      listview.selectedProperty().addListener((o, oldVal, newVal) -> {
        if (newVal) {
          selectionChanged = true;
        
     /*   
     JFXListView<String> listview = new JFXListView<String>();
     for(int i = 0 ; i < 4 ; i++) listview.getItems().add("sde2,sco2,dbo,ito");
     JFXListCell<String>sde2 = new JFXListCell<String>();
     listview.addListCell(sde2);
    
     listview.getStyleClass().add("StudentRecord.css");
    /*
     
      listview.setOnItemSelectedListener(new listview.OnItemSelectedListener(){
      @Override 
      public void onItemSelected(JFXListCell<String> sde2){
     
     }
     @Override
      public void onNothingSelected(listview<?>parent){
      
      }
    } );
     */  

    }
    @FXML
    private void clickPresent(ActionEvent event){
       absentbtn.setSelected(false);
       if(dp.getValue()==null)lbl_popup.setVisible(true);
       else lbl_popup.setVisible(false);
    }

    @FXML
    private void clickAbsent(ActionEvent event) {

        clickAbsentButton=true;
        
       

       presentbtn.setSelected(false);  

       absenttext.visibleProperty().bind(absentbtn.selectedProperty()); //The best line ever!!!
    }

    @FXML
    private void clickConfirm(ActionEvent event) throws IOException {
        
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/attendancesystem/gui/view/Confirmation.fxml"));
        Parent root = loader.load();
        ConfirmationController cctrl = loader.getController();
        
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        
        
   }

}