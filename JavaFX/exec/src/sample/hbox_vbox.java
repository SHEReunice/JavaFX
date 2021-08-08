package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class hbox_vbox extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Button b1 = new Button("button1");

        Button b2 = new Button("button2");

        Button b3 = new Button("button3");

        Button b4 = new Button("button4");

        Button b5 = new Button("button5");

        Button b6 = new Button("button6");

        AnchorPane ap = new AnchorPane();
        ap.setStyle("-fx-background-color: bisque");
        HBox box = new HBox();
        box.setStyle("-fx-background-color: darkkhaki");
        box.setPrefWidth(400);
        box.setPrefHeight(400);
        box.setPadding(new Insets(10)); //内边距
        box.setSpacing(10); //子组件的边距
        box.setMargin(b1, new Insets(10));  //外边距
        box.setAlignment(Pos.CENTER);//居中

        box.getChildren().addAll(b1,b2,b3,b4,b5,b6);

        ap.getChildren().add(box);

        Scene scene = new Scene(ap);
        stage.setScene(scene);
        stage.setTitle("HBoxVBox");
        stage.setHeight(800);
        stage.setWidth(800);
        stage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
