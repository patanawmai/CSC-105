import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class deadCrate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class deadCrate extends Actor
{
    /**
     * Act - do whatever the deadCrate wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       setLocation(getX(),getY()+4);
       /*if(isAtEdge()){
         getWorld().removeObject(this);
        }*/
      
        getImage().scale(60,60);
        effect();
         
    }    
    public void effect(){
  if(isTouching(ship.class)){
         getWorld().removeObject(this);
        MyWorld.shipLife --;
        Stage1.shipLife --;
        
        
    }
     else {
            out();
        }
    }
    public void out(){
         if(isAtEdge()){
         getWorld().removeObject(this);
        }
    }
}
