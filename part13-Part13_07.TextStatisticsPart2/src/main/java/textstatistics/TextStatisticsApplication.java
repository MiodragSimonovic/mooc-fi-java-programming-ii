package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import static javafx.application.Application.launch;
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
        
        HBox counters = new HBox();
        counters.setSpacing(10);
        Label lettersCounterLabel = new Label("Letters: 0");
        Label wordsCounterLabel = new Label("Words: 0");
        Label longestWordLabel = new Label("The longest word is:");
        counters.getChildren().addAll(lettersCounterLabel, wordsCounterLabel, longestWordLabel);
        layout.setBottom(counters);
        
        textArea.textProperty().addListener((change, oldValue, newValue) -> {
        int characters = newValue.length();
        String[] parts = newValue.split(" ");
        int words = parts.length;
        String longestWord = Arrays.stream(parts)
            .sorted((s1, s2) -> s2.length() - s1.length())
            .findFirst()
            .get();
        lettersCounterLabel.setText("Letters: " + characters);
        wordsCounterLabel.setText("Words: " + words);
        longestWordLabel.setText("The longest word is: " + longestWord);
        });
        
        
        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();
        
    }   

}
