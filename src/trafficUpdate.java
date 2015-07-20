import java.util.Scanner;
public class trafficUpdate {
	public static void main(String[] args){
		System.out.println("We have traffic status updates for Nairobi");
		
		Scanner choices = new Scanner (System.in);
		System.out.println("Do you want an update for specific or all roads ?");
		int y = choices.nextInt();
		
		if( y == 1){
			
				Scanner road = new Scanner (System.in);
				System.out.println("Enter the road number:");
				
				int x = road.nextInt();
				
				if(x == 1){
					System.out.println("There is traffic on Ngong Road.");
					
				}
				if(x == 2){
					System.out.println("There is no traffic on Waiyaki Road.");
					
				}
				if(x == 3){
					System.out.println("There is traffic on Mombasa Road.");
					
				}
				if(x == 4){
					System.out.println("There is no traffic on Mbagathi Road.");
					
				}
				if(x == 5){
					System.out.println("There is traffic on Jogoo Road.");
					
				}
			}	
			
			else if (y == 2){
					
					Scanner allroads = new Scanner(System.in);
					System.out.println("Do you want roads with or without traffic?");
					
					int z = allroads.nextInt();
					
					
					if(z == 1) {
						System.out.println("The following have traffic:");
						System.out.println("1.Ngong Road 2.Mombasa Road 3. Jogoo Road");
					}
					else{
						System.out.println("The following have no traffic:");
						System.out.println("1.Waiyaki Way 2. Mbagathi Road");
				}
			
			
		}
		

		
	}
}
