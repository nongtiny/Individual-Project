import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mainmenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mainmenu extends World
{

    /**
     * Constructor for objects of class Mainmenu.
     * 
     * 
     */
    
    public Mainmenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(950, 600, 1);
        
        set();
    }
    
    public void set(){
        
        addObject(new Banner(),getWidth()/2,600);
        addObject(new Play(),1,getHeight()/2);
        addObject(new Instruc(),950,406);
    }
}
