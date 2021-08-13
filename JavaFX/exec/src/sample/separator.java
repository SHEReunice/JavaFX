package sample;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.HPos;
import javafx.geometry.Orientation;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Separator;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class separator extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        AnchorPane an = new AnchorPane();


        HBox hbox = new HBox();

        Button b1 = new Button("button1");
        Button b2 = new Button("button2");

        Separator sep = new Separator(Orientation.VERTICAL); //竖直的
        sep.setPrefWidth(300);
        sep.setPrefHeight(300);

        sep.setHalignment(HPos.LEFT);

        sep.setStyle("-fx-background-color: blueviolet");
    //    sep.setValignment(VPos.BOTTOM);




        hbox.getChildren().addAll(b1,sep,b2);
        an.getChildren().add(hbox);

        Scene scene = new Scene(an);
        stage.setScene(scene);
        stage.setTitle("Separtor");
        stage.setWidth(800);
        stage.setHeight(800);
        stage.show();

    }
    public static void main(String[] args){
        launch(args);
    }
}
