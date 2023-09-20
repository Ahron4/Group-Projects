import java.util.Scanner;

public class Scenario
{
  private static Scanner input = new Scanner(System.in);
  private static int yesCount = 0;
  private static int noCount = 0;
      
  public static void scenario()
  {
    while (Adventurer.getHealth() >= 0) // A while loop we used within our code.
    {
      //Yes Scenario 1
      String userInput = input.nextLine();
      if (userInput.equals("y") && yesCount == 0)
      {
        System.out.println("You went out to train, you work out a sweat +5 health\n");
        Adventurer.addHealth(5);
        yesCount++;
      }

      //No Scenario 1
      else if (userInput.equals("n") && noCount == 0) 
      {
        System.out.println("You decided not to go training. Your commanding officer beats the everloving shite out of you and you spend time lounging in the mess hall. -15 health.");
        Adventurer.removHeal(15);
        noCount++;
      }

      //Yes Scenario 2
      if (yesCount == 1)
      {
        System.out.print("\nIt's getting late and you should probably head back to the barracks (y/n): ");
        userInput = input.nextLine();
        Enemies.randEnemyEncount();
        if (userInput.equals("y"))
        {
          System.out.println("You went insde the barracks and have a good night's rest +10 health");
          Adventurer.addHealth(10);
          Enemies.randEnemyEncount();
          yesCount++;
        }
        else
        {
          System.out.println("You decided to train some more but felt really tired when you woke up +5 armor -1 health");
          Adventurer.removHeal(1);
          Adventurer.addArmor(5);
          noCount++;
        }
      }

      //No Scenario 2
      else if (noCount == 1)
      {
        System.out.print("\nYou ate a very hefty meal and you think you should start training (y/n): ");
        userInput = input.nextLine();
        if (userInput.equals("y"))
        {
          System.out.println("The day is almost over and you managed to cram in any time left to train +5 health +2 armor");
          Enemies.randEnemyEncount();
          Adventurer.addHealth(5);
          Adventurer.addArmor(2);
          yesCount++;
        }
        else
        {
          System.out.println("\"Eh the war isn't going anywhere\" you said to yourself, so you ate desert and went to bed feeling good about your life choices -15 health -10 armor");
          Adventurer.removHeal(15);
          Adventurer.removArmor(10);
          noCount++;
        }
      }

      //Yes Scenario 3
      if (yesCount == 2 || yesCount == 1)
      {
        System.out.print("\nYou wake up to the sound of bells ringing and people shouting!\n");
        System.out.print("\nFrom the shouting it seems the enemies of Zaire, Angola has invaded the land! Your commanding officer demands you to head out (y/n): ");
        userInput = input.nextLine();
        if (userInput.equals("y"))
        {
          System.out.println("\nYou are placed in the 3rd infantry division, codename \"Zeldris\" out to defend the Brazzaville, capital of Zaire ");
          Enemies.randEnemyEncount();
          yesCount++;
        }
        else
        {
          System.out.println("You are under arrest for failure to follow orders\nThe penalty is DEATH...\nYour execution is scheduled when the full moon oversees Zaire (Death Ending 1 of 5)");
        break;
        }
      }

      //No Scenario 3
      if (noCount == 2)
      {
        System.out.print("\nYou wake up and noticed that you slep through all morning. You went through the barracks and mess hall and noticed that there is rarely any personel stationed at the base");
        System.out.print("\nShould you find out what's going on? (y/n): ");
        userInput = input.nextLine();
        if (userInput.equals("y"))
        {
          System.out.println("After looking around the base and distance noises in the background, you figured it out. It happend, the peace treaty alliance with Greenvile is broken and currently invading Zaire");
          Enemies.randEnemyEncount();
          yesCount++;
        }
        else
        {
          System.out.println("Eating is more important, so you went to the mess hall and managed to fish out one hearty meal and some snacks laying around. -15 Health");
          Enemies.randEnemyEncount();  
          Adventurer.removHeal(15);
          noCount++;
        }
      } 

      //Yes Scenario 4
      if (yesCount == 2 || yesCount == 3)
      {
        System.out.print("Your division approaches Brazzaville, left in ruins, and your squadron is setting up camps to house refugees and wounded soldiers. In the middle of your efforts, you are attacked by an enemy squadron sent to deal with stragglers from the attack. Do you attack the squadron? (y/n): ");
        userInput = input.nextLine();
        if (userInput.equals("y"))
        {
          System.out.println("Some sacrifices had to be made which you and your squadron managed to defeat all the attackers. You were left with some heavy bruises -10 health");
          Adventurer.removHeal(10);
          Enemies.randEnemyEncount();
          yesCount++;
        }
        else
        {
          System.out.println("You decided to not attack the squadron. Your mind decided to betray your squad and you join the enemy. (Betrayal Ending (3 of 5))");
          break;
        }
      }

      //No Scenario 4
      if (noCount == 3 || noCount == 2)
      {
        System.out.print("\nYou finally heard the news and the disbelief is shed upon you. You are thinking of helping out but your currently not in the best of shape (y/n): ");
        userInput = input.nextLine();
        if (userInput.equals("y"))
        {
          System.out.println("You head out with your grimoire passing through an open field. You suddenly activated a trap spell and everything went black. The cause of your death was an explosion spell trap that only your upper half of your body remain. (Explosion ending (2 of 5)");
          break;
        }
        else
        {
          System.out.println("\" They got this \" you said to yourself, you went to the mess hall and manage to vacuum all of the remaining food laying out in the mess hall -20 health");
          Adventurer.removHeal(20);
          Enemies.randEnemyEncount();
          noCount++;
        }
      }

      //Yes Scenario 5
      if (yesCount == 4 || yesCount == 3)
      {
        System.out.print("\nYou and the rest of your squadron secure the capital. You are thinking of heading out in hopes of looking for more survivors (y/n): ");
        userInput = input.nextLine();
        if (userInput.equals("y"))
        {
          Enemies.randEnemyEncount();
          System.out.println("You head out with your grimoire passing through an open field. You suddenly activated a trap spell and everything went black. The cause of your death was an explosion spell trap that only your upper half of your body remain. (Explosion ending (2 of 5)");
          break;
        }
        else
        {
          Enemies.randEnemyEncount();
         System.out.println("You decided that defending the capital is more important. You defend the capital and eventually after a fews months, the war is over! You and the rest of your squardron were given medal of honors for your hard work! (Heros ending (4 of 5)");
          break;
        }
      }

      //No Scenario 5
      if (noCount == 4 || noCount == 3)
      {
        System.out.print("\nYou started to feel heavy and tired with each step. As you approch the mess hall, you feel that your body is experiencing the same gravity of the sun. Once you reach the entrance of the mess hall, you fall face first onto the concrete. Your internal organs were squashed due to the intense load on your body and you died on impact (Fat ending (0 of 5)");
        break;
      }

      if (userInput.equals("sv_cheats1")) {
        System.out.println("You have entered DEBUG mode, health will be raised by a high amount (5000) due to this mode. If you are a player and you've found this mode unintentionally, please report it.");
        Adventurer.addHealth(5000);
      }
  
      if (userInput.equals("q") || userInput.equals("quit"))
      {
        System.out.println("Due to the fact that you surrendered, you were executed by the state for high treason. There is no chance of redemption for you. (Game Over: 5 of 5 endings)");
        break;
      }
      if (userInput.equals("myers"))
      {
        System.out.println("\nYou have teamed up with one of your opponents named Myers to take over the Nation of Zaire, and turn it into your personal kingdom. Regardless of how things end up, you have personal control over what your country does in a Dual-Monarchy. (Game Over: Secret Ending)");
        break;
      }
    }
  }
}