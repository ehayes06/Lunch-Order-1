
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;   
import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {

    Scanner input = new Scanner(System.in);
    
    File file = new File("menuitems.txt");

    List<Food> menu = new ArrayList<Food>();
    
    try {
      Scanner scanner = new Scanner(file);

      while (scanner.hasNextLine()) {
	      String line = scanner.nextLine();
	      Scanner lineScanner = new Scanner(line);
        lineScanner.useDelimiter(",");
        
        String name = lineScanner.next();
        double price = lineScanner.nextDouble(); 
        int carb = lineScanner.nextInt();
        int fat = lineScanner.nextInt();
        int fiber = lineScanner.nextInt();

        Food foodItem = new Food(name, price, carb, fat, fiber);
        menu.add(foodItem);
        
      }//end while
      
    }// end try
      
    catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }// end catch

    System.out.println("");
    
    System.out.println("|||||||||||||||||||||||||||||||");
    System.out.println("|   Welcome to Lunch Order!   |");
    System.out.println("|||||||||||||||||||||||||||||||");
    
    System.out.println("");
    
    System.out.println("Take a look at the menu:");
    System.out.println("-----------------------------------------------------------------");
    System.out.println("");
    
    for (Food p : menu){
	     System.out.println("★ " + p.getName() + " ★  -  " + p.getFat()+"g of fat, " + p.getCarb() + "g of carbs, and " + p.getFiber() + "g of fiber.");
    }
    
    System.out.println("");
    System.out.println("-----------------------------------------------------------------");
  
  }//end main
}//end class