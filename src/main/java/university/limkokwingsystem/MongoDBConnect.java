package university.limkokwingsystem;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MongoDBConnect
{
    //MongoClient mongoClient = new MongoClient("localhost", 27017);
    MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");

    // Step 2: Get the specific database (if it doesn't exist, MongoDB will create it)
    MongoDatabase database = mongoClient.getDatabase("myDatabase");

}
