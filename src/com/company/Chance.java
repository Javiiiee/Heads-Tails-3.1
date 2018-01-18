package com.company;
import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import java.util.Optional;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextInputDialog;

public class Chance extends Application {
    @Override
    public void start(Stage primaryStage) {

        int count = 0;
        double sum = 0;
        while(count <= 3) {

            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setTitle("Heads or Tails");
            alert.setHeaderText("take your pick, heads or tails?");
            alert.setContentText("Good luck!");
            ButtonType heads = new ButtonType("Heads");
            ButtonType tails = new ButtonType("Tails");
            alert.getButtonTypes().addAll(heads, tails);
            Optional<ButtonType> result = alert.showAndWait();


            double chance = Math.round(Math.random());



               if(result.get()== heads) {
                    if (chance == 1) {
                        Alert alert1 = new Alert(AlertType.INFORMATION);
                        alert1.setTitle("Heads or tails");
                        alert1.setContentText("You chose heads....Congrats it's heads!");
                        alert1.showAndWait();
                    } else {
                        Alert alert1 = new Alert(AlertType.INFORMATION);
                        alert1.setTitle("Heads or tails");
                        alert1.setContentText("You chose heads....Sorry it's tails");
                        alert1.showAndWait();
                    }
                }else{
                    if (chance == 0) {
                        Alert alert1 = new Alert(AlertType.INFORMATION);
                        alert1.setTitle("Heads or tails");
                        alert1.setContentText("You chose tails....Congrats it's tails!");
                        alert1.showAndWait();
                    } else{
                        Alert alert1 = new Alert(AlertType.INFORMATION);
                        alert1.setTitle("Heads or tails");
                        alert1.setContentText("You chose tails....Sorry it's heads");
                        alert1.showAndWait();
                    }
            }
            count++;
        }
    }
}

