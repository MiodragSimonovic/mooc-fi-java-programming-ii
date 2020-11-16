package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {


    public static void main(String[] args) {
        
        launch(TextStatisticsApplication.class);
        
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        stage.setTitle("Text statistics");
        
        BorderPane layout = new BorderPane();
        
        TextArea textArea = new TextArea();
        layout.setCenter(textArea);
        
        HBox texts = new HBox();
        texts.setSpacing(10);
        texts.getChildren().addAll(new Label("Letters: 0"), new Label("Words: 0"), new Label("The longest word is:"));
        layout.setBottom(texts);
        
        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();
        
    }

}
