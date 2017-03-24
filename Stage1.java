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
      static int counnt;
     static int timme  ;
     boolean go = false;
     ship x ;
     int a;
     int b;
     int c;
     int g;
     int k;
    public Stage1(int a,int b,int c)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
         super(600, 600, 1); 
         this.a= a;
         this.b=b;
         this.c=c;
         addObject(x = new ship(),300,550);
         addObject(new Restart(),580,20);
         addObject(new re2(),580,50);
         counnt=0;
         g = 60;
         k=60;
         timme=0;
         addEn();
    }
    public void act(){
           showText("Your score : "+MyWorld.score,70,590);
             showText("Time : "+(60-(timme/60)),50,570);
                showText("Level : "+2,50,20);
             Timer();
            
        
     
}
 
    public void Timer(){
        if(timme/60==60&&MyWorld.count==0){
            Greenfoot.setWorld(new Stage2());
            
    }
    else{
        if(timme/60!=60){
            timme++;  
        }
        if(g>=620){
            
            addEn();
          g=0;  
        }
        if(k>=90){
            addObject(new Enemy(),Greenfoot.getRandomNumber(400)+20,30);
            addObject(new Enemy(),Greenfoot.getRandomNumber(400)+20,30);
            addObject(new Enemy(),Greenfoot.getRandomNumber(400)+20,30);
            k=0;
        }
        k++;
        g++;
        
    }
    }

    public  void addEn(){
             for(int i=1;i<=5;i++){
             for(int k =1;k<=5;k++){
                 addObject(new Enemy(a,b,c),i*70,k*30);
                 MyWorld.count++;
                }
            }
    }
}

     
