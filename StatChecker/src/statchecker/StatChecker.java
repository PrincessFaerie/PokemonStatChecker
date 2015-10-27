/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statchecker;
import java.util.*;
/**
 *
 * @author 44496
 */
public class StatChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Pokemon Stat Finder");
        System.out.println("Enter the base stat:");
        Scanner scan = new Scanner (System.in);
        double base = scan.nextInt();
        System.out.println("Enter the IV:");
        double IV = scan.nextInt();
        System.out.println("Enter the EVs:");
        double EV = scan.nextInt();
        System.out.println("Enter the Level:");
        double lvl = scan.nextInt();
        System.out.println("Is the nature positive, nuteral or negitive? (-1/0/1)");
        double nat = scan.nextInt();       
        
        double stat = (((IV+(2*base)+(EV/4))*lvl)/100)+5;
        if (nat==0){
            System.out.println("The Pokemon's stat is: "+stat);
        }
        else if (nat > 0){
            System.out.println("The Pokemon's stat is: "+stat*1.1);
        }
        else if (nat < 0){
            System.out.println("The Pokemon's stat is: "+stat*0.9);
        }
    }
    
}
