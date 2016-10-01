package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Testflowpane extends Application{
	public void start(Stage primaryStage){
		FlowPane flp = new FlowPane();
		flp.setPadding(new Insets(10));
		flp.setHgap(5);
		flp.setVgap(5);
		Button bt = new Button("button1");
		Button bt1 = new Button("button2");
		Button bt2 = new Button("button3");
		Button bt3 = new Button("button4");
		Button bt4 = new Button("button5");
		Button bt5 = new Button("button6");

		flp.getChildren().addAll(bt, bt1, bt2, bt3, bt4, bt5);

		Scene scene = new Scene(flp,500,50);
		primaryStage.setTitle("Experiment 4 by zfz");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args){
		Application.launch();
	}
}
