import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Bomberman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomberman extends Actor
{
    /**
     * Act - do whatever the Bomberman wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int picIndex = 2; // Keep track of the picture index.
    int picFrequency = 5;
    int movementCounter = 1;
    String picImage="";
    private ArrayList<Bomb> bombs = new ArrayList<Bomb>();
    public static int bombNums=1,s=2;
    public Bomberman(){

    }

    public void act() 
    {
        checkKeyPress();
       
        if(getWorld()!=null){

            dead2();
            return;
        }
        
    }

    public void setLocation(int x,int y){
        int oldX=getX();int oldY=getY();
        super.setLocation(x,y);
        if(!getIntersectingObjects(Steel.class).isEmpty()||!getIntersectingObjects(Walls.class).isEmpty())
            super.setLocation(oldX,oldY);
    }

    public void checkKeyPress(){

        int y = getY();
        int x = getX();

        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(x, y-s);
            movementCounter++;
            picImage = "walkUp";
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(x, y+s);
            movementCounter++;
            picImage = "walkD";
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(x-s, y);
            movementCounter++;
            picImage = "walkL";
        }
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(x+s, y);
            movementCounter++;
            picImage = "walkR";

        }
        if(Greenfoot.isKeyDown("space")){
            setLocation(x,y);
            if(bombs.size() < bombNums){
                bombs.add(new Bomb());
                getWorld().addObject(bombs.get(bombs.size()- 1), getX(), getY());
            }

            if(bombs.size() > 0){
                for(int i = bombs.size() - 1; i >= 0; i--){
                    if(bombs.get(i).isExploded())
                        bombs.remove(i);
                }
            }

        }
        if (picImage != "" && movementCounter > picFrequency) //loops
        {
            setImage(new GreenfootImage(picImage + picIndex + ".png"));
            movementCounter = 1;
            if (picIndex == 2)
                picIndex = 1;
            else
                picIndex++;
        }
    }

    
    public void dead2(){
        Actor actor1 = getOneObjectAtOffset(0, 0, Fire.class);
        if (actor1 != null){
            World world;
            world = getWorld();
            world.removeObject(this);
            LiveLeft.live--;
        }         
    }


    public void bombNumUpgrade(){
        bombNums++;
    }

    public void speedUpgrade(){
        s++;
    }
}
