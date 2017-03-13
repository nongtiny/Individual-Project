import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WinWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinWorld extends World
{

    /**
     * Constructor for objects of class WinWorld.
     * 
     */
    int frameTimer=100;
    public WinWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
         super(950, 600, 1);
        addObject(new youwinpic(),getWidth()/2,getHeight()/2);
        addObject(new Backtomenu(),470,400);     
    }
    public void act(){
        
        animation();
    }
     public void animation(){
        if(frameTimer>0){
            frameTimer--;
        }
        if(frameTimer==80){
            setBackground("boss2.png");
        }
        if(frameTimer==60){
            setBackground("boss3.png");
        }
        if(frameTimer==40){
             setBackground("boss4.png");
        }
        if(frameTimer==20){
            setBackground("bossdead.png");
        }
       if(frameTimer==0){
            frameTimer=100;
        }
       
    }
}
