import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coin extends Actor
{
     int animateImage = 1;
      int count;
    /**
     * Act - do whatever the Coin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Coin(){
    setImage("goldCoin9.png");
    getImage().scale(70,70);
    }
    
    public void act()
    {
        // Add your action code here.
        count++;
        animate();
         
        Actor player = getOneIntersectingObject(Player.class);
        if (player != null) {
        // Access the existing HealthBar instance in the world
        Counter coin = (Counter)getWorld().getObjects(Counter.class).get(0);
        coin.incoins(); // Call the restoreHealth method of the existing HealthBar instance
        getWorld().removeObject(this); // Remove the health packet after player collects it
    
        
    }
}
    public void animate(){
        if(animateImage >9){
            animateImage =1;
        }
        if(count % 10 ==0){
        setImage("goldCoin" + animateImage + ".png");
        animateImage++;
        getImage().scale(70,70);
   
}}
}
