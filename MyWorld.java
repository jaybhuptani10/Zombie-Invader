import greenfoot.*;

public class MyWorld extends World
{
    int count = 0;
    int spawnSpeed = 50;
    int randomSpawn;
    int phase = 1;
    int spawn=0;
    int s=0;
    Player mainPlayer = new Player();
    Counter counter = new Counter(); // Counter added
    HealthBar healthBar = new HealthBar();
    Upgrade upgrade = new Upgrade(counter);

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {    
        super(900, 700, 1); 
        mainPlayer = new Player(upgrade);
        addObject(mainPlayer, getWidth() / 2, getHeight() / 2);
        addObject(counter, 70, 230);
        addObject(healthBar, mainPlayer.getX() - 11, mainPlayer.getY() - 50);
        addObject(upgrade,760,150);
    }

    public Player getPlayer()
    {
        return mainPlayer;
    }
    public Counter getScore()
    {
        return counter;
    }

   public void act()
{
    count++;
    
    if (counter.getValue() < 10) {
        // Spawn 10 zombies with health 3 for phase 1
        spawnZombies(10, 0, 50, 3);
       
        showText(" Phase 1", getWidth() / 2, getHeight() / 2);
    } else if (counter.getValue() >= 10 && counter.getValue() < 40) {
        // Spawn 30 zombies with health 4 for phase 2
        spawnZombies(30, 0, 30, 3);
        
        showText(" Phase 2", getWidth() / 2, getHeight() / 2);
    } else if (counter.getValue() >= 40 && counter.getValue() < 120) {
        // Spawn 60 zombies with health 3 for phase 3
        spawnZombies(60, 0, 20, 3);
        
        showText(" Phase 3", getWidth() / 2, getHeight() / 2);
    }
    else if (counter.getValue() >= 121 ) {
        // Spawn 60 zombies with health 3 for phase 3
        spawnZombies(70, 0, 15, 4);
        
        showText(" Phase 4", getWidth() / 2, getHeight() / 2);
    }
    
}
   
    public void spawnZombies(int spawn, int s, int spawnSpeed, int zombieHealth)
{
    if (count % spawnSpeed == 0 && s < spawn) {
        randomSpawn = Greenfoot.getRandomNumber(8);
        if(s%10==0){
        switch(randomSpawn){
        case 0:addObject(new HealthPacket(),getWidth() / 2,getHeight() / 2);break;
        case 1:addObject(new HealthPacket(),getWidth()/3 ,getHeight() / 2);break;
        case 2:addObject(new HealthPacket(),getWidth() / 2,getHeight() / 3);break;
        case 4:addObject(new Coin(),getWidth() / 4,getHeight() / 2);break;
        case 5:addObject(new Coin(),getWidth()/6 ,getHeight() / 2);break;
        case 6:addObject(new Coin(),getWidth() / 2,getHeight() / 6);break;
        case 7:addObject(new Coin(),getWidth() / 4,getHeight() / 6);break;
        case 8:addObject(new Coin(),getWidth() / 6,getHeight() / 3);break;
    }
    }
        
        
        s++;
        switch(randomSpawn){
            case 0: addObject(new Zombie(mainPlayer, counter, zombieHealth), 0, 0); break;
            case 1: addObject(new Zombie(mainPlayer, counter, zombieHealth), getWidth() / 2, 0); break;
            case 2: addObject(new Zombie(mainPlayer, counter, zombieHealth), getWidth(), 0); break;
            case 3: addObject(new Zombie(mainPlayer, counter, zombieHealth), 0, getHeight() / 2); break;
            case 4: addObject(new Zombie(mainPlayer, counter, zombieHealth), getWidth(), getHeight() / 2); break;
            case 5: addObject(new Zombie(mainPlayer, counter, zombieHealth), 0, getHeight()); break;
            case 6: addObject(new Zombie(mainPlayer, counter, zombieHealth), getWidth() / 2, getHeight()); break;
            case 7: addObject(new Zombie(mainPlayer, counter, zombieHealth), getWidth(), getHeight()); break;
        }
    }
}
       
        
        
    
}
