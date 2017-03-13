import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stage1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stage1 extends World
{

    /**
     * Constructor for objects of class Stage1.
     * 
     */
     static int count;
      static int score;
     static int time  ;
     int le;
     ship x ;
    public Stage1(int le)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1);
        this.le = le;
         addObject(x = new ship(),300,550);
         addObject(new Restart(),550,50);
         count=0;
         score=0;
         time=0;
         addEn();
    }
     public void act(){
         showText("Your score : "+MyWorld.score,70,580);
         showText("Level : "+2,50,20);
          showText("Time : "+(60-(time/60)),50,560);
            Timer();
        if(count==0&&time/60!=60){
            addEn();
        }
           if(getObjects(Enemy.class).isEmpty()){
            Greenfoot.setWorld(new GameO());
            }
    }
    public void Timer(){
        if(time/60==60&&count==0){
            x.go = true;
    }
    else{
        if(time/60!=60){
            time++;  
        }
          
    }
    }
    public  void addEn(){
            
            for(int i=1;i<=5;i++){
             for(int k =1;k<=5;k++){
                 addObject(new Enemy(),i*70,k*30);
                 count++;
                }
            }
    }
       
    }

