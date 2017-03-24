import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    static int count;
     static int score;
     static int time  ;
     boolean go = false;
     ship x ;
     int a;
     int b;
     int c;
     int k;
    public MyWorld(int a,int b,int c)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
         super(600, 600, 1); 
         this.a= a;
         this.b=b;
         this.c=c;
         addObject(x = new ship(),300,550);
         addObject(new Restart(),580,20);
         addObject(new re1(),580,50);
         count=0;
         score=0;
         time=0;
         addEn();
         k=60;
    }
    public void act(){
           showText("Your score : "+score,70,590);
             showText("Time : "+(60-(time/60)),50,570);
                showText("Level : "+1,50,20);
             Timer();
        
        /*if(getObjects(Enemy.class).isEmpty()){
            
            addEn();
            
        }*/
        
     
}
 
    public void Timer(){
        if(time/60==60&&count==0){
            x.go = true;
            
            //Greenfoot.setWorld(new win());
    }
    else{
        if(time/60!=60){
            time++;  
        }
         if(getObjects(Enemy.class).isEmpty()){
            
            addEn();
            
        }
        if(k>=90){
            addObject(new Enemy(),Greenfoot.getRandomNumber(400)+20,30);
            addObject(new Enemy(),Greenfoot.getRandomNumber(400)+20,30);
            addObject(new Enemy(),Greenfoot.getRandomNumber(400)+20,30);
            k=0;
        }
        k++;
    }

    }
    public  void addEn(){
             for(int i=1;i<=4;i++){
             for(int k =1;k<=4;k++){
                 addObject(new Enemy(a,b,c),i*70,k*30);
                 count++;
                }
            }
    }
     
}
