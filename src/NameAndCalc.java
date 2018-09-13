/**
 * 
 * @author jgonsalves21
 * Variable Homework
 * 
 */
public class NameAndCalc {

	public static void main(String[] args) {
		
		String name = "Joshua Gonsalves";
		int length = 4;
		int width = 2;
		int radius = 5;
		double pi = 3.14;
		
		System.out.print("Hello, my name is ");
		System.out.print(name);
		System.out.println(".");
		
		System.out.print("The area of the rectangle is ");
		System.out.print(length*width);
		System.out.println(".");
		
		System.out.print("The area of the circle is ");
		System.out.print(Math.pow(radius, 2)*pi);
		System.out.print(".");

	}

}
