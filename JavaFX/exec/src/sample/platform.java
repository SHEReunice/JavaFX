package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

public class platform extends Application {
    @Override
    public void start(Stage stage) throws Exception {
//        Platform.runLater(new Runnable() {  //稍后执行
//            @Override
//            public void run() {
//                System.out.println("run方法里面的线程名字 = " + Thread.currentThread().getName());
//                int i = 1;
//                while(i <= 10)
//                {
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println("i = " + i);
//
//                    i = i + 1;
//                }
//            }
//        });
//
//        System.out.println("runlater下面");
        stage.show();


//        Platform.setImplicitExit(true); //点击窗口的叉叉程序会退出，如果是false,点叉叉就只是窗口关闭，程序不会退出
//        Platform.exit();//退出程序
    }
    public static void main(String[] args){
        launch(args);
    }
}
