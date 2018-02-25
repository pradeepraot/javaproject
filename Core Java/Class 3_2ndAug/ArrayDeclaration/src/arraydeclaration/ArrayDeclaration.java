package arraydeclaration;

/**
 *
 * @author PRADEEP
 */
public class ArrayDeclaration {
    
     int a[],b;
     static float k;
     ArrayDeclaration[] obj1,obj2;
     ArrayDeclaration obj4;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayDeclaration obj3=new ArrayDeclaration();
       obj3.obj4=new ArrayDeclaration();
        
        String s=null;
        
        System.out.println(obj3.obj4!=null);
        
        if(obj3.obj4!=null)
        {
               
       System.out.println("Array Declaration:int array value  "+obj3.a);
        System.out.println("Array Declaration: normal int  value  : "+obj3.b);
        //System.out.println("Array Declaration: arry length  value  : "+obj3.a.length);     
        //System.out.println("Array Declaration:int array first element value  "+obj3.a[-1]);
        
        System.out.println("Array Declaration: referance value  : "+obj3.obj4);
        System.out.println("Array Declaration: referance array value  : "+obj3.obj1);
        }
    }
    
}
