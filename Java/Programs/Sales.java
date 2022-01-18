
/**************************************************************************************************
* Sales.java
* Willie Conway
*
* This program is a driver for the MySaleCheck.java file (Sales Checker class File).
* The Driver class loops until �q� is entered to quit, If enter is not �q�, then it creates
* an instance of the MySaleCheck object passing the entry as an argument.If no error, it Prints
* amount by calling: print numeric from  the MySaleCheck class and print alphabetic from MySaleCheck class.
* if error, it then prints an error message.
***************************************************************************************************/
import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;
        /*Enter the infinite loop*/
        while(true) {
            System.out.print("Please enter amount of sale in form $#.## (\"q\" to quit): ");
            //ask for user input
            userInput = scanner.next();
            if( userInput.equals("q")) { //If user enters 'q' then terminate the loop
                break;
            } else {
                try {
                    //create SaleCheck object
                    MySaleCheck saleCheck = new MySaleCheck(userInput);
                    //check if any error has occurred
                    if(saleCheck.getError() == null) {
                        //If no error then print numeric and alphabetic values
                        saleCheck.printNumeric();
                        saleCheck.printAlphabetic();
                    } else {
                        /*If getError() returns a non null value
                         *it means sale string is malformed
                         *print error */
                        System.out.println(saleCheck.getError());
                    }
                } catch (Exception ex) { //Catch any unknown exception
                    System.out.println("Unknown exception");
                }

            } // end if else statement
            System.out.println();
        } // end while loop
    } // end main
} // end Sales