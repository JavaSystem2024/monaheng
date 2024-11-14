package university.limkokwingsystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.stage.Stage;
import com.mongodb.client.MongoDatabase;



import java.io.IOException;

public class HelloApplication extends Application {

    private MongoDBConnection mongoDBConnection;

    @Override
    public void start(Stage stage) throws IOException
    {

        MongoDBConnection mongoDBConnection = new MongoDBConnection();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 320, 240);

        mongoDBConnection.letsgo();

        stage.setTitle("MongoDB with JavaFX");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args)
    {
        launch();
    }
}