import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hyper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hyper extends Actor
{
    /**
     * Act - do whatever the Hyper wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        getImage().scale(580,60);
        setLocation(getX(),getY()-5);
        if(isTouching(Enemy.class)){
          Actor enemy = getOneIntersectingObject(Enemy.class);
          getWorld().removeObject(enemy);
        
        }
        else if(isAtEdge() ){
        getWorld().removeObject(this);
     } 
    }    
}
