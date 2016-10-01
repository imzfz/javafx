package haikesi;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import java.math.*;

public class Haikesi extends Application{

	Line line;
	Pane p = new Pane();
	BorderPane bp = new BorderPane();
	double length = 15.0;
	double x = 50.0, y = 50.0;
	static final double X = 50.0, Y = 50.0;

	@Override
	public void start(Stage primaryStage)  {
		draw4();
//		draw4_2();
		for(int j = 0; j<12; j++){
			for(int i = 0; i < 12; i++){
				if(j != 0){
					draw2();
				}
				if(i != 0){
					draw1();
				}
				draw3();
			}
			x = 50;
			y = 50;
			y = y + (j + 1) * (Math.sin(Math.PI * (1/6.0)) * length + length);
			x = x + (j + 1) * (Math.cos(Math.PI * (1/6.0)) * length );
		}


		Scene scene = new Scene(p,800,600);
		p.getChildren().add(bp);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args){
		launch();
	}

	public void draw1(){//左下
		line = new Line();
		line.setStartX(x);
		line.setStartY(y);
		line.setEndX(x - length * Math.cos(Math.PI * (1/6.0)));
		line.setEndY(y + length * Math.sin(Math.PI * (1/6.0)));
		bp.getChildren().add(line);
	}

	public void draw2(){//向上
		line = new Line();
		line.setStartX(x);
		line.setStartY(y);
		line.setEndX(x);
		line.setEndY(y - length);
	//	x = x + Math.pow(length, 2) * 2 - 2 * Math.pow(length, 2) * Math.cos(Math.PI * (2 / 3.0));
		bp.getChildren().add(line);

	}

	public void draw3(){//右下
		line = new Line();
		line.setStartX(x);
		line.setStartY(y);
		line.setEndX(x + length * Math.cos(Math.PI * (1/6.0)));
		line.setEndY(y + length * Math.sin(Math.PI * (1/6.0)));
		x = x + Math.cos(Math.PI * (1/6.0)) * length * 2;
		bp.getChildren().add(line);
	}

	public void draw4(){
		//横
		line = new Line();
		line.setStartX(x);
		line.setStartY(y);
		line.setEndX(x + 11.3 * 2 * length * Math.cos(Math.PI * (1/6.0)));
		line.setEndY(y);
		bp.getChildren().add(line);

		//斜
		line = new Line();
		line.setStartX(x);
		line.setStartY(y);
		line.setEndX(x + 11.3 * length * Math.cos(Math.PI * (1/6.0)));
		line.setEndY(y + 12 * length * Math.sin(Math.PI * (1/6.0)) + 11 * length);
		bp.getChildren().add(line);

		//横
		line = new Line();
		line.setStartX(x + 11.3 * length * Math.cos(Math.PI * (1/6.0)));
		line.setStartY(y + 12 * length * Math.sin(Math.PI * (1/6.0)) + 11 * length);
		line.setEndX(x + 11.3 * length * Math.cos(Math.PI * (1/6.0)) + 11.3 * 2 * length * Math.cos(Math.PI * (1/6.0)));
		line.setEndY(y + 12 * length * Math.sin(Math.PI * (1/6.0)) + 11 * length);
		bp.getChildren().add(line);

		//斜
		line = new Line();
		line.setStartX(x + 11.35 * 2 * length * Math.cos(Math.PI * (1/6.0)));
		line.setStartY(y);
		line.setEndX(x + 11.35 * length * Math.cos(Math.PI * (1/6.0)) + 11.35 * 2 * length * Math.cos(Math.PI * (1/6.0)));
		line.setEndY(y + 12 * length * Math.sin(Math.PI * (1/6.0)) + 11 * length);
		bp.getChildren().add(line);
	}

}
