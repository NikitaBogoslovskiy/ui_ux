package org.example.controllers;

import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import org.example.App;
import org.example.model.Item;

public class AppController {
    @FXML
    private TableView<Item> items;

    @FXML
    private TableColumn<Item, String> itemsList;

    @FXML
    private void initialize() {
        itemsList.setCellValueFactory(
                cellData -> cellData.getValue().getTitle());
    }

    public void setItems(ObservableList<Item> newItems) {
        items.setItems(newItems);
    }
}
