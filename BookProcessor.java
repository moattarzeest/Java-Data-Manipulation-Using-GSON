import java.util.List;
 
class BookProcessor {


    public void displayBookInfo(List<Book> books)
    {
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Price: " + book.getMetadata().getPrice());
            System.out.println("Categories: " + book.getMetadata().getCategories());
            System.out.println("ISBN: " + book.getMetadata().getIBN());
            System.out.println("Pages: " + book.getMetadata().getPages());
            System.out.println("-----------------------");
        }

    }
    public void authorBooks(String authorName, List<Book> books)
    {
        System.out.println("Here are the books of following aurthor: \n");
        // for (Book book : books) {
        //     if (book.getAuthor() != null && book.getAuthor().equals(authorName)) {
        //         System.out.println( book.getTitle());
               
        //     }
        // }

        books.stream()
        .filter(book -> book.getAuthor() != null && book.getAuthor().equals(authorName))
        .map(Book::getTitle)
        .forEach(System.out::println);
        System.out.println("-----------------------");
    }

    public double averagePrice(List<Book> books)
    {
        System.out.println("The average price of all the books is:");
        // for (Book book: books)
        // {
        //     sum=sum+book.getMetadata().getPrice();
        //     count++;
        // }
       
       double sumOfBooks= books.stream()
        .mapToDouble(book -> book.getMetadata().getPrice())
        .sum();

        long countOfBooks=books.stream()
        .count();
        double average=sumOfBooks/countOfBooks;
        return average;
    }

    public String bookWithHighestPrice(List<Book> books)
    {
        // Book highestPriceBook=books.get(0); // The object of Book --> contains Book 1 object
        // int highestPrice=highestPriceBook.getMetadata().getPrice(); //Contains the price of Book 1
        // for(Book book: books)
        // {
        //     if(book.getMetadata().getPrice() > highestPrice)
        //     {
        //         highestPrice=book.getMetadata().getPrice();
        //         highestPriceBook=book;
        //     }
        // }

        Book highestPriceBook = books.stream()
    .max((book1, book2) -> Integer.compare(book1.getMetadata().getPrice(), book2.getMetadata().getPrice()))
    .orElse(null);
        return highestPriceBook.getTitle();
    }
    public void categoryBooks(String category, List<Book> books)
    {
        // for(Book book: books)
        // {
        //     if(book.getMetadata().getCategories().contains(category))
        //     {
        //         System.out.println(book.getTitle());
        //     }
        // }
        books.stream()
        .filter(book -> book.getMetadata().getCategories().contains(category))
        .map(Book::getTitle)
        .forEach(System.out::println);
    }
    
}
