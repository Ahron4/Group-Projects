public class ChatGPT extends Enemies //These classes are the enemies that you have to fight, which are put into the Enemies class to be used in combat. The health and defense, as well as their name are made within these subclasses.
{
  public static void enemyStats()
  {
    System.out.println("Type: " + "ChatGPT");
    System.out.println("Health Points: " + Enemies.setHealth(400));
    System.out.println("Defense: " + Enemies.setDef(30));
  }
}