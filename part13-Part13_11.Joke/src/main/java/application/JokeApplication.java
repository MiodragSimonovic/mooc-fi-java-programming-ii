package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class JokeApplication extends Application {

    public static void main(String[] args) {
        
        launch(JokeApplication.class);
        
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        GridPane layout = new GridPane();
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        
        HBox menu = new HBox();
        menu.setAlignment(Pos.CENTER);
        menu.setSpacing(10);
        Button button1 = new Button("Joke");
        Button button2 = new Button("Answer");
        Button button3 = new Button("Explanation");
        menu.getChildren().addAll(button1, button2, button3);
        
        Label label = new Label("What do you call a bear with no teeth?");
        
        layout.add(menu, 0, 0);
        layout.add(label, 0, 1);
        
        Scene scene = new Scene(layout, 300, 200);
        stage.setTitle("Joke");
        stage.setScene(scene);
        stage.show();

        button1.setOnAction(e -> {
            label.setText("What do you call a bear with no teeth?");
        });
        
        button2.setOnAction(e -> {
            label.setText("A gummy bear.");
        });
        
        button3.setOnAction(e -> {
            label.setText("This joke is stupid.");
        });
        
    }
    
}
