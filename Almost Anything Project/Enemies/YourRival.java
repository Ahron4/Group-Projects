public class YourRival extends Enemies
{
  private static int random = (int) (Math.random() * 199) + 1;
  
  public static void enemyStats()
  {
    System.out.println("Type: " + "Your Rival");
    System.out.println("Health Points: " + Enemies.setHealth(random));
    System.out.println("Defense: " + Enemies.setDef(95));
  }
}