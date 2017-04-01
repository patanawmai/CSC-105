import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class UltimateCrate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UltimateCrate extends Actor
 
{   public static int ultimateFragment=0;
    public static int readyUltimate = 0;
    /**
     * Act - do whatever the UltimateCrate wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(),getY()+4);
        /*if(isAtEdge()){
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
        ultimateFragment++;
        if(ultimateFragment==3){
            readyUltimate++;
             ultimateFragment=0;
        }
        }
     
    }
     public void out(){
         if(isAtEdge()){
         getWorld().removeObject(this);
        }
    }
}
