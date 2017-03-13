import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu extends World
{

    /**
     * Constructor for objects of class MainMenu.
     * 
     */
    static int x =0;
    public MainMenu()
    {    
 
         super(600, 600, 1); 
          addObject( new name(),300,100);
          addObject( new  easy(),300,300);
          addObject( new  medium(),300,400);
          addObject( new hard(),300,500);
         
         int x=0;
    }
   
}
