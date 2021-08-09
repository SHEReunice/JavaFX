package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class borderPane extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Button b = new Button("buttoon1");
        AnchorPane a1 = new AnchorPane();
        a1.setPrefWidth(100);
        a1.setPrefHeight(100);
        a1.setStyle("-fx-background-color: bisque");

        AnchorPane a2 = new AnchorPane();
        a2.setPrefWidth(100);
        a2.setPrefHeight(100);
        a2.setStyle("-fx-background-color: cadetblue");

        AnchorPane a3 = new AnchorPane();
        a3.setPrefWidth(100);
        a3.setPrefHeight(100);
        a3.setStyle("-fx-background-color: darkkhaki");


        AnchorPane a4 = new AnchorPane();
        a4.setPrefWidth(100);
        a4.setPrefHeight(100);
        a4.setStyle("-fx-background-color: aliceblue");

        AnchorPane a5 = new AnchorPane();
        a5.setPrefWidth(100);
        a5.setPrefHeight(100);
        a5.setStyle("-fx-background-color: cornflowerblue");

        BorderPane bor = new BorderPane();
        bor.setStyle("-fx-background-color: dimgray");
        bor.setTop(b);
        bor.setBottom(a2);
        bor.setLeft(a3);
        bor.setRight(a4);
        bor.setCenter(a5);

        bor.setPadding(new Insets(10)); //内边距
        bor.setMargin(a1,new Insets(20)); //某个子组件的外边距

        bor.setAlignment(b, Pos.BOTTOM_LEFT);  //给某个组件设置堆砌方式，，如果这里放的是a1，是表现不出来的，因为a1它会填充没满的地方

        Button bu = (Button)bor.getTop();//获取顶部的组件
        System.out.println(bu.getText());

        Scene scene = new Scene(bor);
        stage.setScene(scene);
        stage.setTitle("borderPane");
        stage.setWidth(800);
        stage.setHeight(800);
        stage.show();

    }
}
