// Janelynn Camingue
// 1/30/17
// THis program asks the user to input 2 numbers. The program determines which one is the biggest and which one is
// the smallest. The program then prints them out.



import java.util.Scanner;

class Find_Min_and_Max{
	public static void main( String[] args){
		// declare the variables
		// number_1 is the first number being typed
		// number_2 is the second number being typed
		// min and max are the smallest and biggest numbers
		int number_1, number_2, min, max;
		Scanner sc=new Scanner(System.in);
		// Asks the user to type in a number
		System.out.print("Please enter a number: ");
		number_1=sc.nextInt();
		// Asks the user to type in another number
		System.out.print("Please enter another number: ");
		number_2=sc.nextInt();
		max= Math.max(number_1, number_2);
		min=Math.min(number_1, number_2);
		// prints them out
		System.out.println("The biggest number is "+max+".");
		System.out.println("The smallest number is "+min+".");
	}
}