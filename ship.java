import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ship extends Actor
{
    /**
     * Act - do whatever the ship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int spd =10;
    double time =0;
    double rate =0.2;
    boolean agn = false;
    boolean con= true;
    boolean go = false;
    
    public ship(){
      
    }
    public void act() 
    {
        gameover();
        if(go){
            if(con){
                setLocation(512,600); 
            }
            con=false;
            setLocation(getX(),getY()-10); 
            if(isAtEdge()){
                Greenfoot.setWorld(new Stage1(2,30,1)); //ไปด่านอื่น
                go=false;
            }
        }
        Move();
        //shipone();
        //shiptwo();
        // Add your action code here.
    }  
   /* public void shipone(){
        if(isAtEdge()){
                Greenfoot.setWorld(new Stage1(2,30,1)); //ไปด่านอื่น
                go=false;
    }
}
 public void shiptwo(){
        if(isAtEdge()){
                Greenfoot.setWorld(new Stage2()); //ไปด่านอื่น
                go=false;
    }
}*/
    public void Move(){
        if(con){
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+spd,getY());
    }
         if(Greenfoot.isKeyDown("left")){
               setLocation(getX()-spd,getY());
    }
       if(Greenfoot.isKeyDown("space")){
           if(agn==false){
              getWorld().addObject(new bullet(),getX(),getY());
            }
            Semi();
        
    }
    else{
        agn=true;
    }

}
}
public void Semi(){
    agn = true;
    if(time/60==rate){
        agn = !agn;
        time = 0;
    }
    time++;
}
public void gameover(){
             if(isTouching(Boss.class)){  //isAtEdge()
            Greenfoot.setWorld(new GameO());
            }
        }
}

