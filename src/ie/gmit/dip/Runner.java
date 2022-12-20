package ie.gmit.dip;

public class Runner {
	/*	  
	  IMPORTANT! Read the following points and delete them when you're finished.
	  --------------------------------------------------------------------------
	  (a) Keep the menu alive inside a loop. When (4) is selected, set the loop control variable to false.
	  (b) Use a java.util.Scanner class to read in the user input and a new switch statement to process the choice. You
	      can read about the new switch statement at https://docs.oracle.com/en/java/javase/13/language/switch-expressions.html.
	  (c) Perhaps consider placing the arrays in the classs Kernel.java into some type of enum, as the array values are constant.
	  (e) Try not to cram all the functionality into this one class! Each class should have one responsibility only.
	*/
	public static void main(String[] args) throws Exception {
		System.out.println(ConsoleColour.BLUE_BRIGHT);
		System.out.println("*********************************************************************");
		System.out.println("*          GMIT - Dept. Computer Science & Applied Physics          *");
		System.out.println("*                                                                   *");
		System.out.println("*    @( * O * )@    Crazy Image Filtering System!    @( * O * )@    *");
		System.out.println("*                                                                   *");
		System.out.println("*              H.Dip in Science (Software Development)              *");		
		System.out.println("*                                                                   *");
		System.out.println("*********************************************************************");
		
			Menu m = new Menu();
			m.start();
		
		System.out.print(ConsoleColour.BLACK_BOLD_BRIGHT);
		
		System.out.println(ConsoleColour.RESET);
	}
}