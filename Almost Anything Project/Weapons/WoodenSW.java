public class WoodenSW extends Weapons
{

  //Overriding methods
  public WoodenSW (int weapID, int attackDMG, int critRT)
  {
    //Super Keyword
    super(weapID, attackDMG, critRT); //i forgot we had to use super LMAO
  }

  //Prints out weapon type
  public static String printWepType()
  {
    return "Wooden Sword";
  }

  public static int getCritRT()
  {
    return critRT;
  }
}