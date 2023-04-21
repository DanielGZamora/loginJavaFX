package com.app.login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AppController {
    @FXML
    private AnchorPane LoginView;
    @FXML
    private AnchorPane UserView;
    @FXML
    private AnchorPane AdminView;
    @FXML
    private Button btnLogin;
    @FXML
    private Label LoginText;
    @FXML
    private TextField usertextField;
    @FXML
    private PasswordField UserPasswordField;

    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    public void onLoginButtonClick(ActionEvent event) throws IOException {
        if(usertextField.getText().equals("usuario") && UserPasswordField.getText().equals("1234")) {
            LoginText.setText("iniciaste sesion como usuario");

            Parent root = FXMLLoader.load(getClass().getResource("user-view.fxml"));
            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();


        } else  if (usertextField.getText().equals("admin") && UserPasswordField.getText().equals("1234")){
            LoginText.setText("iniciaste sesion como administrador");

            Parent root = FXMLLoader.load(getClass().getResource("admin-view.fxml"));
            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } else {
            LoginText.setText("Porfavor inserte un usuario y contraseña");
        }
    }

}