package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFastExample
{
    
    
    public static void main(String[] args)
    {
        Map<String,String> premiumPhone = new HashMap<String,String>();
        premiumPhone.put("Apple", "iPhone");
        premiumPhone.put("HTC", "HTC one");
        premiumPhone.put("Samsung","S5");
        
        Iterator iterator = premiumPhone.keySet().iterator();
        int i=0;
        while (iterator.hasNext())
        {
            System.out.println(premiumPhone.get(iterator.next()));
           if(i==0) iterator.remove(); 
           i++;
           // premiumPhone.remove("HTC");
          //  premiumPhone.put("Sony", "Xperia Z");
        }
        
        System.out.println(premiumPhone);
        
    }
    
}