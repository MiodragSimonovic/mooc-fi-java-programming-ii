package buttonandlabel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonAndLabelApplication extends Application  {

    public static void main(String[] args) {
        
        launch(ButtonAndLabelApplication.class);
        
    }

    @Override
    public void start(Stage window) throws Exception {
        
        window.setTitle("Button and Label Application");
        
        FlowPane layout = new FlowPane();
        Label label = new Label("This is label");
        Button button = new Button("This is button");
        layout.getChildren().addAll(label, button);
        
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
        
    }

}
