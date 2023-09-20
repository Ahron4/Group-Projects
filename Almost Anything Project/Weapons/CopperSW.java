public class CopperSW extends Weapons //Only commenting in one of the extended weapons, but these basically form the weapons which will change the equipped damage based on what weapons you have.
{
  public CopperSW (int weapID, int attackDMG, int critR) 
  {
    super(weapID, attackDMG, critRT);
  }  

  public static String printWepType()
  {
    return "Copper Sword";
  }

  public static int getCritRT()
  {
    return critRT;
  }
}