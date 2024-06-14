package com.example;

import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        FlowPane fPane = new FlowPane();   
        fPane.setStyle("-fx-background-color:BEIGE");
        
        Label label = new Label("Nom :");
        label.setStyle("-fx-text-fill:darkslategray; -fx-font-size: 40;");
        fPane.getChildren().add(label);

        TextField text = new TextField("nom");
        text.setStyle("-fx-background-color:lavender;-fx-padding: 0.333333em 0em;");
        fPane.getChildren().add(text);

        Button button = new Button("Envoyer");
        button.setStyle("-fx-background-color: azure; -fx-border-color: BLACK; -fx-border-radius: 5;");
        fPane.getChildren().add(button);
        
        //Creating a scene object 
        Scene scene = new Scene(fPane);  
        
        //Setting title to the Stage
        stage.setTitle("FlowPane Example"); 
            
        //Adding scene to the stage 
        stage.setScene(scene);          
        
        //Displaying the contents of the stage 
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}