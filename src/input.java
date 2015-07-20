import java.util.Scanner; //Importing scanner to allow asking for user input
public class input {
	public static void main(String[] args){
		System.out.println("Good Morning!");
		System.out.println("Please enter your name to proceed."); //Giving instructions to the user
		Scanner askuser = new Scanner(System.in); //Variable to hold user input
		System.out.println("Welcome "+askuser.nextLine()); //Printing user input
	}

}
