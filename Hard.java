import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hard extends Button
{
    /**
     * Act - do whatever the Hard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("reset.wav");
            Greenfoot.setWorld(new HardWorld());;
            LiveLeft.live=2;
            Score.score=0;
            Bomberman.s=2;
            Bomberman.bombNums=1;
        }
    }    
}
