package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MainController {

    @FXML
    protected void btNewAction(ActionEvent e){
        System.out.println("Tá funfando");

        Main.changeScene("details");
    }
}
