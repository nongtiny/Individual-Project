import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Live here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Live extends PowerUp
{
    /**
     * Act - do whatever the Live wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        getPickedUp();
    }    
    public void getPickedUp(){
        ArrayList<Bomberman> objs = (ArrayList<Bomberman>) getIntersectingObjects(Bomberman.class);
        if(objs.size() > 0){
            LiveLeft.live++;
            Greenfoot.playSound("special.wav");
            getWorld().removeObject(this);
        }
    }
}
