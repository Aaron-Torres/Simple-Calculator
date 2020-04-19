package application;
	
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Main extends Application{
	
	
	//Buttons of the calculator
	Button b0 = new Button("0");
	Button b1 = new Button("1");
	Button b2 = new Button("2");
	Button b3 = new Button("3");
	Button b4 = new Button("4");
	Button b5 = new Button("5");
	Button b6 = new Button("6");
	Button b7 = new Button("7");
	Button b8 = new Button("8");
	Button b9 = new Button("9");
	
	
	
	//buttons to do a simple math
	Button add = new Button("+");
	Button subs = new Button("-");
	Button mult = new Button("*");
	Button division = new Button("/");
	Button equal = new Button("=");
	Button clear = new Button("Clear");
	
	//TextFied where the number will be shown
	TextField t1 = new TextField("");
	
	//variables to store numbers from the specifi button pressed and use it to execute a math function
	double num1 = 0;
	double num2 = 0;
	
	//boolean to let the equal sign knows which operation will be 
	boolean add1 = false;
	boolean subs1 = false;
	boolean mult1 = false;
	boolean division1 = false;
	boolean equal1 = false;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			VBox vBox = new VBox();
			GridPane gPane = new GridPane();
			
			//sets the gap between the buttons
			gPane.setHgap(3);
			gPane.setVgap(3);
			//sets the padding
			gPane.setPadding(new Insets(10,10,10,10));
			
			vBox.getChildren().add(t1);
			vBox.setMargin(t1, new Insets(10,10,10,10));
			
			//sets the height and width of the buttons
			//sets the font of the buttons
			b0.setPrefWidth(80);
			b0.setPrefHeight(80);
			b0.setFont(new Font(24));
			
			b1.setPrefWidth(80);
			b1.setPrefHeight(80);
			b1.setFont(new Font(24));
			
			b2.setPrefWidth(80);
			b2.setPrefHeight(80);
			b2.setFont(new Font(24));
			
			b3.setPrefWidth(80);
			b3.setPrefHeight(80);
			b3.setFont(new Font(24));
			
			b4.setPrefWidth(80);
			b4.setPrefHeight(80);
			b4.setFont(new Font(24));
			
			b5.setPrefWidth(80);
			b5.setPrefHeight(80);
			b5.setFont(new Font(24));
			
			b6.setPrefWidth(80);
			b6.setPrefHeight(80);
			b6.setFont(new Font(24));
			
			b7.setPrefWidth(80);
			b7.setPrefHeight(80);
			b7.setFont(new Font(24));
			
			b8.setPrefWidth(80);
			b8.setPrefHeight(80);
			b8.setFont(new Font(24));
			
			b9.setPrefWidth(80);
			b9.setPrefHeight(80);
			b9.setFont(new Font(24));
			
			add.setPrefWidth(80);
			add.setPrefHeight(80);
			add.setFont(new Font(24));
			
			subs.setPrefWidth(80);
			subs.setPrefHeight(80);
			subs.setFont(new Font(24));
			
			mult.setPrefWidth(80);
			mult.setPrefHeight(80);
			mult.setFont(new Font(24));
			
			division.setPrefWidth(80);
			division.setPrefHeight(80);
			division.setFont(new Font(24));
			
			equal.setPrefWidth(80);
			equal.setPrefHeight(80);
			equal.setFont(new Font(24));
			
			//CSS to set the color to green when the mouse is hovering
			b0.getStyleClass().add("b0");
			b1.getStyleClass().add("b1");
			b2.getStyleClass().add("b2");
			b3.getStyleClass().add("b3");
			b4.getStyleClass().add("b4");
			b5.getStyleClass().add("b5");
			b6.getStyleClass().add("b6");
			b7.getStyleClass().add("b7");
			b8.getStyleClass().add("b8");
			b9.getStyleClass().add("b9");
			
			add.getStyleClass().add("add");
			subs.getStyleClass().add("subs");
			mult.getStyleClass().add("mult");
			division.getStyleClass().add("division");
			equal.getStyleClass().add("equal");
			clear.getStyleClass().add("clear");
			
			
			//adds the buttons and texfield to the pane
			//first row
			gPane.add(b0, 1, 18);
			gPane.add(b1, 3, 18);
			gPane.add(b2, 5, 18);
			gPane.add(b3, 7, 18);
			gPane.add(b4, 9, 18);
			
			//second row
			gPane.add(b5, 1, 19);
			gPane.add(b6, 3, 19);
			gPane.add(b7, 5, 19);
			gPane.add(b8, 7, 19);
			gPane.add(b9, 9, 19);
			
			//third row
			gPane.add(add, 1, 20);
			gPane.add(subs, 3, 20);
			gPane.add(mult, 5, 20);
			gPane.add(division, 7, 20);
			gPane.add(equal, 9, 20);
			gPane.alignmentProperty().set(Pos.CENTER);
			
			//fourth row
			gPane.add(clear, 9, 22);
			
			
			//sets the event handlers to the buttons
			b0.addEventFilter(MouseEvent.MOUSE_CLICKED, number0EventHandler);
			b1.addEventFilter(MouseEvent.MOUSE_CLICKED, number1EventHandler);
			b2.addEventFilter(MouseEvent.MOUSE_CLICKED, number2EventHandler);
			b3.addEventFilter(MouseEvent.MOUSE_CLICKED, number3EventHandler);
			b4.addEventFilter(MouseEvent.MOUSE_CLICKED, number4EventHandler);
			b5.addEventFilter(MouseEvent.MOUSE_CLICKED, number5EventHandler);
			b6.addEventFilter(MouseEvent.MOUSE_CLICKED, number6EventHandler);
			b7.addEventFilter(MouseEvent.MOUSE_CLICKED, number7EventHandler);
			b8.addEventFilter(MouseEvent.MOUSE_CLICKED, number8EventHandler);
			b9.addEventFilter(MouseEvent.MOUSE_CLICKED, number9EventHandler);
			
			add.addEventFilter(MouseEvent.MOUSE_CLICKED, addEventHandler);
			subs.addEventFilter(MouseEvent.MOUSE_CLICKED, subsEventHandler);
			mult.addEventFilter(MouseEvent.MOUSE_CLICKED, multEventHandler);
			division.addEventFilter(MouseEvent.MOUSE_CLICKED,divisionEventHandler);
			equal.addEventFilter(MouseEvent.MOUSE_CLICKED, EqualEventHandler);
			
			clear.addEventFilter(MouseEvent.MOUSE_CLICKED,clearEventHandler);
			
			//creates a new BorderPane and change the background color to black
			BorderPane root = new BorderPane();
			root.setStyle("-fx-background-color: black");
			//sets the position for the VBox and gPane
			root.setTop(vBox);
			root.setCenter(gPane);
			
			//sets a new scene
			Scene scene = new Scene(root,400,400);
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			primaryStage.setScene(scene);
			primaryStage.setTitle("Simple Calculator");
			//prevent the user from resizing the window
			primaryStage.setResizable(false);
			primaryStage.show();
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}//end try-catch
	}//end start
	
	//main method to launch the program
	public static void main(String[] args) {
		launch(args);
	}//end main method
	
	
	
	/*******************************Event Handlers for the Buttons******************************/
	
	//Event handler methods
	
	EventHandler<MouseEvent> number0EventHandler = new EventHandler<MouseEvent>() {
		@Override
		public void handle(MouseEvent e) {
			
			if(t1.getText().isEmpty()) {
				num1 = 0;
				t1.setText(t1.getText() + "0");
			}//
			else {
				num2 = 0;
				t1.setText(t1.getText() + "0");
			}//end if-else
			
		}//end handle	
	};//end number0EventHandler
	
	EventHandler<MouseEvent> number1EventHandler = new EventHandler<MouseEvent>() {
		@Override
		public void handle(MouseEvent e) {
			
			if(t1.getText().isEmpty()) {
				num1 = 1;
				t1.setText(t1.getText() + "1");
			}//
			else {
				num2 = 1;
				t1.setText(t1.getText() + "1");
				
			}//end if-else
		}//end handle	
	};//end number1EventHandler
	
	EventHandler<MouseEvent> number2EventHandler = new EventHandler<MouseEvent>() {
		@Override
		public void handle(MouseEvent e) {
			
			if(t1.getText().isEmpty()) {
				num1 = 2;
				t1.setText(t1.getText() + "2");
			}//
			else {
				num2 = 2;
				t1.setText(t1.getText() + "2");
			}//end if-else
		}//end handle	
	};//end number2EventHandler
	
	EventHandler<MouseEvent> number3EventHandler = new EventHandler<MouseEvent>() {
		@Override
		public void handle(MouseEvent e) {
			
			if(t1.getText().isEmpty()) {
				num1 = 3;
				t1.setText(t1.getText() + "3");
			}//
			else {
				num2 = 3;
				t1.setText(t1.getText() + "3");
			}//end if-else
		}//end handle	
	};//end number3EventHandler
	
	EventHandler<MouseEvent> number4EventHandler = new EventHandler<MouseEvent>() {
		@Override
		public void handle(MouseEvent e) {
			
			if(t1.getText().isEmpty()) {
				num1 = 4;
				t1.setText(t1.getText() + "4");
			}//
			else {
				num2 = 4;
				t1.setText(t1.getText() + "4");
			}//end if-else
		}//end handle	
	};//end number4EventHandler
	
	EventHandler<MouseEvent> number5EventHandler = new EventHandler<MouseEvent>() {
		@Override
		public void handle(MouseEvent e) {
			
			if(t1.getText().isEmpty()) {
				num1 = 5;
				t1.setText(t1.getText() + "5");
			}//
			else {
				num2 = 5;
				t1.setText(t1.getText() + "5");
			}//end if-else
		}//end handle	
	};//end number5EventHandler
	
	EventHandler<MouseEvent> number6EventHandler = new EventHandler<MouseEvent>() {
		@Override
		public void handle(MouseEvent e) {
			
			if(t1.getText().isEmpty()) {
				num1 = 6;
				t1.setText(t1.getText() + "6");
			}//
			else {
				num2 = 6;
				t1.setText(t1.getText() + "6");
			}//end if-else
		}//end handle	
	};//end number6EventHandler
	
	EventHandler<MouseEvent> number7EventHandler = new EventHandler<MouseEvent>() {
		@Override
		public void handle(MouseEvent e) {
			
			if(t1.getText().isEmpty()) {
				num1 = 7;
				t1.setText(t1.getText() + "7");
			}//
			else {
				num2 = 7;
				t1.setText(t1.getText() + "7");
			}//end if-else
		}//end handle	
	};//end number7EventHandler
	
	EventHandler<MouseEvent> number8EventHandler = new EventHandler<MouseEvent>() {
		@Override
		public void handle(MouseEvent e) {
			
			if(t1.getText().isEmpty()) {
				num1 = 8;
				t1.setText(t1.getText() + "8");
			}//
			else {
				num2 = 8;
				t1.setText(t1.getText() + "8");
			}//end if-else
		}//end handle	
	};//end number8EventHandler
	
	EventHandler<MouseEvent> number9EventHandler = new EventHandler<MouseEvent>() {
		@Override
		public void handle(MouseEvent e) {
			
			if(t1.getText().isEmpty()) {
				num1 = 9;
				t1.setText(t1.getText() + "9");
			}//
			else {
				num2 = 9;
				t1.setText(t1.getText() + "9");
			}//end if-else
		}//end handle	
	};//end number0EventHandler
	
	EventHandler<MouseEvent> addEventHandler = new EventHandler<MouseEvent>() {
		@Override
		public void handle(MouseEvent e) {
			t1.setText(t1.getText() + add.getText());
			add1 = true;
			subs1 = false;
			mult1 = false;
			division1 = false;
			equal1 = false;
		}//end handle	
	};//end addEventHandler
	
	EventHandler<MouseEvent> multEventHandler = new EventHandler<MouseEvent>() {
		@Override
		public void handle(MouseEvent e) {
			t1.setText(t1.getText() + mult.getText());
			mult1 = true;
			subs1 = false;
			division1 = false;
			equal1 = false;
		}//end handle	
	};//end subsEventHandler
	
	EventHandler<MouseEvent> subsEventHandler = new EventHandler<MouseEvent>() {
		@Override
		public void handle(MouseEvent e) {
			t1.setText(t1.getText() + subs.getText());
			subs1 = true;
			mult1 = false;
			division1 = false;
			equal1 = false;
		}//end handle	
	};//end subsEventHandler
	
	EventHandler<MouseEvent> divisionEventHandler = new EventHandler<MouseEvent>() {
		@Override
		public void handle(MouseEvent e) {
			t1.setText(t1.getText() + division.getText());
			division1 = true;
			subs1 = false;
			mult1 = false;
			equal1 = false;
		}//end handle	
	};//end divisionEventHandler
	
	EventHandler<MouseEvent> clearEventHandler = new EventHandler<MouseEvent>() {
		@Override
		public void handle(MouseEvent e) {
			t1.setText("");
			add1 = false;
			subs1 = false;
			mult1 = false;
			division1 = false;
			equal1 = false;
		}//end handle	
	};//end divisionEventHandler
	
	//the equal sign event handler
	EventHandler<MouseEvent> EqualEventHandler = new EventHandler<MouseEvent>() {
		@Override
		public void handle(MouseEvent e) {
			if(add1 == true) {
				double add = num1 + num2;
				String add1 = String.valueOf(add);
				
				t1.setText(add1);
			}
			
			if(subs1 == true) {
				double sub = num1 - num2;
				String sub1 = String.valueOf(sub);
				
				t1.setText(sub1);
			}
			
			if(mult1 == true) {
				double mult = num1 * num2;
				String mult1 = String.valueOf(mult);
				
				t1.setText(mult1);
			}
			
			if(division1 == true) {
				double div = (num1 / num2);
				String div1 = String.valueOf(div);
				
				t1.setText(div1);
			}
			
		}//end handle	
	};//end EqualEventHandler
	
	
	
}//end class
