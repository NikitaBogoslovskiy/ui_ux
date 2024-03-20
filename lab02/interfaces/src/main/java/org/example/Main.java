package org.example;

import javafx.application.Application;

public class Main {
    public static void main(String[] args) {
        new Thread(() -> Application.launch(App.class)).start();
    }
}
