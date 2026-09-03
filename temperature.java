    import java.util.Scanner;

public class temperature {	
        public static void main(String[] args) {
			// the program is using basic if else logic to classify the temperature
			//based on degrees in Fahrenheit entered by the user.
		Scanner keyboard = new Scanner(System.in);
		int degrees; // variable for user input

		// Read degrees Fahrenheit
		System.out.print("Enter the degrees Fahrenheit: "); //print message for user
		degrees = keyboard.nextInt(); //set the input = to degrees variable
		// Classify degrees value
		if ( degrees <= 32 ) {
			System.out.println("Freezing");
		} else if ( degrees <= 50 ) {
			System.out.println("Cold");
		} else if ( degrees <= 85 ) {
			System.out.println("Warm");
		} else {
			System.out.println("Hot");
		}
		// Close keyboard
		keyboard.close();
	}
}
