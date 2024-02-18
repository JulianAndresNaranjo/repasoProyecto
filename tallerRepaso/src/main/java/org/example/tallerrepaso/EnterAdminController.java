package com.example.repaso;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class EnterAdminController {

    @FXML
    private Button enterAdmin;
    @FXML
    private TextField txtAdmin;
    @FXML
    private TextField txtPassword;

    @FXML
    public void btnEnterAdmin(ActionEvent actionEvent) {
        String ID = "1094";
        String contrasena = "123";

        if (txtAdmin.getText().equals(ID)) {
            if (txtPassword.getText().equals(contrasena)) {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("admin-view.fxml"));
                    Parent root = loader.load();
                    AdminController controlador = loader.getController();
                    Scene scene = new Scene(root);
                    Stage stage = new Stage();
                    stage.initModality(Modality.APPLICATION_MODAL);
                    stage.setScene(scene);
                    stage.showAndWait();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("ERROR");
                alert.setContentText("Contraseña incorrecta");
                alert.show();
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("ID incorrecto");
            alert.show();
        }
    }
}
