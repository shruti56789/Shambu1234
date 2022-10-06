package Star;

public class DownPyramid {

	public static void main(String[] args) {
		
		for(int a=7; a>=1; a--) {
			
			System.out.print(" "); // For Spacing
			
			for(int c=1; c<=a; c++) {
				
				System.out.print("*");// For Printing
			}
			
			System.out.println(); // For go to next line
		}

	}

}
