package sample;

import javafx.application.Application;
import javafx.application.HostServices;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.net.URL;


public class sceneee extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        try{
            //打开百度
            HostServices host = getHostServices();
            host.showDocument("www.baidu.com");

            //用这种方式下载资源然后转化为String类型
            URL url = getClass().getClassLoader().getResource("image/mm.jpg");
            String path = url.toExternalForm();




            //stage上面要有一个scene，scene上要有node，也就是组件
            javafx.scene.control.Button button = new Button("按钮");
            button.setPrefWidth(200);
            button.setPrefHeight(200);

            button.setCursor(Cursor.CLOSED_HAND);

            Group group = new Group();
            group.getChildren().add(button);

            Scene scenee  = new Scene(group);

            //scenee.setCursor(Cursor.E_RESIZE);
            scenee.setCursor(Cursor.cursor(path));


            stage.setScene(scenee); //让stage和scene关联上
            stage.setWidth(800);
            stage.setHeight(800);
            stage.setTitle("javaFx");
            stage.show();
        }catch (Exception e){
            // Print the wrapper exception:
            System.out.println("Wrapper exception: " + e);

            // Print the 'actual' exception:
            System.out.println("Underlying exception: " + e.getCause());
        }

    }

    public static void main(String[] args){
        launch(args);
    }
}
