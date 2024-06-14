package com.example;

import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        StackPane root = new StackPane();
        
        //Creating a scene object 
        Scene scene = new Scene(root);  
        
        //Setting title to the Stage
        stage.setTitle("FlowPane Example");

        // Intercepte l'événement de fermeture de la fenêtre principale (stage)
        stage.setOnCloseRequest(event -> {
            event.consume(); // Consomme l'événement pour éviter la fermeture immédiate

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Confirmation");
            alert.setHeaderText("Confirmation de sortie");
            alert.setContentText("Êtes-vous sûr de vouloir quitter l'application?");

            // Options pour l'utilisateur : OK ou Annuler
            alert.showAndWait().ifPresent(response -> {
                if (response == ButtonType.OK) {
                    stage.close(); // Ferme la fenêtre si l'utilisateur clique sur OK
                } else {
                    event.consume(); // Sinon, consomme à nouveau l'événement pour annuler la fermeture
                }
            });
        });
            
        //Adding scene to the stage 
        stage.setScene(scene);          
        
        //Displaying the contents of the stage 
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}