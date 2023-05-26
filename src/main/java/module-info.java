module com.example.git3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.git3 to javafx.fxml;
    exports com.example.git3;
}
