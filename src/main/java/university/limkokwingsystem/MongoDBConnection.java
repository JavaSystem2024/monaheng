package university.limkokwingsystem;
import com.mongodb.ClientSessionOptions;
import com.mongodb.client.*;
import com.mongodb.connection.ClusterDescription;
import org.bson.Document;
import org.bson.conversions.Bson;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

import java.util.List;

public class MongoDBConnection
{
    private MongoClient mongoClient;
    private MongoDatabase database;

    public MongoDBConnection() {

    }

    public void letsgo()
    {
        // Local MongoDB URI or Remote URI (for MongoDB Atlas)
        String mongoURI = "mongodb://localhost:27017"; // Local MongoDB instance

        // Connect to the MongoDB server
        MongoClient mongos = MongoClients.create(mongoURI);

        // Connect to the specific database (replace "myDatabase" with your actual database name)
        // database = mongoClient.getDatabase("admin");

        MongoDatabase bb = mongos.getDatabase("admin");

        MongoCollection collection = bb.getCollection("tlotli");

        FindIterable<Document> doc = collection.find();

        for(Document wow : doc)
        {
            //System.out.println(wow.toJson());
        }
    }


}
