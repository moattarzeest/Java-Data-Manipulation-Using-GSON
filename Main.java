import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Scanner;
import com.google.gson.JsonSyntaxException;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Main {
    
     public static void main(String[] args) {
        Gson gson = new Gson();
        Scanner scannerObj = new Scanner(System.in); 
        String filePath = "books.json";
        Type bookListType = new TypeToken<List<Book>>() {
        }.getType();
        try (FileReader reader = new FileReader(filePath)) {
            List<Book> books = gson.fromJson(reader, bookListType);



            BookProcessor obj1=new BookProcessor();
            obj1.displayBookInfo(books);

            //Ask the user about specific author
            System.out.println("Enter the name of author: \n");
            String authorName=scannerObj.nextLine();
            obj1.authorBooks(authorName, books);

            System.out.println(obj1.averagePrice(books));
            System.out.println("-----------------------");

            System.out.println("The book with Highest Price is: \n");
            System.out.println(obj1.bookWithHighestPrice(books));
            System.out.println("-----------------------");

            System.out.println("Please enter the category of books: ");
            String categoryName=scannerObj.nextLine();
            obj1.categoryBooks(categoryName, books);
            System.out.println("-----------------------");

          

        } catch (IOException e) {
            System.out.println(e);
        }
        catch (JsonSyntaxException e) {
            System.out.println("Invalid JSON format in file: " + e.getMessage());
        } finally {
            scannerObj.close(); // Close the scanner to prevent resource leaks
        }
    }
}
