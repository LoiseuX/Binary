/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary;

/******************************************************************
 * Program 1: Conversion from binary to decimal representation
 * Programmer: Fernandez, Royce Marquo E.
 * 
 * Class: IT 121        Instructor: 
 *        
 * Pledge: I have neither given nor received unauthorized aid
 * on this program.     (Royce Fernandez)
 *
 * Description: This program converts a binary number to decimal.
 *
 * Input: Binary number
 *
 * Output: Decimal number
 *
 ******************************************************************/

// Imported packages
   import javax.swing.*;

    public class Binary
   {
   
   // Main method
       public static void main(String[] args)
      {
      	
      	// Request 6-bit binary number
         String binaryString=JOptionPane.showInputDialog("Enter a 10-bit binary number");
      	
      	// Convert from String to integer type
         int binary=Integer.parseInt(binaryString);
      	
      	// Declaration of output value
         int decimal=0;
      
      	// Declaration of variable to hold the current bit
         int bit;
      
         
         int i=0;
         int power2=1;
         int len=binaryString.length();

         //the modified sample 10 bit binary
/*
         while (i<len) {

               bit=binary%10;//get the last bit (10th)
               decimal=decimal+bit*1;//add it, multiplied by the corresponding power of 2
               binary=binary/10;
               power2*=2;
	            i++;
      
               bit=binary%10;//get the last bit (9th)
               decimal=decimal+bit*2;//add it, multiplied by the corresponding power of 2
               binary=binary/10;
               power2*=2;
		         i++;

               bit=binary%10;//get the last bit (8th)
               decimal=decimal+bit*4;//add it, multiplied by the corresponding power of 2
               binary=binary/10;
               power2*=2;
		         i++;

               bit=binary%10;//get the last bit (7th)
               decimal=decimal+bit*8;//add it, multiplied by the corresponding power of 2
               binary=binary/10;
               power2*=2;
		         i++;

               bit=binary%10;//get the last bit (6th)
               decimal=decimal+bit*16;//add it, multiplied by the corresponding power of 2
               binary=binary/10; 
               power2*=2;
		         i++;

               bit=binary%10;//get the last bit (5th)
               decimal=decimal+bit*32;//add it, multiplied by the corresponding power of 2
               power2*=2;
               i++;

               bit=binary%10;//get the last bit (4th)
               decimal=decimal+bit*64;//add it, multiplied by the corresponding power of 2
               power2*=2;
               i++;

               bit=binary%10;//get the last bit (3rd)
               decimal=decimal+bit*128;//add it, multiplied by the corresponding power of 2
               power2*=2;
               i++;

               bit=binary%10;//get the last bit (2nd)
               decimal=decimal+bit*256;//add it, multiplied by the corresponding power of 2
               power2*=2;
               i++;

               bit=binary%10;//get the last bit (1st)
               decimal=decimal+bit*512;//add it, multiplied by the corresponding power of 2
               power2*=2;
               i++;
    }
*/


	while (i<len) {
		bit=binary%10;
		decimal=decimal+bit*power2;
		binary=binary/10;
		power2*=2;
		i++;
	}

      	// Format output String
         String binaryOutput="Binary: " + binaryString;
         String decimalOutput="Decimal: " + decimal;
      	
      	// Output message
         JOptionPane.showMessageDialog(null, binaryOutput + "\n" + decimalOutput,
            "Binary to Decimal Conversion", JOptionPane.INFORMATION_MESSAGE);
      		
      	// Exit
         System.exit(0);
      		
      }

    }
