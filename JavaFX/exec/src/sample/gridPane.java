package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

public class gridPane extends Application {
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

        GridPane grid = new GridPane();
        grid.setStyle("-fx-background-color: bisque");

        //设置组件在GridPane的第几行第几列
        grid.add(b1, 0, 0);
        grid.add(b2, 1, 0);
        grid.add(b3, 2, 0);
        grid.add(b4, 3, 0);
        grid.add(b5, 0, 1);
        grid.add(b6, 1, 1);
        grid.add(b7, 2, 1);
        grid.add(b8, 3, 1);

        grid.setHgap(10);
        grid.setVgap(10);

//        grid.setPadding(new Insets(10));
//
//        grid.setMargin(b1, new Insets(10));
//
//        grid.setAlignment(Pos.CENTER); //全部居中放


//        grid.setConstraints(b1, 1, 1);
//        grid.getChildren().add(b1);

        grid.getColumnConstraints().add(new ColumnConstraints(100)); //设置第一列间距
        grid.getRowConstraints().add(new RowConstraints(50));//设置第一行间距

        Scene scene = new Scene(grid);
        stage.setScene(scene);
        stage.setTitle("flowPane");
        stage.setWidth(800);
        stage.setHeight(800);
        stage.show();
    }
}
