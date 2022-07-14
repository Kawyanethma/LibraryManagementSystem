package assignment2_databasewithgui;
/**
 *
 * @author Kawya
 */
public class DVD extends LibItem {
    private String director;
    private String makerStudio;
    private boolean subtitled;
    
    public DVD(String movieName,String director, String makerStudio, boolean subtitled){
        super(movieName,2);
        this.director = director;
        this.makerStudio = makerStudio;
        this.subtitled = subtitled;
    }
    public String getDirector(){
        return this.director;
    }
    public String getSub(){
        if(this.subtitled)
            return "Yes";
        else
            return "No";
    }
    @Override
    public String toString(){
        return ("Director: "+this.director+"\nMaker Studio: "+this.makerStudio+"\nSubtitled: "+this.subtitled+"\n"+super.toString());
    }
    public static void main(String[] args) {
        DVD obj = new DVD("Interstellar","Christopher Nolan","Warner Bros. Pictures",true);
        obj.setloanedTo("kawya");
        obj.checkOut();
        System.out.println(obj);
    }
}
