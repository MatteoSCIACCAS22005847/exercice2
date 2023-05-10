module com.example.exercice2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    opens com.example.exercice2 to javafx.fxml;
    exports com.example.exercice2;
}