import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameO here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameO extends World
{

    /**
     * Constructor for objects of class GameO.
     * 
     */
    public GameO()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        showText("Score : " + MyWorld.score,300,350);
         addObject( new overrr(),300,280);
         addObject(new Restart(),20,580);
         sound();
    }
   static GreenfootSound intro = new GreenfootSound("GameOver.wav");
    public void sound(){
        intro.play();
    }
}
