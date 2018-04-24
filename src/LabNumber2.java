import java.util.Scanner;

public class LabNumber2 {

	public static void main(String[] args) {

		double length;
		double width;
		double height;
		double area;
		double perimeter;
		double volume;
		String ifContinue;

		System.out.println("Welcome to Grand Circus's room Detail Generator!");
		do {
			Scanner scnr = new Scanner(System.in);
			// prompt the user to enter value of length
			System.out.println("Enter Length: ");
			length = scnr.nextDouble();
			// prompt the user to enter value of width
			System.out.println("Enter Width: ");
			width = scnr.nextDouble();
			System.out.println("Enter Height: ");
			height = scnr.nextDouble();

			// calculate the area
			area = length * width;
			// calculate the perimeter
			perimeter = 2 * (length + width);
			//calculate the volume
			volume = length * height * width;
			System.out.println("Area: " + area);
			System.out.println("Perimeter: " + perimeter);
            System.out.println("Volume: " + volume);
            
			// ask if the user wants to continue
			System.out.println("Continue?(y/n): ");
			ifContinue = scnr.next();
			scnr.close();
		} while (ifContinue.equalsIgnoreCase("y"));
	
	}
}
