import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NmWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NmWorld extends World
{

    /**
     * Constructor for objects of class NmWorld.
     * 
     */
    public NmWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(950, 600, 1);
        set();
    }
     public void act(){
        if(getObjects(Bomberman.class).size() == 0&&getObjects(Fire.class).size() == 0){
             addObject(new Bomberman(),121,126);
        }
        if(getObjects(Monster.class).size() == 0){
            Greenfoot.playSound("win.wav");
                 Greenfoot.setWorld(new WinWorld());
        }
    }
    public void set(){
      addObject(new WallL(),24,324);
       addObject(new WallR(),924,324);
       addObject(new WallT(),475,74);
       addObject(new WallD(),475,597);
       addObject(new Board(),475,24);
       addObject(new Score(),307,23);
       addObject(new Time(),450,23);
       addObject(new LiveLeft(),589,23);
       addObject(new Backtomenu(),700,23);
       addObject(new Restart(),845,23);
        for(int j=182;j<582;j+=103){
            for(int i=176;i<867;i+=100){
                addObject(new Steel(),i,j);
            }
        }
       addObject(new Bomberman(),121,126);
       addObject(new Medium(),323,560);
       addObject(new Medium(),726,100);
       addObject(new Medium(),862,223);
        addObject(new Normal(),getWidth()/2,75);
    }
}
