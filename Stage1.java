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
     static int timme  ;
     ship x ;
     int a;
     int b;
     int c;
     int g;
     int k;
     int y;
     public static int shipLife;
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
         g = 60;
         k=60;
         timme=3600;
         addEn();
         shipLife = 1;
    }
    public void act(){
           showText("Your score : "+MyWorld.score,70,590);
             showText("Time : "+(timme/60),50,570);
                showText("Level : "+2,50,20);
                showText("LIFE = "+(shipLife),(410),(35)) ;
             Timer();
      
        
     
}
 
    public void Timer(){

        if(timme/60>0){
            timme--;  
        
        /*if(g>=620){
            
            addEn();
          g=0;  
        }*/
               if(getObjects(Enemy.class).isEmpty()){
            
            addEn();
            
        }
        if(k>=90){
            addObject(new Enemy(),Greenfoot.getRandomNumber(400)+20,30);
            addObject(new Enemy(),Greenfoot.getRandomNumber(400)+20,30);
            addObject(new Enemy(),Greenfoot.getRandomNumber(400)+20,30);
            k=0;
        }
         if(g>=270){
         y = Greenfoot.getRandomNumber(4);
            
            if(y==1){
                addObject(new UltimateCrate(),Greenfoot.getRandomNumber(400)+20,30);
            }
            if(y==2){
                addObject(new healCrate(),Greenfoot.getRandomNumber(400)+20,30);
            }
            if(y==3){
                addObject(new deadCrate(),Greenfoot.getRandomNumber(400)+20,30);
            }
            g=0;
        }
        k++;
        g++;
    }
    else {
          k=0;
        if(getObjects(Enemy.class).isEmpty()){
           x.count = 2; 
            x.go = true;
    }
}
    
    }

    public  void addEn(){
             for(int i=1;i<=5;i++){
             for(int k =1;k<=2;k++){
                 addObject(new Enemy(a,b,c),i*70,k*30);
                }
            }
    }
}

     
