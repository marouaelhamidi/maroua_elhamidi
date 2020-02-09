package application;


import java.util.List;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
    	 
     
        primaryStage.setTitle("Gestion d'un cabinet");
        Group root = new Group();
        Scene scene = new Scene(root, 500, 350, Color.LIGHTBLUE);
        Button btn = new Button();
        Button btn1 = new Button();
        Button btn2 = new Button();
        Button btn3 = new Button();
        btn.setLayoutX(70);
        btn.setLayoutY(80);
        btn1.setLayoutX(70);
        btn1.setLayoutY(140);
        btn2.setLayoutX(70);
        btn2.setLayoutY(200);
        btn3.setLayoutX(70);
        btn3.setLayoutY(260);
        btn.setStyle("-fx-font: 30 arial; -fx-base: #fff;");
        btn1.setStyle("-fx-font: 30 arial; -fx-base: #fff;");
        btn2.setStyle("-fx-font: 30 arial; -fx-base: #fff;");
        btn3.setStyle("-fx-font: 30 arial; -fx-base: #fff;");
        btn.setText("gestion des medecins");
        btn1.setText("gestion des clients");
        btn2.setText("gestion des creneaux");
        btn3.setText("gestion des rendez vous");
        Text h1 = new Text("La gestion d'un cabinet || El hamidi Maroua");
        h1.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        h1.setX(0);
        h1.setY(30);
        h1.setFill(Color.BLUE); 
        btn.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                System.out.println("Hello World");
            }
        });

        btn1.setMinWidth(370);
        btn2.setMinWidth(370);
        btn.setMinWidth(370);
        btn3.setMinWidth(370);

        root.getChildren().add(h1);

        root.getChildren().add(btn); 
        root.getChildren().add(btn1); 
        root.getChildren().add(btn2); 
        root.getChildren().add(btn3); 
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
    }

	private List<Node> getChildren() {
		// TODO Auto-generated method stub
		return null;
	}

	private void setTranslateY(int i) {
		// TODO Auto-generated method stub
		
	}

	private void setTranslateX(int i) {
		// TODO Auto-generated method stub
		
	}
}
