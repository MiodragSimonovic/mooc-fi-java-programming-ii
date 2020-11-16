package title;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class UserTitle extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        
        StackPane layout = new StackPane();
        
        Scene scene = new Scene(layout);
        stage.setTitle(getParameters().getNamed().get("title"));
        stage.setScene(scene);
        stage.show();
        
    }

}
