import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.UpdateResult;
import org.bson.Document;

import java.util.Arrays;
import java.util.Date;
import java.util.function.Consumer;
import java.util.logging.Filter;

public class Main {
    public static void main(String[] args) {
// credencial (login)
        MongoCredential credential = MongoCredential.createCredential("root", "admin", "root".toCharArray());
        MongoClient cliente = new MongoClient(new ServerAddress("localhost", 27017), Arrays.asList(credential));

        MongoDatabase db = cliente.getDatabase("vemserdbc");
        //db.createCollection("alunos_java");
        MongoCollection<Document> alunos = db.getCollection("alunos");
//		MongoCollection<Document> orders = db.getCollection("orders");

        Document novoAluno = new Document("nome", "Ana")
                .append("data_nascimento", new Date(0, 10, 10))
                .append("curso", new Document("nome", "Matemática"))
                .append("notas", Arrays.asList(8, 7, 9))
                .append("habilidades", Arrays.asList(new Document()
                                .append("nome", "Português")
                                .append("nível", "Fluente"),
                        new Document()
                                .append("nome", "Inglês")
                                .append("nível", "Intermediário")))
                .append("_id", 3);

        alunos.insertOne(novoAluno);

        //find all documents from a collection
      FindIterable<Document> result  = alunos.find();
      result.forEach((Consumer<? super Document>) document -> System.out.println(document.toJson()));

      //find documents with name Ana
        FindIterable<Document> onlyAna = alunos.find(new Document("nome","Ana"));
        onlyAna.forEach((Consumer<? super Document>) document -> System.out.println(document.toJson()));

        //update

        alunos.updateOne(Filters.eq("_id", 3), Updates.set("nome","Francisca"));

        //delete
        alunos.deleteOne(Filters.eq("nome","Francisca"));
    }
}
