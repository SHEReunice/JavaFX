package sample;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;
import javafx.stage.Stage;



public class button_double extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Button b1 = new Button();
        b1.setText("这是按钮");

        b1.setLayoutY(100);
        b1.setLayoutX(100);
        b1.setPrefHeight(200);
        b1.setPrefWidth(400);
        b1.setFont(Font.font(40));

        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("b1的单击事件");
            }
        });

        b1.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<javafx.scene.input.MouseEvent>() {



            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println("鼠标单击");


                System.out.println("当前鼠标按键=" + mouseEvent.getButton().name());

                if(mouseEvent.getClickCount() == 2 && mouseEvent.getButton().name().equals(MouseButton.PRIMARY.name())){
                   //鼠标左键双击
                    System.out.println("双击事件");
                }
            }
        });

        b1.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {

 //               System.out.println("按下 = " + keyEvent.getCode().getName());
                System.out.println("按下");

                if(keyEvent.getCode().getName().equals(KeyCode.A.getName())){
                    //只有按A才显示
                    System.out.println("按下 = " + keyEvent.getCode().getName());
                }
            }
        });

        b1.setOnKeyTyped(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                System.out.println("释放 = "+keyEvent.getCode().getName());
                System.out.println("释放");
            }
        });

        Group group = new Group();
        group.getChildren().add(b1);
        Scene scene = new Scene(group);
        stage.setScene(scene);
        stage.setTitle("button_double");
        stage.setHeight(800);
        stage.setWidth(800);
        stage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}
