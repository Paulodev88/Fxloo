package Controller;

import javafx.fxml.FXML;

import javafx.event.ActionEvent;

public class DetailsController {

    @FXML
    protected void btBack(ActionEvent e){

        Main.changeScene("main");
    }
}
