package Controllers;

import Path.Path;
import Tools.Tools;
import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class AlimentoController {
    @FXML
    private Label imagen;

    @FXML
    public void initialize(){

        Tools.InsertImage(Path.LOGO, 200, 209, imagen);

    }
}
