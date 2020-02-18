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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
     JFXListView<Label> list = new JFXListView<Label>();
     for(int i = 0 ; i < 4 ; i++) list.getItems().add(new Label("Item " + i));
     list.getStyleClass().add("StudentRecord.css");
    }    

    @FXML
    private void clickPresent(ActionEvent event) {
        
       
    }

    @FXML
    private void clickAbsent(ActionEvent event) {
        
       absenttext.visibleProperty().bind(absentbtn.selectedProperty()); //The best line ever!!!
    }

    @FXML
    private void clickConfirm(ActionEvent event) throws IOException {
        
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/view/Confirmation.fxml"));
        Parent root = loader.load();
        ConfirmationController cctrl = loader.getController();
        
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
   
   }

    @FXML
    private void clickedmabsent(MouseEvent event) {
      
    }

    @FXML
    private void clickedPresent(MouseEvent event) {
        
    }
}
