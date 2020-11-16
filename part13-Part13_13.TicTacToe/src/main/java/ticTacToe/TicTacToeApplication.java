package ticTacToe;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {
    
    String turnX = "Turn: X";
    String x = "X";
    String o = "O";
    String turnO = "Turn: O";
    String theEnd = "The end!";
    Label label;
    Button button11;
    Button button12;
    Button button13;
    Button button21;
    Button button22;
    Button button23;
    Button button31;
    Button button32;
    Button button33;

    public static void main(String[] args) {
        
        launch(TicTacToeApplication.class);
        
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        BorderPane layout = new BorderPane();
        
        label = new Label("Turn: X");
        label.setFont(Font.font("Monospaced", 40));
        layout.setTop(label);
        
        button11 = new Button();
        setButtonStyle(button11);
        button12 = new Button();
        setButtonStyle(button12);
        button13 = new Button();
        setButtonStyle(button13);
        button21 = new Button();
        setButtonStyle(button21);
        button22 = new Button();
        setButtonStyle(button22);
        button23 = new Button();
        setButtonStyle(button23);
        button31 = new Button();
        setButtonStyle(button31);
        button32 = new Button();
        setButtonStyle(button32);
        button33 = new Button();
        setButtonStyle(button33);
        
        GridPane game = new GridPane();
        game.setAlignment(Pos.CENTER);
        game.add(button11, 1, 1);
        game.add(button12, 1, 2);
        game.add(button13, 1, 3);
        game.add(button21, 2, 1);
        game.add(button22, 2, 2);
        game.add(button23, 2, 3);
        game.add(button31, 3, 1);
        game.add(button32, 3, 2);
        game.add(button33, 3, 3);
        layout.setCenter(game);
        game.setPadding(new Insets(20, 20, 20, 20));

        
        Scene scene = new Scene(layout, 600, 400);
        stage.setTitle("Tic-tac-toe");
        stage.setScene(scene);
        stage.show();  
        
     
        handleButtonClick(button11);
        handleButtonClick(button12);
        handleButtonClick(button13);
        handleButtonClick(button21);
        handleButtonClick(button22);
        handleButtonClick(button23);
        handleButtonClick(button31);
        handleButtonClick(button32);
        handleButtonClick(button33);
        
    }      
    
    
    public void setButtonStyle(Button button) {
        button.setFont(Font.font("Monospaced", 40));
    }
    
    public void handleButtonClick (Button button) {
        button.setOnAction(e -> {
            if (button.getText().isEmpty()) {
                if (label.getText().equals(turnX)) {
                    button.setText(x);
                    if (theEnd()) {
                        label.setText(theEnd);
                    } else {
                        label.setText(turnO);
                    }                    
                } else if (label.getText().equals("Turn: O")) {
                    button.setText(o);
                    if (theEnd()) {
                        label.setText(theEnd);
                    } else {
                        label.setText(turnX);
                    }
                }
            }
        });
        
    }
    
    
    public boolean buttonIsNotEmpty(Button button) {
        return !button.getText().isEmpty();
    }
    
    public boolean sameRow(Button button1, Button button2, Button button3) {
        if (buttonIsNotEmpty(button1) && buttonIsNotEmpty(button2) && buttonIsNotEmpty(button3)) {
            return button1.getText().equals(button2.getText()) && button1.getText().equals(button3.getText());
        }
        return false;
    }
    
    public boolean theEnd() {
        return (sameRow(button11, button12, button13) || sameRow(button21, button22, button23) || sameRow(button31, button32, button33) ||  
                sameRow(button11, button21, button31) || sameRow(button12, button22, button32) || sameRow(button13, button23, button33) ||  
                sameRow(button11, button22, button33) || sameRow(button31, button22, button13));
    }    

}
