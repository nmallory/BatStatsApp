import java.util.Scanner;

public class BatStatsApp {

	public static void main(String[] args) {
		
		// Declare variables
	
	    boolean choice =true;
		int number=0;
		int total = 0;
		int totalBases = 0;
	
		//Declare and Instantiate array
		int [] hits; 
	
		
		//Create scanner
		Scanner input = new Scanner(System.in);
		
		//Welcome message
		do{
		System.out.println("Welcome to Batting Average Calculator!");
		System.out.println();
	
		System.out.println("0=out, 1=single, 2=double, 3=triple, 4=home run");
		System.out.println("===============================================");
		
	
		//Prompt user to enter number of times at bat	
		System.out.println("Enter number of times at bat:");
		number = input.nextInt( );
		
		//Validation to ensure user only enters positive integers for number of times at bat
		if(number<=0){
			System.out.println("You entered an invalid number. Enter a number greater than 0.");
			System.out.println("Enter number of times at bat:");
			number = input.nextInt( );
		}
		
		//Create new array for atBats
		int [] atBats = new int[number];
		
		//Creates new object
		hits=new int[number];
	

		//Displays number of at bats
		for (int i = 0; i < hits.length; i++) {
			total = total + 1 ;
			System.out.print("Result for at-bat "  + i +  ": " );
			
			
			//User input times at bat
			hits[i] = input.nextInt();
			
			//Validation to ensure user enters a number between 0 to 4
			if(hits[i] > 4 || hits[i]<0){
			
				System.out.println("You entered an invalid choise. Please enter a number between 0 and 4.");
				number = input.nextInt( );
			}
		}
			
		//Calculate number of hits and sum of bases
		for(int i : atBats) {
			if(i > 0)
				hits[i]++;
				total += hits[i];
		}
	
		//Calculate battingAve and slugPercent
		double slug = (double) total/ number;
		double battingAvg = (double) number/ total;
	
		//Prints out batting average
		System.out.println("Batting average:" +battingAvg);
		
		//Prints out slugging percentage
		System.out.println("Slugging Percentage:" +slug);
	
		//Prompt user to another another batter if they want to continue
		System.out.println("Another batter? (y/n):");
		input.next( );
	
		//Validate to ensure user only enters a "Y", "y", "N", or "n"
		
		
		//While loop to allow user to return to the beginning of program
		}while(true);
	}

}