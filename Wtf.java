import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Easy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Wtf extends Monster
{
    /**
     * Act - do whatever the Easy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int x;
    int y;
  
   private int frameTimer=80;
    
    public void act() 
    {
        animation();
        moving();
        dead();
         if(getWorld()!=null){
            kill();
            return;
        }
    }    
    
    public void moving(){
    
        if(isTouching(WallD.class)){
            y= -1;
            x=0;
            setLocation(getX(),getY()+y);
        }
        if(isTouching(WallT.class)){
            y=1;
            x=0;
            setLocation(getX(),getY()+y);
        }
        if(isTouching(WallL.class)){
            x=+1;
            y=0;
            setLocation(getX()+x,getY());
           
        }
        if(isTouching(WallR.class)){
            x= -1;
            y=0;
            setLocation(getX()+x,getY());
            
        }
        setLocation(getX()+x,getY()+y);
    }
    
    public void animation(){
        if(frameTimer>0){
            frameTimer--;
        }
       
        if(frameTimer==60){
            setImage("easy1.png");
        }
        if(frameTimer==40){
            setImage("easy2.png");
        }
        if(frameTimer==20){
            setImage("easy3.png");
        }
         if(frameTimer==0){
             frameTimer=80;
        }
       
    }
    
    
}
