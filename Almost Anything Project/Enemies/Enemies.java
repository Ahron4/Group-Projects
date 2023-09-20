import java.lang.Math;
//Similar to the Adventurer class, this class manages the enemy stats, including HP gain and loss, attack damage, defense, and also an enemy's chance of encountering the player.
public class Enemies extends AttackSystem
{
  private static int health = 100;
  private static int def = 20;
  private static int enemyEncounter = (int) (Math.random() * 14) + 1;

  private static AttackSystem attack = new AttackSystem();

  public static void addHealth(int addHealth)
  {
    health += addHealth;
  }

  public static void removHeal(int removHeal)
  {
    health -= removHeal;
  }

  //Random number represents random enemies
  public static void randEnemyEncount()
  {
    enemyEncounter = (int) (Math.random() * 15) + 1;
    if (enemyEncounter >= 10)
    {
      System.out.println("An enemy appeared on-site!");
      if (enemyEncounter == 10)
      {
        Goblin.enemyStats();
        attack.attack();
      }
      if (enemyEncounter == 11)
      {
        Myers.enemyStats();
        attack.attack();
      }
      if (enemyEncounter == 12)
      {
        YourRival.enemyStats();
        attack.attack();
      }
      if (enemyEncounter == 13)
      {
        ChunLi.enemyStats();
        attack.attack();
      }
      if (enemyEncounter == 14)
      {
        ChatGPT.enemyStats();
        attack.attack();
      }
      if (enemyEncounter == 15)
      {
        Fly.enemyStats();
        attack.attack();
      }
    }
  }


  public static int setHealth(int heal)
  {
    return health = heal;
  }

  public static int getHealth()
  {
    return health;
  }

  public static int getDef()
  {
    return def;
  }
  
  public static int setDef(int emDef)
  {
    return def = emDef;
  }

  // Reference that Ghostwritter made us, so we have some insight on how to do this thing. Technically.
  /*public void attack(Enemy enemy, int damage) {
  // Reduce enemy's health by the damage amount
  enemy.setHealth(enemy.getHealth() - damage);
  System.out.println("You attacked " + enemy.getName() + " and dealt " + damage + " damage!");
} */

}