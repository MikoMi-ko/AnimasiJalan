import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class stickman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class stickman extends Actor
{
    private GreenfootImage[] images=new GreenfootImage[6];
    private int jeda=1, num=0, deltax=28;
    
    public void addedToWorld(World MyWorld) 
    {
        for(int i=0;i<images.length;i++){
            images[i]=new GreenfootImage("stick"+i+".png");
        } 
        setImage(images[0]);
    }
    
    public void act()
    {
        if(jeda==0)jeda=18;
        if(jeda==1){
        setImage(images[num]);
        num++;
        if(num>=images.length)num=0;
        setLocation(getX()+deltax,getY());
        if(getX()>getWorld().getWidth()+100)setLocation(-100,getY());
    }
    if(jeda>0)jeda--;
    }
}
