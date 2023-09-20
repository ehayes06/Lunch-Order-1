//****************************************************************************************
//*                               ICS4u - Computer Science
//*                               Lab: Mastermind
//*                               Date: Wednesday, September 19th, 2023
//*                               Name: Eldar, Ethan Hayes, Ethan Maddix
//****************************************************************************************


import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the number of pegs <3-8>: ");
    int pegs = input.nextInt();
    
    System.out.print("Enter the number of colors <1-8>: ");
    int numcolors = input.nextInt();

    int[] pegArray = new int[pegs];
    
    for (int i = 0; i < pegArray.length; i++) {
      pegArray[i] = (int) (Math.random() * numcolors + 1);
    }// end for

    System.out.println(Arrays.toString(pegArray));

    boolean guesses = true;

    while (guesses == true) {

    }
  }
}