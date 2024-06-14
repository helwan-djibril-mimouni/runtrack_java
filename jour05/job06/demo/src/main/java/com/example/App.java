package com.example;

import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        choiceBox.getItems().addAll("Small", "Medium", "Large");
        choiceBox.setValue("Small");

        ChoiceBox<String> choiceBox2 = new ChoiceBox<>();
        choiceBox2.getItems().addAll("Strawberry", "Cherry", "Lemon");
        choiceBox2.setValue("Strawberry");

        Button button = new Button("OK");
        button.setOnAction(event -> {
            String selectedSize = choiceBox.getValue();
            String selectedFlavor = choiceBox2.getValue();
            System.out.println("Size of the drink : " + selectedSize);
            System.out.println("Flavor of the drink : " + selectedFlavor);
        });

        // Layout principal
        VBox layout = new VBox(10);
        layout.getChildren().addAll(choiceBox, choiceBox2, button);

        //Creating a scene object 
        Scene scene = new Scene(layout);  
        
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