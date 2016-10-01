package experiment4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Experiment3 extends Application{
	public void start(Stage primaryStage){
		BorderPane bp = new BorderPane();
		HBox hb = new HBox();
		HBox hb1 = new HBox();
		Label nb4 = new Label("+");
		Label nb5 = new Label("=");
		TextField tf1 = new TextField("Number1");
		TextField tf2 = new TextField("Number2");
		TextField tf3 = new TextField("Result");
		Button bt1 = new Button("加");
		Button bt2 = new Button("减");
		Button bt3 = new Button("乘");
		Button bt4 = new Button("除");
		hb1.setSpacing(10);
		hb1.setAlignment(Pos.CENTER);
		hb1.setPadding(new Insets(10,0,10,0));
		hb.setSpacing(10);
		hb.setAlignment(Pos.CENTER);
		hb.setPadding(new Insets(10,0,10,0));

		hb.getChildren().addAll(tf1,nb4,tf2,nb5,tf3);
		hb1.getChildren().addAll(bt1,bt2,bt3,bt4);
		bp.setTop(hb);
		bp.setBottom(hb1);

		bt1.setOnAction(e->{
			double getnb1 = Double.parseDouble(tf1.getText());
			double getnb2 = Double.parseDouble(tf2.getText());
			nb4.setText("+");
			tf3.setText(String.format("%.2f", getnb1+getnb2));
		});

		bt2.setOnAction(e->{
			double getnb1 = Double.parseDouble(tf1.getText());
			double getnb2 = Double.parseDouble(tf2.getText());
			nb4.setText("-");
			tf3.setText(String.format("%.2f", getnb1-getnb2));
		});

		bt3.setOnAction(e->{
			double getnb1 = Double.parseDouble(tf1.getText());
			double getnb2 = Double.parseDouble(tf2.getText());
			nb4.setText("*");
			tf3.setText(String.format("%.2f", getnb1*getnb2));
		});

		bt4.setOnAction(e->{
			double getnb1 = Double.parseDouble(tf1.getText());
			double getnb2 = Double.parseDouble(tf2.getText());
			nb4.setText("/");
			if(getnb2 == 0){
				tf3.setText(String.format("%s", "除数不能为0"));
			}
			else{
				tf3.setText(String.format("%.2f", getnb1/getnb2));
			}
		});

		Scene scene = new Scene(bp,600,100);
		primaryStage.setTitle("计算器");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args){
		launch();
	}
}
