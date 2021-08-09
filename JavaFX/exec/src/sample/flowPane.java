package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.lang.management.BufferPoolMXBean;

public class flowPane extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Button b1 = new Button("button1");
        Button b2 = new Button("button2");
        Button b3 = new Button("button3");
        Button b4 = new Button("button4");
        Button b5 = new Button("button5");
        Button b6 = new Button("button6");
        Button b7 = new Button("button7");
        Button b8 = new Button("button8");

        FlowPane flow = new FlowPane();
        flow.setStyle("-fx-background-color: bisque");

        flow.setPadding(new Insets(10));

        flow.setMargin(b1, new Insets(10));

        flow.setAlignment(Pos.CENTER); //设置居中

        flow.setHgap(10); //子组件之间的水平间距
        flow.setVgap(10);  //垂直间距

        flow.setOrientation(Orientation.VERTICAL); //让组件垂直地放，，不然默认是水平放

        flow.getChildren().addAll(b1,b2,b3,b4,b5,b6,b7,b8);

        Scene scene = new Scene(flow);
        stage.setScene(scene);
        stage.setTitle("flowPane");
        stage.setWidth(800);
        stage.setHeight(800);
        stage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
