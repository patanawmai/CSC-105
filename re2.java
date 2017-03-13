import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class re2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class re2 extends Actor
{
    /**
     * Act - do whatever the re2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
        Greenfoot.setWorld(new Stage1(2,45,2));
    }
    }    
}
