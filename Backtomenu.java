import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Backtomenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Backtomenu extends Button
{
    /**
     * Act - do whatever the Backtomenu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("reset.wav");
            Greenfoot.setWorld(new Mainmenu());
            LiveLeft.live=3;
            Score.score=0;
            Bomberman.s=3;
            Bomberman.bombNums=1;
        }
    }    
}
