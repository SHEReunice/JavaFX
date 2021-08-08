package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class anchorPane extends Application {
    @Override
    public void start(Stage stage) throws Exception {

//        AnchorPane 绝对布局
        AnchorPane ap = new AnchorPane();
        ap.setStyle("-fx-background-color: bisque");
        AnchorPane ap2 = new AnchorPane();
        ap2.setStyle("-fx-background-color: cadetblue");
        ap.getChildren().add(ap2);
        ap.setTopAnchor(ap2,0.0);
        ap.setLeftAnchor(ap2,0.0);

        ap2.setPrefHeight(200);
        ap2.setPrefWidth(200);





//        Group group = new Group();
//        group.setOnMouseClicked(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent mouseEvent) {
//                System.out.println("group的单击事件");
//            }
//        });
//        group.setStyle("-fx-background-color: aquamarine");
        Scene scene = new Scene(ap);
        stage.setScene(scene);
        stage.setTitle("AnchorPane");
        stage.setHeight(800);
        stage.setWidth(800);
        stage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}
