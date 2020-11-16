package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    public static void main(String[] args) {
        
        launch(MultipleViews.class);
        
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        BorderPane layout1 = new BorderPane();
        layout1.setTop(new Label("First view!"));
        Button button1 = new Button("To the second view!");
        layout1.setCenter(button1);
        Scene scene1 = new Scene(layout1, 400, 300);
        stage.setTitle("Multiple Views");
        stage.setScene(scene1);
        stage.show();
        
        VBox layout2 = new VBox();
        Button button2 = new Button("To the third view!");
        layout2.getChildren().addAll(button2, new Label("Second view!"));
        Scene scene2 = new Scene(layout2, 250, 150);
        
        button1.setOnAction(e -> {
            stage.setScene(scene2);
        });
        
        GridPane layout3 = new GridPane();
        Button button3 = new Button( "To the first view!");
        layout3.add(new Label("Third view!"), 0, 0);
        layout3.add(button3, 1, 1);
        Scene scene3 = new Scene(layout3, 300, 200);
        
        button2.setOnAction(e -> {
            stage.setScene(scene3);
        });
        
        button3.setOnAction(e -> {
            stage.setScene(scene1);
        });
        
    }

}
