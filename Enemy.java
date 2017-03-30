import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int spd;
    int dwn;
     int hp;
    int count = 0;
      public Enemy(){
      this(2,40,1); //2 50
    }
    public Enemy(int spd,int dwn,int hp){
        this.spd = spd;
        this.dwn = dwn;
         this.hp = hp;
    }
    public void act() 
    {
        //deduct();
            hit();
            
        if(count/60==1){
            spd = -spd;
            try{
                Gm();
            setLocation(getX(),getY()+dwn);
        }catch(IllegalStateException e){
            
        }
            count=0;
        }
        else{
        move(spd);
    }

        count++;
    }    
    public void Gm(){
        /*if(getY()==600){
             Greenfoot.setWorld(new GameO());
        }*/
    }
    public void deduct(){
             /*if(isAtEdge()){  //isAtEdge()
                 getWorld().removeObject(this);
             MyWorld.shipLife --;
             StageN.shipLife --;
             hp=0;
             //getWorld().removeObject(this);*/
            }
        
    public void hit(){
        if(isTouching(bullet.class)){
            removeTouching(bullet.class);
            hp--;
        }
        if(hp<=0){
                getWorld().removeObject(this);
           MyWorld.count--;
           MyWorld.score++;
           }
           
          
        }
       /* public void deduct(){
             if(isAtEdge()){  //isAtEdge()
                 
             MyWorld.shipLife --;
             StageN.shipLife --;
             hp==0;
             getWorld().removeObject(this);
            }
        }*/
    }
    


