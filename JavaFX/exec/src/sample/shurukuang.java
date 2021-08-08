package sample;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.Stage;



public class shurukuang extends Application {
    @Override
    public void start(Stage stage) throws Exception {


        Group group = new Group();
        Scene scene = new Scene(group);
        stage.setScene(scene);
        stage.setTitle("输入框");
        stage.setWidth(800);
        stage.setHeight(800);

        PasswordField ptext = new PasswordField();
        ptext.setLayoutX(300);
        ptext.setLayoutY(100);
        ptext.setFont(Font.font(14));

        Label label = new Label();
        label.setText("我是标签");
        label.setLayoutX(500);
        label.setLayoutY(100);
        label.setFont(Font.font(12));
        label.setTextFill(Paint.valueOf("red"));


        TextField text = new TextField();
 //       text.setText("这是文本");

        text.setLayoutX(100);
        text.setLayoutY(100);
        text.setFont(Font.font(14));

        Tooltip tip = new Tooltip("这是提示");
        tip.setFont(Font.font(12));
        text.setTooltip(tip);

        text.setPromptText("请输入七个字以下");
        text.setFocusTraversable(false); //没啥用

        //回车触发
        text.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("文本框单击");
            }
        });



        //控制只能输入7个字
        text.textProperty().addListener(new ChangeListener<String>() {
            @Override
            //s是旧的值，t1是新的值
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
//                System.out.println(t1);
                if(t1.length() > 7){  //超过7个字，都用之前的值
                    text.setText(s);
                }
            }
        });

        //选中的部分
        text.selectedTextProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                System.out.println(t1);
            }
        });


        label.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println("标签单击");
            }
        });





        group.getChildren().add(text);
        group.getChildren().add(ptext);
        group.getChildren().add(label);


        stage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}
