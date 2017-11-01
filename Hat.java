
/**
 * Write a description of class Hat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hat
{
    // instance variables - replace the example below with your own
    private String hatType;
    private boolean onHead;

    /**
     * Constructor for objects of class Hat
     */
    public Hat()
    {
        // initialise instance variables
    }
    
    public Hat(String nm,boolean on){
        this.hatType = nm;
        this.onHead = on;
    }
    
    public Hat newHat(Hat other) {
        Hat temp = new Hat("Top Hat", true);
        return temp;
    }
    
    

}
