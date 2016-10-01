package experiment4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Experiment5 extends Application{
	private int x= 200,y = 200;
	public void start(Stage primaryStage){
		Pane pane = new Pane();
		Button bt = new Button("test");
		pane.getChildren().add(bt);
		bt.setStyle("-fx-background-image:url('image/666.jpg');");
		pane.setOnKeyPressed(e->{
			if(e.getCode() == KeyCode.UP){
			pane.getChildren().add(new Line(x,y,x,y-5));
			y -= 5;
			}
			if(e.getCode() == KeyCode.DOWN){
			pane.getChildren().add(new Line(x,y,x,y+5));
			y += 5;
			}
			if(e.getCode() == KeyCode.LEFT){
			pane.getChildren().add(new Line(x-5,y,x,y));
			x -= 5;
			}
			if(e.getCode() == KeyCode.RIGHT){
			pane.getChildren().add(new Line(x+5,y,x,y));
			x += 5;
			}
		});


		Scene scene = new Scene(pane,400,400);
		primaryStage.setTitle("Experiment 4 by zfz");
		primaryStage.setScene(scene);
		primaryStage.show();
		pane.requestFocus();
	}

	public static void main(String[] args){
		launch();
	}
}
