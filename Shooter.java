import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shooter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shooter extends Enemy
{
    /**
     * Act - do whatever the Shooter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
            if(count/60==1){
            spd = -spd;
            setLocation(getX(),getY()+dwn);
            count=0;
        }
        else{
        move(spd);
    }
        getWorld().addObject(new rip(),getX(),getY());
    }    
}
