import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nafea8846
 */
public class ComputerRegester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many chargers are there?");
        int chargers = input.nextInt();
        
        System.out.println("How many motherboards are there?");
        int mobo = input.nextInt();
        
        System.out.println("How many mice are there?");
        int mice = input.nextInt();
        
        double subtotal = (chargers*34.99)+(mobo*127.50)+(mice*18);
        System.out.println("Subtotal: $" + subtotal);
        
        double taxes = .13*subtotal;
        System.out.println("Taxes; $" + taxes);
        
        double total = subtotal + taxes;
        System.out.println("Total: $" + total);
        
    
    }
    
}
