package assignment2_databasewithgui;
/**
 *
 * @author Kawya
 */
public class Book extends LibItem{
    private String authorName;
    private String ISBNnumber;
    
    public Book(String bookName, int length,String ISBNnumber, String authorName){
        super(bookName,length);
        this.ISBNnumber = ISBNnumber;
        this.authorName = authorName;
    }
    public String getAuthorName(){
        return this.authorName;
    }
    public String getISBNnumber(){
        return this.ISBNnumber;
    }
    @Override
    public String toString(){
       return ("ISBNnumber: "+this.ISBNnumber+"\nAuthor Name: "+this.authorName+"\n"+super.toString());
       
    }
    public static void main(String[] args) {
        Book obj = new Book("A Tale of Two Cities",21,"9780140430547","Charles Dickens");
        obj.setloanedTo("kawya");
        obj.checkOut();
        System.out.println(obj);
    }
}
