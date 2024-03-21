import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zombie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zombie extends Actor
{
    /**
     * Act - do whatever the Zombie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int animateImage = 0;
    int count;
    int health = 3;
    Player player;
    Counter counter;
    public Zombie(Player mainPlayer, Counter counter, int health)
{
    player = mainPlayer;
    this.counter = counter;
    setImage("attack01_19.png");
    getImage().scale(250,250);
    this.health = health; // Set the zombie's health
}
    public void act()
    {
        // Add your action code here.
        
        count ++;
        animate();
        moveAround();
        hitByProjectile();
    }
    public void animate(){
        if(animateImage >19){
            animateImage =0;
        }
        if(count % 8 ==0){
        setImage("attack01_" + animateImage + ".png");
        animateImage++;
        getImage().scale(250,250);
   
}}
    public void moveAround(){
        move(1);
        turnTowards(player.getX(),player.getY());
    }
    public void hitByProjectile()
    {   
        Actor projectile = getOneIntersectingObject(Projectile.class);
        if(projectile != null)
        {
            health--;
         
            getWorld().removeObject(projectile);
        }
        if(health == 0){
            counter.score++;
            counter.coins+=2;
        getWorld().removeObject(this);
    }
    }
    
}
