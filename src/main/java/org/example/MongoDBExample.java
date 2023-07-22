package org.example;

import com.mongodb.client.*;
import org.bson.Document;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MongoDBExample {
    public static void main(String[] args) {
        // MongoDB connection parameters
        String hostPort = "localhost:27017";
        String databaseName = "mydb";
        String collectionName = "mycollection";

        // Set up the MongoDB client
        MongoClient mongoClient = MongoClients.create("mongodb://" + hostPort);

        try {
            // Get the database
            MongoDatabase database = mongoClient.getDatabase(databaseName);

            // Get the collection
            MongoCollection<Document> collection = database.getCollection(collectionName);

            // Insert a document (optional, you can skip this)
            Document document = new Document("name", "John Doe").append("age", 35);
            collection.insertOne(document);

            // Query and print all documents in the collection
            FindIterable<Document> documents = collection.find();
            for (Document doc : documents) {
                System.out.println(doc.toJson());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the client when done
            mongoClient.close();
        }
    }
}

