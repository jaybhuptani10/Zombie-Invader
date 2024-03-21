import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed=3;
    int time = 0;
    Upgrade upgrade;
    public Player(){
         setImage("f3.png");
        getImage().scale(100,100);
    }
    public Player(Upgrade upgrade){
        this.upgrade = upgrade;
        setImage("f3.png");
        getImage().scale(100,100);
    }
    public void act()
    {
        // Add your actioncode here.
        time++;
        turnAround();
        moveAround();
        fireProjectile();
        youLose();
        
    }
    public void turnAround(){
        if(Greenfoot.getMouseInfo() != null)
        turnTowards(Greenfoot.getMouseInfo().getX(),Greenfoot.getMouseInfo().getY());
        
    }
    public void moveAround(){
        if(Greenfoot.isKeyDown("w"))
        setLocation(getX(),getY() - speed);
        if(Greenfoot.isKeyDown("a"))
        setLocation(getX() - speed,getY() );
        if(Greenfoot.isKeyDown("s"))
        setLocation(getX(),getY() + speed);
        if(Greenfoot.isKeyDown("d"))
        setLocation(getX() +  speed,getY() );
        
    }
    public void fireProjectile(){
        
       
        if( getRotation()>=0  & getRotation()<45 && upgrade.weaponUpgrade == 1){
            if(Greenfoot.mousePressed(null )){
            Projectile projectile = new Projectile();
            getWorld().addObject(projectile,getX(),getY()+30);
            projectile.setRotation(getRotation());
            }
        }
        else if( getRotation()>=45  & getRotation()<90 && upgrade.weaponUpgrade==1){
            if(Greenfoot.mousePressed(null )){
            Projectile projectile = new Projectile();
            getWorld().addObject(projectile,getX(),getY()+55);
            projectile.setRotation(getRotation());
            }
        }
        else if( getRotation()>=90  & getRotation()<135 && upgrade.weaponUpgrade==1){
            if(Greenfoot.mousePressed(null )){
            Projectile projectile = new Projectile();
            getWorld().addObject(projectile,getX()-20,getY());
            projectile.setRotation(getRotation());
            }
        }
        else if( getRotation()>=135  & getRotation()<180 && upgrade.weaponUpgrade==1){
            if(Greenfoot.mousePressed(null )){
            Projectile projectile = new Projectile();
            getWorld().addObject(projectile,getX()-50,getY());
            projectile.setRotation(getRotation());
            }
        }
        else if( getRotation()>=180  & getRotation()<225 && upgrade.weaponUpgrade==1){
            if(Greenfoot.mousePressed(null)){
            Projectile projectile = new Projectile();
            getWorld().addObject(projectile,getX(),getY()-35);
            projectile.setRotation(getRotation());
            }
        }
        else if( getRotation()>=225  & getRotation()<270 && upgrade.weaponUpgrade==1){
            if(Greenfoot.mousePressed(null)){
            Projectile projectile = new Projectile();
            getWorld().addObject(projectile,getX(),getY()-55);
            projectile.setRotation(getRotation());
            }
        }
        else if( getRotation()>=270  & getRotation()<315 && upgrade.weaponUpgrade==1){
            if(Greenfoot.mousePressed(null)){
            Projectile projectile = new Projectile();
            getWorld().addObject(projectile,getX()+25,getY());
            projectile.setRotation(getRotation());
            }
        }
        else if( getRotation()>=315  & getRotation()<360 && upgrade.weaponUpgrade==1){
            if(Greenfoot.mousePressed(null)){
            Projectile projectile = new Projectile();
            getWorld().addObject(projectile,getX()+25,getY()+20);
            projectile.setRotation(getRotation());
            Projectile projectile2 = new Projectile();
            getWorld().addObject(projectile,getX()+25,getY()+25);
            projectile.setRotation(getRotation());
            }
        }
        
        else if( getRotation()>=0  & getRotation()<45 && upgrade.weaponUpgrade == 2){
            if(Greenfoot.mousePressed(null )){
            Projectile projectile = new Projectile();
            getWorld().addObject(projectile,getX(),getY()+30);
            projectile.setRotation(getRotation());
            Projectile projectile2 = new Projectile();
            getWorld().addObject(projectile2,getX(),getY()+35);
            projectile2.setRotation(getRotation());
            }
        }
        else if( getRotation()>=45  & getRotation()<90 && upgrade.weaponUpgrade==2) {
            if(Greenfoot.mousePressed(null )){
            Projectile projectile = new Projectile();
            getWorld().addObject(projectile,getX(),getY()+55);
            projectile.setRotation(getRotation());
            Projectile projectile2 = new Projectile();
            getWorld().addObject(projectile2,getX(),getY()+60);
            projectile2.setRotation(getRotation());
            }
        }
        else if( getRotation()>=90  & getRotation()<135 && upgrade.weaponUpgrade==2){
            if(Greenfoot.mousePressed(null )){
            
            Projectile projectile = new Projectile();
            getWorld().addObject(projectile,getX()-20,getY());
            projectile.setRotation(getRotation());
            Projectile projectile2 = new Projectile();
            getWorld().addObject(projectile2,getX()-15,getY());
            projectile2.setRotation(getRotation());
            }
        }
        else if( getRotation()>=135  & getRotation()<180 && upgrade.weaponUpgrade==2){
            if(Greenfoot.mousePressed(null )){
            Projectile projectile = new Projectile();
            getWorld().addObject(projectile,getX()-50,getY());
            projectile.setRotation(getRotation());
            Projectile projectile2 = new Projectile();
            getWorld().addObject(projectile2,getX()-55,getY());
            projectile2.setRotation(getRotation());
            }
        }
        else if( getRotation()>=180  & getRotation()<225 && upgrade.weaponUpgrade==2){
            if(Greenfoot.mousePressed(null)){
            Projectile projectile = new Projectile();
            getWorld().addObject(projectile,getX(),getY()-35);
            projectile.setRotation(getRotation());
            Projectile projectile2 = new Projectile();
            getWorld().addObject(projectile2,getX(),getY()-40);
            projectile2.setRotation(getRotation());
            }
        }
        else if( getRotation()>=225  & getRotation()<270 && upgrade.weaponUpgrade==2){
            if(Greenfoot.mousePressed(null)){
            Projectile projectile = new Projectile();
            getWorld().addObject(projectile,getX(),getY()-55);
            projectile.setRotation(getRotation());
            Projectile projectile2 = new Projectile();
            getWorld().addObject(projectile2,getX(),getY()-60);
            projectile2.setRotation(getRotation());
            }
        }
        else if( getRotation()>=270  & getRotation()<315 && upgrade.weaponUpgrade==2){
            if(Greenfoot.mousePressed(null)){
            Projectile projectile = new Projectile();
            getWorld().addObject(projectile,getX()+25,getY());
            projectile.setRotation(getRotation());
            Projectile projectile2 = new Projectile();
            getWorld().addObject(projectile2,getX()+30,getY());
            projectile2.setRotation(getRotation());
            }
        }
        else if( getRotation()>=315  & getRotation()<360 && upgrade.weaponUpgrade==2){
            if(Greenfoot.mousePressed(null)){
            Projectile projectile = new Projectile();
            getWorld().addObject(projectile,getX()+25,getY()+20);
            projectile.setRotation(getRotation());
            Projectile projectile2 = new Projectile();
            getWorld().addObject(projectile2,getX()+3,getY()+25);
            projectile2.setRotation(getRotation());
            }
        }
          else if( getRotation()>=0  & getRotation()<45 && upgrade.weaponUpgrade == 3){
            if(Greenfoot.mousePressed(null )){
            Projectile projectile = new Projectile();
            getWorld().addObject(projectile,getX(),getY()+30);
            projectile.setRotation(getRotation());
            Projectile projectile2 = new Projectile();
            getWorld().addObject(projectile2,getX(),getY()+35);
            projectile2.setRotation(getRotation());
            Projectile projectile3 = new Projectile();
            getWorld().addObject(projectile3,getX(),getY()+45);
            projectile3.setRotation(getRotation());
            }
        }
        else if( getRotation()>=45  & getRotation()<90 && upgrade.weaponUpgrade==3) {
            if(Greenfoot.mousePressed(null )){
            Projectile projectile = new Projectile();
            getWorld().addObject(projectile,getX(),getY()+55);
            projectile.setRotation(getRotation());
            Projectile projectile2 = new Projectile();
            getWorld().addObject(projectile2,getX(),getY()+60);
            projectile2.setRotation(getRotation());
            Projectile projectile3 = new Projectile();
            getWorld().addObject(projectile3,getX(),getY()+65);
            projectile3.setRotation(getRotation());
            }
        }
        else if( getRotation()>=90  & getRotation()<135 && upgrade.weaponUpgrade==3){
            if(Greenfoot.mousePressed(null )){
            
            Projectile projectile = new Projectile();
            getWorld().addObject(projectile,getX()-20,getY());
            projectile.setRotation(getRotation());
            Projectile projectile2 = new Projectile();
            getWorld().addObject(projectile2,getX()-15,getY());
            projectile2.setRotation(getRotation());
            Projectile projectile3 = new Projectile();
            getWorld().addObject(projectile3,getX()-25,getY());
            projectile3.setRotation(getRotation());
            }
        }
        else if( getRotation()>=135  & getRotation()<180 && upgrade.weaponUpgrade==3){
            if(Greenfoot.mousePressed(null )){
            Projectile projectile = new Projectile();
            getWorld().addObject(projectile,getX()-50,getY());
            projectile.setRotation(getRotation());
            Projectile projectile2 = new Projectile();
            getWorld().addObject(projectile2,getX()-55,getY());
            projectile2.setRotation(getRotation());
            Projectile projectile3 = new Projectile();
            getWorld().addObject(projectile3,getX()-65,getY());
            projectile3.setRotation(getRotation());
            }
        }
        else if( getRotation()>=180  & getRotation()<225 && upgrade.weaponUpgrade==2){
            if(Greenfoot.mousePressed(null)){
            Projectile projectile = new Projectile();
            getWorld().addObject(projectile,getX(),getY()-35);
            projectile.setRotation(getRotation());
            Projectile projectile2 = new Projectile();
            getWorld().addObject(projectile2,getX(),getY()-40);
            projectile2.setRotation(getRotation());
            Projectile projectile3 = new Projectile();
            getWorld().addObject(projectile3,getX(),getY()-45);
            projectile3.setRotation(getRotation());
            }
        }
        else if( getRotation()>=225  & getRotation()<270 && upgrade.weaponUpgrade==3){
            if(Greenfoot.mousePressed(null)){
            Projectile projectile = new Projectile();
            getWorld().addObject(projectile,getX(),getY()-55);
            projectile.setRotation(getRotation());
            Projectile projectile2 = new Projectile();
            getWorld().addObject(projectile2,getX(),getY()-60);
            projectile2.setRotation(getRotation());
            Projectile projectile3 = new Projectile();
            getWorld().addObject(projectile3,getX(),getY()-66);
            projectile3.setRotation(getRotation());
            }
        }
        else if( getRotation()>=270  & getRotation()<315 && upgrade.weaponUpgrade==3){
            if(Greenfoot.mousePressed(null)){
            Projectile projectile = new Projectile();
            getWorld().addObject(projectile,getX()+25,getY());
            projectile.setRotation(getRotation());
            Projectile projectile2 = new Projectile();
            getWorld().addObject(projectile2,getX()+30,getY());
            projectile2.setRotation(getRotation());
            Projectile projectile3 = new Projectile();
            getWorld().addObject(projectile3,getX()+35,getY());
            projectile3.setRotation(getRotation());
            }
        }
        else if( getRotation()>=315  & getRotation()<360 && upgrade.weaponUpgrade==3){
            if(Greenfoot.mousePressed(null)){
            Projectile projectile = new Projectile();
            getWorld().addObject(projectile,getX()+25,getY()+20);
            projectile.setRotation(getRotation());
            Projectile projectile2 = new Projectile();
            getWorld().addObject(projectile2,getX()+3,getY()+25);
            projectile2.setRotation(getRotation());
            Projectile projectile3 = new Projectile();
            getWorld().addObject(projectile3,getX()+30,getY()+30);
            projectile3.setRotation(getRotation());
            }
        }
        
        
        
    }
    public boolean youLose() {
    Actor zombie = getOneObjectAtOffset(0,0,Zombie.class);
    if (zombie!=null) {
        // Retrieve one intersecting zombie
        return true;
        
    }
    else
    return false;
}
    

}
