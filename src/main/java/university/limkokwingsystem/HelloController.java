package university.limkokwingsystem;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.fxml.FXML;
import com.mongodb.client.MongoDatabase;


public class HelloController {

    private MongoDBConnection mongoDBConnection;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick()
    {
        welcomeText.setText("Welcome to JavaFX Application!");
    }



}