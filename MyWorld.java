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
     static int score;
     static int time  ;
     static ship x ;
     int a;
     int b;
     int c;
     int k;
      int g;
     int y;
     public static int shipLife;
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
         score=0;
         time=3600;
         addEn();
          k=60;
          g=60;
         shipLife = 2;
    }
    public void act(){
           showText("Your score : "+score,70,590);
             showText("Time : "+(time/60),50,570);
                showText("Level : "+1,50,20);
               showText("LIFE = "+(shipLife),(410),(35)) ;
                showText("HyperBeam = "+(UltimateCrate.readyUltimate),(410),(60)) ;
                gameover2();
                Timer();
        
       
        
     
}
 
      public void Timer(){

        if(time/60>0){
            time--;  
        
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
                addObject(new UltimateCrate(),Greenfoot.getRandomNumber(400)+20,30); //UltimateCrate
            }
            if(y==2){
                addObject(new healCrate(),Greenfoot.getRandomNumber(400)+20,30); //healCrate
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
      x.count = 1;
            x.go = true;
    }
}
    
    }
    public  void addEn(){
             for(int i=1;i<=4;i++){
             for(int k =1;k<=4;k++){
                 addObject(new Enemy(a,b,c),i*70,k*30);
                }
            }
    }
      public void gameover2(){
            if(shipLife==0){ 
            Greenfoot.setWorld(new GameO());
        }
}
 /* public void decreaseship(){
             if(isTouching(ship.class)){  //isAtEdge()
              MyWorld.shipLife --;
              Stage1.shipLife --;
            }
        }*/
}
