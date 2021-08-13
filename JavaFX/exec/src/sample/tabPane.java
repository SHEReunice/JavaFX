package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class tabPane extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        AnchorPane an = new AnchorPane();

        TabPane tabpane = new TabPane();
        tabpane.setPrefHeight(300);
        tabpane.setPrefWidth(300);
        tabpane.setStyle("-fx-background-color: antiquewhite");
        Tab tab1 = new Tab("tab1");
        Tab tab2 = new Tab("tab2");
        Tab tab3 = new Tab("tab3");

        HBox hbox = new HBox(10);
        hbox.setStyle("-fx-background-color: cornflowerblue");
        hbox.setAlignment(Pos.CENTER);
        hbox.getChildren().addAll(new Button("button1"),new Button("button2"));

        tab1.setContent(hbox);

        VBox vbox = new VBox(10);
        vbox.setStyle("-fx-background-color: aqua");
        vbox.setAlignment(Pos.CENTER);
        vbox.getChildren().addAll(new Button("button1"),new Button("button2"));

        tab2.setContent(vbox);
        tabpane.getTabs().addAll(tab1,tab2,tab3);

        AnchorPane.setTopAnchor(tabpane,100.0);
        AnchorPane.setLeftAnchor(tabpane,100.0);
        an.getChildren().addAll(tabpane);

        Scene scene = new Scene(an);
        stage.setScene(scene);
        stage.setTitle("TabPane");
        stage.setWidth(800);
        stage.setHeight(800);

        stage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
