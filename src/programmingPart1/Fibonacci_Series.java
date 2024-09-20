package programmingPart1;

public class Fibonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int n = 10; // Number of terms to display
	        int firstTerm = 0;
	        int secondTerm = 1;
	        
	        System.out.println("Fibonacci Series up to " + n + " terms:");
	        
	        for (int i = 1; i <= n; ++i) {
	            System.out.print(firstTerm + " ");
	            
	            // Compute the next term
	            int nextTerm = firstTerm + secondTerm;
	            firstTerm = secondTerm;
	            secondTerm = nextTerm;
	        
		}

	}

}
