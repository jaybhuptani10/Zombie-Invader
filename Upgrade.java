import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Weapon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Upgrade extends Actor
{
    
    /**
     * Act - do whatever the Weapon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Counter counter;
    int weaponUpgrade = 1;
    public Upgrade(Counter counter)
    {
        this.counter = counter;
        setImage(new GreenfootImage("Gun Upgrade",25,Color.BLUE,new Color(0,0,0,0)));
    }
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.mousePressed(this) && counter.coins >49)
        {
            counter.coins -= 50;
            weaponUpgrade++;
        }
    }
}
