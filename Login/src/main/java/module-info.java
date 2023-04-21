module com.example.login {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.app.login to javafx.fxml;
    exports com.app.login;
}