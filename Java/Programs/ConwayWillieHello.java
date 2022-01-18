/************************************************ 
 * ConwayWillieHello.java* 
 * Willie Conway
 * This is a program that outputs "Hello World!".
 * ***********************************************/

public class ConwayWillieHello {  // Creates a class named ConwayWillieHello
  /** The static method is used to
      access the class witout creating
      a object of the class. The void
      keyword species that the method 
      should not have a return value.
      The main method is being used to
      execute the empty string array 
      parameter and arguments.
  **/
  public static void main(String[] args) { // Uses static method
  /** Inside the main method, the print line
      method is being used to execute or system
      output the line of text or parameter that's
      witheld inside brackets. Each code statement
      must end with a semicolon.
  **/ 
    System.out.println("Hello, world!"); // prints Hello, world! onto screen
  } // end static method
} //end class method



/***************************************************************************
                                    Java Basics
****************************************************************************

* The public keyword is an access modifier, meaning
  that it is used to set the access level for classes,
  attributes, methods and constructors.
  
  (We divide modifiers into two groups)
  
  Access Modifiers - controls the access level.
  
  Non-Access Modifiers - do not control access level,
  but provides other functionality.
  
* Note: Java is case-sensitive: "MyClass" and "myclass" has different meaning.

* The main Method

  The main() method is required and you will see it in every Java program.
  Any code inside the main() method will be executed.
  
  For now, just remember that every Java program has a class name which must match
  the filename, and that every program must contain the main() method.
  
* System.out.println()
  Inside the main() method, we can use the println() method
  to print a line of text to the screen
  
  Note: The curly braces {} marks the beginning and the end of a block of code.

  Note: Each code statement must end with a semicolon.
  
* Java Comments

  Comments can be used to explain Java code, and to make it more readable.
  It can also be used to prevent execution when testing alternative code.

  Single-line comments start with two forward slashes (//).

  Any text between // and the end of the line is ignored by Java (will not be executed).
  
* Java Multi-line Comments

  Multi-line comments start with /* and ends with */
/*
******************************************************************************/