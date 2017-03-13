import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss extends Enemy
{
    /**
     * Act - do whatever the Boss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage b = new GreenfootImage("boss.png");
    public Boss(){
        super(9,20,35);//5 10 20 //20hp
          //setImage(b);
    }
       public void act() 
    {
        //gameover();
        getWorld().showText("Boss's Hp : " + hp,70,40);
      
            hit();
        if(count/60==1){
            spd = -spd;
            setLocation(getX(),getY()+dwn);
            count=0;
        }
        else{
        move(spd);
    }

        count++;
    }    
    /*public void gameover(){
             if(isTouching(ship.class)){  //isAtEdge()
            Greenfoot.setWorld(new GameO());
            }
        }*/
}
