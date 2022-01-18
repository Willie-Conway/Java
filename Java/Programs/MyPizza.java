/***********************************************************************************
* MyPizza.java
* Willie Conway
*
* This abstract class describes Pizza.
***********************************************************************************/



import java.util.Scanner;

public class MyPizza {

	private String type;
	public String crust;
	private String ingredient;
	private double cost;

	public MyPizza() {
		type = "Meat";
		cost = 5.00;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCrust() {
		return crust;
	}

	public void setCrust() {

		if (this instanceof MyCheese) {
			crust = "Thin";
		} else {
			System.out.print("Thin or Thick Crust ? ");// asks user to choose crust preference
			Scanner input = new Scanner(System.in);
			crust = input.nextLine();
		}
	}

	public void setIngredient() {
		Scanner input = new Scanner(System.in);
		System.out.print("What ingredient, sorry, only 1: "); // asks user to pick one ingredint
		ingredient = input.nextLine();
		setCost();
	}

	public String getIngredient() {
		return ingredient;
	}

	public double getCost() {
		return cost;
	}

	public void setCost() {
		this.cost = cost + 2;
	}

	public String toString() {
		return "\nYou ordered:\n" + getType() + " pizza\n" + ingredient
				+ " (+$2.00)\n" + getCrust() + " crust\n" + "Total cost of $" //sums up the total cost of pizza ordered
				+ String.format("%.2f", getCost());
	} // end main

} // end MyPizza
