/*
 *  UCF COP3330 Fall 2021 Exercise 14 Solution
 *  Copyright 2021 Maxwell Graeser
 */

import java.util.Scanner;
public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Whats the order amount? ");
        String order = scan.nextLine();
        System.out.print("What is the state? ");
        String state = scan.nextLine();

        double subtotal = Double.parseDouble(order);
        String output = String.format("The total is $%.2f", subtotal);

        if (state.equals("WI")) {
            double tax = subtotal * .055;
            double total = subtotal + tax;
            output = String.format("The subtotal is $%.2f\nThe tax is $%.2f\nThe total is $%.2f", subtotal, tax, total);
        }


        System.out.println(output);
    }
}