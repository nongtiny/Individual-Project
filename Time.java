import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Time here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Time extends Board
{
    /**
     * Act - do whatever the Time wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int timer=60;
    int x=59;
    int y=1;
    String sec;
    public Time(){
        setImage(new GreenfootImage("2"+":"+"00" ,20, Color.WHITE, Color.BLACK));
    }
    public void act() 
    {
        sec=""+x;
        
        if(timer>0){
            timer--;
        }
        if(x<10){
            sec="0"+x;
        }
        if(x<0){
            x=59;
            y--;
            
            if (getWorld() instanceof EzWorld){
                getWorld().addObject(new Wtf(),720,96);
            }
            else if (getWorld() instanceof NmWorld){
                getWorld().addObject(new Medium(),96,333);
            }
            else if (getWorld() instanceof HardWorld){
                getWorld().addObject(new Boss(),96,333);
            }
        }
        
        if(timer%60==0){
            x--;
        }
        if(timer==0){
            timer=60;
            if(Greenfoot.getRandomNumber(50)%15==3){
                if(getWorld().getObjects(Morebomb.class).size()==0)
                    getWorld().addObject(new Morebomb(),323,324);
            }
            if(Greenfoot.getRandomNumber(50)%15==14){
                if(getWorld().getObjects(Movefaster.class).size()==0)
                getWorld().addObject(new Movefaster(),425,325);
            }
            if(Greenfoot.getRandomNumber(50)%15==2){
                if(getWorld().getObjects(Live.class).size()==0)
                getWorld().addObject(new Live(),528,325);
            }
        }
        if(y==0&&x<0){
            Greenfoot.playSound("timeup.wav");
            if(getWorld().getObjects(Monster.class).size() != 0){
                Greenfoot.setWorld(new LoseWorld());
                Greenfoot.playSound("lose.wav");
                LiveLeft.live=2;
                Score.score=0;
                Bomberman.s=3;
                Bomberman.bombNums=1;
            }else{
                Greenfoot.setWorld(new WinWorld());
                Greenfoot.playSound("win.wav");
                LiveLeft.live=2;
                Score.score=0;
                Bomberman.s=3;
                Bomberman.bombNums=1;
            }
        }
        setImage(new GreenfootImage(""+y+":"+sec,20, Color.WHITE, Color.BLACK));
    }    
}
