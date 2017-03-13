import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play extends Button
{
    /**
     * Act - do whatever the Play wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(getX()!=getWorld().getWidth()/2){
            setLocation(getX()+2,getY());
        }
         if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("reset.wav");
            Greenfoot.setWorld(new Difficult());;
            LiveLeft.live=2;
            Score.score=0;
            Bomberman.s=2;
            Bomberman.bombNums=1;
        }
    }    
}
