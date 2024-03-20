package org.example.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Item {
    private final StringProperty title;

    public Item(String title) {
        this.title = new SimpleStringProperty(title);
    }

    public StringProperty getTitle() {
        return title;
    }
}
