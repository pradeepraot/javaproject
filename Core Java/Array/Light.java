/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author PRADEEP
 */
public class Light {
    int noOfWatts;
    boolean indicator;
    String location;
    
    static String test;
    
    //constructor
    public Light(int noOfwatts,boolean indicator,String site)
    {
       this.noOfWatts=noOfwatts;
       indicator=indicator;
       location=site;
       this.display();
       display();
    }
   
    
    public void display(){
        
        System.out.println(this.indicator);
        System.out.println(this.test);
    }
    
    public static void main(String args[])
    {
        Light light=new Light(100,true,"test");
        System.out.println("No of watts"+light.noOfWatts);
        System.out.println("Indicator"+light.indicator);
        System.out.println("Location"+light.location);
        System.out.println("Location"+light.test);
    }
    
    
    
    
}
