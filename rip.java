import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rip here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rip extends Actor
{
    /**
     * Act - do whatever the rip wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   int spd = 15;
    public void act() 
    {
     
       Move();
       Remove();
    }    
    public void Move(){
        setLocation(getX(),getY()+spd);
    }
    public void Remove(){
        if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}
