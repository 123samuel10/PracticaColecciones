module com.example.demopracticacolecciones {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demopracticacolecciones to javafx.fxml;
    exports com.example.demopracticacolecciones;
    exports com.example.demopracticacolecciones.controllers;
    opens com.example.demopracticacolecciones.controllers to javafx.fxml;
}