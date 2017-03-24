import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bullet extends Actor
{
    /**
     * Act - do whatever the bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int spd = 15;
    public bullet(){
       setRotation(90); 
    }
    public void act() 
    {
       //Greenfoot.playSound("PaddleOut.wav");
       Move();
       Remove();// Add your action code here.
    }    
    public void Move(){
        setLocation(getX(),getY()-spd);
        
    }
    public void Remove(){
        if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}
