
import java.util.*;
public class matokeo {
	public static void main(String[] args){
		double Maize = 20;
		double Rice = 100;
		double Sorgum = 120;
		double Oats = 235;
		double Millet = 145;
		double Soda = 99;
		double Milk = 102;
		double Water = 40;
		double Kales = 40;
		double Spinach = 50;
		double Cabbage = 65;
		double Jembe = 49;
		double Jogoo = 44;
		double EXE = 62.5;
	    double Taifa = 60;
	    
	    System.out.println("Welcome To Matokeo supermarket, where price makes a difference!");
	    
	    System.out.println("to check the items we have in stock reply with 1:");
	    System.out.println("to check the price reply with 2:");
	    System.out.println("to make a purchase reply with 3:");
	    
	    Scanner action1 = new Scanner(System.in);
	    int x = action1.nextInt();
	    
	    if(x == 1){
	    	System.out.println("we have the following in stock:");
	    	System.out.println("Cereals: maize, rice, sorgum, oats, millet");
	    	System.out.println("Beverages: soda, milk, water");
	    	System.out.println("vegetables: kales, spinach, cabbage");
	    	System.out.println("Flour: Jembe, Jogoo, EXE, Taifa");
	    }
	    if(x == 2){
	      System.out.println("Type the name of the product to check the price");
	      System.out.println("reply with: 1. Maize, 2. Rice, 3. Sorgum, 4. Oats, 5. Millet, 6. Soda, 7. Milk, 8. Water, 9. Kales, 10. Spinach, 11. Cabbage, 12. Jembe, 13. Jogoo, 14.EXE, 15. Taifa");
	      Scanner checkPrice = new Scanner(System.in);
	      double z = checkPrice.nextDouble();
	      
		      if(z == 1){
		    	  System.out.println(Maize);
		      }
		      else if(z == 2){
		    	  System.out.println(Rice);
		      }
		      else if(z == 3){
		    	  System.out.println(Sorgum);
		      }
		      else if(z == 4){
		    	  System.out.println(Oats);
		      }
		      else if(z == 5){
		    	  System.out.println(Millet);
		      }
		      else if(z == 6){
		    	  System.out.println(Soda);
		      }
		      else if(z == 7){
		    	  System.out.println(Milk);
		      }
		      else if(z == 8){
		    	  System.out.println(Water);
		      }
		      else if(z == 9){
		    	  System.out.println(Kales);
		      }
		      else if(z == 10){
		    	  System.out.println(Spinach);
		      }
		      else if(z == 11){
		    	  System.out.println(Cabbage);
		      }
		      else if(z == 12){
		    	  System.out.println(Jembe);
		      }
		      else if(z == 13){
		    	  System.out.println(Jogoo);
		      }
		      else if(z == 14){
		    	  System.out.println(EXE);
		      }
		      else if(z == 15){
		    	  System.out.println(Taifa);
		      }
		      else
		      {
		    	  System.out.println("Item doest exist");
		      }
		            
		 }
	   if(x ==3){ 
      System.out.println("Type the name of the product to buy");
      System.out.println("reply with: 1. Maize, 2. Rice, 3. Sorgum, 4. Oats, 5. Millet, 6. Soda, 7. Milk, 8. Water, 9. Kales, 10. Spinach, 11. Cabbage, 12. Jembe, 13. Jogoo, 14.EXE, 15. Taifa");
      Scanner pickItem = new Scanner(System.in);
      double z = pickItem.nextDouble();
      double total = 0;
	    for (z=1; z<=15; z++){
	    	total = total + z;
	    	System.out.println(total);
	    } 
	  }
	    
	}

}
