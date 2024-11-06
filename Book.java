import java.util.List;
public class Book
{
    String title;
    String author;
    Metadata metadata;

    public Book()
    {
    }

    public void setTitle(String title)
    {
        this.title=title;
    }

    public String getTitle()
    {
        return title;
    }

    public void setAuthor(String author)
    {
        this.author=author;
    }

    public String getAuthor()
    {
        return author;
    }
    public void setMetadata(Metadata metadata)
    {
        this.metadata=metadata;
    }
    public Metadata getMetadata()
    {
        return metadata;
    }

    public void displayBookInfo()
    {
        System.out.println(getTitle());
        System.out.println(getAuthor());
        System.out.println(getMetadata());
    }

    public class Metadata
    {
        int price;
        int pages;
        String isbn;
        List<String> categories;

        public void setPrice(int price)
        {
            this.price=price;
        }
    
        public int getPrice()
        {
            return price;

        }
        
        public void setPages(int pages)
        {
            this.pages=pages;
        }
    
        public int getPages()
        {
            return pages;
        }
        
        public void setIBN(String ibn)
        {
            this.isbn=isbn;
        }
    
        public String getIBN()
        {
            return isbn;
        }

        public void setCategories(List<String> categories) {
            this.categories = categories;
        }
        
        public List<String> getCategories() {
            return categories;
        }

       
        




    }

  

}

// public class Demo
// {
//     public static void main(String[] args) {
        
//     }
// }