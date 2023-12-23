module com.aple.presentsearcher {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.aple.Scripts_Views to javafx.fxml;
    exports com.aple.Scripts_Views;
}