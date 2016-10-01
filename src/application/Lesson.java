package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class Lesson extends Application{
	public void start (Stage primaryStage){
		Button btok = new Button("OK");
		Button cancel = new Button("Cancel");
		StackPane pane = new StackPane();
		pane.getChildren().add(btok);
		pane.getChildren().add(cancel);
//		Scene scene = new Scene(btok,300,300);
		Scene scene = new Scene(pane,300,300);
		primaryStage.setScene(scene);
		primaryStage.setTitle("my first javafx");
		primaryStage.show();
	}
	
	public static void main(String[] args){
		Application.launch();
	}
}
