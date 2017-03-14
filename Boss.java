import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class Boss extends Monster
{
    /**
     * Act - do whatever the Boss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int x;
    int y;
    private int live = 200;
    public void act() 
    {
        dead();
        moving();
         if(getWorld()!=null){
            kills();
            return;
        }
    }
    
     public void moving(){
         if(isTouching(WallD.class)){
                 y= -5;
                 x=0;
           
                }
         if(isTouching(WallT.class)){
                y=5;
                x=0;
            
            }
         if(isTouching(WallL.class)){
                x=5;
                y=0;
            
            }
         if(isTouching(WallR.class)){
                x= -5;
                y=0;
            
         }
        
        setLocation(getX()+x,getY()+y);
    
    }
    
    public void kills(){
       
        if (isTouching(Fire.class)){
            live--;
            if(live==150)
                setImage("boss2.png");
            if(live==100)
                setImage("boss3.png");
            if(live==50)
                setImage("boss4.png");
            if(live==0){
                World world;
                world = getWorld();
                world.removeObject(this);
                Score.score+=50;
            }
        }
        
    }
}
