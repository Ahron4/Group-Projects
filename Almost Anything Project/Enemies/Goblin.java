public class Goblin extends Enemies
{
  public static void enemyStats()
  {
    System.out.println("Type: " + "Goblin");
    System.out.println("Health Points: " + Enemies.setHealth(200));
    System.out.println("Defense: " + Enemies.setDef(50));
  }
}