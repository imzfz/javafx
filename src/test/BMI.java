package test;

import java.text.Format;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
/*
public class BMI extends Application{
	public void start (Stage primaryStage){
		GridPane gp = new GridPane();
		TextField cm = new TextField();
		TextField kg = new TextField();
		TextField bmi = new TextField();
		TextField status = new TextField();
		Button bt = new Button("Calculate BMI");
		gp.setPadding(new Insets(11,11,11,11));
		gp.setHgap(5);
		gp.setVgap(5);

		gp.add(new Label("Height"),0,0);
		gp.add(cm, 1, 0);
		gp.add(new Label("Weight"),0,1);
		gp.add(kg, 1, 1);
		gp.add(new Label("BMI"),0,2);
		gp.add(bmi, 1, 2);
		gp.add(new Label("Status"),0,3);
		gp.add(status, 1, 3);
		gp.add(bt, 1, 4);
		GridPane.setHalignment(bt, HPos.RIGHT);

		bt.setOnAction(e->{
			double h = Double.parseDouble(cm.getText());
			double w = Double.parseDouble(kg.getText());
			double b = w/Math.pow(h,2);
			String ttt="";
			if(b<18.5){
				ttt="Underweight";
			}
			if(b>=18.5&&b<25){
				ttt="Normal";
			}
			if(b>=25&&b<30){
				ttt="Overweight";
			}
			if(b>=30){
				ttt="Obese";
			}
			bmi.setText(String.format("%.2f", b));
			status.setText(ttt);
		});

		Scene scene = new Scene(gp,300,200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("BMI Calculator");
		primaryStage.show();
	}

	public static void main(String[] args){
		launch();
	}
}
*/

public class BMI extends Application{
	public void start(Stage primaryStage){
		Label cm = new Label("身高（米）");
		Label kg = new Label("体重（公斤）");
		Label bmi = new Label("BMI");
		Label status = new Label("体重状况");
		TextField tcm = new TextField();
		TextField tkg = new TextField();
		TextField tbmi = new TextField();
		TextField tstatus = new TextField();
		GridPane gp = new GridPane();
		Button bt = new Button("计算BMI");

		gp.add(kg,0,0);
		gp.add(tkg,1,0);
		gp.add(cm,0,1);
		gp.add(tcm,1,1);
		gp.add(bmi,0,2);
		gp.add(tbmi,1,2);
		gp.add(status,0,3);
		gp.add(tstatus,1,3);
		gp.add(bt,1,4);

		Scene scene = new Scene(gp,260,130);
		primaryStage.setScene(scene);
		primaryStage.setTitle("BMI计算");
		primaryStage.show();

		bt.setOnAction(e->{
			double scm = Double.parseDouble(tcm.getText());
			double skg = Double.parseDouble(tkg.getText());
			double sbmi = skg/(Math.pow(scm, 2));
			String sstatus = "";
			tbmi.setText(String.format("%f", sbmi));

			if(sbmi<25 && sbmi>=18.5)
				sstatus="normal";
			else
				sstatus="abnormal";

			tstatus.setText(sstatus);
		});

	}

	public static void main(String[] argss){
		launch();
	}
}













