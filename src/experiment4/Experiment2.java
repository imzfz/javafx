package experiment4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class Experiment2 extends Application{
	public void start(Stage primaryStage){
		Circle circle = new Circle();
		circle.setCenterX(200);
		circle.setCenterY(200);
		circle.setRadius(10);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);

		BorderPane p1 = new BorderPane();
		Pane p2 = new Pane();
		HBox hb = new HBox();
		hb.setPadding(new Insets(20,0,20,0));
		hb.setAlignment(Pos.CENTER);
		hb.setSpacing(10);
		hb.setStyle("-fx-background-color:lightgrey;");

		Button bt = new Button("Up");
		bt.setOnAction(e->{
			if(circle.getCenterY() > 10 ){
				circle.setCenterY(circle.getCenterY()-1);
			}
		});

		Button bt1 = new Button("Down");
		bt1.setOnAction(e->{
			if(p2.getHeight() - circle.getCenterY() > 10){
				circle.setCenterY(circle.getCenterY() + 1);
			}
		});

		Button bt2 = new Button("Left");
		bt2.setOnAction(e->{
			if(circle.getCenterX() > 10){
				circle.setCenterX(circle.getCenterX()-1);
			}
		});

		Button bt3 = new Button("Right");
		bt3.setOnAction(e->{
			if(p2.getWidth() - circle.getCenterX() > 10){
				circle.setCenterX(circle.getCenterX()+1);
			}
		});

		hb.getChildren().addAll(bt,bt1,bt2,bt3);
		p2.getChildren().add(circle);
		p1.setBottom(hb);
		p1.setTop(p2);

		Scene scene = new Scene(p1,400,400);
		primaryStage.setTitle("Experiment 4 by zfz");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args){
		launch();
	}
}
