package assignment2_databasewithgui;
/**
 *
 * @author Kawya
 */

import java.util.*;

public class Time {
    int year;
    int monthi;
    String month;
    int day;

    public Time(GregorianCalendar obj){
        String months[] = { "January", "February", "March", "April",   
                           "May", "June", "July", "August",   
                           "September", "October", "November", "December" };   

        
        year = obj.get(Calendar.YEAR);
        monthi= obj.get(Calendar.MONTH);
        month = months[obj.get(Calendar.MONTH)];
        day = obj.get(Calendar.DATE);

        
    }
    
    @Override
    public String toString(){
        return (year+" "+month+" "+day);
    }
}
