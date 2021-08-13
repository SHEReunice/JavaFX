package sample;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //stage就是一个窗口
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.getIcons().add(new Image("/image/gg.png"));
//        primaryStage.setIconified(true);//设置最小化
//        primaryStage.setMaximized(true); //设置最大化
//        primaryStage.close();//关闭
//        primaryStage.setWidth(500);
//        primaryStage.setHeight(400);
//        primaryStage.setMaxHeight(1000);
//        primaryStage.setMaxWidth(1000); //最大高度和宽度
//        primaryStage.setMinHeight(50);
//        primaryStage.setMinWidth(50);//最小宽度和高度
//        primaryStage.setResizable(false); //设置不可改变窗口大小


//        primaryStage.getWidth();//获取宽度，如果前面没有设置宽和高，就要放在show方法后面才能获得宽和高
//
//        primaryStage.heightProperty().addListener(new ChangeListener<Number>() {
//            //动态地获取高度
//            @Override
//            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
//                //observableValue是观察对象
//                //number是旧值，t1是新值
//                System.out.println(t1.doubleValue());
//            }
//        });
//        primaryStage.widthProperty().addListener(new ChangeListener<Number>() {
//            @Override
//            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
//                System.out.println(t1.doubleValue());
//            }
//        });
//        primaryStage.setFullScreen(true); //设置全屏
//        primaryStage.setScene(new Scene(new Group()));//有这个scene才能设置全屏


        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();  //显示窗口
    }




    public static void main(String[] args) {
        launch(args);
    }
}
