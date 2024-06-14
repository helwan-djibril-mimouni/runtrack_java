package com.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        ObservableList<Pokemon> data = FXCollections.observableArrayList(
                new Pokemon("Bulbizarre", "Plante", "Poison", 318),
                new Pokemon("Salamèche", "Feu", "Aucun", 309),
                new Pokemon("Carapuce", "Eau", "Aucun", 314)
        );

        TableView<Pokemon> tableView = new TableView<>();
        tableView.setItems(data);

        TableColumn<Pokemon, String> nameColumn = new TableColumn<>("Nom");
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn<Pokemon, String> type1Column = new TableColumn<>("Premier Type");
        type1Column.setCellValueFactory(new PropertyValueFactory<>("type1"));

        TableColumn<Pokemon, String> type2Column = new TableColumn<>("Second Type");
        type2Column.setCellValueFactory(new PropertyValueFactory<>("type2"));

        TableColumn<Pokemon, Integer> bstColumn = new TableColumn<>("BST");
        bstColumn.setCellValueFactory(new PropertyValueFactory<>("bst"));

        tableView.getColumns().addAll(nameColumn, type1Column, type2Column, bstColumn);

        Button button = new Button("Exporter");
        button.setOnAction(event -> {
            try {
                exportToCSV(data);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        // Layout principal
        VBox layout = new VBox(10);
        layout.getChildren().addAll(tableView, button);

        //Creating a scene object 
        Scene scene = new Scene(layout);  
        
        //Setting title to the Stage
        stage.setTitle("FlowPane Example"); 
            
        //Adding scene to the stage 
        stage.setScene(scene);          
        
        //Displaying the contents of the stage 
        stage.show();
    }

    private void exportToCSV(ObservableList<Pokemon> data) throws IOException {
        String fileName = "src/main/resources/data.csv";
    
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(fileName)))) {
            // CSV header
            writer.println("Nom,Type1,Type2,BST");
    
            // Write data rows
            for (Pokemon pok : data) {
                writer.println(pok.name + "," + pok.type1 + "," + pok.type2 + "," + pok.bst);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    
        System.out.println("Data exported to " + fileName);
    }

    public static void main(String[] args) {
        launch();
    }

}