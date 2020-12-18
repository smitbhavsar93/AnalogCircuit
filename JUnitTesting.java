
package coe318.lab7;

import java.util.ArrayList;

/**
 *
 * @author Smit Bhavsar
 */
public class JUnitTesting {
    
    /*
     *  Here are the two JUnit Tests for testing out my getResistance  
     *  and getVoltage methods (From Spicey Class)
    */
    public static void main(String[] args) {
        
        ArrayList<Integer> t1n1 = new ArrayList<>();
        ArrayList<Integer> t1n2 = new ArrayList<>();
        ArrayList<Double> t1val = new ArrayList<>();
        ArrayList<String> t1com = new ArrayList<>();
        
        t1n1.add(1);
        t1n1.add(2);
        t1n2.add(2);
        t1n2.add(0);
        t1val.add(25.0);
        t1val.add(3.5);
        t1com.add("r");
        t1com.add("v");
        Spicey t1 = new Spicey (t1n1, t1n2, t1val, t1com);
        
        //I will first test out getResistance method: (JUnit Test #1)
        t1.getResistance(0);
        /*
         * The output of the above statement should be 
         *
         * "R1 1 2 25.0"
         */
        
        //Now I will test out the getVoltage method: (JUnit Test #2)
        t1.getVoltage(1);
        /*
         * The output of the above statement should be 
         *
         * "V1 2 0 DC 3.5"
         */
    }
}
