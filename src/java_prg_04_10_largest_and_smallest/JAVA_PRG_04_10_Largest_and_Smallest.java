/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_04_10_largest_and_smallest;

import javax.swing.JOptionPane;
/**
 *
 * @author bluebackdev
 * Write a program with a loop that lets the user enter a series of integers.
 * The user should enter -99 to signal the end of the series. After all the
 * numbers have been entered, the program should display the largest and
 * smallest numbers entered.
 */
public class JAVA_PRG_04_10_Largest_and_Smallest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // For user input
        String strUserInput;
        
        // Declare integers for use in loop
        int intUserInput = 0;
        int intHighest = Integer.MIN_VALUE; // Set to minimum value so all inputs are higher
        int intLowest = Integer.MAX_VALUE; // Set to maximum integer value so all inputs are lower
        int intCounter = 0;
        
        while(intUserInput != -99)
        {
            strUserInput = JOptionPane.showInputDialog("Please enter a number.\n"
                    + "Enter -99 to exit.");
            intUserInput = Integer.parseInt(strUserInput);
            
            // Check user input against highest value and make sure
            // that it's not the final number (-99) so it doesn't displace
            // the highest number if all values are lower than -99
            if(intUserInput > intHighest && intUserInput != -99)
            {
                intHighest = intUserInput;
            }
            
            // Check if number is lowest and that it's not -99 so that
            // it doesn't displace the lowest value if the lowest value
            // is greater than -99
            if(intUserInput < intLowest && intUserInput != -99)
            {
                intLowest = intUserInput;
            }
            
            // Vanity, for keeping track of total numbers
            // entered by user
            intCounter++;
        }
        
        // Format and output results to the user
        JOptionPane.showMessageDialog(null, "After entering " + intCounter +
                " numbers, your highest value was " + intHighest + " and your"
                        + " lowest value was " + intLowest + ".");
        
        // Exit for JOptionPane
        System.exit(0);
    }
    
}
