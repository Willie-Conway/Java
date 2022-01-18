import java.util.Scanner; // import the Scanner class

 class Budget{
    public static void main(String[] args) {
     Scanner food = new Scanner(System.in);

      // Enter percent budget and press enter
      System.out.println("Enter amount of money spent on food this month:");
      String amount = food.nextLine();
      int percentBudget = 600;
      if (percentBudget <  1) {
        System.out.println("Over Budget, Stop Now!");
      } else if (percentBudget < 75) {
        System.out.println("Nearing or at budget, time to stop spending.");
      } else if (percentBudget > 50) {
        System.out.println("Still on budget, you may continue spending.");
      } else if (percentBudget < 25) {
        System.out.println("Still on budget, you still have plenty to go.");
      } else if (percentBudget <  0) {
        System.out.println("Spend away, maybe a nice dinner out?");
      }

}    }
