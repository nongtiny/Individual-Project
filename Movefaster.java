import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Movefaster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Movefaster extends PowerUp
{
    /**
     * Act - do whatever the Movefaster wants to do. This method is called whenever
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
            man.speedUpgrade();
            Greenfoot.playSound("special.wav");
            getWorld().removeObject(this);
        }
    }
}
