package sample;

import javafx.application.Application;
import javafx.collections.ListChangeListener;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;



public class Group_introduction extends Application {

    int i = 10;
    @Override
    public void start(Stage stage) throws Exception {
        Button b1 = new Button("b1");
        Button b2 = new Button("b2");
        Button b3 = new Button("b3");

        b1.setLayoutX(0);
        b1.setLayoutY(10);
        b1.setPrefHeight(50);
        b1.setPrefWidth(50);

        b2.setLayoutX(200);
        b2.setLayoutY(10);
        b2.setPrefHeight(50);
        b2.setPrefWidth(50);

        b3.setLayoutX(400);
        b3.setLayoutY(10);
        b3.setPrefHeight(50);
        b3.setPrefWidth(50);

        Group group = new Group();
//        group.getChildren().add(b1);
//        group.getChildren().add(b2);
//        group.getChildren().add(b3);

        group.getChildren().addAll(b1,b2,b3);


//        System.out.println(group.contains(0,10));  //检测这个点有没有东西，返回一个布尔值

//        group.setOpacity(0.5); //设置group的透明度，也会影响到子组件

//        group.setAutoSizeChildren(false); //不自动设置子组件的大小，就变为0，0
//        group.getChildren().clear();

        group.getChildren().addListener(new ListChangeListener<Node>() {
            @Override
            public void onChanged(Change<? extends Node> change) {
                System.out.println("当前子组件数量：" + change.getList().size());

            }
        });

       Object[] obj =  group.getChildren().toArray(); //将所有元素放在一个数组里面，但是返回的是一个Object数组

        System.out.println(obj.length);

        for(Object o : obj){
            Button bu = (Button) o;
            bu.setPrefWidth(100);
            bu.setPrefHeight(100);
        }



        b1.setOnAction(new EventHandler<ActionEvent>() {  //b1的单击事件
            @Override
            public void handle(ActionEvent actionEvent) {
                i = i + 10;
                Button b4 = new Button("b4");
                b4.setLayoutX(600);
                b4.setLayoutY(i);
                b4.setPrefWidth(100);
                b4.setPrefHeight(100);
                group.getChildren().add(b4);
            }
        });

        Scene scene = new Scene(group);
        stage.setScene(scene);
        stage.setTitle("group");
        stage.setWidth(800);
        stage.setHeight(800);
        stage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
