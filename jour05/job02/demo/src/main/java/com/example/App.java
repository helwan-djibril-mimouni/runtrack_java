package com.example;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        BorderPane bPane = new BorderPane();   
       
        Button button = new Button("Quit");
        button.setOnAction((ActionEvent event) -> {
            stage.close();
        });
        
        bPane.setTop(new TextField("Top"));
        bPane.setBottom(button);
        
        //Creating a scene object 
        Scene scene = new Scene(bPane);  
        
        //Setting title to the Stage
        stage.setTitle("BorderPane Example"); 
            
        //Adding scene to the stage 
        stage.setScene(scene);          
        
        //Displaying the contents of the stage 
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}