import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class win here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class win extends World
{

    /**
     * Constructor for objects of class win.
     * 
     */
    public win()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        showText("Score : " + MyWorld.score,300,350);
         addObject( new youwin(),300,280);
         addObject(new Restart(),20,580);
         Greenfoot.playSound("Over.wav");
    }
}
