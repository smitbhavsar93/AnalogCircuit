
package coe318.lab7;

import java.util.ArrayList;

/**
 *
 * @author Smit Bhavsar
 */
public class Spicey {
    
    static ArrayList<Integer> n1 = new ArrayList<>();
    static ArrayList<Integer> n2 = new ArrayList<>();
    static ArrayList<Double> val = new ArrayList<>();
    static ArrayList<String> com = new ArrayList<>();
    static int countR = 1;
    static int countV = 1;
    
    public Spicey(ArrayList<Integer> node1, ArrayList<Integer> node2, ArrayList<Double> value, ArrayList<String> comman) {
        n1 = node1;
        n2 = node2;
        val = value;
        com = comman;
    }
    
    public static void getResistance (int i){
            System.out.println("R" + (countR) + " " + n1.get(i) + " " + n2.get(i) + " " + val.get(i));
            countR++;
    }
    
    public static void getVoltage (int i){
            System.out.println("V" + (countV) + " " + n1.get(i) + " " + n2.get(i) + " " + "DC " + val.get(i));
            countV++;
    }
}   
