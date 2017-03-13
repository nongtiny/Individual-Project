import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Restart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Restart extends Button
{
    /**
     * Act - do whatever the Restart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(getWorld().getObjects(Normal.class).size()!=0){
            if (Greenfoot.mouseClicked(this)){
                Greenfoot.playSound("reset.wav");
                Greenfoot.setWorld(new NmWorld());
                LiveLeft.live=2;
                Score.score=0;
                Bomberman.s=2;
                Bomberman.bombNums=1;
            }
        }
        
        if(getWorld().getObjects(Easy.class).size()!=0){
            if (Greenfoot.mouseClicked(this)){
                Greenfoot.playSound("reset.wav");
                Greenfoot.setWorld(new EzWorld());
                LiveLeft.live=2;
                Score.score=0;
                Bomberman.s=2;
                Bomberman.bombNums=1;
            }
        }
        
        if(getWorld().getObjects(Hard.class).size()!=0){
            if (Greenfoot.mouseClicked(this)){
                Greenfoot.playSound("reset.wav");
                Greenfoot.setWorld(new HardWorld());
                LiveLeft.live=2;
                Score.score=0;
                Bomberman.s=2;
                Bomberman.bombNums=1;
            }
        }
    }
}
