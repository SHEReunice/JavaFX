package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class kuaijiejian extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Button b1 = new Button();
        b1.setText("这是按钮");

        b1.setLayoutY(100);
        b1.setLayoutX(100);
        b1.setPrefHeight(200);
        b1.setPrefWidth(400);
        b1.setFont(Font.font(20));

        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                play();
            }
        });
        Group group = new Group();
        group.getChildren().add(b1);
        Scene scene = new Scene(group);

        //第一种
        KeyCombination kc1 = new KeyCodeCombination(KeyCode.C, KeyCombination.ALT_DOWN, KeyCombination.CONTROL_DOWN);
        Mnemonic mnemonic1 = new Mnemonic(b1,kc1);
        scene.addMnemonic(mnemonic1);

        //第二种
        KeyCombination kc2 = new KeyCharacterCombination("O", KeyCombination.ALT_DOWN);
        Mnemonic mnemonic2 = new Mnemonic(b1,kc2);
        scene.addMnemonic(mnemonic2);

        //第三种
        KeyCombination kc3 = new KeyCodeCombination(KeyCode.K, KeyCombination.SHIFT_DOWN, KeyCombination.CONTROL_DOWN,KeyCombination.ALT_DOWN,KeyCombination.META_DOWN,KeyCombination.SHORTCUT_DOWN);
        Mnemonic mnemonic3 = new Mnemonic(b1,kc3);
        scene.addMnemonic(mnemonic3);

        //第四种
        KeyCombination kccb = new KeyCodeCombination(KeyCode.Y, KeyCombination.SHORTCUT_DOWN);
        scene.getAccelerators().put(kccb, new Runnable() {
            @Override
            public void run() {
                System.out.println("run()方法");

                System.out.println(Thread.currentThread().getName());
                play();
            }
        });

        stage.setScene(scene);
        stage.setTitle("快捷键");
        stage.setHeight(800);
        stage.setWidth(800);
        stage.show();
    }

    public static void play(){
        System.out.println("setOnAction");
    }

    public static void main(String[] args){
        launch(args);
    }
}
