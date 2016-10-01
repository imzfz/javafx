package sheji;

import javafx.scene.paint.Color;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import java.util.Optional;

public class JieMian extends Application{
	private GuiZe gz;
	private int temp=0,temp1=0;
	private int withdraw=0;

	public void start (Stage primaryStage){
		gz = new GuiZe();
		Label lb = new Label("Ready");
		Alert al = new Alert(AlertType.CONFIRMATION);
		Alert blackwin = new Alert(AlertType.INFORMATION);
		Alert whitewin = new Alert(AlertType.INFORMATION);
		Alert draw = new Alert(AlertType.INFORMATION);
		Alert exit = new Alert(AlertType.CONFIRMATION);
		StackPane sp = new StackPane();
		Pane p = new Pane();
		BorderPane bp = new BorderPane();
		HBox hb = new HBox();
		HBox bottom = new HBox(lb);
		MenuBar mb = new MenuBar();
		Menu mgame = new Menu("Game");
		Menu mhelp = new Menu("Help");
		MenuItem about = new MenuItem("About..");
		MenuItem mexit = new MenuItem("Exit");
		MenuItem mnew = new MenuItem("New Game");
		MenuItem mhowto = new MenuItem("How to play");
		MenuItem mback = new MenuItem("Withdraw");


		mgame.getItems().addAll(mnew,mback,mexit);
		mhelp.getItems().addAll(mhowto,about);
		mb.getMenus().addAll(mgame,mhelp);
		mb.setPrefWidth(600);
		Image img = new Image("image/777.jpg");
//		ImageView imgv = new ImageView();
		sp.getChildren().add(new ImageView(img));
		sp.setAlignment(Pos.CENTER);
		Label l = new Label();
		sp.getChildren().addAll(l,p);
		hb.getChildren().addAll(mb);
		bp.setTop(hb);
		bp.setCenter(sp);
		bp.setBottom(bottom);
		bottom.setAlignment(Pos.CENTER);

		Scene scene = new Scene(bp,600,600);
		primaryStage.setTitle("六子棋");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();

		sp.setOnMouseMoved(e->{
			if(gz.getIsTurn()==0 || gz.getIsTurn()==1){
				lb.setText("黑方回合");
			}
			else if(gz.getIsTurn()==2 || gz.getIsTurn()==3){
				lb.setText("白方回合");
			}
		});


		sp.setOnMouseClicked(e->{
			withdraw=0;
			/*计算坐标与数组对应，距离绝对值比较*/
			double x = e.getSceneX();
			double y = e.getSceneY();
			double z,t=999,res1=0,res2 = 0;
			for(int i=0;i<19;i++){
				z = Math.abs((gz.getI(i)-x));
				if(z<t){
					t=z;
					temp=i;
				}
			}

			t=999;		//复原

			for(int j=0;j<19;j++){
				z = Math.abs((gz.getJ(j)-y));
				if(z<t){
					t=z;
					temp1=j;
				}
			}

			/*坐标微调,判断是否有子*/
			res1 = gz.getI(temp);
			res2 = gz.getJ(temp1)-27.5;

			if(gz.isDone(temp, temp1)==false && gz.Win(temp,temp1) == 0){
				if(temp>=0&&temp<=6){
					res1 = gz.getI(temp)-3;
				}
				if(temp>=6&&temp<=8){
					res1 = gz.getI(temp)-2;
				}
				if(temp1>=0&&temp1<=10){
					res2 = gz.getJ(temp1)-30.5;
				}
	/*windows
				if(gz.getVrsion()==0){
					if(temp>=0){
						res1 = gz.getI(temp)+5.5;
					}
					if(temp>=1&&temp<=4){
						res1 = gz.getI(temp)+2.5;
					}
					if(temp>=5&&temp<=6){
						res1 = gz.getI(temp)+4.5;
					}
					if(temp>=7&&temp<=10){
						res1 = gz.getI(temp)+5;
					}
					if(temp1>=0&&temp1<=19){
						res2 = gz.getJ(temp1)-22;
					}
					if(temp1>=1&&temp1<=3){
						res2 = gz.getJ(temp1)-23;
					}
				}
*/
				Circle c = new Circle(res1,res2,10);

				/*变换颜色*/
				if(gz.isFirst()==false){
					if(gz.getIsTurn()==0||gz.getIsTurn()==1){
						c.setFill(Color.BLACK);
						gz.setBoard(temp,temp1);
					}
					else if(gz.getIsTurn()==2||gz.getIsTurn()==3){
						c.setFill(Color.WHITE);
						gz.setBoard(temp,temp1);
					}
					l.setText(""+ e.getSceneY() + "," + e.getSceneY());
				}
				else{
					c.setFill(Color.BLACK);
					gz.setBoard(temp,temp1);
					gz.setIsTurn(2);
				}
				p.getChildren().addAll(c);

		/*===========================================*/

				if(gz.Win(temp,temp1)==1){
					blackwin.setTitle("黑棋赢了");
					blackwin.setContentText("恭喜,黑棋赢了！");
					blackwin.show();
					gz.isWin();
//					System.out.println("=====黑==" + gz.getNumber());
				}
				else if(gz.Win(temp,temp1)==2){
					whitewin.setTitle("白棋赢了");
					whitewin.setContentText("恭喜,白棋赢了！");
					whitewin.show();
					gz.isWin();
//					System.out.println("=====白");
				}
				else if(gz.Win(temp,temp1)==3){
					draw.setTitle("平局");
					draw.setContentText("二人平局");
					draw.show();
//					System.out.println("=====满");
				}
			}

		});

		/*开始新游戏*/
		mnew.setOnAction(e->{
			al.setTitle("New game");
			al.setContentText("If you click 'OK',the chessboard will be cleared.");
			al.setHeaderText("New Game?");

			Optional<ButtonType> res = al.showAndWait();
			if(res.get() == ButtonType.OK){
				for(int i =0;i < gz.getNumber();i++){
					p.getChildren().remove(0);
				}
				this.gz = new GuiZe();
				withdraw=0;
			}
		});

		/*限制悔棋一步*/
		mback.setOnAction(e->{
			if(withdraw==1){
				lb.setText("只能悔棋一次");
			}
			else if(gz.getNumber()==0){}

			else if(withdraw==0){
				p.getChildren().remove(gz.getNumber()-1);
				gz.setBack(temp,temp1);
//				System.out.println(gz.getIsTurn());
				gz.setIsTurn(gz.getIsTurn()-1);
				withdraw+=1;
			}

		});

		mexit.setOnAction(e->{
			exit.setTitle("Exit");
			exit.setContentText("If you click 'OK',the game will be closed.");
			exit.setHeaderText("Exit?");

			Optional<ButtonType> res = exit.showAndWait();
			if(res.get() == ButtonType.OK){
				primaryStage.close();
			}
		});

		about.setOnAction(e->{
			Label guanyu = new Label();
			Stage About = new Stage();
			Scene s = new Scene(guanyu,500,200);
			About.setScene(s);
			guanyu.setText("本六子棋游戏为 Java程序设计实践 课程作业 Designed by zfz");
			guanyu.setAlignment(Pos.CENTER);
			About.show();
		});

		mhowto.setOnAction(e->{
			Label guanyu = new Label();
			guanyu.setPadding(new Insets(10,10,10,10));
			Stage About = new Stage();
			Scene s = new Scene(guanyu,300,200);
			About.setScene(s);
			guanyu.setWrapText(true);
			guanyu.setText("黑子先手一子，后双方各下两子，先连成六子的一方胜,若棋盘满而无法分出胜负，判和。");
			guanyu.setAlignment(Pos.CENTER);
			About.show();
		});

	}



	public static void main(String[] args){
		launch();
	}

}
