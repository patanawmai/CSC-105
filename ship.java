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
        if(go){
            if(con){
                setLocation(512,700); 
            }
            con=false;
            setLocation(getX(),getY()-10); 
            if(isAtEdge()){
                Greenfoot.setWorld(new Stage2()); //ไปด่านอื่น
                go=false;
            }
        }
        Move();
        // Add your action code here.
    }  
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
}
