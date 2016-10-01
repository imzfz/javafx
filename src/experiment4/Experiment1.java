package experiment4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Experiment1 extends Application {

	public void start(Stage primaryStage) {
		HBox pane1 = new HBox(20);
		HBox pane2 = new HBox(20);
		HBox pane = new HBox(50);
		pane1.setAlignment(Pos.CENTER_LEFT);
		pane1.setPadding(new Insets(8));
		pane1.setSpacing(20);
		pane2.setAlignment(Pos.CENTER_RIGHT);
		pane2.setPadding(new Insets(8));
		pane2.setSpacing(20);
		Button bt = new Button("button1");
		Button bt1 = new Button("button2");
		Button bt2 = new Button("button3");
		Button bt3 = new Button("button4");
		Button bt4 = new Button("button5");
		Button bt5 = new Button("button6");

		Bt1Class handler1 = new Bt1Class();
		Bt2Class handler2 = new Bt2Class();
		Bt3Class handler3 = new Bt3Class();
		Bt4Class handler4 = new Bt4Class();
		Bt5Class handler5 = new Bt5Class();
		Bt6Class handler6 = new Bt6Class();

		bt.setOnAction(handler1);
		bt1.setOnAction(handler2);
		bt2.setOnAction(handler3);
		bt3.setOnAction(handler4);
		bt4.setOnAction(handler5);
		bt5.setOnAction(handler6);

		pane1.getChildren().addAll(bt,bt1,bt2);
		pane2.getChildren().addAll(bt3,bt4,bt5);
		pane.getChildren().addAll(pane1,pane2);

		Scene scene = new Scene(pane);
		primaryStage.setTitle("Experiment 4 by zfz");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

		public static void main(String[] a){
			launch(a);
		}

	}

	class Bt1Class implements EventHandler<ActionEvent>{
		public void handle(ActionEvent c){
			System.out.println("Button1 clicked");
		}
	}

	class Bt2Class implements EventHandler<ActionEvent> {
		public void handle(ActionEvent e) {
		System.out.println("Button2 clicked");
		}
	}

	class Bt3Class implements EventHandler<ActionEvent> {
		public void handle(ActionEvent e) {
		System.out.println("Button3 clicked");
		}
	}

	class Bt4Class implements EventHandler<ActionEvent> {
		public void handle(ActionEvent e) {
		System.out.println("Button4 clicked");
		}
	}

	class Bt5Class implements EventHandler<ActionEvent> {
		public void handle(ActionEvent e) {
		System.out.println("Button5 clicked");
		}
	}

	class Bt6Class implements EventHandler<ActionEvent> {
		public void handle(ActionEvent e) {
		System.out.println("Button6 clicked");
		}
	}

