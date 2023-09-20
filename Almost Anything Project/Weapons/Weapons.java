import java.util.ArrayList;
//The base methods for "Weapon" type items. Includes a constructor, and getters for managing the amount of damage each weapon deals.
public class Weapons extends AttackSystem
{
  private static int attackDMG = 10;
  private static int weapID = 0;
  protected static int critRT = 10;
  protected static int critChance = (int) (Math.random() * 101); //1 to 100
  
  public Weapons (int id, int ad, int cr)
  {
    attackDMG = ad;
    critRT = cr;
    weapID = id;
  }

  public static int getDoubDMG()
  {
    critChance = (int) (Math.random() * 101);
    if (critChance <= critRT)
      return AttackSystem.getPlayerAtk() * 2;
    return 0;
  }

  public static int getcritRT()
  {
    return critRT;
  }

  public static String printWepType(int weapID)
  {
    if (weapID == 1)
      return WoodenSW.printWepType();
    else if (weapID == 2)
      return CopperSW.printWepType();
    else if (weapID == 3)
      return IronSW.printWepType();
    else if (weapID == 4)
      return GoldSW.printWepType();
    else if (weapID == 5)
      return DiamondSW.printWepType();
    else
      return null;
  }
}