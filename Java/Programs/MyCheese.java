/***********************************************************************************
* MyCheese.java
* Willie Conway
*
* This is the Cheese class for Pizza driver.
***********************************************************************************/


public class MyCheese extends MyPizza {

	public MyCheese() {
		setType("Cheese");
		setCrust();
	}

	@Override
	public String toString() {
		return "\nYou ordered:\n" + getType() + " pizza\n" + getCrust()
				+ " crust\n" + "Total cost of $"
				+ String.format("%.2f", getCost());
	} // end main

} // end MyCheese
