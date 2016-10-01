package test;

	import javafx.application.Application;
	import javafx.geometry.HPos;
	import javafx.geometry.Insets;
	import javafx.geometry.Pos;
	import javafx.scene.Scene;
	import javafx.scene.control.Button;
	import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
	import javafx.scene.layout.GridPane;
	import javafx.stage.Stage;

	public class Dashayu extends Application{
		public void start (Stage primaryStage){
			GridPane gp = new GridPane();
			TextField username = new TextField();
			PasswordField psw = new PasswordField();
			Button bt = new Button("登录");
			gp.setPadding(new Insets(11,11,11,11));
			gp.setHgap(5);
			gp.setVgap(5);

			gp.add(new Label("用户名"),0,0);
			gp.add(username, 1, 0);
			gp.add(new Label("密码"),0,1);
			gp.add(psw, 1, 1);
			gp.add(bt, 1, 2);
			GridPane.setHalignment(bt, HPos.RIGHT);

			bt.setOnAction(e->{
				String u = username.getText();
				String p = psw.getText();
				if(p.equals("123456")&& u.equals("大鲨鱼")){
					System.out.println("欢迎你，大鲨鱼!");
				}
				else{
					System.out.println("用户名或密码错误");
				}

			});

			Scene scene = new Scene(gp,270,120);
			primaryStage.setScene(scene);
			primaryStage.setTitle("登录");
			primaryStage.show();
		}

		public static void main(String[] args){
			launch();
		}
	}
