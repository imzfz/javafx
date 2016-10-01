package experiment4;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Experiment4 extends Application{
	public void start(Stage primaryStage){
		GridPane gp = new GridPane();
		TextField tftotal = new TextField();
		TextField tfyear = new TextField();
		TextField tfrate = new TextField();
		TextField tffuture = new TextField();
		gp.setPadding(new Insets(11,11,11,11));
		gp.setHgap(5);
		gp.setVgap(5);

		gp.add(new Label("投资总额"), 0,0);
		gp.add(tftotal, 1,0);
		gp.add(new Label("年数"), 0,1);
		gp.add(tfyear, 1,1);
		gp.add(new Label("年利率"), 0,2);
		gp.add(tfrate, 1,2);
		gp.add(new Label("未来值"), 0,3);
		gp.add(tffuture, 1,3);
		Button bt = new Button("Calculate");
		gp.add(bt, 1 ,4);
		GridPane.setHalignment(bt, HPos.RIGHT);


	bt.setOnAction(e->{
		double total = Double.parseDouble(tftotal.getText());
		int year = Integer.parseInt(tfyear.getText());
		double rate = Double.parseDouble(tfrate.getText());
		double future;
		future = total * Math.pow((1 + rate/1200), (year * 12));
		tffuture.setText(String.format("%.2f", future));
		System.out.println(total + "\n" + year + "\n" + rate + "\n" + future);
	});


		Scene scene = new Scene(gp,300,200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Experiment 4 by zfz");
		primaryStage.show();
	}

	public static void main(String[] args){
		Application.launch();
	}


}

