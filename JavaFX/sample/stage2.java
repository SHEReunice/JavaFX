package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.awt.event.MouseListener;

public class stage2 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
//        stage.setOpacity(0.5); //设置透明度
//        stage.setAlwaysOnTop(true);//设置置顶
//        stage.setX(100);
//        stage.setY(100); //屏幕左上角是0，0
//        stage.xProperty().addListener(new ChangeListener<Number>() {
//            //动态获取窗口左上角坐标
//            @Override
//            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
//                System.out.println(t1.doubleValue());
//            }
//        });
//        stage.yProperty().addListener(new ChangeListener<Number>() {
//            @Override
//            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
//                System.out.println(t1.doubleValue());
//            }
//        });
//
//        //设置窗口类型
//        Stage s1 = new Stage();
//        s1.setTitle("s1");
//        s1.initStyle(StageStyle.DECORATED);
//        s1.show();
//
//
//        Stage s2 = new Stage();
//        s2.setTitle("s2");
//        s2.initStyle(StageStyle.TRANSPARENT); //s2是透明的
//        s2.show();
//
//        Stage s3 = new Stage();
//        s3.setTitle("s3");
//        s3.initStyle(StageStyle.UNDECORATED);//白色的
//        s3.show();
//
//        Stage s4 = new Stage();
//        s4.setTitle("s4");
//        s4.initStyle(StageStyle.UNIFIED);
//        s4.show();
//
//        Stage s5 = new Stage();
//        s5.setTitle("s5");
//        s5.initStyle(StageStyle.UTILITY);//只有一个叉
//        s5.show();
//        Platform.exit();//关闭所有窗口

        //设置模态化窗口
//        Stage s1 = new Stage();
//        s1.setTitle("s1");
//        s1.show();
//
//
//        Stage s2 = new Stage();
//        s2.setTitle("s2");
//        s2.initOwner(s1);
//        s2.initModality(Modality.WINDOW_MODAL);//s2用的时候不能用s1
//        s2.show();
//
//        Stage s3 = new Stage();
//        s3.setTitle("s3");
//        s3.initModality(Modality.APPLICATION_MODAL);//用s3的时候不能用其它窗口
//        s3.show();

        stage.show();
    }
    public static void main(String[] args)
    {
        launch(args);
    }
}
