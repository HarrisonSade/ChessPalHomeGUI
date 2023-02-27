module com.example.homeguitest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.homeguitest to javafx.fxml;
    exports com.example.homeguitest;
}