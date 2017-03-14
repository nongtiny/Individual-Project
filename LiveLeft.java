import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class LiveLeft here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LiveLeft extends Board
{
    /**
     * Act - do whatever the LiveLeft wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int live=2; 
    public LiveLeft(){
        setImage(new GreenfootImage("3",20, Color.WHITE, Color.BLACK));
    }
    public void act() 
    {
        if(live<0){
             Greenfoot.playSound("lose.wav");
            Greenfoot.setWorld(new LoseWorld());
        }
         setImage(new GreenfootImage(""+LiveLeft.live,20, Color.WHITE, Color.BLACK));
    }    
}
