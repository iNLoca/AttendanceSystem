/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendancesystem.gui.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXListCell;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXTextArea;
import java.io.IOException;
import java.net.URL;
import java.util.EventObject;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
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
    private JFXListView<Label> listview;
    @FXML
    private JFXListCell<Label> sde2;
    @FXML
    private JFXListCell<Label> sco2;
    @FXML
    private JFXListCell<Label> dbo;
    @FXML
    private JFXListCell<Label> ito;
    @FXML
    private JFXButton confirmbtn;
    @FXML
    private JFXTextArea absenttext;
    
    boolean clickPresentButton=false;
    boolean clickAbsentButton=false;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
        listview.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            // = newValue;
           listview.setCellFactory(sde2 -> new JFXListCell<>());
           sde2.isPressed();
        });
      
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
    private void clickPresent(ActionEvent event) {
        clickPresentButton=true;              
    }

    @FXML
    private void clickAbsent(ActionEvent event) {
        clickAbsentButton=true;
        
       
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

    @FXML
    private void clicksde2(MouseEvent event) {
                
        if (sde2 != null) {
       
        sde2.isPressed();
    }else 
        {
        sde2.setText("WrongAGIAN");
        }
        System.out.println("Wrong");

    }
}