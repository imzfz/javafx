package experiment4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Experiment6 extends Application{
	public void start(Stage primaryStage){
		Pane pane = new Pane();
		Text t1 = new Text("Java is fun");
		t1.setLayoutX(50);
		t1.setLayoutY(50);

		pane.setOnMouseClicked(e->{
			if(t1.getText() == "Java is fun"){
				t1.setText("Java is powerful");
				t1.setLayoutX(100);
				t1.setLayoutY(50);
			}
			else{
				t1.setText("Java is fun");
				t1.setLayoutX(50);
				t1.setLayoutY(50);
			}
		});

		pane.getChildren().add(t1);
		Scene scene = new Scene(pane,300,100);
		primaryStage.setTitle("Experiment 4 by zfz");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args){
		launch();
	}
}
