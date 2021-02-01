
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
import java.util.Scanner;
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [] students;
        students = new String[6];
        // allocates memory for 10 integers
                   
        // initialize first element
        /*students[0] = "John";
        // initialize second element
        students[1] = "Marry";
        // and so forth
        students[2] = "May";
        students[3] = "Kamal";
        students[4] = "Susan";
        students[5] = "Nancy";*/
       Scanner input= new Scanner (System.in);
        for (int i = 0; i < students.length; i++) {
                
                System.out.print("Enter the student name: ");
                students[i]=input.nextLine();
}
        for (int i = 0; i < students.length; i++) {
                System.out.println(students[i]);
}
    }
    
}
