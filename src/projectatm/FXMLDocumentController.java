/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectatm;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author zendy bramantia
 */
public class FXMLDocumentController implements Initializable {
    
    String pin="";
    String PIN="1234";
    int kesempatan=3;
    int tmp;

    @FXML
    private JFXButton button1;
    @FXML
    private JFXButton button2;
    @FXML
    private JFXButton button3;
    @FXML
    private JFXButton button4;
    @FXML
    private JFXButton button5;
    @FXML
    private JFXButton button6;
    @FXML
    private JFXButton button7;
    @FXML
    private JFXButton button8;
    @FXML
    private JFXButton button9;
    @FXML
    private JFXButton buttonc;
    @FXML
    private JFXButton button0;
    @FXML
    private JFXButton buttonok;
    @FXML
    private JFXPasswordField editPin;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void tekan1(ActionEvent event) {
        pin +="1";
        editPin.setText(pin);
    }

    @FXML
    private void tekan2(ActionEvent event) {
        pin +="2";
        editPin.setText(pin);
    }

    @FXML
    private void tekan3(ActionEvent event) {
        pin +="3";
        editPin.setText(pin);
    }

    @FXML
    private void tekan4(ActionEvent event) {
        pin +="4";
        editPin.setText(pin);
    }

    @FXML
    private void tekan5(ActionEvent event) {
        pin +="5";
        editPin.setText(pin);        
    }

    @FXML
    private void tekan6(ActionEvent event) {
        pin +="6";
        editPin.setText(pin);        
    }

    @FXML
    private void tekan7(ActionEvent event) {
        pin +="7";
        editPin.setText(pin);        
    }

    @FXML
    private void tekan8(ActionEvent event) {
        pin +="8";
        editPin.setText(pin);        
    }

    @FXML
    private void tekan9(ActionEvent event) {
        pin +="9";
        editPin.setText(pin);        
    }

    @FXML
    private void tekanc(ActionEvent event) {
        pin ="";
        editPin.setText(pin);        
    }

    @FXML
    private void tekan0(ActionEvent event) {
        pin +="1";
        editPin.setText(pin);        
    }

    @FXML
    private void tekanok(ActionEvent event) {
        if(pin.equals(PIN)){
            try {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("FXMLMenuAwal.fxml"));
                Scene scene = new Scene (fxmlLoader.load(),830,450);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.setTitle("MenuAwal");
                stage.show();
            }
            catch (IOException e){
                System.out.println("Failed to create new Window."+e);
            }
        }
        else {
            kesempatan -=1;
            JOptionPane.showMessageDialog(null,"PIN Salah \n Tersisa "+kesempatan+" kesempatan Lagi !");
            editPin.setText("");
            pin="";
            if(kesempatan ==0){
                System.exit(0);
            }
        }
    }
    
}
