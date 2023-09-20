public class Fly extends Enemies 
{
  public static void enemyStats()
  {
    System.out.println("Type: " + "Fly");
    System.out.println("Health Points: " + Enemies.setHealth(10));
    System.out.println("Defense: " + Enemies.setDef(3));
  }
}

//Fly update 4/21 (makes things more fair for the fly. He has 5 health!)
//Fly update 5/4 (Defense has raised from 1 to 2.)
//Fly update 5/8 (Uber fly, 5 -> 10 Health!)
//Fly update 5/9 (Likely, the final update which raises the fly defense from 2 to 3.)
// Yes, I love my fly and nobody can stop me.