package Controllers;

import Tools.Tools;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.scene.control.Label;
import Path.Path;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.awt.*;


public class LoginController {
    @FXML
    private Label Logo;

    @FXML
    public void initialize(){
        Tools.InsertImage(Path.LOGO, 200, 209, Logo);
    }

}
