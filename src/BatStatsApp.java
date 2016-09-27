import java.util.Scanner;

public class BatStatsApp {

	public static void main(String[] args) {
		
		// Declare variables 
		int number=0;
		double total = 0.0;
		double result = 0.0;
		String answer = "";
		boolean proceed = true;
	
		//Declare and Instantiate array
		int [] hits; 
		
		//Create scanner
		Scanner input = new Scanner(System.in);
		
		//Welcome message
		while(proceed){
		System.out.println("Welcome to Batting Average Calculator!\n");
	
		
		System.out.println("0=out, 1=single, 2=double, 3=triple, 4=home run");
		System.out.println("===============================================");
	
		//Prompt user to enter number of times at bat	
		System.out.println("Enter number of times at bat:\n");
		number = input.nextInt( );
		
		//Validation to ensure user only enters positive integers for number of times at bat
		while(number <= 0){
			System.out.println("You entered an invalid number. Enter a number greater than 0:");
			number = input.nextInt( );
		}
		
		//Create new array for atBats
		int [] atBats = new int[number];
		
		//Creates new object
		hits=new int[number];
	

		//Displays number of at bats entered by user
		for (int i = 0; i < hits.length; i++) {
			total = total + 1 ;
			System.out.print("Result for at-bat "  + i +  ": " );
	
			//User input times at bat
			hits[i] = input.nextInt();
			
			//Validation to ensure user enters a number between 0 to 4
			if(hits[i] > 4 || hits[i]<0){
			
				System.out.println("You entered an invalid choice. Please enter a number between 0 and 4.");
				number = input.nextInt( );
			}
		}
			
		//Number of hits and sum of bases
		for(int i : atBats) {
			if(i > 0)
				hits[i]++;
				total += i;
		}
		
		//Sum of at bat results 
		for (int i = 0; i< hits.length; i++) {
			result += hits[i];
		}
		
		//Calculate battingAve and slugPercent
		double slug = (double) result/ number;
		double battingAvg = (double) total/ number;
	
		//Prints out batting average
		System.out.printf("Batting Average: %.3f \n", battingAvg);
		
		//Prints out slugging percentage
		System.out.printf("Slugging Percentage: %.3f \n", slug);
	
		//Prompt user to another another batter if they want to continue
		System.out.println("Another batter? (y/n):");
		input.nextLine( );
	
		//Validation to ensure user only enters a "Y", "y", "N", or "n"
		String choice = input.nextLine();
		
		
		if(choice.equalsIgnoreCase("y")){
			proceed = true;	
		}else{
			proceed= false;
			System.out.println("Thanks for playing");
		}
		
		}//end while
			
		
	}//psvm
 
}//ends class
