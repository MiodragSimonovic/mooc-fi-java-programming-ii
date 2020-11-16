package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {


    public static void main(String[] args) {
        
        launch(GreeterApplication.class);
        
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        GridPane layout1 = new GridPane();
        TextField textField = new TextField();
        Button button1 = new Button("Start");
        layout1.add(new Label("Enter your name and start."), 0, 0);
        layout1.add(textField, 0, 1);
        layout1.add(button1, 0, 2);        
        layout1.setAlignment(Pos.CENTER);
        layout1.setVgap(10);
        layout1.setHgap(10);
        layout1.setPadding(new Insets(20, 20, 20, 20));
        Scene scene1 = new Scene(layout1, 300, 200);
        
        stage.setTitle("Greeter");
        stage.setScene(scene1);
        stage.show();
        
        GridPane layout2 = new GridPane();
        Label label = new Label();
        layout2.add(label,0, 0);
        layout2.setAlignment(Pos.CENTER);
        Scene scene2 = new Scene(layout2, 200, 100);
        
        button1.setOnAction(e -> {
            label.setText("Welcome " + textField.getText().trim() + "!");
            stage.setScene(scene2);
        });        
        
    }
    
}
