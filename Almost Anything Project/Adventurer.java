import java.util.ArrayList;
//The class that manages player stats and inventory, especially when outside of a battle. The methods here allows the player to access their current stats and inventory.

//Use of inheritance hierarchy
public class Adventurer extends AttackSystem
{
  //Primitive and reference type variables
  //Wrapper classes
  //Static variable(s) and method(s)
  private static String name = "";
  private static int health = 100;
  private static int armorPoints = 15;
  //Use of an array or array list
  private static ArrayList<String> inventory = new ArrayList<String>();
  private static String wepType;

  //This keyword
  public Adventurer (String name)
  {
    this.name = name;
  }

  // Custom written classes with attributes, accessors, getters
  public static void getStats()
  {
    System.out.println("\nHERE ARE YOUR CHARACTER STATS: ");
    System.out.println("Name: " + name);
    System.out.println("Health Points: " + health);
    System.out.println("Armor: " + armorPoints); 
    //Prints out the current weapon
    System.out.println("Current Weapon: " + Weapons.printWepType(AttackSystem.getWeapTier()) + "\n");
  }

  //getter
  //Static variable(s) and method(s)
  public static String getInventory(int s)
  {
    //Compound operators
    return inventory.get(s - 1);
  }
  
  public static void removeFromInventory(int r)
  {
    inventory.remove(r - 1);
  }

  //returns the size of the inventory
  public static int invSize()
  {
    return inventory.size();
  }

  public static void printInv()
  {
    System.out.println(inventory);
  }

  //getter
  public static int getHealth()
  {
    return health;
  }

  //setter
  public static void addHealth(int addHealth)
  {
    health += addHealth;
  }

  //setter
  public static void removHeal(int removHeal)
  {
    health -= removHeal;
  }

   public void starterItemsInInv()
  {
    inventory.add("Weaker Health Potion (+40)");
    inventory.add("Weaker Health Potion (+40)");
    inventory.add("Weaker Health Potion (+40)");
    inventory.add("Strong Health Potion (+80)");
  }
  public static void addItemsToInv(String item)
  {
    inventory.add(item);
  }

  //setter
  public static int setHealth(int heal)
  {
    return health = heal;
  }

  //getter
  public static int getArmor()
  {
    return armorPoints;
  }

  //setter
  public static int addArmor(int ap) //armor points
  {
    return armorPoints + ap;
  }

  //setter
  public static int removArmor(int ra) //remove armor
  {
    return armorPoints - ra;
  }

  //getters
  public static String getWepType()
  {
    return wepType;
  }
}