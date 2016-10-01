package test;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class Investment extends Application{
	private double investAmount;
	private int year;
	private double yearInterest;

	public void InvestmentCompute(){

	}
	public void InvestmentCompute(double investAmount,int year,double yearInterest){
		this.investAmount = investAmount;
		this.year = year;
		this.yearInterest = yearInterest;
	}
	public double getTotalAmount(){
		return investAmount * Math.pow((1+yearInterest/1200), year*12);
	}

	public void start(Stage primaryStage){
		GridPane gp = new GridPane();
		Label l1 = new Label("投资总额");
		Label l2 = new Label("投资年数");
		Label l3 = new Label("年利率");
		Label l4 = new Label("未来值");
		TextField t1 = new TextField();
		TextField t2 = new TextField();
		TextField t3 = new TextField();
		TextField t4 = new TextField();
		Button bt = new Button("计算");
		gp.add(l1, 0, 0);
		gp.add(l2, 0, 1);
		gp.add(l3, 0, 2);
		gp.add(l4, 0, 3);
		gp.add(t1, 1, 0);
		gp.add(t2, 1, 1);
		gp.add(t3, 1, 2);
		gp.add(t4, 1, 3);
		gp.add(bt, 1, 4);
		GridPane.setHalignment(bt, HPos.RIGHT);
		gp.setHgap(10);
		gp.setVgap(10);
		gp.setPadding(new Insets(10,10,10,10));

		bt.setOnAction(e->{
			InvestmentCompute(Double.parseDouble(t1.getText()), Integer.parseInt(t2.getText()), Double.parseDouble(t3.getText()));
			t4.setText(String.format("%s",getTotalAmount()));
		});

		Scene scene = new Scene(gp,250,250);
		primaryStage.setScene(scene);
		primaryStage.setTitle("投资计算器");
		primaryStage.show();
	}

	public static void main(String[] args){
		launch();
	}
}
