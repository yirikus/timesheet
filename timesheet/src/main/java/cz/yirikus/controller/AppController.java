package cz.yirikus.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created with IntelliJ IDEA.
 * User: TERRMITh
 * Date: 4.2.16
 * Time: 22:01
 * To change this template use File | Settings | File Templates.
 */
public class AppController implements Initializable {
    @FXML
    private Label label;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("click");
        label.setText(label.getText() + ".");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
