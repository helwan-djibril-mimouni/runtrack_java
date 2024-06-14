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
       
        Button button = new Button("Envoyer");
        
        fPane.getChildren().add(new Label("Nom :"));
        fPane.getChildren().add(new TextField("nom"));
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