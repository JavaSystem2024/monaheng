package university.limkokwingsystem;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;


public class MongoDbOperations
{
    // Method to insert data
    public static void insertData(MongoDatabase database) {
        MongoCollection<Document> collection = database.getCollection("tlotli");

        Document document = new Document("name", "John Doe")
                .append("age", 30)
                .append("email", "john.doe@example.com");

        collection.insertOne(document);
        System.out.println("Data inserted successfully!");
    }

    // Method to read data
    public static void readData(MongoDatabase database) {
        MongoCollection collection = database.getCollection("tlotli");

        FindIterable<Document> names = collection.find();

        for (Document doc : names)
        {

            System.out.println(doc);
        }
    }
}
