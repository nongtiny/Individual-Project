import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Noob here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Noob extends Monster
{
    /**
     * Act - do whatever the Noob wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int frameTimer=80;
    public void act() 
    {
        animation();
        dead();
         if(getWorld()!=null){
            kill();
            return;
        }
    }
    
    public void animation(){
        if(frameTimer>0){
            frameTimer--;
        }
       
        if(frameTimer==60){
            setImage("noob1.png");
        }
        if(frameTimer==40){
            setImage("noob2.png");
        }
        if(frameTimer==20){
           frameTimer=80;
        }
    }
}
