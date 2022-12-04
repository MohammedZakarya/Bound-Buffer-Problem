package com.example.boundbuffer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    Button sellid,buyid;
    @FXML
    private Stage stage;

    private Scene scene;
    private Parent root;


    public void Buy(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("customer.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }



    public void Sell(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ticket-seller.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


}