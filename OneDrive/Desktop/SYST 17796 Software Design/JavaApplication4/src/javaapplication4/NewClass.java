/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author r2kar
 */
public class NewClass {
    public static void main(String[] args) {

		// TODO Auto-generated method stub
	    double amount; // amount on deposit at end of each year
	    double principal = 1000.0; // initial amount before interest
	    double rate = 1.05; // interest rate

	      // display headers
	    System.out.printf("%s%20s%n", "Year", "Amount on deposit");

	      // calculate amount on deposit for each of ten years
	      for (int year = 1; year <= 10; year++) 
	      {
	         // calculate new amount for specified year
	         amount = principal * Math.pow(rate, year);
	         // display the year and the amount
	         System.out.printf("%4d%,20.3f%n", year, amount);

		}

	}
}
