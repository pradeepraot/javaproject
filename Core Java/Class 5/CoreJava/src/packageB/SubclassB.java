// Filename: SubclassB.java                             (6)
package packageB;
import packageA.*;

public class SubclassB extends SuperclassA {
    
    void subclassMethodB() { superclassMethodA();    }  // (7) OK.
    
    SubclassB objRefB = new SubclassB();             // (1)

    void subclassMethodB(SuperclassA objRefA) {
        objRefB.superclassMethodA();                 // (2) OK.
        objRefB.superclassVarA = 5;                  // (3) OK.
        //objRefB.c=10;
       // objRefA.superclassMethodA();                 // (4) Not OK.
        //objRefA.superclassVarA = 10;                 // (5) Not OK.
    }

    
}

class AnyClassB {
    SuperclassA obj = new SuperclassA();
    void anyClassMethodB() {
        obj.superclassVarA = 20;                     // (8) OK.
//        System.out.print(obj.c);
    }
    
    
}
