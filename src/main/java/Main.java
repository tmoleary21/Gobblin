import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application{
    
    public static void main(String[] args){
        launch(args);

        Player player1 = new Player("Player 1", "white");
        Player player2 = new Player("Player 2", "black");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Gobblin"); //Stage is the window
        
        StackPane root = new StackPane(); //StackPane is area within window with content. It can have multiple layers
        primaryStage.setScene(new Scene(root, 300, 250)); //Scene is container for Pane?
        primaryStage.show();
    }
}