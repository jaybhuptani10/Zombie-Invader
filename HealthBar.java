import greenfoot.*;

public class HealthBar extends Actor {
    int health = 100;
    int restore = 0;

    public HealthBar() {
        setImage(new GreenfootImage(52, 12));
        GreenfootImage img = getImage();
        img.drawRect(0, 0, 51, 11);
        img.setColor(Color.GREEN);
        img.fillRect(1, 1, 50, 10);
        setImage(img);
    }

    public void act() {
        setImage(new GreenfootImage(52, 12));
        getImage().drawRect(0, 0, 51, 11);
        getImage().setColor(Color.GREEN);
        getImage().fillRect(1, 1, health, 10);
        World world = getWorld();
        MyWorld myWorld = (MyWorld) world;
        setLocation(myWorld.getPlayer().getX() - 11, myWorld.getPlayer().getY() - 50);
        loseLife();
    }

    public void loseLife() {
        World world = getWorld();
        MyWorld myWorld = (MyWorld) world;
        if (myWorld.getPlayer().youLose()) {
            health = health - 1;
        }
        if (health <= 0) {
            int finalScore = myWorld.getScore().getValue(); // Get the score from Counter
            getWorld().showText("GAME OVER! \n You survived for " + (myWorld.getPlayer().time / 60) + " seconds \n Your Score : " + finalScore, getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            Greenfoot.stop();
        }
    }

    public void restoreHealth() {
        health = 100;
    }
}
