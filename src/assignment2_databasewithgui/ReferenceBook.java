package assignment2_databasewithgui;

import java.util.GregorianCalendar;

/**
 *
 * @author Kawya
 */
public class ReferenceBook extends Book{
    private String forCourse;
    
    public ReferenceBook(String bookName,String ISBNnumber, String authorName, String forCourse){
        super(bookName,0,ISBNnumber,authorName);
        this.forCourse = forCourse;
    }
    public String getCourse(){
        return this.forCourse;
    }
    @Override
     public void checkOut(){
        GregorianCalendar obj = new GregorianCalendar(); 
        super.setCheckOutDate(obj);
        obj.add(GregorianCalendar.DATE, 0);
        super.setDueDate(obj);
        super.setCheckOut(false);
    }
    @Override
      public void checkOut(int forNumDays){
        GregorianCalendar obj = new GregorianCalendar(); 
        super.setCheckOutDate(obj);
        obj.add(GregorianCalendar.DATE, 0);
        super.setDueDate(obj);
        super.setCheckOut(false);
    }
    @Override
    public String toString(){
       return (super.toString()+"\nCourse: "+this.forCourse);  
    }
    public static void main(String[] args) {
        ReferenceBook obj = new ReferenceBook("Algebraic Topology","9780521791601","Allen Hatcher","Math");
        obj.setloanedTo("kawya");
        obj.checkOut();
        System.out.println(obj);
    }
}
