import java.util.Scanner;
public class trafficUpdate {
	public static void main(String[] args){
		System.out.println("We have status updates on the following roads:");
		System.out.println("r1.Ngong Road r2.Waiyaki Way r3.Mombasa Road r4.Mbagathi Way r5.Jogoo Road");
		
//		String r1 = "Yes"; 
//		String r2 = "No"; 
//		String r3 = "Yes";
//		String r4 = "No";
//		String r5 = "Yes";
		
		Scanner road = new Scanner (System.in);
		System.out.println("Enter the road number:");
		
		int x = road.nextInt();
		
		if(x == 1){
			System.out.println("There is traffic on Ngong Road.");
			
		}
		if(x == 2){
			System.out.println("There is traffic on Waiyaki Road.");
			
		}
		if(x == 3){
			System.out.println("There is traffic on Mombasa Road.");
			
		}
		if(x == 4){
			System.out.println("There is traffic on Mbagathi Road.");
			
		}
		if(x == 5){
			System.out.println("There is traffic on Jogoo Road.");
			
		}
	}
}
