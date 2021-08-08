package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class button_intro extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Button b1 = new Button();
        b1.setText("这是按钮");

        b1.setLayoutY(100);
        b1.setLayoutX(100);
        b1.setPrefHeight(200);
        b1.setPrefWidth(400);

        b1.setFont(Font.font("sans-serif",40));
//        b1.setTextFill(Paint.valueOf("#CD0000"));

        Button b2 = new Button("b2");
        b2.setLayoutY(300);
        b2.setLayoutX(700);
        b2.setPrefHeight(100);
        b2.setPrefWidth(100);

//        BackgroundFill bgf = new BackgroundFill(Paint.valueOf("#8FBC8F55"), new CornerRadii(20), new Insets(10));
////#8FBC8F55最后两位表示透明度
//        Background bg = new Background(bgf);
//        b1.setBackground(bg);
//
//        BorderStroke strokes = new BorderStroke(Paint.valueOf("#8A2BE2"), BorderStrokeStyle.DOTTED, new CornerRadii(20), new BorderWidths(10));
//
//        Border bo = new Border(strokes);
//
//        b1.setBorder(bo);

        b1.setStyle("-fx-background-color:#7CCD7C;" + "-fx-background-radius:20;" + "-fx-text-fill: bisque;");

        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Button bu = (Button)actionEvent.getSource();
                System.out.println("b1的文本是：" + bu.getText());
            }
        });


        Group group = new Group();
        group.getChildren().add(b2);
        group.getChildren().add(b1);
        Scene scene = new Scene(group);
        stage.setScene(scene);
        stage.setTitle("button");
        stage.setHeight(800);
        stage.setWidth(800);
        stage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
