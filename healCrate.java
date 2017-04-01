import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class healCrate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class healCrate extends Actor
{
    /**
     * Act - do whatever the healCrate wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(),getY()+4);
       /* if(isAtEdge()){
         getWorld().removeObject(this);
        }*/
        out();
        getImage().scale(60,60);
    effect();
    }    
    public void effect(){
     Actor S = getOneIntersectingObject(ship.class);
     if(S!=null){
         getWorld().removeObject(this);
        MyWorld.shipLife ++;
        Stage1.shipLife ++;
        
        }
     
    }   
     public void out(){
         if(isAtEdge()){
         getWorld().removeObject(this);
        }
    }
}
