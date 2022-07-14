package assignment2_databasewithgui;
/**
 *
 * @author Kawya
 */
import java.util.*;
public class LibItem {
    private boolean checkedOut;
    private Time checkOutDate;
    private Time dueDate;
    private String itemName;
    private String loanedTo;
    private int loanPeriodLength;
    
    public LibItem(String itemName,int length){
        this.itemName = itemName;
        this.loanPeriodLength = length;
    }
    public void checkOut(){
        GregorianCalendar obj = new GregorianCalendar(); 
        checkOutDate = new Time(obj);
        obj.add(GregorianCalendar.DATE, loanPeriodLength);
        dueDate = new Time(obj);
        if (this.loanedTo==null)
            checkedOut = false;
        else
            checkedOut = true;
    }
    public void renew(){
        checkOut(21);
    }
    public void checkOut(int forNumDays){
        GregorianCalendar obj = new GregorianCalendar(); 
        checkOutDate = new Time(obj);
        obj.add(GregorianCalendar.DATE, forNumDays);
        dueDate = new Time(obj);
        if (this.loanedTo==null)
            checkedOut = false;
        else
            checkedOut = true;
    }
    public void returnToLibrary(){
        this.loanedTo = null;
        checkedOut = false;
    }
    @Override
    public String toString(){
        return ("Item Name : "+this.itemName+"\nCheckout Date: "+checkOutDate+"\nDue Date: "+dueDate+"\nLoaned To :"+loanedTo+"\nChecked Out: "+checkedOut);
    }
    public void setloanedTo(String loanedTo){
        this.loanedTo =loanedTo;
    }
    public void loanPeriodLength(int loanPeriodLength){
        this.loanPeriodLength =loanPeriodLength;
    }
    public void setCheckOutDate(GregorianCalendar checkOutDate){
        this.checkOutDate = new Time(checkOutDate);
    }
    public void setCheckOut(boolean checkedOut){
        this.checkedOut = checkedOut;
    }
    public void setDueDate(GregorianCalendar dueDate){
        this.dueDate = new Time(dueDate);
    }
    public void setItemName(String itemName){
        this.itemName = itemName;
    }
    public String getItemName(){
        return this.itemName;
    }
    public String getLoanedTo(){
        return this.loanedTo;
    }
    public Time getDueDate(){
        return this.dueDate;
    }
   
    public static void main(String[] args) {
        LibItem obj = new LibItem("A Tale of Two Cities",21);
        obj.setloanedTo("kawya");
        obj.checkOut();
        System.out.println(obj);
        long millis = System.currentTimeMillis();
        java.sql.Date sqlDate = new java.sql.Date(millis);
        System.out.println(sqlDate);
    }
}
