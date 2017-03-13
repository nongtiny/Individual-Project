import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Medium here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Medium extends Monster
{
    /**
     * Act - do whatever the Medium wants to do. This method is called whenever
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
    
    
    
    public void animation(){
        if(frameTimer>0){
            frameTimer--;
        }
       
        if(frameTimer==60){
            setImage("medium1.png");
        }
        if(frameTimer==40){
            setImage("medium2.png");
        }
        if(frameTimer==20){
            setImage("medium3.png");
        }
         if(frameTimer==0){
             frameTimer=80;
        }
    }
    
}
