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
            if(Greenfoot.getRandomNumber(3)==3){
                getWorld().addObject(new Morebomb(),474,332);
            }
            if(Greenfoot.getRandomNumber(3)==1){
                getWorld().addObject(new Movefaster(),474,332);
            }
            if(Greenfoot.getRandomNumber(3)==2){
                getWorld().addObject(new Live(),474,332);
            }
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
        }
        if(y==0&&x<0){
            Greenfoot.playSound("timeup.wav");
            if(getWorld().getObjects(Monster.class).size() != 0){
                Greenfoot.setWorld(new LoseWorld());
                Greenfoot.playSound("lose.wav");
            }else{
                Greenfoot.setWorld(new WinWorld());
                Greenfoot.playSound("win.wav");
            }
        }
        setImage(new GreenfootImage(""+y+":"+sec,20, Color.WHITE, Color.BLACK));
    }    
}
