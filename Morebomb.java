import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Morebomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Morebomb extends PowerUp
{
    /**
     * Act - do whatever the Morebomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        getPickedUp();
    }  
     
    public void getPickedUp(){
        Bomberman man = new Bomberman();
        ArrayList<Bomberman> objs = (ArrayList<Bomberman>) getIntersectingObjects(Bomberman.class);
        if(objs.size() > 0){
            Bomberman.bombNums+=2;
            Greenfoot.playSound("special.wav");
            getWorld().removeObject(this);
        }
    }
}
  
