import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthPacket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthPacket extends Actor
{
    /**
     * Act - do whatever the HealthPacket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public HealthPacket()
    {
         setImage("h1.png");
        getImage().scale(50,50);
    }
    public void act() {
    Actor player = getOneIntersectingObject(Player.class);
    if (player != null) {
        // Access the existing HealthBar instance in the world
        HealthBar health = (HealthBar)getWorld().getObjects(HealthBar.class).get(0);
        health.restoreHealth(); // Call the restoreHealth method of the existing HealthBar instance
        getWorld().removeObject(this); // Remove the health packet after player collects it
    }
}

}
