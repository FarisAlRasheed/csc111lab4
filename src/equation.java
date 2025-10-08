import java.util.Scanner;
public class equation {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter X value: ");
		double x = input.nextDouble();
		
		double result = ((x++ * x) / ((--x)+((x*2)/(--x))));
		System.out.println("The result is " + result);
	}
}
