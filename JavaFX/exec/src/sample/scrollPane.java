package sample;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class scrollPane extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        AnchorPane an = new AnchorPane();

        VBox box = new VBox();

        HBox hbox = new HBox();
        for(int i = 0; i < 10; i++){
            hbox.getChildren().add(new Button("button" + i));
        }

        VBox vbox = new VBox(10);
        for(int i = 0; i < 10; i++){
            vbox.getChildren().add(new Button("button" + i));
        }

        ScrollPane scp = new ScrollPane();
        scp.setPrefHeight(200);
        scp.setPrefWidth(200);

        box.getChildren().addAll(hbox,vbox);

        scp.setContent(box);

        an.getChildren().add(scp);

        Scene scene = new Scene(an);
        stage.setScene(scene);
        stage.setTitle("ScrollPane");
        stage.setWidth(800);
        stage.setHeight(800);
        stage.show();

        scp.hvalueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                System.out.println(t1);
            }
        });



    }

    public static void main(String[] args){
        launch(args);
    }
}
