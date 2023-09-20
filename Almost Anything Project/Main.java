//Almost Anything Poject by: Justin, Ahron, and William

import java.util.Scanner;
import java.util.ArrayList;
//This main class is mainly used as our runner, gathering each of the classes together to run the game in a loop of encounters.
class Main {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  //weapon test
  //DO NOT modify id of swords
  WoodenSW woodenSword = new WoodenSW (1, 10, 5);
  CopperSW copperSword = new CopperSW (2, 15, 10);
  IronSW ironSword = new IronSW (3, 20, 25);
  GoldSW goldSword = new GoldSW (4, 25, 20);
  DiamondSW diamondSword = new DiamondSW(5, 30, 30);

  woodenSword.printWepType();

  System.out.println("\nHere are your controls: \nType s for character info\nType i to check your inventory\nType c to refer back to the controls\nType y (yes) or n (no) for decision making and outcomes\nCombat Commands:\n--------------\nType a to attack\nType d to dodge\nType i to check inventory (DURING COMBAT)\nType 0 to exit out of inventory\n");
      
  System.out.print("WELCOME ADVENTURER WHAT IS THOU NAME OF CHARACTER?: ");
  String charName = input.nextLine();
  Adventurer adventurer = new Adventurer (charName); 
  Enemies enemyEncount = new Enemies();

   System.out.println("\nWelcome " + charName + " You have just been accepted into the National Training Academy of Zaire, training for able-bodied students preparing for the wars ahead.\n");

  adventurer.starterItemsInInv(); //give starter inventory items

    //starts the game
    Adventurer.getStats();

    System.out.print("War is coming soon, and you should maybe start training (y/n): ");
    
    Scenario.scenario();
  }
} 

// Another Ghostwritter reference code.
/* class Main {
  private static boolean firstEnemyDefeat = false; // new variable
  // ...
  public static void main(String[] args) {
    // ...
    while (Adventurer.getIsDead() == false) {
      while (start != 1) {
        System.out.println("War is coming soon, and you should maybe start training (y/n): ");
        String userInput = input.nextLine();
        if (userInput.equals("y")) {
          adventurer.addHealth(5); // ... other code for training
          enemyEncount.randEnemyEncount();
          if (firstEnemyDefeat == false && Enemies.getIsDead()) { // check if first enemy is defeated
            firstEnemyDefeat = true;
            System.out.println("You defeated the first enemy!");
            Enemy1.resetHealth(); // reset health of first enemy
          }
        }
        // ... handle other user input
      }
    }
  }
}
*/