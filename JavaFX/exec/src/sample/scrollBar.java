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
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class scrollBar extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Button bu = new Button("bu");

        AnchorPane an = new AnchorPane();

        VBox vbox = new VBox(10);
        for(int i = 0; i < 10; i++){
            vbox.getChildren().add(new Button("button" + i));
        }

        ScrollBar sc = new ScrollBar();
        sc.setOrientation(Orientation.VERTICAL);  //设置垂直
        sc.setVisibleAmount(50); //设置滚动条长度
//        sc.setValue(20);

        sc.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                System.out.println(t1);
                vbox.setLayoutY(-t1.doubleValue());
            }
        });

        AnchorPane.setLeftAnchor(sc,100.0);
        AnchorPane.setLeftAnchor(bu,200.0);
        an.getChildren().addAll(vbox,sc,bu);



        Scene scene = new Scene(an);
        stage.setScene(scene);
        stage.setTitle("ScrollPane");
        stage.setWidth(800);
        stage.setHeight(800);
        stage.show();

        sc.setPrefHeight(vbox.getHeight());

        sc.setMax(vbox.getHeight());

        sc.setUnitIncrement(10);
        sc.setBlockIncrement(100);

        bu.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                sc.increment();//往下拉
                sc.decrement();//往上拉
            }
        });


    }
    public static void main(String[] args){
        launch(args);
    }
}
