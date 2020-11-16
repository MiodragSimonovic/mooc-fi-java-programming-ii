package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonAndTextFieldApplication extends Application {

    public static void main(String[] args) {
        
        launch(ButtonAndTextFieldApplication.class);
        
    }

    @Override
    public void start(Stage window) throws Exception {
        
        window.setTitle("Button and TextField");
        
        FlowPane layout = new FlowPane();
        Button button = new Button("Button");
        TextField textField = new TextField("Enter text here");
        layout.getChildren().addAll(button, textField);
        
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
        
    }

}
