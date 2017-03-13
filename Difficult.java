import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Difficult here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Difficult extends World
{

    /**
     * Constructor for objects of class Difficult.
     * 
     */
    public Difficult()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(950, 600, 1);
        addObject(new Normal(),getWidth()/2,getHeight()/2);
        addObject(new Easy(),getWidth()/2,209);
        addObject(new Hard(),getWidth()/2,400);
    }
}
