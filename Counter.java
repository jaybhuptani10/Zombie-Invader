import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int score;
    int coins;
    public Counter(){
        setImage(new GreenfootImage("Score: " + score + "\nCoins: " + coins,40,Color.BLACK,new Color(0,0,0,0)));
    }
    public void act()
    {
        // Add your action code here.
        setImage(new GreenfootImage("Score: " + score + "\nCoins: " + coins,40,Color.BLACK,new Color(0,0,0,0)));
    }
    public int getValue() {
        return score;
    }
    public void increment() {
        score++;
    }
    public void incoins() {
        coins=coins+5;
    }
}
