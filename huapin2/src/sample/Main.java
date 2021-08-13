package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.BufferedReader;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        VBox centerVBox = new VBox();
        HBox wholeHBox = new HBox();
        HBox bottomHBox = new HBox();
        HBox centerHBox = new HBox();
        centerHBox.setStyle("-fx-background-color: rgba(255,240,245,0.7);");
        VBox rightVBox = new VBox();
        rightVBox.setStyle("-fx-background-color: rgba(255,245,238,0.5)");


        GridPane screenGridPane = new GridPane();
        int r = 0, c = 0;
        for(int i = 2; i <= 7; i++){
            Image image = new Image("\\image\\" + i + ".jpg");
            ImageView iv = new ImageView(image);
            screenGridPane.add(iv,r,c);
            r++;
            if(r == 2){
                r = 0;
                c ++;
            }
            GridPane.setHgrow(iv,Priority.ALWAYS);
            GridPane.setVgrow(iv,Priority.ALWAYS);
        }
        r = 0;
        for(int i = 2; i <= 7; i++){
            Image image = new Image("\\image\\" + i + ".jpg");
            ImageView iv = new ImageView(image);
            screenGridPane.add(iv,r,c);
            r++;
            if(r == 2){
                r = 0;
                c ++;
            }
            GridPane.setHgrow(iv,Priority.ALWAYS);
            GridPane.setVgrow(iv,Priority.ALWAYS);
        }
        screenGridPane.setHgap(40);
        screenGridPane.setVgap(40);
        screenGridPane.setPadding(new Insets(10));

        ScrollPane scp = new ScrollPane();
        GridPane autoGridPane = new GridPane();
        r = 0;
        c = 0;
        for(int i = 2; i <= 7; i++){
            Image image = new Image("\\image\\" + i + ".jpg");
            ImageView iv = new ImageView(image);
            autoGridPane.add(iv,r,c);
            r++;
            if(r == 1){
                r = 0;
                c ++;
            }
            GridPane.setHgrow(iv,Priority.ALWAYS);
            GridPane.setVgrow(iv,Priority.ALWAYS);
        }
        autoGridPane.setHgap(40);
        autoGridPane.setVgap(40);
        autoGridPane.setPadding(new Insets(10));
//        Image image1 = new Image("\\image\\1.jpg");
//        Image image2 = new Image("\\image\\6.jpg");
//        Image image3 = new Image("\\image\\3.jpg");
//        Image image4 = new Image("\\image\\4.jpg");
////        Image image5 = new Image("\\image\\5.jpg");
//        Image image6 = new Image("\\image\\6.jpg");
//        Image image7 = new Image("\\image\\7.jpg");
//        Image image8 = new Image("\\image\\8.jpg");
//        ImageView iv1 = new ImageView(image1);
//       ImageView iv2 = new ImageView(image2);
//        ImageView iv3 = new ImageView(image3);
//        ImageView iv4 = new ImageView(image4);
////        ImageView iv5 = new ImageView(image5);
//        ImageView iv6 = new ImageView(image6);
//        ImageView iv7 = new ImageView(image7);
//        ImageView iv8 = new ImageView(image8);
//
//        screenGridPane.setVgap(20);
//        screenGridPane.setVgap(20);
//        screenGridPane.setPadding(new Insets(50));
//
//        screenGridPane.add(iv2,0,0);
////        screenGridPane.add(iv2,1,0);
//        screenGridPane.add(iv3,1,0);
//        screenGridPane.add(iv4,0,1);
////        screenGridPane.add(iv5,0,1);
//        screenGridPane.add(iv6,1,1);
//        screenGridPane.add(iv7,0,2);
//        screenGridPane.add(iv8,1,2);
//        GridPane.setHgrow(iv8, Priority.ALWAYS);
//        GridPane.setHgrow(iv2, Priority.ALWAYS);
//        GridPane.setHgrow(iv3, Priority.ALWAYS);
//        GridPane.setHgrow(iv4, Priority.ALWAYS);
//        GridPane.setHgrow(iv7, Priority.ALWAYS);
//        GridPane.setHgrow(iv6, Priority.ALWAYS);
//        GridPane.setVgrow(iv2,Priority.ALWAYS);
//        GridPane.setVgrow(iv3,Priority.ALWAYS);
//        GridPane.setVgrow(iv4,Priority.ALWAYS);
//        GridPane.setVgrow(iv6,Priority.ALWAYS);
//        GridPane.setVgrow(iv7,Priority.ALWAYS);
//        GridPane.setVgrow(iv8,Priority.ALWAYS);
        Separator sep = new Separator(Orientation.VERTICAL); //竖直的
        sep.setPrefWidth(100);


        sep.setHalignment(HPos.CENTER);
        sep.setStyle("-fx-border-style:dotted;"+
                "-fx-border-color: cornflowerblue;"
                );



        screenGridPane.setAlignment(Pos.CENTER); //全部居中放
        autoGridPane.setAlignment(Pos.CENTER);

        ScrollPane scpp = new ScrollPane();
        scpp.setContent(screenGridPane);
        ScrollPane scppp = new ScrollPane();
        scppp.setContent(autoGridPane);



        centerHBox.getChildren().addAll(scpp,sep,scppp);
        centerHBox.setStyle("-fx-padding: 20;" +
                "-fx-border-style: dotted;" +
                "-fx-border-width: 5;" +
                "-fx-border-insets: 30;" +
                "-fx-border-radius: 10;" +
                "-fx-border-color: rgba(132,112,255,.6);"+
                "-fx-background-color: rgba(255,228,225,0.5);"

                );
        //右边VBox上的内容

        FlowPane kuaifp1 = new FlowPane();
        Button kuaijie = new Button("设置快捷键");
        kuaifp1.getChildren().add(kuaijie);
        kuaifp1.setAlignment(Pos.CENTER);

        HBox rightCenterVBox = new HBox();

        AnchorPane bottomAP = new AnchorPane();
        Image imb = new Image("\\image\\nn.jpg");
        ImageView ivb = new ImageView(imb);

        rightVBox.getChildren().addAll(kuaifp1,rightCenterVBox,ivb);


//        ScrollBar sc = new ScrollBar();
//        sc.setOrientation(Orientation.VERTICAL);  //设置垂直
 //       centerHBox.setOpacity(0.5);

//        centerVBox.getChildren().addAll(centerHBox,bottomHBox);

        wholeHBox.getChildren().addAll(centerHBox,rightVBox);
//        AnchorPane root = new AnchorPane();
//        root.getChildren().add(wholeHBox);

//        wholeHBox.setStyle("-fx-background-color: beige");


//
        ImageView ivbb = new ImageView("image/mm.jpg");
        ImageView ivbbb = new ImageView("image/gg.png");
        AnchorPane an = new AnchorPane();
        TabPane tabpane = new TabPane();
        Tab tab1 = new Tab("壁纸");
        Tab tab2 = new Tab("分屏");
        tab2.setGraphic(ivbb);
        tab2.setContent(wholeHBox);
        tab1.setGraphic(ivbbb);
        tabpane.getTabs().addAll(tab1,tab2);
        an.getChildren().addAll(tabpane);

        // 监听窗口面板宽度变化
        primaryStage.widthProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                // 更新GUI组件
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        Scene sceneee = primaryStage.getScene();

                        double width = primaryStage.getWidth();
                        centerHBox.setPrefWidth(width * 0.8);
//                        bottomHBox.setPrefWidth(width * 0.8);
                        rightVBox.setPrefWidth(width * 0.2);
                    }
                });
            }

        });
        // 监听窗口面板高度变化
        primaryStage.heightProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        Scene sceneee = primaryStage.getScene();

                        double height = primaryStage.getHeight();
                        centerHBox.setPrefHeight(height * 0.8);
//                        bottomHBox.setPrefHeight(height*0.2);
                        rightVBox.setPrefHeight(height);
                    }
                });
            }
        });





        primaryStage.setTitle("Hello World");
        Scene scene = new Scene(an);
        primaryStage.setScene(scene);
        primaryStage.setHeight(800);
        primaryStage.setWidth(1300);
        primaryStage.show();

        tabpane.setPrefWidth(scene.getWidth());
        tabpane.setPrefHeight(scene.getHeight());
        centerVBox.setPrefWidth(scene.getWidth() * 3 / 4);
        centerVBox.setPrefHeight(scene.getHeight() * 0.8);
        rightVBox.setPrefWidth(scene.getWidth() / 4);
        rightVBox.setPrefHeight(scene.getHeight());
        sep.setPrefHeight(scene.getHeight());
//        sc.setVisibleAmount(50); //设置滚动条长度



    }


    public static void main(String[] args) {
        launch(args);
    }
}
