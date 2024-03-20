package org.example;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.example.controllers.AppController;
import org.example.model.Item;

import java.io.IOException;
import java.net.URL;

public class App extends Application {
    public Stage stage;
    private final ObservableList<Item> items = FXCollections.observableArrayList();

    public App() {
        items.add(new Item("Buy some milk"));
        items.add(new Item("Wash the car"));
        items.add(new Item("Create the eternal engine"));
        items.add(new Item("Watch new series on TV"));
    }

    @Override
    public void start(Stage primaryStage) {
        stage = primaryStage;
        stage.setTitle("TODO List");
        //stage.setResizable(false);
        configureMainScene();
        stage.show();
    }

    public void configureMainScene() {
        try {
            FXMLLoader loader = new FXMLLoader();
            URL url = App.class.getResource("app.fxml");
            loader.setLocation(url);
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
            AppController controller = loader.getController();
            controller.setItems(items);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}