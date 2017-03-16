import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class LoseWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LoseWorld extends World
{

    /**
     * Constructor for objects of class LoseWorld.
     * 
     */
    GreenfootSound s = new GreenfootSound("lose.wav");
    
    public LoseWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(950, 600, 1);
           
       addObject(new youlosepic(),getWidth()/2,getHeight()/2);
       addObject(new Backtomenu(),476,282);     
    }
    
    public void act(){
        s.play();
    }
}
