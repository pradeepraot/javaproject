/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TransferStatements;

/**
 *
 * @author PRADEEP
 */
public class AssertExample {
    
    public static void main(String[] args) {
        AssertExample objRef = new AssertExample();
        double speed = objRef.calcSpeed(-12.0, 3.0);                // (1a)
        // double speed = objRef.calcSpeed(12.0, -3.0);             // (1b)
        // double speed = objRef.calcSpeed(12.0, 2.0);              // (1c)
        // double speed = objRef.calcSpeed(12.0, 0.0);              // (1d)
        System.out.println("Speed (km/h): " + speed);
    }

    /** Requires distance >= 0.0 and time > 0.0 */
    private double calcSpeed(double distance, double time) {
        assert distance >= 0.0;                                      // (2)
        assert time >0.0 : "Time is not a positive value: " + time;  // (3)
      //  if (time <= 0.0) throw new AssertionError("Time is not a positive value: " + time);
        
        double speed = distance / time;
        assert speed >= 0.0;                                         // (4)
        return speed;
    }

}
