/***********************************************************************************
* PizzaHut.java
* Willie Conway
*
* This is the driver class for the Pizza class.
***********************************************************************************/

import java.util.Scanner;

public class PizzaHut {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out
				.print("What type of pizza would you like (Cheese or Meat): "); //determine if user requested a "meat" or "cheese" pizza, echo the response then set variable values in the sub-classes
		String choice = input.nextLine();
		MyPizza eatable = null;

		if (choice.equalsIgnoreCase("Cheese")) {
			eatable = new MyCheese();
			System.out.println(eatable);
		} // end if

		else if (choice.equalsIgnoreCase("Meat")) {
			MyPizza l = new MyPizza();
			l.setCrust();
			l.setIngredient();
			System.out.println(l);
		} // end else if

	} // end main

} // end PizzaHut
