import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomb extends Actor
{
    /**
     * Act - do whatever the bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int bombTimer = 240;
    public boolean isExploded = false;
    public static int powerup=1;
    private int length=55;
    public Bomb(){
        
    }
    public void act() 
    {
        boom();
    }
    
    public void boom(){
        if(bombTimer>0){
            bombTimer--;
        }
       
        if(bombTimer==200){
            setImage("bomb2.png");
        }
        if(bombTimer==160){
            setImage("bomb3.png");
        }
        if(bombTimer==120){
            setImage("bomb4.png");
        }
        if(bombTimer==80){
            setImage("bomb5.png");
        }
        if(bombTimer==60){
            setImage("fire1.png");
            Greenfoot.playSound("boom.wav");
            fireLength();
            isExploded = true;     
        }
         if(bombTimer==20){
             getWorld().removeObject(this);
        }
        
       
    }
    
    public void fireLength(){
        int x = getX();
        int y = getY();
        
        for(int i=1;i<=powerup;i++){
           getWorld().addObject(new Fire(),x+length*i,y);
           getWorld().addObject(new Fire(),x-length*i,y);
           getWorld().addObject(new Fire(),x,y+length*i);
           getWorld().addObject(new Fire(),x,y-length*i);
            
        }
        
    }
    
    public boolean isExploded(){
        return isExploded;
    }
}
