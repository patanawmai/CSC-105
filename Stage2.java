import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stage2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stage2 extends World
{

    /**
     * Constructor for objects of class Stage2.
     * 
     */
    static int hp;
    int k;
    public Stage2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
             super(600, 600, 1); 
         addObject(new ship(),300,550);
         addObject(new Restart(),580,20);
         addObject(new re3(),580,50);
         // MyWorld.score =0;
         addObject(new Boss(),getWidth()/2,0);
         
    }
    public void act(){
         showText("Your score : "+MyWorld.score,70,580);
         showText("Level : "+3,50,20);
         End();
    }
    public void End(){
         if(getObjects(Boss.class).isEmpty()){
           Greenfoot.setWorld(new win());
    }else if(k>=90){
         addObject(new Enemy(),Greenfoot.getRandomNumber(400)+20,30);
         addObject(new Enemy(),Greenfoot.getRandomNumber(400)+20,30);
         addObject(new Enemy(),Greenfoot.getRandomNumber(400)+20,30);
         k=0;
    }
    k++;
    }
}
