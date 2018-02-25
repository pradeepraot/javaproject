/**
 *
 * @author PRADEEP
 */
public class JavaApplication7 {
    int noOfWatts;
    boolean indicator;
    String  location;
    
    //constructor
    public JavaApplication7(int noOfwatts,boolean indicator,String site)
    {
       this.noOfWatts=noOfwatts;
       indicator=indicator;
       this.location=site;
       location=site;
       this.display();
       display();
       System.out.println(indicator);
    }
    
    public void display(){System.out.println(this);}
    
    public static void main(String args[])
    {
        JavaApplication7 light=new JavaApplication7(100,true,"test");
        System.out.println("No of watts\t"+light.noOfWatts);
        System.out.println("Indicator\t"+light.indicator);
        System.out.println("Location\t"+light.location);
    }
    
    
    
    
}

