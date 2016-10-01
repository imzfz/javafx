package test;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Calculator extends Application{
	public void start(Stage primaryStage){
		Label l1 = new Label("Number 1");
		Label l2 = new Label("Number 2");
		Label l3 = new Label("Result");
		TextField tf1 = new TextField();
		TextField tf2 = new TextField();
		TextField tf3 = new TextField();
/*		Button bt1 = new Button("Add");
		Button bt2 = new Button("Subtract");*/
		Button bt3 = new Button("Multiply");
		Button bt4 = new Button("Divide");
/*
		BorderPane p = new BorderPane();
		HBox hb = new HBox();
		HBox hb2 = new HBox();
		hb2.getChildren().addAll(bt1,bt2,bt3,bt4);

		p.setTop(hb);
		p.setBottom(hb2);
		hb.getChildren().addAll(l1,tf1,l2,tf2,l3,tf3);
		hb.setAlignment(Pos.CENTER);
		hb2.setAlignment(Pos.CENTER);
		hb.setPadding(new Insets(10,10,10,10));
		hb2.setPadding(new Insets(10,10,10,10));
*/
		HBox hb = new HBox();
		hb.getChildren().addAll(bt3,bt4);
		GridPane gp = new GridPane();
		gp.add(l1, 0, 0);
		gp.add(l2, 0, 1);
		gp.add(l3, 0, 2);
		gp.add(tf1, 1, 0);
		gp.add(tf2, 1, 1);
		gp.add(tf3, 1, 2);
		gp.add(hb, 1, 3);


/*

		bt1.setOnAction(e->{
			int a =Integer.parseInt(tf1.getText());
			int b =Integer.parseInt(tf2.getText());
			tf3.setText(String.format("%d", a+b));
		});

		bt2.setOnAction(e->{
			int a =Integer.parseInt(tf1.getText());
			int b =Integer.parseInt(tf2.getText());
			tf3.setText(String.format("%d", a-b));
		});
*/
		bt3.setOnAction(e->{
			int a =Integer.parseInt(tf1.getText());
			int b =Integer.parseInt(tf2.getText());
			tf3.setText(String.format("%d", a*b));
		});

		bt4.setOnAction(e->{
			int a =Integer.parseInt(tf1.getText());
			int b =Integer.parseInt(tf2.getText());
			tf3.setText(String.format("%d", a/b));
		});

		Scene scene = new Scene(gp,300,150);
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setTitle("除法器");


	}

	public static void main(String[] args){
		launch();
	}
}
