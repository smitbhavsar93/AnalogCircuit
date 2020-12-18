
package coe318.lab7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Smit Bhavsar
 */

public class UserMain {
    
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in); 
        char command = 'a';
        ArrayList<Integer> node1 = new ArrayList<>();
        ArrayList<Integer> node2 = new ArrayList<>();
        ArrayList<Double> value = new ArrayList<>();
        ArrayList<String> comm = new ArrayList<>();
        
        do {
            command = in.next().charAt(0);
            comm.add((Character.toString(command)));
            if (command == 'e'){
                break;
            } else if (command == 's'){
                Spicey spice = new Spicey(node1, node2, value, comm);
                for (int i = 0; i < comm.size(); i++){
                    if (comm.get(i).equals("r")){
                        spice.getResistance(i);
                    } else if (comm.get(i).equals("v")){
                      spice.getVoltage(i);
                    }
                }
            } else {
                node1.add(in.nextInt());
                node2.add(in.nextInt());
                value.add(in.nextDouble());
            }
        } while (command != 'e');
        
        System.out.println("All Done");
    }
}
