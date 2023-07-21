//package org.example;
//
//import com.mongodb.MongoClientSettings;
//import com.mongodb.client.*;
//import com.mongodb.ConnectionString;
//import com.mongodb.MongoCredential;
//import org.bson.Document;
//
//public class MongoDBExample {
//    public static void main(String[] args) {
//        // MongoDB connection parameters
//        String host = "your_remote_host"; // Replace with your remote host address
//        int port = 27017; // MongoDB default port
//        String databaseName = "your_database_name"; // Replace with your database name
//        String collectionName = "your_collection_name"; // Replace with your collection name
//        String username = "abc"; // Replace with your username
//        String password = "xyz123"; // Replace with your password
//        String replicaSetName = "rs_dan"; // Replace with your replica set name
//
//        // MongoDB connection URL
//        String connectionString = "mongodb://" + username + ":" + password + "@" + host + ":" + port + "/?replicaSet=" + replicaSetName + "&authMechanism=PLAIN&authSource=$external";
//
//        // Set up the MongoDB client
//        MongoClientSettings settings = MongoClientSettings.builder()
//                .applyConnectionString(new ConnectionString(connectionString))
//                .build();
//
//        MongoClient mongoClient = MongoClients.create(settings);
//
//        try {
//            // Get the database
//            MongoDatabase database = mongoClient.getDatabase(databaseName);
//
//            // Get the collection
//            MongoCollection<Document> collection = database.getCollection(collectionName);
//
//            // Insert a document (optional, you can skip this)
//            Document document = new Document("name", "John Doe").append("age", 30);
//            collection.insertOne(document);
//
//            // Query and print all documents in the collection
//            FindIterable<Document> documents = collection.find();
//            for (Document doc : documents) {
//                System.out.println(doc.toJson());
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            // Close the client when done
//            mongoClient.close();
//        }
//    }
//}
//
