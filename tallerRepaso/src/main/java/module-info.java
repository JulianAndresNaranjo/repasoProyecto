module org.example.tallerrepaso {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens org.example.tallerrepaso to javafx.fxml;
    exports org.example.tallerrepaso;
}