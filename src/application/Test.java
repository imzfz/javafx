package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Test extends Application{
	public void start(Stage primaryStage){
		Button btok = new Button("OK");
		Scene scene = new Scene(btok, 200, 250);
		primaryStage.setTitle("my");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
public static void main(String[] args){
	Application.launch(args);
}
}