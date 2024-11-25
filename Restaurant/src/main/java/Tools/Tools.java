package Tools;

import Path.Path;
import javafx.geometry.Pos;
import javafx.scene.control.ContentDisplay;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.scene.text.Text;
import javafx.scene.control.Label;

import java.awt.*;

public class Tools {

    public static void InsertImage(String url, int width, int height, Label Logo){
        Image imagen = new Image(Tools.class.getResource(url).toExternalForm());
        ImageView imageView = new ImageView(imagen);
        imageView.setFitHeight(height);
        imageView.setFitWidth(width);
        imageView.setPreserveRatio(true);
        Logo.setGraphic(imageView);
        Logo.setContentDisplay(ContentDisplay.CENTER);
        Logo.setAlignment(Pos.CENTER);

    }

}
