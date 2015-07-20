import java.util.Scanner;
public class addnumbres {
	public static void main(String[] args){
		System.out.println("I can add numbers for you: Try me:");
		Scanner num = new Scanner (System.in);
		int numone, numtwo, numthree, answer;
		
		System.out.println("enter the 1st number:");
		numone = num.nextInt();
		
		System.out.println("enter the 2nd number:");
		numtwo = num.nextInt();
				
		System.out.println("enter the 3rd number");
		numthree = num.nextInt();
		
		answer = numone + numtwo + numthree;
		System.out.println("Your sum is "+answer);
		
	}
}

