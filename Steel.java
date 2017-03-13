import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Steel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Steel extends Actor
{
    /**
     * Act - do whatever the Steel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Steel(){
       
    }
    public void act() 
    {
       chk();
    }    
    
   public void remove(){
       if(isTouching(Fire.class)){
           removeTouching(Fire.class);
        }
    }
    
    public void chk(){
       Actor fire;
       fire = getOneObjectAtOffset(0,0,Fire.class);
       if(fire!=null){
           World w;
           w = getWorld();
           w.removeObject(fire);
        }
    }
   
}
