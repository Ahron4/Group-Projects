import java.util.Scanner;
//The primary system that manages fight sequences in its entirety, from HP gain and loss, turn sequences and attacks numbers.
public class AttackSystem 
{  
  private static Scanner atk = new Scanner(System.in);
  private static int randEnemyDrop = (int) (Math.random() * 10) + 1;
  private static int enemyTurn = (int) (Math.random() * 3) + 1;
  private static int emAtk = (int) (Math.random() * 40) + 5;
  private static int randSwrdDrop = (int) (Math.random() * 9) + 1;
  private static int playerAtk = (int) (Math.random() * 50) + 10;
  private static int weapTier = 1; //Updragdes weapons each time
  
  public static void attack()
  {
    //While or for loop(s) (1st loop)
    while (true)
    {
      //Conditional statements
      if (Adventurer.getHealth() <= 0) //When adventurer dies, game quits
      {
        System.out.println("The strength of the enemy overwhelms you and you fall facing the dirt. You lay there unconscious as your enemy dealt one final blow.");
        break;
      }
      //When enemy dies, attack stops and generates random reward
      if (Enemies.getHealth() <= 0) 
      {
        randEnemyDrop = (int) (Math.random() * 10) + 1;
        randSwrdDrop = (int) (Math.random() * 9) + 1;
        System.out.println("You defeated an enemy!\n");
        if (randEnemyDrop <= 3)
        {
          //Chance to get weak health potion
          System.out.println("The enemy dropped a weak health potion!");
          Adventurer.addItemsToInv("Weaker Health Potion (+40)");

          //A smaller chance to obtain a stronger potion
          if (randEnemyDrop == 2)
          {
          System.out.println("The enemy also dropped a stronger health potion!");
          Adventurer.addItemsToInv("Strong Health Potion (+80)");
          }
        }

        //Chance to get strong health potion
        if (randEnemyDrop >= 9)
        {
          System.out.println("The enemy dropped a stronger health potion");
          Adventurer.addItemsToInv("Strong Health Potion (+80)");

          //A smaller chance to obtain a stronger potion
          if (randEnemyDrop == 9)
          {
            System.out.println("The enemy dropped another stronger health potion!");
           Adventurer.addItemsToInv("Strong Health Potion (+80)");
          }
        }
        System.out.println("");
      //A chance for a enemy to drop a random weapon
      if (randSwrdDrop == 7)
      {
        System.out.println("The enemy dropped a weapon!");
        weapTier++;
      }
        break;
      }

      //repeating varibles
      playerAtk = (int) (Math.random() * 50) + 10;
      emAtk = (int) (Math.random() * 20) + 5;
      enemyTurn = (int) (Math.random() * 3 + 1);
      System.out.println("Your Health: " + Adventurer.getHealth());
      System.out.println("Enemy Health: " + Enemies.getHealth());
      System.out.print("\nWhat should you do?: ");
      String atkInput = atk.nextLine();

      //user input and random attacks
      if (atkInput.equals("a")) //user attacks
      {
        System.out.println("You attack with your sword and dealt: " + playerAtk + " DMG");
        if (enemyTurn == 1) //enemy also attacks
        {
          System.out.println("Enemy also attacks which they deal " + emAtk + " DMG");
          Adventurer.removHeal(Math.abs(emAtk - Adventurer.getArmor()));
          Enemies.removHeal(Math.abs(playerAtk - Enemies.getDef()));  
        }
        else if (enemyTurn == 2) //enemy dodges
        {
          System.out.println("Enemy dodges your attack");
          Enemies.removHeal(0);
        }
        else
        {
          System.out.println("Enemy tried to attack but missed"); //try to dodge but failed
          Enemies.removHeal(Math.abs(playerAtk - Enemies.getDef()));
        }
      }
      else if (atkInput.equals("d"))
      {
        System.out.println("You dodged");
        if (enemyTurn == 1)
        {
          System.out.println("Enemy attacks but misses");
        }
        else if (enemyTurn == 2)
        {
          System.out.println("Enemy also dodges");
        }
        else
        {
          System.out.println("You tried to dodged but failed which the enemy dealt " + emAtk + " DMG");
          Adventurer.removHeal(emAtk);
        }
      }
      else if (atkInput.equals("i")) //access inventory
      {
        //While or for loop(s) (2nd loop)
        while (true)
        {
          Adventurer.printInv();
          System.out.print("What item do you want to use? (1 - " + Adventurer.invSize() + ")?: ");
          int itemSel = atk.nextInt();
          try
          {
            if (itemSel == 0)
            {
              break;
            }   
            else if (Adventurer.getInventory(itemSel).equals("Weaker Health Potion (+40)")) 
            {
              Adventurer.addHealth(40);
              Adventurer.removeFromInventory(itemSel);
              System.out.println("You drank a weaker health potion and gained +40 health\n");
            }   
            else if (Adventurer.getInventory(itemSel).equals("Strong Health Potion (+80)"))
            {
              Adventurer.addHealth(80);
              Adventurer.removeFromInventory(itemSel);
              System.out.println("You drank a stronger health potion and gained +80 health\n");
            }
          }
          catch (Exception e)
          {
            System.out.println("You pulled out air. It does nothing.\n");
          }
        }
      }
      else
      {
        System.out.println("Invalid Command");
      }
    }
  }

  public static int getPlayerAtk()
  {
    return playerAtk;
  }

  public static int getcritRT()
  {
    return Weapons.getcritRT();
  }

  public static int getWeapTier()
  {
    return weapTier;
  }
}

