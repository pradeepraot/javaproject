package AbstractClass;
abstract class Light {
    // Fields
    int     noOfWatts;       // wattage
    boolean indicator;       // on or off
    String  location;        // placement

    // Instance methods
    public void switchOn()  { indicator = true; }
    public void switchOff() { indicator = false; }
    public boolean isOn()   { return indicator; }

    // Abstract Instance Method
    abstract public double kwhPrice();               // (1) No method body
}
 class TubeLight extends Light {
    // Fields
    int tubeLength;

    // Implementation of inherited abstract method.
    public final  double  kwhPrice() { return 2.75; }        // (2)
}

public class Factory   {
    public static void main(String[] args) {
        TubeLight cellarLight = new TubeLight();     // (3) OK
        Light nightLight;                            // (4) OK
      Light tableLight = new TubeLight();              // (5) Compile time error
        nightLight = cellarLight;                    // (6) OK
        System.out.println("KWH price: " + nightLight.kwhPrice());
        System.out.println("KWH price: " + tableLight.kwhPrice());
       // public   double  kwhPrice() { return 2.75; }
    }
}
