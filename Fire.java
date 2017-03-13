import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Fire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fire extends Actor
{
    /**
     * Act - do whatever the Fire wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int fireTimer=55;
   
    
   
    public Fire(){
       
    }
    public void act() 
    {
        setFireTime();
    } 
   
    public void setFireTime(){
        if(fireTimer>0){
            fireTimer--;
        }
        if(fireTimer==0){
            getWorld().removeObject(this);
        }
    }
   
}
